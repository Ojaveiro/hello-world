package br.com.ideatech.comercial;

public enum TipoParametroDataCampanha {

    PEDIDO("P", "Data Pedido"),
    NOTA("N", "Data Nota Fiscal");

    private final String tipo;
    private final String descricao;

    private TipoParametroDataCampanha(final String tipo, final String descricao) {
        this.tipo = tipo;
        this.descricao = descricao;
    }

    public String getTipo() {
        return tipo;
    }

    public String getDescricao() {
        return descricao;
    }

    public static TipoParametroDataCampanha get(String tipo) {
        for (TipoParametroDataCampanha atual : values()) {
            if (atual.tipo.equals(tipo)) {
                return atual;
            }
        }
        throw new IllegalArgumentException("Tipo campanha inválido: " + tipo);
    }

    public static TipoParametroDataCampanha get(int ordinal) {
        return values()[ordinal];
    }
}
