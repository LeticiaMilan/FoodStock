package controller;

import dao.FornecedorDao;
import java.util.ArrayList;
import model.Fornecedor;

public class FornecedorController {
    FornecedorDao fornecedorDao = new FornecedorDao();
    
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
