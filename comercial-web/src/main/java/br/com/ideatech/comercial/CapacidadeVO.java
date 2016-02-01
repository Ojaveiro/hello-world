package br.com.ideatech.comercial;

public class CapacidadeVO extends AbstractVO {

    private static final long serialVersionUID = 1L;

    private long codCapacidade;
    private String descricao;

    public long getCodCapacidade() {
        return codCapacidade;
    }

    public void setCodCapacidade(long codCapacidade) {
        this.codCapacidade = codCapacidade;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
