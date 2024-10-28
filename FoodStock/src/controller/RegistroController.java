package controller;

import dao.RegistroDao;

public class RegistroController {
    RegistroDao registroDao = new RegistroDao();
    
    public int registrarUsuario(String nome, String cpf, String email, String senha) {
        return registroDao.registrarUsuario(nome, cpf, email, 1, senha);
    }
}
