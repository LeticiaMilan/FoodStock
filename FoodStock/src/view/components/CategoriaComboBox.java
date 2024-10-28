package view.components;

import controller.CategoriaController;
import java.util.ArrayList;
import javax.swing.JComboBox;
import model.Categoria;

public class CategoriaComboBox {
    public void carregarCategorias(JComboBox<String> comboBox) {
        CategoriaController categoriaController = new CategoriaController();
        ArrayList<Categoria> categorias = categoriaController.buscarCategorias();

        comboBox.removeAllItems();

        for (Categoria categoria : categorias) {
            String nome = categoria.getNome();
            comboBox.addItem(nome);
        }
    }
}
