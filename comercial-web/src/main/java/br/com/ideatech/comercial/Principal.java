package br.com.ideatech.comercial;

import java.util.Date;

import br.com.ideatech.comercial.Status.StatusCampanha;
import br.com.ideatech.comercial.campanha.CampanhaLiquidaMargemPedido;
import br.com.ideatech.comercial.campanha.CampanhaVO;

public class Principal {

    public static void main(String[] args) {
        CampanhaVO campanha = new CampanhaLiquidaMargemPedido()
                                    .criaCampanha()
                                    .comTipo(TipoCampanha.MARGEM_LIQUIDA)
                                    .comTipoDoCalculo(TipoCalculoCampanha.MARGEM)
                                    .comTipoParametroData(TipoParametroDataCampanha.PEDIDO)
                                    .comNome("Campanha Teste")
                                    .comDataVigenciaInicialEm(new Date())
                                    .comDataVigenciaFinalEm(new Date())
                                    .comStatus(StatusCampanha.ABERTA).build();

        System.out.println(campanha.toString());
    }

}
