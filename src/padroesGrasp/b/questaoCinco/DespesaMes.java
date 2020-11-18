package padroesGrasp.b.questaoCinco;

/**
 * Representa o total de despesas de um mês.
 */
public class DespesaMes {

    private final int mes; // mês da despesa
    private final float valor; // valor da despesa

    /**
     * Cria uma nova instância da classe DespesaMes
     *
     * @param mes   Número do mês.
     * @param valor Valor da despesa do mês.
     */
    public DespesaMes(int mes, float valor) {
        this.mes = mes;
        this.valor = valor;
    }

    /**
     * Obtém o número do mês.
     *
     * @return Número do mês.
     */
    public int getMes() {
        return mes;
    }

    /**
     * Obtém o valor da despesa do mês.
     *
     * @return Valor da despesa do mês.
     */
    public float getValor() {
        return valor;
    }
}
