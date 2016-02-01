package br.com.ideatech.comercial;

public enum TipoCalculoCampanha {

    RATEIO("R", "Rateio"),
    MARGEM("M", "Margem"),
    CUSTO("C", "Custo"),
    RECMANUAL("E", "RecManual");

    private final String tipo;
    private final String descricao;

    private TipoCalculoCampanha(final String tipo, final String descricao) {
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
    public static TipoCalculoCampanha get(String tipo) {
        for (TipoCalculoCampanha atual : values()) {
            if (atual.tipo.equals(tipo)) {
                return atual;
            }
        }
        throw new IllegalArgumentException("Tipo calculo inválido: " + tipo);
    }

    public static TipoCalculoCampanha get(int ordinal) {
        return values()[ordinal];
    }
}
