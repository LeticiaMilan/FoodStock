package controller;

import dao.FornecedorDAO;
import java.util.ArrayList;
import model.Fornecedor;

public class FornecedorController {
    FornecedorDAO fornecedorDao = new FornecedorDAO();
    
    public ArrayList<Fornecedor> buscarFornecedores() {
        return fornecedorDao.buscarFornecedores();
    }
    
    public String buscarNomeFornecedorPorId(int id) {
        return fornecedorDao.buscarNomeFornecedorPorId(id);
    }
    
    public void inserirFornecedor(String nome, String cnpj, String email, int enderecoId, int telefoneId) {
        fornecedorDao.inserirFornecedor(nome, cnpj, email, enderecoId, telefoneId);
    }
    
    public Fornecedor buscarFornecedorPorId(int id) {
        return fornecedorDao.buscarFornecedorPorId(id);
    }
}
