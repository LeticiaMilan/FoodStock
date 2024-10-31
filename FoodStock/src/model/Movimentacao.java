package model;

import java.time.LocalDate;

public class Movimentacao {
    private int idMovimentacao;
    private TipoMovimentacaoEnum tipoMovimentacao;
    private int quantidade;
    private LocalDate data;
    private Produto produto;
    private Usuario usuario;
    private Fornecedor fornecedor;
    private Cliente cliente;

    public Movimentacao() {
        
    }
    public Movimentacao(int idMovimentacao, TipoMovimentacaoEnum tipoMovimentacao, int quantidade, LocalDate data, Produto produto, Usuario usuario, Fornecedor fornecedor, Cliente cliente) {
        this.idMovimentacao = idMovimentacao;
        this.tipoMovimentacao = tipoMovimentacao;
        this.quantidade = quantidade;
        this.data = data;
        this.produto = produto;
        this.usuario = usuario;
        this.fornecedor = fornecedor;
        this.cliente = cliente;
    }

    public Movimentacao(TipoMovimentacaoEnum tipoMovimentacao, int quantidade, LocalDate data, Produto produto, Usuario usuario, Fornecedor fornecedor, Cliente cliente) {
        this.tipoMovimentacao = tipoMovimentacao;
        this.quantidade = quantidade;
        this.data = data;
        this.produto = produto;
        this.usuario = usuario;
        this.fornecedor = fornecedor;
        this.cliente = cliente;
    }

    public Movimentacao(TipoMovimentacaoEnum tipoMovimentacao, int quantidade, LocalDate data, Produto produto, Usuario usuario, Fornecedor fornecedor) {
        this.tipoMovimentacao = tipoMovimentacao;
        this.quantidade = quantidade;
        this.data = data;
        this.produto = produto;
        this.usuario = usuario;
        this.fornecedor = fornecedor;
    }

    public Movimentacao(TipoMovimentacaoEnum tipoMovimentacao, int quantidade, LocalDate data, Produto produto, Usuario usuario, Cliente cliente) {
        this.tipoMovimentacao = tipoMovimentacao;
        this.quantidade = quantidade;
        this.data = data;
        this.produto = produto;
        this.usuario = usuario;
        this.cliente = cliente;
    }
    
    public int getId() {
        return tipoMovimentacao.getId();
    }

    public int getIdMovimentacao() {
        return idMovimentacao;
    }

    public void setIdMovimentacao(int idMovimentacao) {
        this.idMovimentacao = idMovimentacao;
    }

    public TipoMovimentacaoEnum getTipoMovimentacao() {
        return tipoMovimentacao;
    }

    public void setTipoMovimentacao(TipoMovimentacaoEnum tipoMovimentacao) {
        this.tipoMovimentacao = tipoMovimentacao;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
    public boolean isEntrada() {
        return TipoMovimentacaoEnum.ENTRADA.equals(tipoMovimentacao);
    }
    
}
