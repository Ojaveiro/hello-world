package br.com.ideatech.comercial;

public enum TipoItemCorporativo {

    PEDIDO("P", "Pedido"),
    NOTAFISCAL("N", "Nota Fiscal"),
    DEVOLUCAO("D", "Devolução");

    private final String tipo;
    private final String descricao;

    private TipoItemCorporativo(final String tipo, final String descricao) {
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
    public static TipoItemCorporativo get(String tipo) {
        for (TipoItemCorporativo atual : values()) {
            if (atual.tipo.equals(tipo)) {
                return atual;
            }
        }
        throw new IllegalArgumentException("Tipo Item Corporativo inválido: " + tipo);
    }

    public static TipoItemCorporativo get(int ordinal) {
        return values()[ordinal];
    }
}
