package dao;

import connection.Conexao;
import model.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class UsuarioDAO {

    private static Connection con;
    private static Usuario usuario;

    public String buscarNomeUsuarioPorId(int id) {
        String sql = "SELECT nome FROM usuarios WHERE id_usuario = ?";
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
        } catch (Exception e) {
            System.out.println("Erro ao buscar o nome do usuário. Erro: " + e);
        }

        return nome;
    }

    public Usuario buscarUsuarioPorId(int id) {
        String sql = "SELECT * FROM usuarios where id_usuario = ?";
        Usuario usuario = null;

        con = new Conexao().obterConexao();

        try {
            PreparedStatement pstm = con.prepareStatement(sql);
            pstm.setInt(1, id);
            ResultSet rs = pstm.executeQuery();

            if (rs.next()) {
                String nome = rs.getString("nome");
                String cpf = rs.getString("cpf");
                String email = rs.getString("email");
                String tipo = rs.getString("tipo");
                String senha = rs.getString("senha");

                usuario = new Usuario(id, nome, cpf, email, tipo, senha);
            }

            pstm.close();
            con.close();
        } catch (Exception e) {
            System.out.println("Erro ao buscar usuario. Erro: " + e);
        }

        return usuario;
    }
}
