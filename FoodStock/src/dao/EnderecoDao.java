package dao;

import connection.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import model.Endereco;

public class EnderecoDao {
    private static Connection con;
    
    public int inserirEndereco(String logradouro, String bairro, String numero, String cep, String municipio, String estado, String pais) {
        String sql = "INSERT INTO endereco (logradouro, bairro, numero, cep, municipio, estado, pais) VALUES (?, ?, ?, ?, ?, ?, ?);";
        int enderecoId = -1;

        con = new Conexao().obterConexao();

        try {
            PreparedStatement pstm = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            pstm.setString(1, logradouro);
            pstm.setString(2, bairro);
            pstm.setString(3, numero);
            pstm.setString(4, cep);
            pstm.setString(5, municipio);
            pstm.setString(6, estado);
            pstm.setString(7, pais);

            int resultado = pstm.executeUpdate();
        
            ResultSet rs = pstm.getGeneratedKeys();
            if (rs.next()) {
                enderecoId = rs.getInt(1);
            }
            pstm.close();
            con.close();

            if (resultado == 0) {
                System.out.println("Nenhum endereço inserido.");
            } else {
                System.out.println("Endereço inserido com sucesso.");
            }
        } catch (Exception e) {
            System.out.println("Erro ao inserir endereço. Erro: " + e);
        }
        
        return enderecoId;
    }
    
    public Endereco buscarEnderecoPorId(int id) {
        String sql = "SELECT * FROM endereco where id_endereco = ?";
        Endereco endereco = null;
        
        con = new Conexao().obterConexao();
        
        try {
            PreparedStatement pstm = con.prepareStatement(sql);
            pstm.setInt(1, id);
            ResultSet rs = pstm.executeQuery();
            
            if (rs.next()) {
                String logradouro = rs.getString("logradouro");
                String bairro = rs.getString("bairro");
                String numero = rs.getString("numero");
                String cep = rs.getString("cep");
                String municipio = rs.getString("municipio");
                String estado = rs.getString("estado");
                String pais = rs.getString("pais");
                
                endereco = new Endereco(id, logradouro, bairro, numero, cep, municipio, estado, pais);
            }
            
            pstm.close();
            con.close();
        } catch(Exception e) {
            System.out.println("Erro ao buscar endereço. Erro: " + e);
        }
        
        return endereco;
    }

}
