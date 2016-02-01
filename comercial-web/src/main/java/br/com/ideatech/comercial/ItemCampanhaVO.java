package br.com.ideatech.comercial;

import java.io.Serializable;
import java.math.BigDecimal;

import br.com.ideatech.comercial.Status.StatusItemCampanha;

public class ItemCampanhaVO implements Serializable {

    private static final long serialVersionUID = 1L;

    private long idRegItemCampanha;
    private long codCampanha;
    private long idRegItemTabCorporativa;
    private long idItemCorrespondente;
    private TipoItem tipoItem;
    private long codItProd;
    private StatusItemCampanha status;
    private BigDecimal custoTecnico = BigDecimal.ZERO;
    private BigDecimal custoTecnicoGarantido = BigDecimal.ZERO;
    private BigDecimal valorTecnicoCalculado = BigDecimal.ZERO;
    private BigDecimal custoLiquido = BigDecimal.ZERO;
    private BigDecimal custoLiquidoGarantido = BigDecimal.ZERO;
    private BigDecimal valorLiquidoCalculado = BigDecimal.ZERO;
    private int competenciaItem;
    private boolean desconsideraMargemVendedor;
    private long quantidadeItens;

    private BigDecimal valorPIS = BigDecimal.ZERO;
    private BigDecimal valorPISGarantido = BigDecimal.ZERO;
    private BigDecimal valorPISCalculado = BigDecimal.ZERO;

    private BigDecimal valorCOFINS = BigDecimal.ZERO;
    private BigDecimal valorCOFINSGarantido = BigDecimal.ZERO;
    private BigDecimal valorCOFINSCalculado = BigDecimal.ZERO;

    private BigDecimal valorSubstTributaria = BigDecimal.ZERO;
    private BigDecimal valorSubstTributariaGarantido = BigDecimal.ZERO;
    private BigDecimal valorSubstTributariaCalculado = BigDecimal.ZERO;

    private TipoRecuperacaoCampanha tipoRecuperacaoCampanha;

    public ItemCampanhaVO() {

    }

    public ItemCampanhaVO(ItemCorporativoVO itemCorporativoVO, long codCampanha, StatusItemCampanha status,
            int competencia) {

        this.codCampanha = codCampanha;
        idRegItemTabCorporativa = itemCorporativoVO.getIdReg();
        codItProd = itemCorporativoVO.getCodItProd();
        this.status = status;

        custoLiquido = itemCorporativoVO.getCustoLiquidoUnitario();
        custoLiquidoGarantido = itemCorporativoVO.getCustoLiquidoUnitarioGarantido();
        valorLiquidoCalculado = itemCorporativoVO.getCustoLiquidoUnitarioGarantido()
                .subtract(itemCorporativoVO.getCustoLiquidoUnitario());

        custoTecnico = itemCorporativoVO.getCustoTecnicoUnitario();
        custoTecnicoGarantido = itemCorporativoVO.getCustoTecnicoUnitarioGarantido();
        valorTecnicoCalculado = itemCorporativoVO.getCustoTecnicoUnitarioGarantido()
                .subtract(itemCorporativoVO.getCustoTecnicoUnitario());

        quantidadeItens = itemCorporativoVO.getQuantidade();
        competenciaItem = competencia;

        if (itemCorporativoVO.getTipoItem() == TipoItemCorporativo.NOTAFISCAL) {
            tipoItem = TipoItem.NOTAFISCAL;

            valorPIS = itemCorporativoVO.getValorGMPIS();
            valorPISGarantido = itemCorporativoVO.getValorGMPISGarantido();
            valorPISCalculado = itemCorporativoVO.getValorGMPISGarantido().subtract(itemCorporativoVO.getValorGMPIS());

            valorCOFINS = itemCorporativoVO.getValorGMCOFINS();
            valorCOFINSGarantido = itemCorporativoVO.getValorGMCOFINSGarantido();
            valorCOFINSCalculado = itemCorporativoVO.getValorGMCOFINSGarantido()
                    .subtract(itemCorporativoVO.getValorGMCOFINS());

            valorSubstTributaria = itemCorporativoVO.getValorGMSubstTributaria();
            valorSubstTributariaGarantido = itemCorporativoVO.getValorGMSubstTributariaGarantido();
            valorSubstTributariaCalculado = itemCorporativoVO.getValorGMSubstTributariaGarantido()
                    .subtract(itemCorporativoVO.getValorGMSubstTributaria());

        } else {
            tipoItem = TipoItem.PEDIDO;
        }
    }

