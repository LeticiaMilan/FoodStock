package controller;

import dao.LoginDAO;

public class LoginController {
    LoginDAO loginDAO = new LoginDAO();
    UsuarioController usuarioController = new UsuarioController();

    public int fazerLogin(String email, String senha) {
        return loginDAO.fazerLogin(email, senha); 
    }

    public String getNomeUsuario(int userId) {
        return usuarioController.buscarNomeUsuarioPorId(userId); 
    }
}