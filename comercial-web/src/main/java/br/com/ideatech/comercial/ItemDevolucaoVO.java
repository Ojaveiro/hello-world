package br.com.ideatech.comercial;

import java.math.BigDecimal;

public class ItemDevolucaoVO extends AbstractVO {

    /**
     * serialVersionUID.
     */
    private static final long serialVersionUID = 1L;

    private long idReg;
    private TipoItemCorporativo tipoItem;
    private long quantidade;
    private long codItProd;

    private BigDecimal custoTecnicoUnitario;
    private BigDecimal custoTecnicoUnitarioGarantido;
    private BigDecimal custoLiquidoUnitario;
    private BigDecimal custoLiquidoUnitarioGarantido;

    public long getIdReg() {
        return idReg;
    }

    public void setIdReg(long idReg) {
        this.idReg = idReg;
    }

    public TipoItemCorporativo getTipoItem() {
        return tipoItem;
    }

    public void setTipoItem(TipoItemCorporativo tipoItem) {
        this.tipoItem = tipoItem;
    }

    public long getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(long quantidade) {
        this.quantidade = quantidade;
    }

    public long getCodItProd() {
        return codItProd;
    }

    public void setCodItProd(long codItProd) {
        this.codItProd = codItProd;
    }

    public BigDecimal getCustoTecnicoUnitario() {
        return custoTecnicoUnitario;
    }

    public void setCustoTecnicoUnitario(BigDecimal custoTecnicoUnitario) {
        this.custoTecnicoUnitario = custoTecnicoUnitario;
    }

    public BigDecimal getCustoTecnicoUnitarioGarantido() {
        return custoTecnicoUnitarioGarantido;
    }

    public void setCustoTecnicoUnitarioGarantido(BigDecimal custoTecnicoUnitarioGarantido) {
        this.custoTecnicoUnitarioGarantido = custoTecnicoUnitarioGarantido;
    }

    public BigDecimal getCustoLiquidoUnitario() {
        return custoLiquidoUnitario;
    }

    public void setCustoLiquidoUnitario(BigDecimal custoLiquidoUnitario) {
        this.custoLiquidoUnitario = custoLiquidoUnitario;
    }

    public BigDecimal getCustoLiquidoUnitarioGarantido() {
        return custoLiquidoUnitarioGarantido;
    }

    public void setCustoLiquidoUnitarioGarantido(BigDecimal custoLiquidoUnitarioGarantido) {
        this.custoLiquidoUnitarioGarantido = custoLiquidoUnitarioGarantido;
    }

}
