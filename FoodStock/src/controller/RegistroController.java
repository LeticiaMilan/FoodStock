package controller;

import dao.RegistroDAO;

public class RegistroController {
    RegistroDAO registroDAO = new RegistroDAO();
    
    public int registrarUsuario(String nome, String cpf, String email, String senha) {
        return registroDAO.registrarUsuario(nome, cpf, email, 1, senha);
    }
}
