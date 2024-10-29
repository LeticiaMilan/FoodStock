package dao;

import connection.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class EnderecoDao {
    private static Connection con;
    
    public void inserirEndereco(String logradouro, String bairro, String numero, String cep, String municipio, String estado, String pais) {
    String sql = "INSERT INTO endereco (logradouro, bairro, numero, cep, municipio, estado, pais) VALUES (?, ?, ?, ?, ?, ?, ?);";

    con = new Conexao().obterConexao();

    try {
        PreparedStatement pstm = con.prepareStatement(sql);

        pstm.setString(1, logradouro);
        pstm.setString(2, bairro);
        pstm.setString(3, numero);
        pstm.setString(4, cep);
        pstm.setString(5, municipio);
        pstm.setString(6, estado);
        pstm.setString(7, pais);

        int resultado = pstm.executeUpdate();

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
}

}
