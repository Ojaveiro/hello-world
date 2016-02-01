package br.com.ideatech.comercial;

public class FornecedorVO extends AbstractVO {

    private static final long serialVersionUID = 1L;

    private long codFornecedor;
    private String fantasia;
    private String razaoSocial;

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public long getCodFornecedor() {
        return codFornecedor;
    }

    public void setCodFornecedor(long codFornecedor) {
        this.codFornecedor = codFornecedor;
    }

    public String getFantasia() {
        return fantasia;
    }

    public void setFantasia(String fantasia) {
        this.fantasia = fantasia;
    }

}
