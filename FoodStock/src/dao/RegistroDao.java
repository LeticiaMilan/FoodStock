package dao;

import connection.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import model.Usuario;

public class RegistroDao {
    private static Connection con;
    
    private static Usuario usuario;
    
    public static void registrarUsuario(String nome, String cpf, String email, String tipo, String senha) {
        String sql = "INSERT INTO usuarios (nome, cpf, email, tipo, senha) VALUES (?, ?, ?, ?, ?);";
        
        con = new Conexao().obterConexao();
        
        try {
            PreparedStatement pstm = con.prepareStatement(sql);

            pstm.setString(1, nome);
            pstm.setString(2, cpf);
            pstm.setString(3, email);
            pstm.setString(4, tipo);
            pstm.setString(5, senha);
            int resultado = pstm.executeUpdate();
            pstm.close();
            
            con.close();
            
            if (resultado == 0) {
                System.out.println("Nenhum usuário registrado.");
            } else {
                System.out.println("Usuário registrado com sucesso.");
            }
        } catch(Exception e) {
            System.out.println("Erro ao registrar usuário. Erro: " + e);
        }
    }
    
    public static void mudarSenha(int id, String senha) {
        String sql = "UPDATE usuario SET senha = ? WHERE id = ?;";
        
        con = new Conexao().obterConexao();
        
        try {
            PreparedStatement pstm = con.prepareStatement(sql);
            pstm.setString(1, senha);
            pstm.setInt(2, id);
            int resultado = pstm.executeUpdate();
            
            pstm.close();
            con.close();
            
            if (resultado == 0) {
                System.out.println("Nenhuma senha foi atualizada.");
            } else {
                System.out.println("Senha atualizada com sucesso.");
            }
        } catch(Exception e) {
            System.out.println("Erro ao atualizar senha. Erro: " + e);
        }
    }

}
