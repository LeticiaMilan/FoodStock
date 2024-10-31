package controller;

import dao.FornecedorDAO;
import dao.MovimentacaoDAO;
import dao.ProdutoDAO;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import model.Cliente;
import model.Fornecedor;
import model.Movimentacao;
import model.Produto;
import model.TipoMovimentacao;
import model.TipoMovimentacaoEnum;
import model.Usuario;

public class MovimentacaoController {

    private ProdutoDAO produtoDAO;
    private FornecedorDAO fornecedorDAO;
    private MovimentacaoDAO movimentacaoDAO;
    
    private Usuario usuarioSessao;

    public Usuario getUsuarioSessao() {
        return usuarioSessao;
    }

    public void setUsuarioSessao(Usuario usuarioSessao) {
        this.usuarioSessao = usuarioSessao;
    }
    
    public MovimentacaoController() {
        movimentacaoDAO = new MovimentacaoDAO();
        fornecedorDAO = new FornecedorDAO();
        produtoDAO = new ProdutoDAO();
    }

    public boolean adicionarMovimentacao(TipoMovimentacaoEnum tipoMovimentacao, int quantidade, LocalDate data, Produto produto, Usuario usuario, Fornecedor fornecedor, Cliente cliente) {
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
    public ArrayList<Movimentacao> obterMovimentacao(ProdutoController produtoController,
            UsuarioController usuarioController,
            FornecedorController fornecedorController,
            ClienteController clienteController) {
        return movimentacaoDAO.obterMovimentacao(produtoController, usuarioController, fornecedorController, clienteController);
    }

    public void deletarMovimentacaoPorId(int idMovimentacao) {
        movimentacaoDAO.deletarMovimentacaoPorId(idMovimentacao);
    }

    /*public boolean adicionarEntradaEstoque(TipoMovimentacaoEnum tipoMovimentacao, LocalDate data, int quantidade, Produto produto, Fornecedor fornecedor) {
        if (tipoMovimentacao == TipoMovimentacaoEnum.ENTRADA && fornecedor == null) {
            System.out.println("Erro: Fornecedor é necessário para movimentações de entrada.");
            return false;
        }

        Movimentacao movimentacao = new Movimentacao(tipoMovimentacao, quantidade, data, produto, null, fornecedor, null);
        return movimentacaoDAO.inserirMovimentacao(movimentacao);
    }*/
 /*public boolean adicionarEntradaEstoque(TipoMovimentacaoEnum tipoMovimentacao, LocalDate data, int quantidade, int produtoId, int fornecedorId) {
        if (tipoMovimentacao == TipoMovimentacaoEnum.ENTRADA) {
            System.out.println("Erro: Fornecedor é necessário para movimentações de entrada.");
            return false;
        }

        Produto produto = produtoDAO.buscarProdutoPorId(produtoId);
        if (produto == null) {
            System.out.println("Erro: Produto não encontrado.");
            return false;
        }
        
        Fornecedor fornecedor = fornecedorDAO.buscarFornecedorPorId(fornecedorId);
        if (fornecedor == null) {
            System.out.println("Erro: Produto não encontrado.");
            return false;
        }

        Movimentacao movimentacao = new Movimentacao(tipoMovimentacao, quantidade, data, produto, null, fornecedor, null);
        return movimentacaoDAO.inserirMovimentacao(movimentacao);
    }*/
    public boolean adicionarEntradaEstoque(TipoMovimentacaoEnum tipoMovimentacao, LocalDate data, int quantidade, int produtoId, int fornecedorId, Usuario usuarioSessao) {
        Produto produto = produtoDAO.buscarProdutoPorId(produtoId);
        if (produto == null) {
            System.out.println("Erro: Produto não encontrado.");
            return false;
        }

        if (tipoMovimentacao == TipoMovimentacaoEnum.ENTRADA && fornecedorId <= 0) {
            System.out.println("Erro: Fornecedor é necessário para movimentações de entrada.");
            return false;
        }

        Fornecedor fornecedor = fornecedorDAO.buscarFornecedorPorId(fornecedorId);
        if (fornecedor == null) {
            System.out.println("Erro: Fornecedor não encontrado.");
            return false;
        }

        Movimentacao movimentacao = new Movimentacao(tipoMovimentacao, quantidade, data, produto, usuarioSessao, fornecedor, null);

        return movimentacaoDAO.inserirMovimentacao(movimentacao);
    }
}
