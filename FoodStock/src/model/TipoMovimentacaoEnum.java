package model;

public enum TipoMovimentacaoEnum {
    ENTRADA(5),
    SAIDA(6);

    private final int id;
    
    TipoMovimentacaoEnum(int id) {
        this.id = id;
    }
    
    public static TipoMovimentacaoEnum fromId(int id) {
        for (TipoMovimentacaoEnum tipo : TipoMovimentacaoEnum.values()) {
            if (tipo.id == id) {
                return tipo;
            }
        }
        throw new IllegalArgumentException("TipoMovimentacaoEnum não encontrado para o id: " + id);
    }

    public int getId() {
        return id;
    }
    
    public boolean isEntrada() {
        return this == ENTRADA; 
    }
    
    public boolean isSaida() {
        return this == SAIDA; 
    }
}