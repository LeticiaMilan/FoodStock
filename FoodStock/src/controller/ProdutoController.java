package controller;

import dao.ProdutoDAO;
import java.util.ArrayList;
import model.Produto;

public class ProdutoController {

    private ProdutoDAO produtoDAO = new ProdutoDAO();
    
     public ProdutoController() {
        this.produtoDAO = new ProdutoDAO();
    }

    public void inserirProduto(String nome, String descricao, double preco_venda, double preco_custo, int quantidade, int categoria, int fornecedor) {
        produtoDAO.inserirProduto(nome, descricao, preco_venda, preco_custo, quantidade, categoria, fornecedor);
    }

    public ArrayList<Produto> obterProdutos() {
        return produtoDAO.obterProdutos();
    }
    
    public ArrayList<Produto> buscarProdutos() {
        return produtoDAO.buscarProdutos();
    }

    public void deletarProdutoPorId(int id) {
        produtoDAO.deletarProdutoPorId(id);
    }

    public void atualizarProduto(int id, String nome, String descricao, double preco_venda, double preco_custo, int quantidade, int id_categoria, int id_fornecedor) {
        produtoDAO.atualizarProduto(id, nome, descricao, preco_venda, preco_custo, quantidade, id_categoria, id_fornecedor);
    }

    public String buscarNomeProdutoPorId(int id) {
        return produtoDAO.buscarNomeProdutoPorId(id);
    }

    public Produto buscarProdutoPorId(int id) {
        return produtoDAO.buscarProdutoPorId(id);
    }
}
