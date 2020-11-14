package padroesGrasp.B.QuestaoSeis;

import java.util.ArrayList;

/**
 * Possuí o método obterCorrentistasDespesaMaiorSaldoMarco
 */
public class ObterCorrentistasDespesaMaiorSaldo {

    /**
     * Obtém os correntistas cujas despesas são maiores que o saldo.
     *
     * @param correntistaDespesa Vetor de instâncias da classe CorrentistaDespesa contendo os correntistas.
     * @param mes                Número do mês das despesas.
     * @return Vetor de instâncias da classe CorrentistaDespesa contendo os correntistas cujas despesas sejam maiores que o saldo da conta.
     */
    private static CorrentistaDespesa[] obterCorrentistasDespesaMaiorSaldo(CorrentistaDespesa correntistaDespesa[], int mes) {

        ArrayList<CorrentistaDespesa> correntistaDespesaMaiorSaldo = new ArrayList<CorrentistaDespesa>();

        for (CorrentistaDespesa c : correntistaDespesa) {
            if (c.getDespesasPrevistas().totalizaMes(mes).getValor() > c.getSaldo()) {
                correntistaDespesaMaiorSaldo.add(c);
            }
        }

        return correntistaDespesaMaiorSaldo.toArray(new CorrentistaDespesa[0]);
    }

    /**
     * Obtém os correntistas cujas despesas são maiores que o saldo para o mês de março.
     *
     * @param correntistaDespesa Vetor de instâncias da classe CorrentistaDespesa contendo os correntistas.
     * @return Vetor de instâncias da classe CorrentistaDespesa contendo os correntistas cujas despesas sejam maiores que o saldo da conta.
     */
    public static CorrentistaDespesa[] obterCorrentistasDespesaMaiorSaldoMarco(CorrentistaDespesa correntistaDespesa[]) {
        return obterCorrentistasDespesaMaiorSaldo(correntistaDespesa, 3);
    }

}
