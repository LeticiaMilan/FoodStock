package dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import model.TipoMovimentacao;

public class TipoMovimentacaoDAO {
    private Connection connection;

    public TipoMovimentacaoDAO(Connection connection) {
        this.connection = connection;
    }

    public void adicionarTipoMovimentacao(TipoMovimentacao tipo) throws SQLException {
        String sql = "INSERT INTO tipo_movimentacao (tipo) VALUES (?)";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, tipo.getTipo());
            statement.executeUpdate();
        }
    }

    public List<TipoMovimentacao> listarTiposMovimentacao() throws SQLException {
        List<TipoMovimentacao> tipos = new ArrayList<>();
        String sql = "SELECT * FROM tipo_movimentacao";

        try (Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(sql)) {
            while (resultSet.next()) {
                TipoMovimentacao tipo = new TipoMovimentacao(
                        resultSet.getInt("id_tipo_movimentacao"),
                        resultSet.getString("tipo")
                );
                tipos.add(tipo);
            }
        }
        return tipos;
    }

    public void atualizarTipoMovimentacao(TipoMovimentacao tipo) throws SQLException {
        String sql = "UPDATE tipo_movimentacao SET tipo = ? WHERE id_tipo_movimentacao = ?";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, tipo.getTipo());
            statement.setInt(2, tipo.getIdTipoMovimentacao());
            statement.executeUpdate();
        }
    }

    public void deletarTipoMovimentacao(int id) throws SQLException {
        String sql = "DELETE FROM tipo_movimentacao WHERE id_tipo_movimentacao = ?";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setInt(1, id);
            statement.executeUpdate();
        }
    }
}