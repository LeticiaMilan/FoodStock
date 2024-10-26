package model;

import java.util.Date;

public class Movimentacao {
    private int id_movimentacao;
    private String tipo_movimentacao;
    private int quantidade;    
    private Date data;
    private int id_produto;
    private int id_usuario;
    private int id_fornecedor;
    private int id_cliente;

    public Movimentacao(int id_movimentacao, String tipo_movimentacao, int quantidade, Date data, int id_produto, int id_usuario, int id_fornecedor, int id_cliente) {
        this.id_movimentacao = id_movimentacao;
        this.tipo_movimentacao = tipo_movimentacao;
        this.quantidade = quantidade;
        this.data = data;
        this.id_produto = id_produto;
        this.id_usuario = id_usuario;
        this.id_fornecedor = id_fornecedor;
        this.id_cliente = id_cliente;
    }

    public Movimentacao(String tipo_movimentacao, int quantidade, Date data, int id_produto, int id_usuario, int id_fornecedor, int id_cliente) {
        this.tipo_movimentacao = tipo_movimentacao;
        this.quantidade = quantidade;
        this.data = data;
        this.id_produto = id_produto;
        this.id_usuario = id_usuario;
        this.id_fornecedor = id_fornecedor;
        this.id_cliente = id_cliente;
    }

    public int getId_movimentacao() {
        return id_movimentacao;
    }

    public void setId_movimentacao(int id_movimentacao) {
        this.id_movimentacao = id_movimentacao;
    }

    public String getTipo_movimentacao() {
        return tipo_movimentacao;
    }

    public void setTipo_movimentacao(String tipo_movimentacao) {
        this.tipo_movimentacao = tipo_movimentacao;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public int getId_produto() {
        return id_produto;
    }

    public void setId_produto(int id_produto) {
        this.id_produto = id_produto;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public int getId_fornecedor() {
        return id_fornecedor;
    }

    public void setId_fornecedor(int id_fornecedor) {
        this.id_fornecedor = id_fornecedor;
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }
    
}
