package dao;

import connection.Conexao;
import java.util.ArrayList;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import model.Categoria;

public class CategoriaDao {
    private static Categoria categoria;
    private static Connection con;
    
    public ArrayList<Categoria> buscarCategorias() {
        ArrayList<Categoria> categorias = new ArrayList<>();
        String sql = "SELECT * FROM categorias";

        try {
            con = new Conexao().obterConexao();
            PreparedStatement pstm = con.prepareStatement(sql);
            ResultSet rs = pstm.executeQuery();

            while (rs.next()) {
                int id = rs.getInt("id_categoria");
                String nome = rs.getString("nome");
                categoria = new Categoria(id, nome);
                categorias.add(categoria);
            }

        } catch (Exception e) {
            System.out.println("Erro ao buscar categorias: " + e);
        }

        return categorias;
    }
    
    public String buscarCategoriaPorId(int id) {
        String sql = "SELECT nome FROM categorias where id_categoria = ?";
        String nome = null;
        
        con = new Conexao().obterConexao();
        
        try {
            PreparedStatement pstm = con.prepareStatement(sql);
            pstm.setInt(1, id);
            ResultSet rs = pstm.executeQuery();
            
            if (rs.next()) {
                nome = rs.getString("nome");
            }
            
            pstm.close();
            con.close();
        } catch(Exception e) {
            System.out.println("Erro ao buscar categoria. Erro: " + e);
        }
        
        return nome;
    }
}
