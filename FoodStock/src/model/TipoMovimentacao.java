package model;

public class TipoMovimentacao {
    private int idTipoMovimentacao;
    private String tipo;

    public TipoMovimentacao(int idTipoMovimentacao, String tipo) {
        this.idTipoMovimentacao = idTipoMovimentacao;
        this.tipo = tipo;
    }

    public TipoMovimentacao(String tipo) {
        this.tipo = tipo;
    }

    public int getIdTipoMovimentacao() {
        return idTipoMovimentacao;
    }

    public void setIdTipoMovimentacao(int idTipoMovimentacao) {
        this.idTipoMovimentacao = idTipoMovimentacao;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    
}
