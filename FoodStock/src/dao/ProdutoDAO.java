package dao;

import connection.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import model.Produto;

public class ProdutoDAO {
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
    
    public void atualizarProduto(int id, String nome, String descricao, double preco_venda, double preco_custo, int quantidade, int id_categoria, int id_fornecedor) {
        String sql = "UPDATE produtos SET nome = ?, descricao = ?, preco_venda = ?, preco_custo = ?, quantidade = ?, id_categoria = ?, id_fornecedor = ? WHERE id_produto = ?;";
        
        con = new Conexao().obterConexao();
        
        try {
            PreparedStatement pstm = con.prepareStatement(sql);
            
            pstm.setString(1, nome);
            pstm.setString(2, descricao);
            pstm.setDouble(3, preco_venda);
            pstm.setDouble(4, preco_custo);
            pstm.setInt(5, quantidade);
            pstm.setInt(6, id_categoria);
            pstm.setInt(7, id_fornecedor);
            pstm.setInt(8, id);
            
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
    
    public ArrayList<Produto> obterProdutos() {
        String sql = "SELECT * FROM produtos";
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
                int categoria = rs.getInt("id_categoria");
                int fornecedor = rs.getInt("id_fornecedor");
                
                produto = new Produto(id, nome, descricao, preco_venda, preco_custo, quantidade, categoria, fornecedor);
                listaProdutos.add(produto);
            }
            
        } catch(Exception e) {
            System.out.println("Erro ao buscar todos os produtos. Erro: " + e);
        }
        
        return listaProdutos;
    }
    
    public ArrayList<Produto> buscarProdutos() {
        ArrayList<Produto> produtos = new ArrayList<>();
        String sql = "SELECT * FROM produtos";

        try {
            con = new Conexao().obterConexao();
            PreparedStatement pstm = con.prepareStatement(sql);
            ResultSet rs = pstm.executeQuery();

            while (rs.next()) {
                int id = rs.getInt("id_produto");
                String nome = rs.getString("nome");
                String descricao = rs.getString("descricao");
                double preco_venda = rs.getDouble("preco_venda");
                double preco_custo = rs.getDouble("preco_custo");
                int quantidade = rs.getInt("quantidade");
                int categoria = rs.getInt("id_categoria");
                int fornecedor = rs.getInt("id_fornecedor");
                
                produto = new Produto(id, nome, descricao, preco_venda, preco_custo, quantidade, categoria, fornecedor);
                produtos.add(produto);
            }

        } catch (Exception e) {
            System.out.println("Erro ao buscar fornecedores: " + e);
        }

        return produtos;
    }
    
    public String buscarNomeProdutoPorId(int id) {
        String sql = "SELECT nome FROM produtos where id_produto = ?";
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
            System.out.println("Erro ao buscar produto. Erro: " + e);
        }
        
        return nome;
    }
    
    public Produto buscarProdutoPorId(int id) {
        String sql = "SELECT * FROM produtos where id_produto = ?";
        Produto produto = null;
        
        con = new Conexao().obterConexao();
        
        try {
            PreparedStatement pstm = con.prepareStatement(sql);
            pstm.setInt(1, id);
            ResultSet rs = pstm.executeQuery();
            
            if (rs.next()) {
                String nome = rs.getString("nome");
                String descricao = rs.getString("descricao");
                double preco_venda = rs.getDouble("preco_venda");
                double preco_custo = rs.getDouble("preco_custo");
                int quantidade = rs.getInt("quantidade");
                int categoria = rs.getInt("id_categoria");
                int fornecedor = rs.getInt("id_fornecedor");
                
                produto = new Produto(id, nome, descricao, preco_venda, preco_custo, quantidade, categoria, fornecedor);
            }
            
            pstm.close();
            con.close();
        } catch(Exception e) {
            System.out.println("Erro ao buscar produto. Erro: " + e);
        }
        
        return produto;
    }
}
