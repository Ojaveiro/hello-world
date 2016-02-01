package br.com.ideatech.comercial;

public enum TipoRecuperacaoCampanha {

    RECUPERACAO_MARGEM_LIQUIDA("L", "Recuperação Margem Líquida"),
    RECUPERACAO_MARGEM_TECNICA("T", "Recuperação Margem Técnica");

    private final String tipo;
    private final String descricao;

    private TipoRecuperacaoCampanha(final String tipo, final String descricao) {
        this.tipo = tipo;
        this.descricao = descricao;
    }

    public String getTipo() {
        return tipo;
    }

    public String getDescricao() {
        return descricao;
    }

    public static TipoRecuperacaoCampanha get(String tipo) {
        for (TipoRecuperacaoCampanha atual : values()) {
            if (atual.tipo.equals(tipo)) {
                return atual;
            }
        }
        throw new IllegalArgumentException("Tipo recuperacao inválido: " + tipo);
    }

    public static TipoRecuperacaoCampanha get(int ordinal) {
        return values()[ordinal];
    }
}
