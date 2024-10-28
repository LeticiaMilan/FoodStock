package dao;

import connection.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import model.Produto;

public class ProdutoDao {
    private static Connection con;
    private static Produto produto;
    
    public void inserirProduto(String nome, String descricao, double preco_venda, double preco_custo, int quantidade, int categoria, int fornecedor) {
        String sql = "INSERT INTO produtos (nome, descricao, preco_venda, preco_custo, quantidade, id_categoria, id_fornecedor) VALUES (?, ?, ?, ?, ?, ?, ?);";
        
        con = new Conexao().obterConexao();
        
        try {
            PreparedStatement pstm = con.prepareStatement(sql);
            
            pstm.setString(1, nome);
            pstm.setString(2, descricao);
            pstm.setDouble(3, preco_venda);
            pstm.setDouble(4, preco_custo);
            pstm.setInt(5, quantidade);
            pstm.setInt(6, categoria);
            pstm.setInt(7, fornecedor);
            
            int resultado = pstm.executeUpdate();
            
            pstm.close();
            con.close();
            
            if (resultado == 0) {
                System.out.println("Nenhum produto inserido.");
            } else {
                System.out.println("Produto inserido com sucesso.");
            }
        } catch(Exception e) {
            System.out.println("Erro ao inserir produto. Erro: " + e);
        }
    }
    
    public void deletarProdutoPorId(int id) {
        String sql = "DELETE FROM produtos WHERE id_produto = ?;";
        
        con = new Conexao().obterConexao();
        
        try {
            PreparedStatement pstm = con.prepareStatement(sql);
            pstm.setInt(1, id);
            int resultado = pstm.executeUpdate(); 
            
            pstm.close();
            con.close();
            
            if (resultado == 0) {
                System.out.println("Nenhum produto removido.");
            } else {
                System.out.println("Produto removido com sucesso.");
            }
        } catch(Exception e) {
            System.out.println("Erro ao remover produto. Erro: " + e);
        }
    }
    
    public static void atualizarProduto(int id, String nome, String descricao, double preco_venda, double preco_custo, int quantidade) {
        String sql = "UPDATE produtos SET nome = ?, descricao = ?, preco_venda = ?, preco_custo = ?, quantidade = ? WHERE id_produto = ?;";
        
        con = new Conexao().obterConexao();
        
        try {
            PreparedStatement pstm = con.prepareStatement(sql);
            
            pstm.setString(1, nome);
            pstm.setString(2, descricao);
            pstm.setDouble(3, preco_venda);
            pstm.setDouble(4, preco_custo);
            pstm.setInt(5, quantidade);
            pstm.setInt(6, id);
            
            int resultado = pstm.executeUpdate();
            
            pstm.close();
            con.close();
            
            if (resultado == 0) {
                System.out.println("Nenhum produto foi atualizado.");
            } else {
                System.out.println("Produto atualizado com sucesso.");
            }
        } catch(Exception e) {
            System.out.println("Erro ao atualizar produto. Erro: " + e);
        }
    }
    
    public static ArrayList<Produto> obterProdutos() {
        String sql = "SELECT * FROM usuarios";
        con = new Conexao().obterConexao();
        
        ArrayList<Produto> listaProdutos = new ArrayList();
        
        try {
            PreparedStatement pstm = con.prepareStatement(sql);
            ResultSet rs = pstm.executeQuery();
            
            while (rs.next()) {
                int id = rs.getInt("id_produto");
                String nome = rs.getString("nome");
                String descricao = rs.getString("descricao");
                double preco_venda = rs.getDouble("preco_venda");
                double preco_custo = rs.getDouble("preco_custo");
                int quantidade = rs.getInt("quantidade");
                int categoria = rs.getInt("categoria");
                int fornecedor = rs.getInt("fornecedor");
                
                produto = new Produto(id, nome, descricao, preco_venda, preco_custo, quantidade, categoria, fornecedor);
                listaProdutos.add(produto);
            }
            
        } catch(Exception e) {
            System.out.println("Erro ao buscar todos os usuários. Erro: " + e);
        }
        
        return listaProdutos;
    }
}
