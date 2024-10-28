package dao;

import connection.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import model.Usuario;
import java.sql.ResultSet;

public class RegistroDao {
    private static Connection con;
    
    private static Usuario usuario;
    
    public int registrarUsuario(String nome, String cpf, String email, int tipo, String senha) {
        if(nome.isBlank() || email.isBlank() || cpf.isBlank() || senha.isBlank()) {
            return 2;
        }
        
        String sqlInserirUsuario = "INSERT INTO usuarios (nome, cpf, email, id_tipo_usuario, senha) VALUES (?, ?, ?, ?, ?);";
        String sqlVerificaCpf = "SELECT COUNT(*) FROM usuarios WHERE cpf = ?;";
        String sqlVerificaEmail = "SELECT COUNT(*) FROM usuarios WHERE email = ?;";
        
        con = new Conexao().obterConexao();
        
        try {
            PreparedStatement pstmVerificaEmail = con.prepareStatement(sqlVerificaEmail);
            pstmVerificaEmail.setString(1, email);
            ResultSet rsEmail = pstmVerificaEmail.executeQuery();

            if (rsEmail.next() && rsEmail.getInt(1) > 0) {
                rsEmail.close();
                pstmVerificaEmail.close();
                con.close();
                return 4;
            }

            rsEmail.close();
            pstmVerificaEmail.close();
            
            PreparedStatement pstmVerificaCpf = con.prepareStatement(sqlVerificaCpf);
            pstmVerificaCpf.setString(1, cpf);
            ResultSet rsCpf = pstmVerificaCpf.executeQuery();

            if (rsCpf.next() && rsCpf.getInt(1) > 0) {
                rsCpf.close();
                pstmVerificaCpf.close();
                con.close();
                return 3;
            }

            rsCpf.close();
            pstmVerificaCpf.close();
            
            PreparedStatement pstm = con.prepareStatement(sqlInserirUsuario);

            pstm.setString(1, nome);
            pstm.setString(2, cpf);
            pstm.setString(3, email);
            pstm.setInt(4, tipo);
            pstm.setString(5, senha);
            int resultado = pstm.executeUpdate();
            
            pstm.close();
            
            con.close();
            
            if (resultado == 0) {
                return 0;
            } else {
                return 1;
            }
        } catch(Exception e) {
            System.out.println("Erro ao registrar usuário. Erro: " + e);
        }
        
        return 1;
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
