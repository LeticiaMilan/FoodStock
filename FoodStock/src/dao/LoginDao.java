package dao;

import connection.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class LoginDao {

    private static Connection con;

    public int fazerLogin(String email, String senha) {
        if(email.isBlank() || senha.isBlank()) {
            return 2;
        }
        
        String sql = "SELECT * FROM usuarios WHERE email = ? AND senha = ?;";

        con = new Conexao().obterConexao();

        try {
            PreparedStatement pstm = con.prepareStatement(sql);
            pstm.setString(1, email);
            pstm.setString(2, senha);
            ResultSet rs = pstm.executeQuery();
            if (rs.next()) {
                System.out.println("Login bem-sucedido!");
                return 1;
            } else {
                System.out.println("Usu�rio n�o encontrado ou senha incorreta.");
                return 0;
            }
        } catch (Exception e) {
            System.out.println("N�o foi poss�vel fazer login. Erro: " + e);
        }
        
        return 1;
    }
    
}
