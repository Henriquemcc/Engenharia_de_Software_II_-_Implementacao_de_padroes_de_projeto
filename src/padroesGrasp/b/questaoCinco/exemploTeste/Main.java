package padroesGrasp.b.questaoCinco.exemploTeste;

import padroesGrasp.b.questaoCinco.DespesaDia;
import padroesGrasp.b.questaoCinco.DespesaMes;
import padroesGrasp.b.questaoCinco.DespesasIndividuo;

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

        //Criando as despesas
        DespesaMes[] despesaMes = new DespesaMes[31];
        despesaMes[0] = new DespesaDia(1, 1, 200);
        despesaMes[1] = new DespesaDia(2, 1, 300);
        despesaMes[2] = new DespesaDia(3, 1, 200);
        despesaMes[3] = new DespesaDia(4, 1, 1000);
        despesaMes[4] = new DespesaDia(5, 1, 500);
        despesaMes[5] = new DespesaDia(6, 1, 600);
        despesaMes[6] = new DespesaDia(7, 1, 400);
        despesaMes[7] = new DespesaDia(8, 1, 300);
        despesaMes[8] = new DespesaDia(9, 1, 200);
        despesaMes[9] = new DespesaDia(10, 1, 700);
        despesaMes[10] = new DespesaDia(11, 1, 400);
        despesaMes[11] = new DespesaDia(12, 1, 400);
        despesaMes[12] = new DespesaDia(13, 1, 500);
        despesaMes[13] = new DespesaDia(14, 1, 200);
        despesaMes[14] = new DespesaDia(15, 1, 600);
        despesaMes[15] = new DespesaDia(16, 1, 500);
        despesaMes[16] = new DespesaDia(17, 1, 300);
        despesaMes[17] = new DespesaDia(18, 1, 200);
        despesaMes[18] = new DespesaDia(19, 1, 100);
        despesaMes[19] = new DespesaDia(20, 1, 500);
        despesaMes[20] = new DespesaDia(21, 1, 700);
        despesaMes[21] = new DespesaDia(22, 1, 800);
        despesaMes[22] = new DespesaDia(23, 1, 600);
        despesaMes[23] = new DespesaDia(24, 1, 400);
        despesaMes[24] = new DespesaDia(25, 1, 700);
        despesaMes[25] = new DespesaDia(26, 1, 400);
        despesaMes[26] = new DespesaDia(27, 1, 800);
        despesaMes[27] = new DespesaDia(28, 1, 400);
        despesaMes[28] = new DespesaDia(29, 1, 200);
        despesaMes[29] = new DespesaDia(30, 1, 300);
        despesaMes[30] = new DespesaDia(31, 1, 900);

        DespesasIndividuo despesasIndividuo = new DespesasIndividuo("960.908.440-04", despesaMes);

        //Imprimindo
        System.out.println("CPF: " + despesasIndividuo.getCPF());
        System.out.println("Total: R$" + despesasIndividuo.totalizaMes(1).getValor());

    }

}
