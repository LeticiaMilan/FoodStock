package model;

public class Produto {
    private int id_produto;
    private String nome;
    private String descricao;
    private double precoVenda;
    private double precoCusto;

    public Produto(int id_produto, String nome, String descricao, double precoVenda, double precoCusto) {
        this.id_produto = id_produto;
        this.nome = nome;
        this.descricao = descricao;
        this.precoVenda = precoVenda;
        this.precoCusto = precoCusto;
    }

    public int getId_produto() {
        return id_produto;
    }

    public void setId_produto(int id_produto) {
        this.id_produto = id_produto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPrecoVenda() {
        return precoVenda;
    }

    public void setPrecoVenda(double precoVenda) {
        this.precoVenda = precoVenda;
    }

    public double getPrecoCusto() {
        return precoCusto;
    }

    public void setPrecoCusto(double precoCusto) {
        this.precoCusto = precoCusto;
    }
    
    
}
