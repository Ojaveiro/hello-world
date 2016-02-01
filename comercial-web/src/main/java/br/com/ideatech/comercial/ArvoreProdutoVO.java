package br.com.ideatech.comercial;

import java.util.List;

public class ArvoreProdutoVO extends AbstractVO {

    private static final long serialVersionUID = 1L;

    private LinhaVO linhaVO;
    private FamiliaVO familiaVO;

    private List<GrupoProdutoVO> listaGrupoProdutoVO;
    private List<SubGrupoProdutoVO> listaSubGrupoProdutoVO;
    private List<CapacidadeVO> listaCapacidadeVO;
    private List<ProdutoVO> listaProdutoVO;
    private List<ProdutoVO> listaProdutoConjuntoVO;
    private String temProdutos;

    public LinhaVO getLinha() {
        return linhaVO;
    }

    public void setLinha(LinhaVO linhaVO) {
        this.linhaVO = linhaVO;
    }

    public FamiliaVO getFamilia() {
        return familiaVO;
    }

    public void setFamilia(FamiliaVO familiaVO) {
        this.familiaVO = familiaVO;
    }

    public List<GrupoProdutoVO> getListaGrupoProduto() {
        return listaGrupoProdutoVO;
    }

    public void setListaGrupoProduto(List<GrupoProdutoVO> listaGrupoProdutoVO) {
        this.listaGrupoProdutoVO = listaGrupoProdutoVO;
    }

    public List<SubGrupoProdutoVO> getListaSubGrupoProduto() {
        return listaSubGrupoProdutoVO;
    }

    public void setListaSubGrupoProduto(List<SubGrupoProdutoVO> listaSubGrupoProdutoVO) {
        this.listaSubGrupoProdutoVO = listaSubGrupoProdutoVO;
    }

    public List<CapacidadeVO> getListaCapacidade() {
        return listaCapacidadeVO;
    }

    public void setListaCapacidade(List<CapacidadeVO> listaCapacidadeVO) {
        this.listaCapacidadeVO = listaCapacidadeVO;
    }

    public List<ProdutoVO> getListaProduto() {
        return listaProdutoVO;
    }

    public void setListaProduto(List<ProdutoVO> listaProduto) {
        this.listaProdutoVO = listaProduto;
    }

    public List<ProdutoVO> getListaProdutoConjunto() {
        return listaProdutoConjuntoVO;
    }

    public void setListaProdutoConjunto(List<ProdutoVO> listaProdutoConjuntoVO) {
        this.listaProdutoConjuntoVO = listaProdutoConjuntoVO;
    }

    public String getTemProdutos() {
        return temProdutos;
    }

    public void setTemProdutos(String temProdutos) {
        this.temProdutos = temProdutos;
    }

}
