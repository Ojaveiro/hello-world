package br.com.ideatech.comercial;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ItemCorporativoVO extends AbstractVO {

    private static final long serialVersionUID = 1;

    // ///////////////////////////////////
    // Propriedades comuns a NF e Pedido//
    // ///////////////////////////////////

    private long idReg;
    private TipoItemCorporativo tipoItem;

    // Quando for Item Pedido o item correspondente é o
    // item nota; quando for Item NF o item correspondente é o item pedido
    private ItemCorporativoVO itemCorrespondente;

    private long codFil;
    private Date dataItem;
    private long quantidade;
    private BigDecimal valorVenda;

    private long codItProd;
    private long codFornecedor;
    private long codLinha;
    private long codFamilia;
    private long codGrupo;
    private long codSubGrupo;
    private long codCapacidade;

    private BigDecimal custoTecnicoUnitarioOriginal;
    private BigDecimal custoLiquidoUnitarioOriginal;

    private BigDecimal custoTecnicoUnitario;
    private BigDecimal custoTecnicoUnitarioGarantido;
    private BigDecimal custoLiquidoUnitario;
    private BigDecimal custoLiquidoUnitarioGarantido;

    private BigDecimal valorImpostoPIS;
    private BigDecimal valorImpostoCOFINS;
    private BigDecimal valorImpostoSubstTributaria;
    private BigDecimal valorImpostoICMS;

    private BigDecimal margemTecnicaObjetivaTecnica;
    private BigDecimal margemTecnicaObjetivaLiquida;

    private boolean calcularCustoTecnico;
    private boolean itemNotaUnica;
    private boolean itemPrincipal;

    private int competencia;
    private boolean competenciaFechada;

    // /////////////////////////////////////////////////////////
    // Propriedades setadas somento quando item for do tipo NF//
    // /////////////////////////////////////////////////////////

    // Propriedades referentes a impostos de nota fiscal calculado pelo garantia
    private BigDecimal valorGMPIS;
    private BigDecimal valorGMPISGarantido;
    private BigDecimal valorGMCOFINS;
    private BigDecimal valorGMCOFINSGarantido;
    private BigDecimal valorGMSubstTributaria;
    private BigDecimal valorGMSubstTributariaGarantido;

    // Essas propriedades servem para calcular impostos quando for item nota
    // fiscal
    private BigDecimal valorCustoGerencial;
    private boolean isentoPISCOFINS;
    private boolean isentoSubstTributaria;
    private ArrayList<Long> idsCadastroIsencaoPISCOFINS;
    private ArrayList<Long> idsCadastroIsencaoSubstTributaria;

    // /////////////////////////////////////////////////////////////
    // Propriedades setadas somento quando item for do tipo Pedido//
    // /////////////////////////////////////////////////////////////

    // Lista de itens devolvidos quando o for item pedido
    private List<ItemDevolucaoVO> listaItensDevolvidos;

    public ItemCorporativoVO() {
        idReg = -1L;
        codFil = -1L;
        quantidade = 0L;
        valorVenda = BigDecimal.ZERO;

        codFornecedor = -1L;
        codItProd = -1L;
        codLinha = -1L;
        codGrupo = -1L;
        codSubGrupo = -1L;
        codCapacidade = -1L;
        codFamilia = -1L;

        custoTecnicoUnitario = BigDecimal.ZERO;
        custoTecnicoUnitarioGarantido = BigDecimal.ZERO;
        custoLiquidoUnitario = BigDecimal.ZERO;
        custoLiquidoUnitarioGarantido = BigDecimal.ZERO;

        valorImpostoPIS = BigDecimal.ZERO;
        valorImpostoCOFINS = BigDecimal.ZERO;
        valorImpostoSubstTributaria = BigDecimal.ZERO;
        valorImpostoICMS = BigDecimal.ZERO;

        margemTecnicaObjetivaTecnica = BigDecimal.ZERO;
        margemTecnicaObjetivaLiquida = BigDecimal.ZERO;

        valorGMPIS = BigDecimal.ZERO;
        valorGMPISGarantido = BigDecimal.ZERO;
        valorGMCOFINS = BigDecimal.ZERO;
        valorGMCOFINSGarantido = BigDecimal.ZERO;
        valorGMSubstTributaria = BigDecimal.ZERO;
        valorGMSubstTributariaGarantido = BigDecimal.ZERO;

        valorCustoGerencial = BigDecimal.ZERO;

        isentoPISCOFINS = false;
        isentoSubstTributaria = false;
    }

    public static List<ItemCorporativoVO> getItensNotasFiscais(ArrayList<ItemCorporativoVO> itensCorporativosVO) {
        ArrayList<ItemCorporativoVO> result = new ArrayList<ItemCorporativoVO>();

        for (ItemCorporativoVO itemVO : itensCorporativosVO) {
            if (itemVO.getTipoItem().equals(TipoItemCorporativo.NOTAFISCAL)) {
                result.add(itemVO);
            } else {
                if (itemVO.getItemCorrespondente() != null) {
                    result.add(itemVO.getItemCorrespondente());
                }
            }
        }

        return result;
    }

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

    public ItemCorporativoVO getItemCorrespondente() {
        return itemCorrespondente;
    }

    public void setItemCorrespondente(ItemCorporativoVO itemCorrespondente) {
        this.itemCorrespondente = itemCorrespondente;
    }

    public long getCodFil() {
        return codFil;
    }

    public void setCodFil(long codFil) {
        this.codFil = codFil;
    }

    public Date getDataItem() {
        return dataItem;
    }

    public void setDataItem(Date dataItem) {
        this.dataItem = dataItem;
    }

    public long getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(long quantidade) {
        this.quantidade = quantidade;
    }

    public BigDecimal getValorVenda() {
        return valorVenda;
    }

    public void setValorVenda(BigDecimal valorVenda) {
        this.valorVenda = valorVenda;
    }

    public long getCodItProd() {
        return codItProd;
    }

    public void setCodItProd(long codItProd) {
        this.codItProd = codItProd;
    }

    public long getCodFornecedor() {
        return codFornecedor;
    }

    public void setCodFornecedor(long codFornecedor) {
        this.codFornecedor = codFornecedor;
    }

    public long getCodLinha() {
        return codLinha;
    }

    public void setCodLinha(long codLinha) {
        this.codLinha = codLinha;
    }

    public long getCodFamilia() {
        return codFamilia;
    }

    public void setCodFamilia(long codFamilia) {
        this.codFamilia = codFamilia;
    }

    public long getCodGrupo() {
        return codGrupo;
    }

    public void setCodGrupo(long codGrupo) {
        this.codGrupo = codGrupo;
    }

    public long getCodSubGrupo() {
        return codSubGrupo;
    }

    public void setCodSubGrupo(long codSubGrupo) {
        this.codSubGrupo = codSubGrupo;
    }

    public long getCodCapacidade() {
        return codCapacidade;
    }

    public void setCodCapacidade(long codCapacidade) {
        this.codCapacidade = codCapacidade;
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

    public BigDecimal getValorImpostoPIS() {
        return valorImpostoPIS;
    }

    public void setValorImpostoPIS(BigDecimal valorImpostoPIS) {
        this.valorImpostoPIS = valorImpostoPIS;
    }

    public BigDecimal getValorImpostoCOFINS() {
        return valorImpostoCOFINS;
    }

    public void setValorImpostoCOFINS(BigDecimal valorImpostoCOFINS) {
        this.valorImpostoCOFINS = valorImpostoCOFINS;
    }

    public BigDecimal getValorImpostoSubstTributaria() {
        return valorImpostoSubstTributaria;
    }

    public void setValorImpostoSubstTributaria(BigDecimal valorImpostoSubstTributaria) {
        this.valorImpostoSubstTributaria = valorImpostoSubstTributaria;
    }

    public BigDecimal getValorImpostoICMS() {
        return valorImpostoICMS;
    }

    public void setValorImpostoICMS(BigDecimal valorImpostoICMS) {
        this.valorImpostoICMS = valorImpostoICMS;
    }

    public BigDecimal getMargemTecnicaObjetivaTecnica() {
        return margemTecnicaObjetivaTecnica;
    }

    public void setMargemTecnicaObjetivaTecnica(BigDecimal margemTecnicaObjetivaTecnica) {
        this.margemTecnicaObjetivaTecnica = margemTecnicaObjetivaTecnica;
    }

    public BigDecimal getMargemTecnicaObjetivaLiquida() {
        return margemTecnicaObjetivaLiquida;
    }

    public void setMargemTecnicaObjetivaLiquida(BigDecimal margemTecnicaObjetivaLiquida) {
        this.margemTecnicaObjetivaLiquida = margemTecnicaObjetivaLiquida;
    }

    public BigDecimal getValorGMPIS() {
        return valorGMPIS;
    }

    public void setValorGMPIS(BigDecimal valorGMPIS) {
        this.valorGMPIS = valorGMPIS;
    }

    public BigDecimal getValorGMPISGarantido() {
        return valorGMPISGarantido;
    }

    public void setValorGMPISGarantido(BigDecimal valorGMPISGarantido) {
        this.valorGMPISGarantido = valorGMPISGarantido;
    }

    public BigDecimal getValorGMCOFINS() {
        return valorGMCOFINS;
    }

    public void setValorGMCOFINS(BigDecimal valorGMCOFINS) {
        this.valorGMCOFINS = valorGMCOFINS;
    }

    public BigDecimal getValorGMCOFINSGarantido() {
        return valorGMCOFINSGarantido;
    }

    public void setValorGMCOFINSGarantido(BigDecimal valorGMCOFINSGarantido) {
        this.valorGMCOFINSGarantido = valorGMCOFINSGarantido;
    }

    public BigDecimal getValorGMSubstTributaria() {
        return valorGMSubstTributaria;
    }

    public void setValorGMSubstTributaria(BigDecimal valorGMSubstTributaria) {
        this.valorGMSubstTributaria = valorGMSubstTributaria;
    }

    public BigDecimal getValorGMSubstTributariaGarantido() {
        return valorGMSubstTributariaGarantido;
    }

    public void setValorGMSubstTributariaGarantido(BigDecimal valorGMSubstTributariaGarantido) {
        this.valorGMSubstTributariaGarantido = valorGMSubstTributariaGarantido;
    }

    public BigDecimal getValorCustoGerencial() {
        return valorCustoGerencial;
    }

    public void setValorCustoGerencial(BigDecimal valorCustoGerencial) {
        this.valorCustoGerencial = valorCustoGerencial;
    }

    public boolean isIsentoPISCOFINS() {
        return isentoPISCOFINS;
    }

    public void setIsentoPISCOFINS(boolean isentoPISCOFINS) {
        this.isentoPISCOFINS = isentoPISCOFINS;
    }

    public boolean isIsentoSubstTributaria() {
        return isentoSubstTributaria;
    }

    public void setIsentoSubstTributaria(boolean isentoSubstTributaria) {
        this.isentoSubstTributaria = isentoSubstTributaria;
    }

    public ArrayList<Long> getIdsCadastroIsencaoPISCOFINS() {
        if (idsCadastroIsencaoPISCOFINS == null) {
            idsCadastroIsencaoPISCOFINS = new ArrayList<Long>();
        }
        return idsCadastroIsencaoPISCOFINS;
    }

    public ArrayList<Long> getIdsCadastroIsencaoSubstTributaria() {
        if (idsCadastroIsencaoSubstTributaria == null) {
            idsCadastroIsencaoSubstTributaria = new ArrayList<Long>();
        }
        return idsCadastroIsencaoSubstTributaria;
    }

    public List<ItemDevolucaoVO> getListaItensDevolvidos() {
        if (listaItensDevolvidos == null) {
            listaItensDevolvidos = new ArrayList<ItemDevolucaoVO>();
        }

        return listaItensDevolvidos;
    }

    public void setListaItensDevolvidos(List<ItemDevolucaoVO> listaItensDevolvidos) {
        this.listaItensDevolvidos = listaItensDevolvidos;
    }

    public boolean isCalcularCustoTecnico() {
        return calcularCustoTecnico;
    }

    public void setCalcularCustoTecnico(boolean calcularCustoTecnico) {
        this.calcularCustoTecnico = calcularCustoTecnico;
    }

    public boolean isItemNotaUnica() {
        return itemNotaUnica;
    }

    public void setItemNotaUnica(boolean itemNotaUnica) {
        this.itemNotaUnica = itemNotaUnica;
    }

    public BigDecimal getCustoTecnicoUnitarioOriginal() {
        return custoTecnicoUnitarioOriginal;
    }

    public void setCustoTecnicoUnitarioOriginal(BigDecimal custoTecnicoUnitarioOriginal) {
        this.custoTecnicoUnitarioOriginal = custoTecnicoUnitarioOriginal;
    }

    public BigDecimal getCustoLiquidoUnitarioOriginal() {
        return custoLiquidoUnitarioOriginal;
    }

    public void setCustoLiquidoUnitarioOriginal(BigDecimal custoLiquidoUnitarioOriginal) {
        this.custoLiquidoUnitarioOriginal = custoLiquidoUnitarioOriginal;
    }

    public boolean isItemPrincipal() {
        return itemPrincipal;
    }

    public void setItemPrincipal(boolean itemPrincipal) {
        this.itemPrincipal = itemPrincipal;
    }

    public int getCompetencia() {
        return competencia;
    }

    public void setCompetencia(int competencia) {
        this.competencia = competencia;
    }

    public boolean isCompetenciaFechada() {
        return competenciaFechada;
    }

    public void setCompetenciaFechada(boolean competenciaFechada) {
        this.competenciaFechada = competenciaFechada;
    }
}