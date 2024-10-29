package controller;

import dao.MovimentacaoDAO;
import java.time.LocalDate;
import java.util.List;
import model.Cliente;
import model.Fornecedor;
import model.Movimentacao;
import model.Produto;
import model.TipoMovimentacao;
import model.TipoMovimentacaoEnum;
import model.Usuario;

public class MovimentacaoController {

    private MovimentacaoDAO movimentacaoDAO;

    public MovimentacaoController() {
        movimentacaoDAO = new MovimentacaoDAO();
    }

    public boolean adicionarMovimentacao(TipoMovimentacaoEnum tipoMovimentacao, int quantidade, LocalDate data, Produto produto, Usuario usuario, Fornecedor fornecedor, Cliente cliente) {
        // Verifica se o tipoMovimentacao corresponde ao ID esperado para "Entrada"
        if (tipoMovimentacao.getId() == TipoMovimentacaoEnum.ENTRADA.getId() && fornecedor == null) {
            System.out.println("Erro: Fornecedor é necessário para movimentações de entrada.");
            return false;
        } else if (tipoMovimentacao.getId() == TipoMovimentacaoEnum.SAIDA.getId() && cliente == null) {
            System.out.println("Erro: Cliente é necessário para movimentações de saída.");
            return false;
        }

        Movimentacao movimentacao = new Movimentacao(tipoMovimentacao, quantidade, data, produto, usuario, fornecedor, cliente);
        return movimentacaoDAO.inserirMovimentacao(movimentacao);
    }

    /*public boolean atualizarMovimentacao(int idMovimentacao, TipoMovimentacao tipoMovimentacao, int quantidade, LocalDate data, Produto produto, Usuario usuario, Fornecedor fornecedor, Cliente cliente) {
        // Obtém o id do enum associado ao TipoMovimentacao
        int tipoMovimentacaoId = tipoMovimentacao.getTipoMovimentacaoEnum().getId();

        if (tipoMovimentacaoId == TipoMovimentacaoEnum.ENTRADA.getId() && fornecedor == null) {
            System.out.println("Erro: Fornecedor é necessário para movimentações de entrada.");
            return false;
        } else if (tipoMovimentacaoId == TipoMovimentacaoEnum.SAIDA.getId() && cliente == null) {
            System.out.println("Erro: Cliente é necessário para movimentações de saída.");
            return false;
        }

        Movimentacao movimentacao = new Movimentacao(idMovimentacao, tipoMovimentacao, quantidade, data, produto, usuario, fornecedor, cliente);
        return movimentacaoDAO.atualizarMovimentacao(movimentacao);
    }*/

    /*public List<Movimentacao> obterMovimentacao() {
        return movimentacaoDAO.obterMovimentacao(); 
    }*/
    public void deletarMovimentacaoPorId(int idMovimentacao) {
        movimentacaoDAO.deletarMovimentacaoPorId(idMovimentacao);
    }

    
    public boolean adicionarEntradaEstoque(TipoMovimentacaoEnum tipoMovimentacao, LocalDate data, int quantidade, Produto produto, Fornecedor fornecedor) {
    if (tipoMovimentacao == TipoMovimentacaoEnum.ENTRADA && fornecedor == null) {
        System.out.println("Erro: Fornecedor é necessário para movimentações de entrada.");
        return false;
    }
    
    // Criação da nova movimentação
    Movimentacao movimentacao = new Movimentacao(tipoMovimentacao, quantidade, data, produto, null, fornecedor, null);
    return movimentacaoDAO.inserirMovimentacao(movimentacao);
}
}
