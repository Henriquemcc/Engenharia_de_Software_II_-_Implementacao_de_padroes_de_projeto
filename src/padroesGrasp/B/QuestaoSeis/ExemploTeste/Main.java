package padroesGrasp.B.QuestaoSeis.ExemploTeste;

import padroesGrasp.B.QuestaoCinco.DespesaMes;
import padroesGrasp.B.QuestaoCinco.DespesasIndividuo;
import padroesGrasp.B.QuestaoSeis.CorrentistaDespesa;
import padroesGrasp.B.QuestaoSeis.ObterCorrentistasDespesaMaiorSaldo;

/**
 * Classe principal.
 */
public class Main {

    /**
     * Método principal.
     *
     * @param args Argumentos do método (inútil).
     */
    public static void main(String[] args) {

        //Criando os correntistas
        CorrentistaDespesa[] correntistas = new CorrentistaDespesa[10];

        //Correntista 0
        DespesaMes[] despesaMes = new DespesaMes[12];
        despesaMes[0] = new DespesaMes(1, 600);
        despesaMes[1] = new DespesaMes(2, 700);
        despesaMes[2] = new DespesaMes(3, 35708);
        despesaMes[3] = new DespesaMes(4, 900);
        despesaMes[4] = new DespesaMes(5, 400);
        despesaMes[5] = new DespesaMes(6, 900);
        despesaMes[6] = new DespesaMes(7, 200);
        despesaMes[7] = new DespesaMes(8, 300);
        despesaMes[8] = new DespesaMes(9, 1000);
        despesaMes[9] = new DespesaMes(10, 700);
        despesaMes[10] = new DespesaMes(11, 800);
        despesaMes[11] = new DespesaMes(12, 600);
        DespesasIndividuo despesas = new DespesasIndividuo("674.196.060-05", despesaMes);
        correntistas[0] = new CorrentistaDespesa("674.196.060-05", 10000, despesas);

        //Correntista 1
        despesaMes = new DespesaMes[12];
        despesaMes[0] = new DespesaMes(1, 900);
        despesaMes[1] = new DespesaMes(2, 1000);
        despesaMes[2] = new DespesaMes(3, 2000);
        despesaMes[3] = new DespesaMes(4, 1500);
        despesaMes[4] = new DespesaMes(5, 1400);
        despesaMes[5] = new DespesaMes(6, 1500);
        despesaMes[6] = new DespesaMes(7, 1300);
        despesaMes[7] = new DespesaMes(8, 1200);
        despesaMes[8] = new DespesaMes(9, 1400);
        despesaMes[9] = new DespesaMes(10, 1500);
        despesaMes[10] = new DespesaMes(11, 1600);
        despesaMes[11] = new DespesaMes(12, 1700);
        despesas = new DespesasIndividuo("598.095.450-37", despesaMes);
        correntistas[1] = new CorrentistaDespesa("598.095.450-37", 5000, despesas);

        //Correntista 2
        despesaMes = new DespesaMes[12];
        despesaMes[0] = new DespesaMes(1, 1000);
        despesaMes[1] = new DespesaMes(2, 1100);
        despesaMes[2] = new DespesaMes(3, 17463);
        despesaMes[3] = new DespesaMes(4, 1600);
        despesaMes[4] = new DespesaMes(5, 1500);
        despesaMes[5] = new DespesaMes(6, 1600);
        despesaMes[6] = new DespesaMes(7, 1400);
        despesaMes[7] = new DespesaMes(8, 1300);
        despesaMes[8] = new DespesaMes(9, 1500);
        despesaMes[9] = new DespesaMes(10, 1600);
        despesaMes[10] = new DespesaMes(11, 1700);
        despesaMes[11] = new DespesaMes(12, 1800);
        despesas = new DespesasIndividuo("813.867.860-71", despesaMes);
        correntistas[2] = new CorrentistaDespesa("813.867.860-71", 20000, despesas);

        //Correntista 3
        despesaMes = new DespesaMes[12];
        despesaMes[0] = new DespesaMes(1, 2000);
        despesaMes[1] = new DespesaMes(2, 2200);
        despesaMes[2] = new DespesaMes(3, 4200);
        despesaMes[3] = new DespesaMes(4, 3200);
        despesaMes[4] = new DespesaMes(5, 3000);
        despesaMes[5] = new DespesaMes(6, 3200);
        despesaMes[6] = new DespesaMes(7, 2100);
        despesaMes[7] = new DespesaMes(8, 2600);
        despesaMes[8] = new DespesaMes(9, 3000);
        despesaMes[9] = new DespesaMes(10, 3000);
        despesaMes[10] = new DespesaMes(11, 3400);
        despesaMes[11] = new DespesaMes(12, 3600);
        despesas = new DespesasIndividuo("955.235.890-63", despesaMes);
        correntistas[3] = new CorrentistaDespesa("955.235.890-63", 30000, despesas);

        //Correntista 4
        despesaMes = new DespesaMes[12];
        despesaMes[0] = new DespesaMes(1, 4000);
        despesaMes[1] = new DespesaMes(2, 4400);
        despesaMes[2] = new DespesaMes(3, 69810);
        despesaMes[3] = new DespesaMes(4, 6400);
        despesaMes[4] = new DespesaMes(5, 6000);
        despesaMes[5] = new DespesaMes(6, 6200);
        despesaMes[6] = new DespesaMes(7, 4200);
        despesaMes[7] = new DespesaMes(8, 5200);
        despesaMes[8] = new DespesaMes(9, 6000);
        despesaMes[9] = new DespesaMes(10, 6000);
        despesaMes[10] = new DespesaMes(11, 6800);
        despesaMes[11] = new DespesaMes(12, 7200);
        despesas = new DespesasIndividuo("886.388.680-65", despesaMes);
        correntistas[4] = new CorrentistaDespesa("886.388.680-65", 60000, despesas);

        //Correntista 5
        despesaMes = new DespesaMes[12];
        despesaMes[0] = new DespesaMes(1, 8000);
        despesaMes[1] = new DespesaMes(2, 8800);
        despesaMes[2] = new DespesaMes(3, 16800);
        despesaMes[3] = new DespesaMes(4, 12800);
        despesaMes[4] = new DespesaMes(5, 12000);
        despesaMes[5] = new DespesaMes(6, 12800);
        despesaMes[6] = new DespesaMes(7, 8400);
        despesaMes[7] = new DespesaMes(8, 10400);
        despesaMes[8] = new DespesaMes(9, 12000);
        despesaMes[9] = new DespesaMes(10, 12000);
        despesaMes[10] = new DespesaMes(11, 13600);
        despesaMes[11] = new DespesaMes(12, 14400);
        despesas = new DespesasIndividuo("003.971.410-17", despesaMes);
        correntistas[5] = new CorrentistaDespesa("003.971.410-17", 30000, despesas);

        //Correntista 6
        despesaMes = new DespesaMes[12];
        despesaMes[0] = new DespesaMes(1, 1000);
        despesaMes[1] = new DespesaMes(2, 35476);
        despesaMes[2] = new DespesaMes(3, 1000);
        despesaMes[3] = new DespesaMes(4, 1000);
        despesaMes[4] = new DespesaMes(5, 1000);
        despesaMes[5] = new DespesaMes(6, 1000);
        despesaMes[6] = new DespesaMes(7, 1000);
        despesaMes[7] = new DespesaMes(8, 1000);
        despesaMes[8] = new DespesaMes(9, 1000);
        despesaMes[9] = new DespesaMes(10, 1000);
        despesaMes[10] = new DespesaMes(11, 1000);
        despesaMes[11] = new DespesaMes(12, 1000);
        despesas = new DespesasIndividuo("294.565.050-90", despesaMes);
        correntistas[6] = new CorrentistaDespesa("294.565.050-90", 120000, despesas);

        //Correntista 7
        despesaMes = new DespesaMes[12];
        despesaMes[0] = new DespesaMes(1, 912477);
        despesaMes[1] = new DespesaMes(2, 498620);
        despesaMes[2] = new DespesaMes(3, 930849);
        despesaMes[3] = new DespesaMes(4, 591386);
        despesaMes[4] = new DespesaMes(5, 896007);
        despesaMes[5] = new DespesaMes(6, 688349);
        despesaMes[6] = new DespesaMes(7, 767833);
        despesaMes[7] = new DespesaMes(8, 158336);
        despesaMes[8] = new DespesaMes(9, 864869);
        despesaMes[9] = new DespesaMes(10, 927286);
        despesaMes[10] = new DespesaMes(11, 944961);
        despesaMes[11] = new DespesaMes(12, 71764);
        despesas = new DespesasIndividuo("279.915.850-18", despesaMes);
        correntistas[7] = new CorrentistaDespesa("279.915.850-18", 7769191, despesas);

        //Correntista 8
        despesaMes = new DespesaMes[12];
        despesaMes[0] = new DespesaMes(1, 896);
        despesaMes[1] = new DespesaMes(2, 340);
        despesaMes[2] = new DespesaMes(3, 704);
        despesaMes[3] = new DespesaMes(4, 86);
        despesaMes[4] = new DespesaMes(5, 616);
        despesaMes[5] = new DespesaMes(6, 267);
        despesaMes[6] = new DespesaMes(7, 122);
        despesaMes[7] = new DespesaMes(8, 80);
        despesaMes[8] = new DespesaMes(9, 765);
        despesaMes[9] = new DespesaMes(10, 602);
        despesaMes[10] = new DespesaMes(11, 133);
        despesaMes[11] = new DespesaMes(12, 216);
        despesas = new DespesasIndividuo("524.809.720-70", despesaMes);
        correntistas[8] = new CorrentistaDespesa("524.809.720-70", 4865, despesas);

        //Correntista 9
        despesaMes = new DespesaMes[12];
        despesaMes[0] = new DespesaMes(1, 41198);
        despesaMes[1] = new DespesaMes(2, 27620);
        despesaMes[2] = new DespesaMes(3, 66484);
        despesaMes[3] = new DespesaMes(4, 60605);
        despesaMes[4] = new DespesaMes(5, 77297);
        despesaMes[5] = new DespesaMes(6, 79067);
        despesaMes[6] = new DespesaMes(7, 38016);
        despesaMes[7] = new DespesaMes(8, 23419);
        despesaMes[8] = new DespesaMes(9, 46939);
        despesaMes[9] = new DespesaMes(10, 84941);
        despesaMes[10] = new DespesaMes(11, 18649);
        despesaMes[11] = new DespesaMes(12, 41912);
        despesas = new DespesasIndividuo("913.470.780-88", despesaMes);
        correntistas[9] = new CorrentistaDespesa("913.470.780-88", 25333, despesas);

        CorrentistaDespesa[] correntistasDespesasMaiorSaldoMarco = ObterCorrentistasDespesaMaiorSaldo.obterCorrentistasDespesaMaiorSaldoMarco(correntistas);

        //Imprimindo os correntistas com despesa maior que saldo para o mês de março.
        for (CorrentistaDespesa c : correntistasDespesasMaiorSaldoMarco) {
            System.out.println("CPF: " + c.getCPFCliente());
            System.out.println("Saldo: R$" + c.getSaldo());
            System.out.println("Despesas: R$" + c.getDespesasPrevistas().totalizaMes(3).getValor());
        }


    }

}
