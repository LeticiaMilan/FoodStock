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

        for (Cliente cliente : clientes) {
            String nome = cliente.getNome();
            int id = cliente.getIdCliente();
            comboBox.addItem(nome);
            clienteMap.put(nome, id);
        }
    }

    public void carregarClientesEstoque(JComboBox<Cliente> comboBox) {
        ClienteController clienteController = new ClienteController();
        ArrayList<Cliente> clientes = clienteController.buscarClientes();

        comboBox.removeAllItems();

        for (Cliente cliente : clientes) {
            comboBox.addItem(cliente);
        }
    }

    public int getClienteId(JComboBox<String> comboBox) {
        String nomeSelecionado = (String) comboBox.getSelectedItem();
        return clienteMap.get(nomeSelecionado);
    }

    public int getClienteIdEstoque(JComboBox<Cliente> comboBox) {
        Cliente clienteSelecionado = (Cliente) comboBox.getSelectedItem();
        if (clienteSelecionado != null) {
            int id = clienteSelecionado.getIdCliente();
            System.out.println("Cliente selecionado: " + clienteSelecionado.getNome() + ", ID: " + id);
            return id;
        }
        return -1;
    }
}
