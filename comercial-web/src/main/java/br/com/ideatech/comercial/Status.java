package br.com.ideatech.comercial;

/**
 * @author Daniel Silva
 *
 */

public class Status {

    public enum StatusRegional {
        ATIVA(0),
        INATIVA(1);

        private int status;

        StatusRegional(int status) {
            this.status = status;
        }

        public int getStatusValue() {
            return status;
        }

        public static StatusRegional get(int status) {
            for (StatusRegional atual : values()) {
                if (atual.status == status) {
                    return atual;
                }
            }
            throw new IllegalArgumentException("Status inválido: " + status);
        }
    }

    public enum StatusCapacidade {

    }

    public enum StatusGrupoProduto {

    }

    public enum StatusFamilia {

    }

    public enum StatusProduto {

    }

    public enum StatusLinha {

    }

    public enum StatusSubGrupo {

    }

    public enum StatusItemPedido {

    }

    public enum StatusItemNotaFiscal {

    }

    public enum StatusItemDevolucao {

    }

    public enum StatusDevolucao {

    }

    public enum StatusCampanha {

        ABERTA(0, "Aberta"),
        INICIADA(1, "Iniciada"),
        INTERROMPIDA(2, "Interrompida"),
        CANCELADA(3, "Cancelada"),
        CONCLUIDA(4, "Concluída"),
        ENCERRADA(5, "Encerrada"),
        PENDENTE(6, "Pendente"),
        REJEITADA(7, "Rejeitada");

        private int status;
        private String descricao;

        StatusCampanha(int status, String descricao) {
            this.status = status;
            this.descricao = descricao;
        }

        public int getStatusValue() {
            return status;
        }

        public static StatusCampanha get(int status) {
            for (StatusCampanha atual : values()) {
                if (atual.status == status) {
                    return atual;
                }
            }
            throw new IllegalArgumentException("Status inválido: " + status);
        }

        public void setDescricao(String descricao) {
            this.descricao = descricao;
        }

        public String getDescricao() {
            return descricao;
        }

    }

    public enum StatusCondicaoPagamento {

    }

    public enum StatusProcessamento {

    }

    public enum StatusItemCampanha {
        PROCESSADO(0),
        CANCELADO(1),
        CONCLUIDO(2),
        CANCELAMENTO_SIMBOLICO(3);

        private int status;

        StatusItemCampanha(int status) {
            this.status = status;
        }

        public int getStatusValue() {
            return status;
        }

        public static StatusItemCampanha get(int status) {
            for (StatusItemCampanha atual : values()) {
                if (atual.status == status) {
                    return atual;
                }
            }
            throw new IllegalArgumentException("Status inválido: " + status);
        }
    }

    public enum StatusCompetencia {
        ABERTA(0, "Aberta"),
        FECHADA(1, "Fechada");

        private int status;
        private String descricao;

        StatusCompetencia(int status, String descricao) {
            this.status = status;
            this.setDescricao(descricao);
        }

        public int getStatusValue() {
            return status;
        }

        public static StatusCompetencia get(int status) {
            for (StatusCompetencia atual : values()) {
                if (atual.status == status) {
                    return atual;
                }
            }
            throw new IllegalArgumentException("Status inválido: " + status);
        }

        public void setDescricao(String descricao) {
            this.descricao = descricao;
        }

        public String getDescricao() {
            return descricao;
        }
    }
}
