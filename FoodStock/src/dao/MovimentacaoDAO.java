package dao;

import connection.Conexao;
import controller.ClienteController;
import controller.FornecedorController;
import controller.ProdutoController;
import controller.UsuarioController;
import model.Movimentacao;
import model.Produto;
import model.TipoMovimentacao;
import model.Usuario;
import model.Fornecedor;
import model.Cliente;

import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import model.TipoMovimentacaoEnum;

public class MovimentacaoDAO {

    public boolean inserirMovimentacao(Movimentacao movimentacao) {
        String sql = "INSERT INTO movimentacao_estoque (id_tipo_movimentacao, quantidade, data, id_produto, id_usuario, id_fornecedor, id_cliente) VALUES (?, ?, ?, ?, ?, ?, ?)";

        try (Connection con = new Conexao().obterConexao(); PreparedStatement pstm = con.prepareStatement(sql)) {

            pstm.setInt(1, movimentacao.getTipoMovimentacao().getId());
            pstm.setInt(2, movimentacao.getQuantidade());
            pstm.setDate(3, Date.valueOf(movimentacao.getData()));
            pstm.setInt(4, movimentacao.getProduto().getIdProduto());
            pstm.setInt(5, movimentacao.getUsuario().getIdUsuario());

            if (movimentacao.getFornecedor() != null) {
                pstm.setInt(6, movimentacao.getFornecedor().getIdFornecedor());
            } else {
                pstm.setNull(6, Types.INTEGER);
            }
            if (movimentacao.getCliente() != null) {
                pstm.setInt(7, movimentacao.getCliente().getIdCliente());
            } else {
                pstm.setNull(7, Types.INTEGER);
            }

            return pstm.executeUpdate() > 0;

        } catch (SQLException e) {
            System.out.println("Erro ao inserir movimentação. Erro: " + e.getMessage());
            return false;
        }
    }

    /*public boolean adicionarEntradaEstoque(TipoMovimentacaoEnum tipoMovimentacao, LocalDate data, int quantidade, Produto produto, Fornecedor fornecedor, Usuario usuario) {
        if (tipoMovimentacao == TipoMovimentacaoEnum.ENTRADA && fornecedor == null) {
            System.out.println("Erro: Fornecedor é necessário para movimentações de entrada.");
            return false;
        }

        Movimentacao movimentacao = new Movimentacao(tipoMovimentacao, quantidade, data, produto, usuario, fornecedor, null);

        return inserirMovimentacao(movimentacao);
    }*/
    public boolean adicionarEntradaEstoque(TipoMovimentacaoEnum tipoMovimentacao, LocalDate data, int quantidade, Produto produto, Fornecedor fornecedor, Usuario usuario) {

        System.out.println("Tipo de Movimentação: " + tipoMovimentacao);
        System.out.println("Fornecedor recebido no método: " + (fornecedor != null ? fornecedor.getIdFornecedor() : "null"));

        if (tipoMovimentacao == TipoMovimentacaoEnum.ENTRADA && fornecedor == null) {
            System.out.println("Erro: Fornecedor é necessário para movimentações de entrada.");
            return false;
        }

        // Exibe informações sobre o produto e outros parâmetros
        System.out.println("Produto selecionado ID: " + (produto != null ? produto.getIdProduto() : "Nenhum"));
        System.out.println("Quantidade: " + quantidade);
        System.out.println("Data: " + data);
        System.out.println("Usuário: " + (usuario != null ? usuario.getIdUsuario() : "Nenhum"));

        Movimentacao movimentacao = new Movimentacao(tipoMovimentacao, quantidade, data, produto, usuario, fornecedor, null);

        boolean resultado = inserirMovimentacao(movimentacao);

        if (resultado) {
            System.out.println("Movimentação adicionada com sucesso.");
        } else {
            System.out.println("Falha ao adicionar movimentação ao estoque.");
        }

        return resultado;
    }

    public boolean atualizarMovimentacao(Movimentacao movimentacao) {
        String sql = "UPDATE movimentacao_estoque SET id_tipo_movimentacao = ?, quantidade = ?, data = ?, id_produto = ?, id_usuario = ?, id_fornecedor = ?, id_cliente = ? WHERE id_movimentacao = ?";

        try (Connection con = new Conexao().obterConexao(); PreparedStatement pstm = con.prepareStatement(sql)) {

            pstm.setInt(1, movimentacao.getTipoMovimentacao().getId());
            pstm.setInt(2, movimentacao.getQuantidade());
            pstm.setDate(3, Date.valueOf(movimentacao.getData()));
            pstm.setInt(4, movimentacao.getProduto().getIdProduto());
            pstm.setInt(5, movimentacao.getUsuario().getIdUsuario());

            if (movimentacao.getFornecedor() != null) {
                pstm.setInt(6, movimentacao.getFornecedor().getIdFornecedor());
            } else {
                pstm.setNull(6, Types.INTEGER);
            }
            if (movimentacao.getCliente() != null) {
                pstm.setInt(7, movimentacao.getCliente().getIdCliente());
            } else {
                pstm.setNull(7, Types.INTEGER);
            }

            pstm.setInt(8, movimentacao.getIdMovimentacao());

            return pstm.executeUpdate() > 0;

        } catch (SQLException e) {
            System.out.println("Erro ao atualizar movimentação. Erro: " + e.getMessage());
            return false;
        }
    }

    public ArrayList<Movimentacao> obterMovimentacao(ProdutoController produtoController,
            UsuarioController usuarioController,
            FornecedorController fornecedorController,
            ClienteController clienteController) {
        ArrayList<Movimentacao> listaMovimentacao = new ArrayList<>();
        String sql = "SELECT * FROM movimentacao_estoque";

        try (Connection con = new Conexao().obterConexao(); PreparedStatement pstm = con.prepareStatement(sql); ResultSet rs = pstm.executeQuery()) {

            while (rs.next()) {
                Movimentacao movimentacao = new Movimentacao();
                movimentacao.setIdMovimentacao(rs.getInt("id_movimentacao"));

                TipoMovimentacaoEnum tipoMovimentacao = TipoMovimentacaoEnum.fromId(rs.getInt("id_tipo_movimentacao"));
                movimentacao.setTipoMovimentacao(tipoMovimentacao);

                movimentacao.setQuantidade(rs.getInt("quantidade"));

                LocalDate data = rs.getDate("data").toLocalDate();
                movimentacao.setData(data);

                Produto produto = produtoController.buscarProdutoPorId(rs.getInt("id_produto"));
                movimentacao.setProduto(produto);

                Usuario usuario = usuarioController.buscarUsuarioPorId(rs.getInt("id_usuario"));
                movimentacao.setUsuario(usuario);

                Fornecedor fornecedor = fornecedorController.buscarFornecedorPorId(rs.getInt("id_fornecedor"));
                movimentacao.setFornecedor(fornecedor);

                Cliente cliente = clienteController.buscarClientePorId(rs.getInt("id_cliente"));
                movimentacao.setCliente(cliente);

                listaMovimentacao.add(movimentacao);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return listaMovimentacao;
    }

    public void deletarMovimentacaoPorId(int idMovimentacao) {
        String sql = "DELETE FROM movimentacao_estoque WHERE id_movimentacao = ?";

        try (Connection con = new Conexao().obterConexao(); PreparedStatement pstm = con.prepareStatement(sql)) {

            pstm.setInt(1, idMovimentacao);
            pstm.executeUpdate();

        } catch (SQLException e) {
            System.out.println("Erro ao deletar movimentação. Erro: " + e.getMessage());
        }
    }
}
