package dao;

import connection.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class TelefoneDao {
    private static Connection con;
    
    public void inserirTelefone(String numero) {
    String sql = "INSERT INTO telefone values (?) ";
    con = new Conexao().obterConexao();

    try {
        PreparedStatement pstm = con.prepareStatement(sql);

        pstm.setString(1, numero);

        int resultado = pstm.executeUpdate();

        pstm.close();
        con.close();

        if (resultado == 0) {
            System.out.println("Nenhum telefone inserido.");
        } else {
            System.out.println("Endereço telefone com sucesso.");
        }
    } catch (Exception e) {
        System.out.println("Erro ao inserir telefone. Erro: " + e);
    }
}
}
