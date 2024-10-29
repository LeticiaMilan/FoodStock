package controller;

import dao.MovimentacaoDAO;
import java.time.LocalDate;
import java.util.List;
import model.Cliente;
import model.Fornecedor;
import model.Movimentacao;
import model.Produto;
import model.TipoMovimentacao;
import model.Usuario;

public class MovimentacaoController {
    private MovimentacaoDAO movimentacaoDAO;

    public MovimentacaoController() {
        movimentacaoDAO = new MovimentacaoDAO();
    }

    public boolean adicionarMovimentacao(TipoMovimentacao tipoMovimentacao, int quantidade, LocalDate data, Produto produto, Usuario usuario, Fornecedor fornecedor, Cliente cliente) {
        if (tipoMovimentacao.getTipo().equalsIgnoreCase("Entrada") && fornecedor == null) {
            System.out.println("Erro: Fornecedor é necessário para movimentações de entrada.");
            return false;
        } else if (tipoMovimentacao.getTipo().equalsIgnoreCase("Saida") && cliente == null) {
            System.out.println("Erro: Cliente é necessário para movimentações de saída.");
            return false;
        }
        
        Movimentacao movimentacao = new Movimentacao(tipoMovimentacao, quantidade, data, produto, usuario, fornecedor, cliente);
        return movimentacaoDAO.inserirMovimentacao(movimentacao);
    }
    
    public boolean atualizarMovimentacao(int idMovimentacao, TipoMovimentacao tipoMovimentacao, int quantidade, LocalDate data, Produto produto, Usuario usuario, Fornecedor fornecedor, Cliente cliente) {
        if (tipoMovimentacao.getTipo().equalsIgnoreCase("Entrada") && fornecedor == null) {
            System.out.println("Erro: Fornecedor é necessário para movimentações de entrada.");
            return false;
        } else if (tipoMovimentacao.getTipo().equalsIgnoreCase("Saida") && cliente == null) {
            System.out.println("Erro: Cliente é necessário para movimentações de saída.");
            return false;
        }

        Movimentacao movimentacao = new Movimentacao(idMovimentacao, tipoMovimentacao, quantidade, data, produto, usuario, fornecedor, cliente);
        return movimentacaoDAO.atualizarMovimentacao(movimentacao);
    }

    public List<Movimentacao> obterMovimentacao() {
        return movimentacaoDAO.obterMovimentacao(); 
    }

    public void deletarMovimentacaoPorId(int idMovimentacao) {
        movimentacaoDAO.deletarMovimentacaoPorId(idMovimentacao);
    }
}
