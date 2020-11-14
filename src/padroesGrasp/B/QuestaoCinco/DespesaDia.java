package padroesGrasp.B.QuestaoCinco;

/**
 * Representa o total de despesas de um dia.
 */
public class DespesaDia extends DespesaMes {

    private int dia; // dia da despesa

    /**
     * Cria uma nova instância da classe DespesaMes.
     *
     * @param dia   Número do dia do mês.
     * @param mes   Número do mês.
     * @param valor Valor da despesa do dia.
     */
    public DespesaDia(int dia, int mes, float valor) {
        super(mes, valor);
        this.dia = dia;
    }

    /**
     * Obtém o número do dia.
     *
     * @return Número do dia.
     */
    public int getDia() {
        return dia;
    }
}
