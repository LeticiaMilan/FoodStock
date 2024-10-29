package controller;

import dao.TelefoneDao;
import model.Telefone;

public class TelefoneController {
    private TelefoneDao telefoneDao = new TelefoneDao();
    
    public int inserirTelefone(String numero) {
        return telefoneDao.inserirTelefone(numero);
    }
    
    public Telefone buscarTelefonePorId(int id) {
        return telefoneDao.buscarTelefonePorId(id);
    }
}
