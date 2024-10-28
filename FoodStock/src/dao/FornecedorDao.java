package dao;

import connection.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import model.Fornecedor;

public class FornecedorDao {
    private static Fornecedor fornecedor;
    private static Connection con;
    
    public ArrayList<Fornecedor> buscarFornecedores() {
        ArrayList<Fornecedor> fornecedores = new ArrayList<>();
        String sql = "SELECT * FROM fornecedores";

        try {
            con = new Conexao().obterConexao();
            PreparedStatement pstm = con.prepareStatement(sql);
            ResultSet rs = pstm.executeQuery();

            while (rs.next()) {
                int id = rs.getInt("id_fornecedor");
                String nome = rs.getString("nome");
                String cnpj = rs.getString("cnpj");
                String email = rs.getString("email");
                int endereco = rs.getInt("id_endereco");
                int telefone = rs.getInt("id_telefone");
                fornecedor = new Fornecedor(id, nome, cnpj, email, endereco, telefone);
                fornecedores.add(fornecedor);
            }

        } catch (Exception e) {
            System.out.println("Erro ao buscar fornecedores: " + e);
        }

        return fornecedores;
    }
    
    public String buscarFornecedorPorId(int id) {
        String sql = "SELECT nome FROM fornecedores where id_fornecedor = ?";
        String nome = null;
        
        con = new Conexao().obterConexao();
        
        try {
            PreparedStatement pstm = con.prepareStatement(sql);
            pstm.setInt(1, id);
            ResultSet rs = pstm.executeQuery();
            
            if (rs.next()) {
                nome = rs.getString("nome");
            }
            
            pstm.close();
            con.close();
        } catch(Exception e) {
            System.out.println("Erro ao buscar fornecedor. Erro: " + e);
        }
        
        return nome;
    }
}
