package br.com.ideatech.comercial;

public class GrupoProdutoVO extends AbstractVO {

    private static final long serialVersionUID = -1L;

    private long codGrupoProduto;

    private String descricao;

    public long getCodGrupoProduto() {
        return codGrupoProduto;
    }

    public void setCodGrupoProduto(long codGrupoProduto) {
        this.codGrupoProduto = codGrupoProduto;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

}
