package controller;

import dao.UsuarioDAO;
import java.util.ArrayList;
import java.util.List;
import model.Usuario;

public class UsuarioController {
    
    private UsuarioDAO usuarioDAO;

    public UsuarioController() {
        usuarioDAO = new UsuarioDAO();
    }
    
    public String buscarNomeUsuarioPorId(int id) {
        return usuarioDAO.buscarNomeUsuarioPorId(id);
    }
    
    public Usuario buscarUsuarioPorId(int id) {
        return usuarioDAO.buscarUsuarioPorId(id);
    }
}
