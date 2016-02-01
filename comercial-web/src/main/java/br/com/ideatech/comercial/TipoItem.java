package br.com.ideatech.comercial;

public enum TipoItem {

    PEDIDO("P", "Pedido"),
    NOTAFISCAL("N", "Nota Fiscal"),
    DEVOLUCAO("D", "Devolução"),
    REC_MANUAL("R", "Recuperação Manual");

    private final String tipo;
    private final String descricao;

    private TipoItem(final String tipo, final String descricao) {
        this.tipo = tipo;
        this.descricao = descricao;
    }

    /**
     * @return tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * @return descricao
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * Gets the situation on the given ordinal position.
     * 
     * @param ordinal
     *            Ordinal position.
     * @return Returns the situation on the given ordinal position.
     */
    public static TipoItem get(String tipo) {
        for (TipoItem atual : values()) {
            if (atual.tipo.equals(tipo)) {
                return atual;
            }
        }
        throw new IllegalArgumentException("Tipo inválido: " + tipo);
    }

    public static TipoItem get(int ordinal) {
        return values()[ordinal];
    }
}
