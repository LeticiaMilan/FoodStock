package view.components;

import controller.ClienteController;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JComboBox;
import model.Cliente;

public class ClienteComboBox {
    private Map<String, Integer> clienteMap = new HashMap<>();
    
    public void carregarClientes(JComboBox<String> comboBox) {
        ClienteController clienteController = new ClienteController();
        ArrayList<Cliente> clientes = clienteController.buscarClientes();

        comboBox.removeAllItems();
        clienteMap.clear();

        for(Cliente cliente : clientes) {
            String nome = cliente.getNome();
            int id = cliente.getIdCliente();
            comboBox.addItem(nome);
            clienteMap.put(nome, id);
        }
    }
    
    public int getClienteId(JComboBox<String> comboBox) {
        String nomeSelecionado = (String) comboBox.getSelectedItem();
        return clienteMap.get(nomeSelecionado);
    }
}
