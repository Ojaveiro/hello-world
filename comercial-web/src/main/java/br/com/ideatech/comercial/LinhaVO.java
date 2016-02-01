package br.com.ideatech.comercial;

import java.text.MessageFormat;

public class LinhaVO extends AbstractVO {

    private static final long serialVersionUID = 1L;

    private long codLinha;
    private String descricao;
    private String codLinhaFormatado;

    public long getCodLinha() {
        return codLinha;
    }

    public void setCodLinha(long codLinha) {
        this.codLinha = codLinha;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getCodLinhaFormatado() {

        codLinhaFormatado = Long.toString(codLinha);
        while (codLinhaFormatado.length() < 4) {
            codLinhaFormatado = "0" + codLinhaFormatado;
        }
        return codLinhaFormatado;
    }

    public String getListValue() {
        return MessageFormat.format("{0} - {1}", getCodLinha(), getDescricao());
    }

}
