package dao;

import connection.Conexao;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import model.Telefone;

public class TelefoneDao {
    private static Connection con;
    
    public int inserirTelefone(String numero) {
        String sql = "INSERT INTO telefone (numero) values (?) ";
        int telefoneId = -1;
        con = new Conexao().obterConexao();

        try {
            PreparedStatement pstm = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            pstm.setString(1, numero);

            int resultado = pstm.executeUpdate();

            ResultSet rs = pstm.getGeneratedKeys();
            if (rs.next()) {
                telefoneId = rs.getInt(1);
            }

            pstm.close();
            con.close();

            if (resultado == 0) {
                System.out.println("Nenhum telefone inserido.");
            } else {
                System.out.println("Telefone inserido com sucesso.");
            }
        } catch (Exception e) {
            System.out.println("Erro ao inserir telefone. Erro: " + e);
        }
        
        return telefoneId;
    }
    
    public Telefone buscarTelefonePorId(int id) {
        String sql = "SELECT * FROM telefone where id_telefone = ?";
        Telefone telefone = null;
        
        con = new Conexao().obterConexao();
        
        try {
            PreparedStatement pstm = con.prepareStatement(sql);
            pstm.setInt(1, id);
            ResultSet rs = pstm.executeQuery();
            
            if (rs.next()) {
                String numero = rs.getString("numero");
                
                telefone = new Telefone(id, numero);
            }
            
            pstm.close();
            con.close();
        } catch(Exception e) {
            System.out.println("Erro ao buscar telefone. Erro: " + e);
        }
        
        return telefone;
    }
}
