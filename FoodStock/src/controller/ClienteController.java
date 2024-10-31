package controller;

import dao.ClienteDAO;
import java.util.ArrayList;
import java.util.List;
import model.Cliente;

public class ClienteController {

    private ClienteDAO clienteDAO;

    public ClienteController() {
        clienteDAO = new ClienteDAO();
    }

    public boolean adicionarCliente(String nome, String cpfCnpj, String email,
                                    String numeroTelefone, String logradouro, String bairro,
                                    String numeroEndereco, String cep, String municipio,
                                    String estado, String pais) {
        
        if (nome.isEmpty() || cpfCnpj.isEmpty() || email.isEmpty()) {
            System.out.println("Erro: Campos obrigatórios não preenchidos.");
            return false;
        }

        boolean inserido = clienteDAO.inserirCliente(nome, cpfCnpj, email, numeroTelefone,
                                                     logradouro, bairro, numeroEndereco, cep,
                                                     municipio, estado, pais);
        return inserido;
    }

    public boolean atualizarCliente(int idCliente, String nome, String cpfCnpj, String email,
                                    String numeroTelefone, String logradouro, String bairro,
                                    String numeroEndereco, String cep, String municipio,
                                    String estado, String pais) {
        
        if (nome.isEmpty() || cpfCnpj.isEmpty() || email.isEmpty()) {
            System.out.println("Erro: Campos obrigatórios não preenchidos.");
            return false;
        }
        
        boolean atualizado = clienteDAO.atualizarCliente(idCliente, nome, cpfCnpj, email, numeroTelefone,
                                                         logradouro, bairro, numeroEndereco, cep,
                                                         municipio, estado, pais);
        return atualizado;
    }

    public List<Cliente> obterClientes() {
        return clienteDAO.obterClientes(); 
    }
    
    public void deletarClientePorId(int idCliente) {
        clienteDAO.deletarClientePorId(idCliente);
    }
    
    public ArrayList<Cliente> buscarClientes() {
        return clienteDAO.buscarClientes();
    }
    
    public Cliente buscarClientePorId(int id) {
        return clienteDAO.buscarClientePorId(id);
    }
    
    public String buscarNomeClientePorId(int id) {
        return clienteDAO.buscarNomeClientePorId(id);
    }
}
