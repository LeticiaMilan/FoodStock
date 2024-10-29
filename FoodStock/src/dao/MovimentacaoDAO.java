package dao;

import connection.Conexao;
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

public class MovimentacaoDAO {

    public boolean inserirMovimentacao(Movimentacao movimentacao) {
        String sql = "INSERT INTO movimentacao_estoque (id_tipo_movimentacao, quantidade, data, id_produto, id_usuario, id_fornecedor, id_cliente) VALUES (?, ?, ?, ?, ?, ?, ?)";

        try (Connection con = new Conexao().obterConexao(); PreparedStatement pstm = con.prepareStatement(sql)) {

            pstm.setInt(1, movimentacao.getTipoMovimentacao().getIdTipoMovimentacao());
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

    public boolean atualizarMovimentacao(Movimentacao movimentacao) {
        String sql = "UPDATE movimentacao_estoque SET id_tipo_movimentacao = ?, quantidade = ?, data = ?, id_produto = ?, id_usuario = ?, id_fornecedor = ?, id_cliente = ? WHERE id_movimentacao = ?";

        try (Connection con = new Conexao().obterConexao(); PreparedStatement pstm = con.prepareStatement(sql)) {

            pstm.setInt(1, movimentacao.getTipoMovimentacao().getIdTipoMovimentacao());
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

    public List<Movimentacao> obterMovimentacao() {
        String sql = "SELECT * FROM movimentacao_estoque";
        List<Movimentacao> movimentacoes = new ArrayList<>();

        try (Connection con = new Conexao().obterConexao(); PreparedStatement pstm = con.prepareStatement(sql); ResultSet rs = pstm.executeQuery()) {

            while (rs.next()) {
                int idMovimentacao = rs.getInt("id_movimentacao");
                TipoMovimentacao tipoMovimentacao = new TipoMovimentacaoDAO().buscarTipoMovimentacaoPorId(rs.getInt("id_tipo_movimentacao"));
                int quantidade = rs.getInt("quantidade");
                LocalDate data = rs.getDate("data").toLocalDate();
                Produto produto = new ProdutoDAO().buscarProdutoPorId(rs.getInt("id_produto"));
                Usuario usuario = new UsuarioDAO().buscarUsuarioPorId(rs.getInt("id_usuario"));
                Fornecedor fornecedor = rs.getInt("id_fornecedor") > 0 ? new FornecedorDAO().buscarFornecedorPorId(rs.getInt("id_fornecedor")) : null;
                Cliente cliente = rs.getInt("id_cliente") > 0 ? new ClienteDAO().buscarClientePorId(rs.getInt("id_cliente")) : null;

                Movimentacao movimentacao = new Movimentacao(idMovimentacao, tipoMovimentacao, quantidade, data, produto, usuario, fornecedor, cliente);
                movimentacoes.add(movimentacao);
            }

        } catch (SQLException e) {
            System.out.println("Erro ao obter movimentações. Erro: " + e.getMessage());
        }

        return movimentacoes;
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
