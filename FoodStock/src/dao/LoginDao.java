package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import model.Usuario;

public class LoginDao {

    private static Connection con;

    private static Usuario usuario;

    public static void fazerLogin(String email, String senha) {
        String sql = "SELECT * FROM usuario WHERE email = ? AND senha = ?;";

        con = new Conexao().obterConexao();

        try {
            PreparedStatement pstm = con.prepareStatement(sql);
            pstm.setString(1, email);
            pstm.setString(2, senha);
            ResultSet rs = pstm.executeQuery();
        } catch (Exception e) {
            System.out.println("E-mail ou senha incorretos. Erro: " + e);
        }
    }
}
