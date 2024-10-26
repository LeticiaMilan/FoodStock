package model;

public class Cliente {

    private int idCliente;
    private String nome;
    private String cpfCnpj;
    private String email;
    private Endereco endereco;
    private Telefone telefone;

    public Cliente(int idCliente, String nome, String cpfCnpj, String email, Endereco endereco, Telefone telefone) {
        this.idCliente = idCliente;
        this.nome = nome;
        this.cpfCnpj = cpfCnpj;
        this.email = email;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    public Cliente(String nome, String cpfCnpj, String email, Endereco endereco, Telefone telefone) {
        this.nome = nome;
        this.cpfCnpj = cpfCnpj;
        this.email = email;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    public Cliente(String nome, String cpfCnpj, String email, Endereco endereco) {
        this.nome = nome;
        this.cpfCnpj = cpfCnpj;
        this.email = email;
        this.endereco = endereco;
    }

    public Cliente(String nome, String cpfCnpj, String email, Telefone telefone) {
        this.nome = nome;
        this.cpfCnpj = cpfCnpj;
        this.email = email;
        this.telefone = telefone;
    }

    public Cliente(String nome, String cpfCnpj, Endereco endereco, Telefone telefone) {
        this.nome = nome;
        this.cpfCnpj = cpfCnpj;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    public Cliente(String nome, String cpfCnpj, String email) {
        this.nome = nome;
        this.cpfCnpj = cpfCnpj;
        this.email = email;
    }

    public Cliente(String nome, String cpfCnpj, Endereco endereco) {
        this.nome = nome;
        this.cpfCnpj = cpfCnpj;
        this.endereco = endereco;
    }

    public Cliente(String nome, String cpfCnpj, Telefone telefone) {
        this.nome = nome;
        this.cpfCnpj = cpfCnpj;
        this.telefone = telefone;
    }

    public Cliente(String nome, String cpfCnpj) {
        this.nome = nome;
        this.cpfCnpj = cpfCnpj;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpfCnpj() {
        return cpfCnpj;
    }

    public void setCpfCnpj(String cpfCnpj) {
        this.cpfCnpj = cpfCnpj;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Telefone getTelefone() {
        return telefone;
    }

    public void setTelefone(Telefone telefone) {
        this.telefone = telefone;
    }
    
    
}
