package controller;

import dao.LoginDAO;
import model.Usuario;

public class LoginController {
    LoginDAO loginDAO = new LoginDAO();
    UsuarioController usuarioController = new UsuarioController();

    public Usuario fazerLogin(String email, String senha) {
        return loginDAO.fazerLogin(email, senha); 
    }

    public String getNomeUsuario(int userId) {
        return usuarioController.buscarNomeUsuarioPorId(userId); 
    }
}