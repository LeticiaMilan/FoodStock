package controller;

import dao.ProdutoDao;
import java.util.ArrayList;
import model.Produto;

public class ProdutoController {
    private ProdutoDao produtoDao = new ProdutoDao();
    
    public void inserirProduto(String nome, String descricao, double preco_venda, double preco_custo, int quantidade, int categoria, int fornecedor) {
        produtoDao.inserirProduto(nome, descricao, preco_venda, preco_custo, quantidade, categoria, fornecedor);
    }
    
    public ArrayList<Produto> obterProdutos() {
        return produtoDao.obterProdutos();
    }
    
    public void deletarProdutoPorId(int id) {
        produtoDao.deletarProdutoPorId(id);
    }
}
