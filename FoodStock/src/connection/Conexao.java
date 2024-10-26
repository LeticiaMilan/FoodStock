package connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexao {

    private String url, usuario, senha;
    private Connection con;

    public Conexao() {
        url = "jdbc:postgresql://localhost:5432/Estoque";
        usuario = "postgres";
        senha = "123";

        try {
            Class.forName("org.postgresql.Driver");
            con = DriverManager.getConnection(url, usuario, senha);
            System.out.println("Conexão realizada com sucesso!");
        } catch (Exception e) {
            System.out.println("Erro ao iniciar a conexão com o banco. Erro " + e);
        }
    }

    public Connection obterConexao() {
        return con;
    }
}
