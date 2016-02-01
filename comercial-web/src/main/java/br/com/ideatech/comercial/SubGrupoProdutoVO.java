package br.com.ideatech.comercial;

public class SubGrupoProdutoVO extends AbstractVO {

    private static final long serialVersionUID = 1L;

    private long codSubGrupo;
    private String descricao;

    public long getCodSubGrupo() {
        return codSubGrupo;
    }

    public void setCodSubGrupo(long codSubGrupo) {
        this.codSubGrupo = codSubGrupo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
