package br.com.ideatech.comercial;

public class FamiliaVO extends AbstractVO {

    private static final long serialVersionUID = 1L;

    private long codFamilia;
    private String descricao;

    public long getCodFamilia() {
        return codFamilia;
    }

    public void setCodFamilia(long codFamilia) {
        this.codFamilia = codFamilia;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

}
