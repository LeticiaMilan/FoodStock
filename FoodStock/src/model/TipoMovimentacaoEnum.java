package model;

public enum TipoMovimentacaoEnum {
    ENTRADA(1),
    SAIDA(2);

    private final int id;
    
    TipoMovimentacaoEnum(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
}