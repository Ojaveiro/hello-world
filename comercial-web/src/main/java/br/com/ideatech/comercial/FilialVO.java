package br.com.ideatech.comercial;

public class FilialVO extends AbstractVO {

    private static final long serialVersionUID = 1L;

    private long codFilial;
    private String cidade;
    private String uf;
    private int tipo;
    private String fantasia;
    private String descricao;

    public String getFantasia() {
        return fantasia;
    }

    public void setFantasia(String fantasia) {
        this.fantasia = fantasia;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public long getCodFilial() {
        return codFilial;
    }

    public void setCodFilial(long codFilial) {
        this.codFilial = codFilial;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

}
