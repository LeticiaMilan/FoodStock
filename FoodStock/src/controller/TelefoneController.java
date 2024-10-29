package controller;

import dao.TelefoneDao;

public class TelefoneController {
    private TelefoneDao telefoneDao = new TelefoneDao();
    
    public void inserirTelefone(String numero) {
        telefoneDao.inserirTelefone(numero);
    }
}
