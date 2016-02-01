package br.com.ideatech.comercial.campanha;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import br.com.ideatech.comercial.ArvoreProdutoVO;
import br.com.ideatech.comercial.CondicaoPagamentoVO;
import br.com.ideatech.comercial.FilialVO;
import br.com.ideatech.comercial.FornecedorVO;
import br.com.ideatech.comercial.ItemCampanhaVO;
import br.com.ideatech.comercial.Status.StatusCampanha;
import br.com.ideatech.comercial.TipoCalculoCampanha;
import br.com.ideatech.comercial.TipoCampanha;
import br.com.ideatech.comercial.TipoParametroDataCampanha;
import br.com.ideatech.comercial.TipoRecuperacaoCampanha;

public class CampanhaVO implements Serializable {
    public static final long serialVersionUID = 1L;

    public long codigoCampanha;

    public String nomeDaCampanha;
    public Date inicioVigenciaCampanha;
    public Date fimVigenciaCampanha;
    public BigDecimal valorMaximoDaCampanha;
    public TipoCalculoCampanha tipoCalculoCampanha;
    public TipoRecuperacaoCampanha tipoRecuperacaoCampanha;
    public TipoParametroDataCampanha tipoParametroDataCampanha;
    public TipoCampanha tipoCampanha;
    public BigDecimal valorGarantia;
    public BigDecimal percentualPrecoTabela;
    public StatusCampanha status;

    public List<ItemCampanhaVO> listaItensCampanhaVO;
    public List<CondicaoPagamentoVO> listaCondicaoPagamentoVO;
    public List<FilialVO> listaFilialVO;
    public List<FornecedorVO> listFornecedorVO;
    public ArvoreProdutoVO arvoreProdutoVO;
    public String usuario;

    public BigDecimal valorCampanha;

    @Override
    public String toString() {
        return "CampanhaVO [codigoCampanha=" + codigoCampanha + ", nomeDaCampanha=" + nomeDaCampanha
                + ", inicioVigenciaCampanha=" + inicioVigenciaCampanha + ", fimVigenciaCampanha=" + fimVigenciaCampanha
                + ", valorMaximoDaCampanha=" + valorMaximoDaCampanha + ", tipoCalculoCampanha=" + tipoCalculoCampanha
                + ", tipoRecuperacaoCampanha=" + tipoRecuperacaoCampanha + ", tipoParametroDataCampanha="
                + tipoParametroDataCampanha + ", tipoCampanha=" + tipoCampanha + ", valorGarantia=" + valorGarantia
                + ", percentualPrecoTabela=" + percentualPrecoTabela + ", status=" + status + ", listaItensCampanhaVO="
                + listaItensCampanhaVO + ", listaCondicaoPagamentoVO=" + listaCondicaoPagamentoVO + ", listaFilialVO="
                + listaFilialVO + ", listFornecedorVO=" + listFornecedorVO + ", arvoreProdutoVO=" + arvoreProdutoVO
                + ", usuario=" + usuario + ", valorCampanha=" + valorCampanha + "]";
    }

    
}