    public ItemCampanhaVO(ItemDevolucaoVO itemDevolucaoVO, long codCampanha, StatusItemCampanha status,
            int competencia) {

        this.codCampanha = codCampanha;
        this.status = status;

        idRegItemTabCorporativa = itemDevolucaoVO.getIdReg();
        tipoItem = TipoItem.DEVOLUCAO;
        codItProd = itemDevolucaoVO.getCodItProd();

        custoLiquido = itemDevolucaoVO.getCustoLiquidoUnitario();
        custoLiquidoGarantido = itemDevolucaoVO.getCustoLiquidoUnitarioGarantido();
        valorLiquidoCalculado = itemDevolucaoVO.getCustoLiquidoUnitario()
                .subtract(itemDevolucaoVO.getCustoLiquidoUnitarioGarantido());

        custoTecnico = itemDevolucaoVO.getCustoTecnicoUnitario();
        custoTecnicoGarantido = itemDevolucaoVO.getCustoTecnicoUnitarioGarantido();
        valorTecnicoCalculado = itemDevolucaoVO.getCustoTecnicoUnitario()
                .subtract(itemDevolucaoVO.getCustoTecnicoUnitarioGarantido());

        quantidadeItens = itemDevolucaoVO.getQuantidade();
        competenciaItem = competencia;
    }

    public TipoRecuperacaoCampanha getTipoRecuperacaoCampanha() {
        return tipoRecuperacaoCampanha;
    }

    public void setTipoRecuperacaoCampanha(TipoRecuperacaoCampanha tipoRecuperacaoCampanha) {
        this.tipoRecuperacaoCampanha = tipoRecuperacaoCampanha;
    }

    public long getIdRegItemCampanha() {
        return idRegItemCampanha;
    }

    public void setIdRegItemCampanha(long idRegItemCampanha) {
        this.idRegItemCampanha = idRegItemCampanha;
    }

    public long getIdRegItemTabCorporativa() {
        return idRegItemTabCorporativa;
    }

    public void setIdRegItemTabCorporativa(long idRegItemTabCorporativa) {
        this.idRegItemTabCorporativa = idRegItemTabCorporativa;
    }

    public TipoItem getTipoItem() {
        return tipoItem;
    }

    public void setTipoItem(TipoItem tipoItem) {
        this.tipoItem = tipoItem;
    }

    public long getCodItProd() {
        return codItProd;
    }

    public void setCodItProd(long codItProd) {
        this.codItProd = codItProd;
    }

    public StatusItemCampanha getStatus() {
        return status;
    }

    public void setStatus(StatusItemCampanha status) {
        this.status = status;
    }

    public BigDecimal getCustoLiquido() {
        return custoLiquido;
    }

    public void setCustoLiquido(BigDecimal custoLiquido) {
        this.custoLiquido = custoLiquido;
    }

    public BigDecimal getCustoLiquidoGarantido() {
        return custoLiquidoGarantido;
    }

    public void setCustoLiquidoGarantido(BigDecimal custoLiquidoGarantido) {
        this.custoLiquidoGarantido = custoLiquidoGarantido;
    }

    public BigDecimal getValorLiquidoCalculado() {
        return valorLiquidoCalculado;
    }

    public void setValorLiquidoCalculado(BigDecimal valorLiquidoCalculado) {
        this.valorLiquidoCalculado = valorLiquidoCalculado;
    }

    public BigDecimal getCustoTecnico() {
        return custoTecnico;
    }

