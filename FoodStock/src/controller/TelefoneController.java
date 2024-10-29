package controller;

import dao.TelefoneDAO;
import model.Telefone;

public class TelefoneController {
    private TelefoneDAO telefoneDao = new TelefoneDAO();
    
    public int inserirTelefone(String numero) {
        return telefoneDao.inserirTelefone(numero);
    }
    
    public Telefone buscarTelefonePorId(int id) {
        return telefoneDao.buscarTelefonePorId(id);
    }
}
