package dao;

import connection.Conexao;
import model.Cliente;
import model.Endereco;
import model.Telefone;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ClienteDAO {

    private static Connection con;
    private static Cliente cliente;

    public boolean inserirCliente(String nome, String cpfCnpj, String email,
            String numeroTelefone, String logradouro, String bairro,
            String numeroEndereco, String cep, String municipio,
            String estado, String pais) {
        con = new Conexao().obterConexao();
        try {
            con.setAutoCommit(false);

            // inserir o telefone e recuperar o ID gerado
            int idTelefone = inserirTelefone(numeroTelefone);
            if (idTelefone == -1) {
                con.rollback(); 
                System.out.println("Erro ao inserir telefone.");
                return false;
            }

            // inserir o endereco e recuperar o ID gerado
            int idEndereco = inserirEndereco(logradouro, bairro, numeroEndereco, cep, municipio, estado, pais);
            if (idEndereco == -1) {
                con.rollback(); 
                System.out.println("Erro ao inserir endereço.");
                return false;
            }

            // inserir o cliente com os IDs de telefone e endereco
            String sqlCliente = "INSERT INTO clientes (nome, cpf_cnpj, email, id_telefone, id_endereco) VALUES (?, ?, ?, ?, ?);";
            try (PreparedStatement pstmCliente = con.prepareStatement(sqlCliente)) {
                pstmCliente.setString(1, nome);
                pstmCliente.setString(2, cpfCnpj);
                pstmCliente.setString(3, email);
                pstmCliente.setInt(4, idTelefone);
                pstmCliente.setInt(5, idEndereco);

                int resultado = pstmCliente.executeUpdate();
                if (resultado <= 0) {
                    con.rollback(); 
                    return false;
                }
            }

            con.commit();
            return true;

        } catch (SQLException e) {
            System.out.println("Erro ao inserir cliente. Erro: " + e.getMessage());
            try {
                if (con != null) {
                    con.rollback(); 
                }
            } catch (SQLException rollbackEx) {
                System.out.println("Erro ao reverter a transação: " + rollbackEx.getMessage());
            }
            return false;
        } finally {
            try {
                if (con != null) {
                    con.close();
                }
            } catch (SQLException e) {
                System.out.println("Erro ao fechar conexão: " + e.getMessage());
            }
        }
    }

    // inserir telefone
    private int inserirTelefone(String numero) {
        String sqlTelefone = "INSERT INTO telefone (numero) VALUES (?) RETURNING id_telefone;";
        try (PreparedStatement pstmTelefone = con.prepareStatement(sqlTelefone)) {
            pstmTelefone.setString(1, numero);
            ResultSet rs = pstmTelefone.executeQuery();
            if (rs.next()) {
                return rs.getInt("id_telefone");
            }
        } catch (SQLException e) {
            System.out.println("Erro ao inserir telefone: " + e.getMessage());
        }
        return -1;
    }

    // inserir endereco
    private int inserirEndereco(String logradouro, String bairro, String numero, String cep, String municipio, String estado, String pais) {
        String sqlEndereco = "INSERT INTO endereco (logradouro, bairro, numero, cep, municipio, estado, pais) VALUES (?, ?, ?, ?, ?, ?, ?) RETURNING id_endereco;";
        try (PreparedStatement pstmEndereco = con.prepareStatement(sqlEndereco)) {
            pstmEndereco.setString(1, logradouro);
            pstmEndereco.setString(2, bairro);
            pstmEndereco.setString(3, numero);
            pstmEndereco.setString(4, cep);
            pstmEndereco.setString(5, municipio);
            pstmEndereco.setString(6, estado);
            pstmEndereco.setString(7, pais);

            ResultSet rs = pstmEndereco.executeQuery();
            if (rs.next()) {
                return rs.getInt("id_endereco");
            }
        } catch (SQLException e) {
            System.out.println("Erro ao inserir endereço: " + e.getMessage());
        }
        return -1;
    }

    public ArrayList<Cliente> obterClientes() {
        String sql = "SELECT * FROM clientes";  
        con = new Conexao().obterConexao();  

        ArrayList<Cliente> listaClientes = new ArrayList<>();  

        try {
            PreparedStatement pstm = con.prepareStatement(sql);
            ResultSet rs = pstm.executeQuery();  

            while (rs.next()) {  
                int id = rs.getInt("id_cliente"); 
                String nome = rs.getString("nome");  
                String cpfCnpj = rs.getString("cpf_cnpj");  
                String email = rs.getString("email");  

                int idTelefone = rs.getInt("id_telefone");  
                int idEndereco = rs.getInt("id_endereco");  

                Telefone telefone = buscarTelefonePorId(idTelefone);
                Endereco endereco = buscarEnderecoPorId(idEndereco);

                // objeto cliente com os dados recuperados
                Cliente cliente = new Cliente(id, nome, cpfCnpj, email, endereco, telefone);
                listaClientes.add(cliente); 
            }

            rs.close();  
            pstm.close();  
        } catch (Exception e) {
            System.out.println("Erro ao buscar todos os clientes. Erro: " + e);
        } finally {
            try {
                if (con != null) {
                    con.close();  
                }
            } catch (SQLException e) {
                System.out.println("Erro ao fechar a conexão: " + e.getMessage());
            }
        }

        return listaClientes;  
    }

    // buscar telefone por id
    private Telefone buscarTelefonePorId(int idTelefone) {
        Telefone telefone = null;
        String sql = "SELECT * FROM telefone WHERE id_telefone = ?";

        try {
            PreparedStatement pstm = con.prepareStatement(sql);
            pstm.setInt(1, idTelefone);
            ResultSet rs = pstm.executeQuery();

            if (rs.next()) {
                String numero = rs.getString("numero");
                telefone = new Telefone(idTelefone, numero); 
            }

            rs.close();  
            pstm.close();  
        } catch (SQLException e) {
            System.out.println("Erro ao buscar telefone. Erro: " + e);
        }

        return telefone; 
    }

    // buscar endereco por id
    private Endereco buscarEnderecoPorId(int idEndereco) {
        Endereco endereco = null; 
        String sql = "SELECT * FROM endereco WHERE id_endereco = ?"; 

        try {
            PreparedStatement pstm = con.prepareStatement(sql);
            pstm.setInt(1, idEndereco);
            ResultSet rs = pstm.executeQuery();

            if (rs.next()) {
                String logradouro = rs.getString("logradouro"); 
                String bairro = rs.getString("bairro");
                String numero = rs.getString("numero");
                String cep = rs.getString("cep");
                String municipio = rs.getString("municipio");
                String estado = rs.getString("estado");
                String pais = rs.getString("pais");
                endereco = new Endereco(idEndereco, logradouro, bairro, numero, cep, municipio, estado, pais); 
            }

            rs.close(); 
            pstm.close();  
        } catch (SQLException e) {
            System.out.println("Erro ao buscar endereço. Erro: " + e);
        }

        return endereco; 
    }

    public boolean atualizarCliente(int idCliente, String nome, String cpfCnpj, String email,
                                    String numeroTelefone, String logradouro, String bairro,
                                    String numeroEndereco, String cep, String municipio,
                                    String estado, String pais) {
        con = new Conexao().obterConexao();
        try {
            con.setAutoCommit(false); 

            // obter o CPF/CNPJ atual
            String cpfCnpjAtual = obterCpfCnpjPorId(idCliente);
            if (cpfCnpjAtual == null) {
                System.out.println("Erro: Cliente não encontrado.");
                return false;
            }

            // comparar o CPF/CNPJ do JTF com o valor do banco
            if (cpfCnpj.equals(cpfCnpjAtual)) {
                System.out.println("O CPF/CNPJ no JTextField é igual ao CPF/CNPJ no banco de dados, não é necessário atualizar este campo.");
            } else {
                System.out.println("Erro: CPF/CNPJ já cadastrado em outro cliente.");
                return false;
            }

            // atualizar telefone e endereco
            boolean telefoneAtualizado = atualizarTelefone(idCliente, numeroTelefone);
            if (!telefoneAtualizado) {
                con.rollback();
                System.out.println("Erro ao atualizar telefone.");
                return false;
            }

            boolean enderecoAtualizado = atualizarEndereco(idCliente, logradouro, bairro, numeroEndereco, cep, municipio, estado, pais);
            if (!enderecoAtualizado) {
                con.rollback();
                System.out.println("Erro ao atualizar endereço.");
                return false;
            }

            // atualizar cliente - ignora o campo CPF/CNPJ se nao houver alteracao
            String sqlCliente;
            if (cpfCnpj.equals(cpfCnpjAtual)) {
                sqlCliente = "UPDATE clientes SET nome = ?, email = ? WHERE id_cliente = ?;";
            } else {
                sqlCliente = "UPDATE clientes SET nome = ?, cpf_cnpj = ?, email = ? WHERE id_cliente = ?;";
            }

            try (PreparedStatement pstmCliente = con.prepareStatement(sqlCliente)) {
                pstmCliente.setString(1, nome);
                if (cpfCnpj.equals(cpfCnpjAtual)) {
                    pstmCliente.setString(2, email);
                    pstmCliente.setInt(3, idCliente);
                } else {
                    pstmCliente.setString(2, cpfCnpj);
                    pstmCliente.setString(3, email);
                    pstmCliente.setInt(4, idCliente);
                }

                int resultado = pstmCliente.executeUpdate();
                if (resultado <= 0) {
                    con.rollback();
                    return false;
                }
            }

            con.commit(); 
            return true;

        } catch (SQLException e) {
            System.out.println("Erro ao atualizar cliente. Erro: " + e.getMessage());
            try {
                if (con != null) {
                    con.rollback(); 
                }
            } catch (SQLException rollbackEx) {
                System.out.println("Erro ao reverter a transação: " + rollbackEx.getMessage());
            }
            return false;
        } finally {
            try {
                if (con != null) {
                    con.close();
                }
            } catch (SQLException e) {
                System.out.println("Erro ao fechar conexão: " + e.getMessage());
            }
        }
    }

    private String obterCpfCnpjPorId(int idCliente) {
        String sql = "SELECT cpf_cnpj FROM clientes WHERE id_cliente = ?";
        try (PreparedStatement pstm = con.prepareStatement(sql)) {
            pstm.setInt(1, idCliente);
            ResultSet rs = pstm.executeQuery();
            if (rs.next()) {
                return rs.getString("cpf_cnpj");
            }
        } catch (SQLException e) {
            System.out.println("Erro ao obter CPF/CNPJ do cliente: " + e.getMessage());
        }
        return null;
    }

    // atualizar telefone
    private boolean atualizarTelefone(int idCliente, String numero) {
        String sqlTelefone = "UPDATE telefone SET numero = ? WHERE id_telefone = (SELECT id_telefone FROM clientes WHERE id_cliente = ?);";
        try (PreparedStatement pstmTelefone = con.prepareStatement(sqlTelefone)) {
            pstmTelefone.setString(1, numero);
            pstmTelefone.setInt(2, idCliente);
            int resultado = pstmTelefone.executeUpdate();
            return resultado > 0; 
        } catch (SQLException e) {
            System.out.println("Erro ao atualizar telefone: " + e.getMessage());
            return false;
        }
    }

    // atualizar endereco
    private boolean atualizarEndereco(int idCliente, String logradouro, String bairro, String numero, String cep, String municipio, String estado, String pais) {
        String sqlEndereco = "UPDATE endereco SET logradouro = ?, bairro = ?, numero = ?, cep = ?, municipio = ?, estado = ?, pais = ? WHERE id_endereco = (SELECT id_endereco FROM clientes WHERE id_cliente = ?);";
        try (PreparedStatement pstmEndereco = con.prepareStatement(sqlEndereco)) {
            pstmEndereco.setString(1, logradouro);
            pstmEndereco.setString(2, bairro);
            pstmEndereco.setString(3, numero);
            pstmEndereco.setString(4, cep);
            pstmEndereco.setString(5, municipio);
            pstmEndereco.setString(6, estado);
            pstmEndereco.setString(7, pais);
            pstmEndereco.setInt(8, idCliente);

            int resultado = pstmEndereco.executeUpdate();
            return resultado > 0; 
        } catch (SQLException e) {
            System.out.println("Erro ao atualizar endereço: " + e.getMessage());
            return false;
        }
    }

    public boolean deletarClientePorId(int idCliente) {
        con = new Conexao().obterConexao();
        try {
            con.setAutoCommit(false); 

            int idTelefone = obterIdTelefonePorCliente(idCliente);
            int idEndereco = obterIdEnderecoPorCliente(idCliente);

            String sqlDeleteCliente = "DELETE FROM clientes WHERE id_cliente = ?";
            try (PreparedStatement pstmCliente = con.prepareStatement(sqlDeleteCliente)) {
                pstmCliente.setInt(1, idCliente);
                int resultadoCliente = pstmCliente.executeUpdate();
                if (resultadoCliente == 0) {
                    con.rollback(); 
                    return false;
                }
            }

            // excluir o telefone associado
            if (idTelefone != -1) { 
                String sqlDeleteTelefone = "DELETE FROM telefone WHERE id_telefone = ?";
                try (PreparedStatement pstmTelefone = con.prepareStatement(sqlDeleteTelefone)) {
                    pstmTelefone.setInt(1, idTelefone);
                    pstmTelefone.executeUpdate();
                }
            }

            // excluir o endereco associado
            if (idEndereco != -1) {
                String sqlDeleteEndereco = "DELETE FROM endereco WHERE id_endereco = ?";
                try (PreparedStatement pstmEndereco = con.prepareStatement(sqlDeleteEndereco)) {
                    pstmEndereco.setInt(1, idEndereco);
                    pstmEndereco.executeUpdate();
                }
            }

            con.commit();
            return true;

        } catch (SQLException e) {
            System.out.println("Erro ao deletar cliente. Erro: " + e.getMessage());
            try {
                if (con != null) {
                    con.rollback();
                }
            } catch (SQLException rollbackEx) {
                System.out.println("Erro ao reverter a transação: " + rollbackEx.getMessage());
            }
            return false;
        } finally {
            try {
                if (con != null) {
                    con.close();
                }
            } catch (SQLException e) {
                System.out.println("Erro ao fechar a conexão: " + e.getMessage());
            }
        }
    }

    private int obterIdTelefonePorCliente(int idCliente) {
        String sql = "SELECT id_telefone FROM clientes WHERE id_cliente = ?";
        try (PreparedStatement pstm = con.prepareStatement(sql)) {
            pstm.setInt(1, idCliente);
            ResultSet rs = pstm.executeQuery();
            if (rs.next()) {
                return rs.getInt("id_telefone");
            }
        } catch (SQLException e) {
            System.out.println("Erro ao obter id_telefone. Erro: " + e.getMessage());
        }
        return -1;
    }

    private int obterIdEnderecoPorCliente(int idCliente) {
        String sql = "SELECT id_endereco FROM clientes WHERE id_cliente = ?";
        try (PreparedStatement pstm = con.prepareStatement(sql)) {
            pstm.setInt(1, idCliente);
            ResultSet rs = pstm.executeQuery();
            if (rs.next()) {
                return rs.getInt("id_endereco");
            }
        } catch (SQLException e) {
            System.out.println("Erro ao obter id_endereco. Erro: " + e.getMessage());
        }
        return -1;
    }
}