    public void setCustoTecnico(BigDecimal custoTecnico) {
        this.custoTecnico = custoTecnico;
    }

    public BigDecimal getValorTecnicoCalculado() {
        return valorTecnicoCalculado;
    }

    public void setValorTecnicoCalculado(BigDecimal valorTecnicoCalculado) {
        this.valorTecnicoCalculado = valorTecnicoCalculado;
    }

    public BigDecimal getCustoTecnicoGarantido() {
        return custoTecnicoGarantido;
    }

    public void setCustoTecnicoGarantido(BigDecimal custoTecnicoGarantido) {
        this.custoTecnicoGarantido = custoTecnicoGarantido;
    }

    public int getCompetenciaItem() {
        return competenciaItem;
    }

    public void setCompetenciaItem(int competenciaItem) {
        this.competenciaItem = competenciaItem;
    }

    public long getCodCampanha() {
        return codCampanha;
    }

    public void setCodCampanha(long codCampanha) {
        this.codCampanha = codCampanha;
    }

    public void setDesconsideraMargemVendedor(boolean desconsideraMargemVendedor) {
        this.desconsideraMargemVendedor = desconsideraMargemVendedor;
    }

    public boolean isDesconsideraMargemVendedor() {
        return desconsideraMargemVendedor;
    }

    public long getQuantidadeItens() {
        return quantidadeItens;
    }

    public void setQuantidadeItens(long quantidadeItens) {
        this.quantidadeItens = quantidadeItens;
    }

    public BigDecimal getValorPIS() {
        return valorPIS;
    }

    public void setValorPIS(BigDecimal valorPIS) {
        this.valorPIS = valorPIS;
    }

    public BigDecimal getValorPISGarantido() {
        return valorPISGarantido;
    }

    public void setValorPISGarantido(BigDecimal valorPISGarantido) {
        this.valorPISGarantido = valorPISGarantido;
    }

    public BigDecimal getValorPISCalculado() {
        return valorPISCalculado;
    }

    public void setValorPISCalculado(BigDecimal valorPISCalculado) {
        this.valorPISCalculado = valorPISCalculado;
    }

    public BigDecimal getValorCOFINS() {
        return valorCOFINS;
    }

    public void setValorCOFINS(BigDecimal valorCOFINS) {
        this.valorCOFINS = valorCOFINS;
    }

    public BigDecimal getValorCOFINSGarantido() {
        return valorCOFINSGarantido;
    }

    public void setValorCOFINSGarantido(BigDecimal valorCOFINSGarantido) {
        this.valorCOFINSGarantido = valorCOFINSGarantido;
    }

    public BigDecimal getValorCOFINSCalculado() {
        return valorCOFINSCalculado;
    }

    public void setValorCOFINSCalculado(BigDecimal valorCOFINSCalculado) {
        this.valorCOFINSCalculado = valorCOFINSCalculado;
    }

    public BigDecimal getValorSubstTributaria() {
        return valorSubstTributaria;
    }

    public void setValorSubstTributaria(BigDecimal valorSubstTributaria) {
        this.valorSubstTributaria = valorSubstTributaria;
    }

    public BigDecimal getValorSubstTributariaGarantido() {
        return valorSubstTributariaGarantido;
    }

    public void setValorSubstTributariaGarantido(BigDecimal valorSubstTributariaGarantido) {
        this.valorSubstTributariaGarantido = valorSubstTributariaGarantido;
    }

    public BigDecimal getValorSubstTributariaCalculado() {
        return valorSubstTributariaCalculado;
    }

    public void setValorSubstTributariaCalculado(BigDecimal valorSubstTributariaCalculado) {
        this.valorSubstTributariaCalculado = valorSubstTributariaCalculado;
    }

    public long getIdItemCorrespondente() {
        return idItemCorrespondente;
    }

    public void setIdItemCorrespondente(long idItemCorrespondente) {
        this.idItemCorrespondente = idItemCorrespondente;
    }
}
