package br.com.ideatech.comercial.campanha;

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

public class CampanhaBuilder {

    CampanhaVO campanha;

    public CampanhaBuilder criaCampanha() {
        campanha = new CampanhaVO();
        return this;
    }

    public CampanhaBuilder comTipo(TipoCampanha tipoCampanha) {
        campanha.tipoCampanha = tipoCampanha;
        return this;
    }

    public CampanhaBuilder comTipoDeRecuperacao(TipoRecuperacaoCampanha tipoRecuperacaoCampanha) {
        campanha.tipoRecuperacaoCampanha = tipoRecuperacaoCampanha;
        return this;
    }

    public CampanhaBuilder comValorDaCampanha(BigDecimal valorCampanha) {
        this.campanha.valorCampanha = valorCampanha;
        return this;
    }

    public CampanhaBuilder comTipoDoCalculo(TipoCalculoCampanha tipoCalculoCampanha) {
        campanha.tipoCalculoCampanha = tipoCalculoCampanha;
        return this;
    }

    public CampanhaBuilder comTipoParametroData(TipoParametroDataCampanha tipoParametroDataCampanha) {
        campanha.tipoParametroDataCampanha = tipoParametroDataCampanha;
        return this;
    }

    public CampanhaBuilder comStatus(StatusCampanha statusCampanha) {
        campanha.status = statusCampanha;
        return this;
    }

    public CampanhaBuilder comNome(String nomeDaCampanha) {
        campanha.nomeDaCampanha = nomeDaCampanha;
        return this;
    }

    public CampanhaBuilder comDataVigenciaInicialEm(Date inicioVigenciaCampanha) {
        campanha.inicioVigenciaCampanha = inicioVigenciaCampanha;
        return this;
    }

    public CampanhaBuilder comDataVigenciaFinalEm(Date fimVigenciaCampanha) {
        campanha.fimVigenciaCampanha = fimVigenciaCampanha;
        return this;
    }

    public CampanhaBuilder comCodigo(Long codigoCampanha) {
        campanha.codigoCampanha = codigoCampanha;
        return this;
    }

    public CampanhaBuilder comValorDaGarantia(BigDecimal valorGarantia) {
        campanha.valorGarantia = valorGarantia;
        return this;
    }

    public CampanhaBuilder comOsItens(List<ItemCampanhaVO> itensDaCampanha) {
        campanha.listaItensCampanhaVO = itensDaCampanha;
        return this;
    }

    public CampanhaBuilder comAsCondicoesDePagamentos(List<CondicaoPagamentoVO> condicoesDePagamento) {
        campanha.listaCondicaoPagamentoVO = condicoesDePagamento;
        return this;
    }

    public CampanhaBuilder comAsFiliais(List<FilialVO> filiais) {
        campanha.listaFilialVO = filiais;
        return this;
    }

    public CampanhaBuilder comOsFornecedores(List<FornecedorVO> fornecedores) {
        campanha.listFornecedorVO = fornecedores;
        return this;
    }

    public CampanhaBuilder comArvoreDeProduto(ArvoreProdutoVO arvoreProduto) {
        campanha.arvoreProdutoVO = arvoreProduto;
        return this;
    }

    public CampanhaBuilder comUsuario(String usuario) {
        campanha.usuario = usuario;
        return this;
    }

    public CampanhaVO build() {
        return campanha;
    }

}
