package dao;

import connection.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class LoginDao {

    private static Connection con;

    public void fazerLogin(String email, String senha) {
        String sql = "SELECT * FROM usuario WHERE email = ? AND senha = ?;";

        con = new Conexao().obterConexao();

        try {
            PreparedStatement pstm = con.prepareStatement(sql);
            pstm.setString(1, email);
            pstm.setString(2, senha);
            ResultSet rs = pstm.executeQuery();
            if (rs.next()) {
                System.out.println("Login bem-sucedido!");
            } else {
                System.out.println("Usuário não encontrado ou senha incorreta.");
            }
        } catch (Exception e) {
            System.out.println("Não foi possível fazer login. Erro: " + e);
        }
    }
}
