package controller;

import dao.FornecedorDao;
import java.util.ArrayList;
import model.Fornecedor;

public class FornecedorController {
    FornecedorDao fornecedorDao = new FornecedorDao();
    
    public ArrayList<Fornecedor> buscarFornecedores() {
        return fornecedorDao.buscarFornecedores();
    }
    
    public String buscarFornecedorPorId(int id) {
        return fornecedorDao.buscarFornecedorPorId(id);
    }
}
