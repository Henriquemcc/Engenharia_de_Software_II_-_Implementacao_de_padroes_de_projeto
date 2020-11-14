package padroesGrasp.A.QuestaoDois;

/**
 *
 */
public class ItemOrcamento {

    private final String historico; // historico do item
    private final float valor; // valor do item

    /**
     * @param historico
     * @param valor
     */
    public ItemOrcamento(String historico, float valor) {
        this.historico = historico;
        this.valor = valor;
    }

    /**
     * @return
     */
    public String getHistorico() {
        return historico;
    }

    /**
     * @return
     */
    public float getValor() {
        return valor;
    }

}

