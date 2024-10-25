package model;

public class Usuario {
    private int id_usuario;
    private String nome;
    private String cpf;
    private String email;
    private String tipo;

    public Usuario(int id_usuario, String nome, String cpf, String email, String tipo) {
        this.id_usuario = id_usuario;
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.tipo = tipo;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    
}
