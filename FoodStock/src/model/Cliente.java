package model;

public class Cliente {
    private int id_produto;
    private String nome;
    private String cpf_cnpj;    
    private String email;
    private String telefone;
    private String logradouro;
    private String bairro;
    private String numero;
    private String cep;
    private String municipio;
    private String estado;
    private String pais;

    public Cliente(int id_produto, String nome, String cpf_cnpj, String email, String telefone, String logradouro, String bairro, String numero, String cep, String municipio, String estado, String pais) {
        this.id_produto = id_produto;
        this.nome = nome;
        this.cpf_cnpj = cpf_cnpj;
        this.email = email;
        this.telefone = telefone;
        this.logradouro = logradouro;
        this.bairro = bairro;
        this.numero = numero;
        this.cep = cep;
        this.municipio = municipio;
        this.estado = estado;
        this.pais = pais;
    }
    
    
}
