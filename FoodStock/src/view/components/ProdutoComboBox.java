package view.components;

import controller.ProdutoController;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JComboBox;
import model.Produto;

public class ProdutoComboBox {

    private Map<String, Integer> produtoMap = new HashMap<>();

    public void carregarProdutos(JComboBox<Produto> comboBox) {
        ProdutoController produtoController = new ProdutoController();
        ArrayList<Produto> produtos = produtoController.buscarProdutos();

        comboBox.removeAllItems();

        for (Produto produto : produtos) {
            comboBox.addItem(produto); 
        }
    }

    public int getProdutoId(JComboBox<Produto> comboBox) {
        Produto produtoSelecionado = (Produto) comboBox.getSelectedItem();
        if (produtoSelecionado != null) {
            return produtoSelecionado.getIdProduto(); 
        }
        return -1; 
    }
}
