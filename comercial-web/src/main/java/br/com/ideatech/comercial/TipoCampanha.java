package br.com.ideatech.comercial;

import java.util.HashMap;
import java.util.Map;

public enum TipoCampanha {

    MARGEM_LIQUIDA("L", "Margem Líquida"),
    MARGEM_TECNICA("T", "Margem Técnica"),
    MARGEM_LIQUIDA_TECNICA("A", "Margem Líquida/Técnica"),
    MARGEM_TECNICA_LIQUIDA("B", "Margem Técnica/Liquida"),
    REC_MANUAL("R", "Recuperação Manual");

    private static Map<String, TipoCampanha> mapTipoParaEnum;

    static {
        mapTipoParaEnum = new HashMap<String, TipoCampanha>();
        for (TipoCampanha tipoEnum : values()) {
            mapTipoParaEnum.put(tipoEnum.tipo, tipoEnum);
        }
    }

    private final String tipo;
    private final String descricao;

    private TipoCampanha(final String tipo, final String descricao) {
        this.tipo = tipo;
        this.descricao = descricao;
    }

    public String getTipo() {
        return tipo;
    }

    public String getDescricao() {
        return descricao;
    }

    public static TipoCampanha get(String tipo) {
        TipoCampanha tipoCampanha = mapTipoParaEnum.get(tipo);
        if (tipoCampanha == null) {
            throw new IllegalArgumentException("Tipo campanha inválido: " + tipo);
        }
        return tipoCampanha;
    }

}
