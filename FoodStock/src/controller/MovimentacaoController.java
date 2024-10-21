package controller;

import dao.MovimentacaoDAO;

public class MovimentacaoController {
    private MovimentacaoDAO movimentacaoDAO;
    
    public MovimentacaoController() {
        movimentacaoDAO = new MovimentacaoDAO();
    }
}
