package controller;

import dao.ProdutoDAO;
import java.util.ArrayList;
import model.Produto;

public class ProdutoController {
    private ProdutoDAO produtoDao = new ProdutoDAO();
    
    public void inserirProduto(String nome, String descricao, double preco_venda, double preco_custo, int quantidade, int categoria, int fornecedor) {
        produtoDao.inserirProduto(nome, descricao, preco_venda, preco_custo, quantidade, categoria, fornecedor);
    }
    
    public ArrayList<Produto> obterProdutos() {
        return produtoDao.obterProdutos();
    }
    
    public void deletarProdutoPorId(int id) {
        produtoDao.deletarProdutoPorId(id);
    }
    
    public void atualizarProduto(int id, String nome, String descricao, double preco_venda, double preco_custo, int quantidade, int id_categoria, int id_fornecedor) {
        produtoDao.atualizarProduto(id, nome, descricao, preco_venda, preco_custo, quantidade, id_categoria, id_fornecedor);
    }
}
