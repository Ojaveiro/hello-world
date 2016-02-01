package br.com.ideatech.comercial.campanha;

import java.math.BigDecimal;

public class CampanhaLiquidaMargemPedido extends CampanhaBuilder {

    public CampanhaVO comValorMaximoDaCampanha(BigDecimal valorMaximoDaCampanha) {
        this.campanha.valorMaximoDaCampanha = valorMaximoDaCampanha;
        return this.campanha;
    }

    public CampanhaVO comPercentualPrecoDeTabela(BigDecimal percentualPrecoDeTabela) {
        this.campanha.percentualPrecoTabela = percentualPrecoDeTabela;
        return this.campanha;
    }

}
