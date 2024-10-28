package view.components;

import controller.CategoriaController;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JComboBox;
import model.Categoria;

public class CategoriaComboBox {
    private Map<String, Integer> categoriaMap = new HashMap<>();
    
    public void carregarCategorias(JComboBox<String> comboBox) {
        CategoriaController categoriaController = new CategoriaController();
        ArrayList<Categoria> categorias = categoriaController.buscarCategorias();

        comboBox.removeAllItems();
        categoriaMap.clear();

        for (Categoria categoria : categorias) {
            String nome = categoria.getNome();
            int id = categoria.getId_categoria();
            comboBox.addItem(nome);
            categoriaMap.put(nome, id);
        }
    }
    
    public int getCategoriaId(JComboBox<String> comboBox) {
        String nomeSelecionado = (String) comboBox.getSelectedItem();
        return categoriaMap.get(nomeSelecionado);
    }
}
