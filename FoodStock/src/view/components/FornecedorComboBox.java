package view.components;

import controller.FornecedorController;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JComboBox;
import model.Fornecedor;

public class FornecedorComboBox {
    private Map<String, Integer> fornecedorMap = new HashMap<>();
    
    public void carregarFornecedores(JComboBox<String> comboBox) {
        FornecedorController fornecedorController = new FornecedorController();
        ArrayList<Fornecedor> fornecedores = fornecedorController.buscarFornecedores();

        comboBox.removeAllItems();
        fornecedorMap.clear();

        for (Fornecedor fornecedor : fornecedores) {
            String nome = fornecedor.getNome();
            int id = fornecedor.getId_fornecedor();
            comboBox.addItem(nome);
            fornecedorMap.put(nome, id);
        }
    }
    
    public int getFornecedorId(JComboBox<String> comboBox) {
        String nomeSelecionado = (String) comboBox.getSelectedItem();
        return fornecedorMap.get(nomeSelecionado);
    }
}
