package dao;

import connection.Conexao;
import controller.MovimentacaoController;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import model.Usuario;
import view.CadastrarEntradaEstoqueView;
import view.HomeView;
import view.LoginView;

public class LoginDAO {

    private static Connection con;
    private static Usuario usuarioSessao;
    private static LoginView mov;
    
    public Usuario fazerLogin(String email, String senha) {
        if(email.isBlank() || senha.isBlank()) {
            return new Usuario(-1, "", "");
        }
        
        String sql = "SELECT * FROM usuarios WHERE email = ? AND senha = ?;";

        con = new Conexao().obterConexao();

        try {
            PreparedStatement pstm = con.prepareStatement(sql);
            pstm.setString(1, email);
            pstm.setString(2, senha);
            ResultSet rs = pstm.executeQuery();
            if (rs.next()) {
                int id = rs.getInt("id_usuario");
                String nome = rs.getString("nome");
                
                System.out.println("Login bem-sucedido!");
                
                usuarioSessao = new Usuario(id, nome, email);
                
                return usuarioSessao;
            } else {
                System.out.println("Usuário não encontrado ou senha incorreta.");
                return new Usuario(0, "", "");
            }
        } catch (Exception e) {
            System.out.println("Não foi possível fazer login. Erro: " + e);
        }
        
        return usuarioSessao;
    }

}
