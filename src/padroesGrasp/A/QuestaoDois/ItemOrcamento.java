package padroesGrasp.A.QuestaoDois;

/**
 * Representa um item do orçamento.
 */
public class ItemOrcamento {

    private final String historico; // histórico do item
    private final float valor; // valor do item

    /**
     * Cria uma nova instância da classe ItemOrcamento.
     *
     * @param historico Histórico do item do orçamento.
     * @param valor     Valor do item do orçamento.
     */
    public ItemOrcamento(String historico, float valor) {
        this.historico = historico;
        this.valor = valor;
    }

    /**
     * Obtém o histórico do item do orçamento.
     *
     * @return Histórico do item do orçamento.
     */
    public String getHistorico() {
        return historico;
    }

    /**
     * Obtém o valor do item do orçamento.
     *
     * @return Valor do item do orçamento.
     */
    public float getValor() {
        return valor;
    }

}

