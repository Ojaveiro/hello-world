package br.com.ideatech.comercial;

public class ProdutoVO extends AbstractVO {

    private static final long serialVersionUID = 1L;

    private long codItProd;
    private int digitProd;
    private String descricaoProduto;
    private String descricaoCor;
    private String descricaoEspecificacao;

    public long getCodItProd() {
        return codItProd;
    }

    public void setCodItProd(long codItProd) {
        this.codItProd = codItProd;
    }

    public int getDigitProd() {
        return digitProd;
    }

    public void setDigitProd(int digitProd) {
        this.digitProd = digitProd;
    }

    public String getDescricaoProduto() {
        return descricaoProduto;
    }

    public void setDescricaoProduto(String descricaoProduto) {
        this.descricaoProduto = descricaoProduto;
    }

    public String getDescricaoCor() {
        return descricaoCor;
    }

    public void setDescricaoCor(String descricaoCor) {
        this.descricaoCor = descricaoCor;
    }

    public String getDescricaoEspecificacao() {
        return descricaoEspecificacao;
    }

    public void setDescricaoEspecificacao(String descricaoEspecificacao) {
        this.descricaoEspecificacao = descricaoEspecificacao;
    }

}
