package padroesGrasp.b.questaoQuatro.exemploTeste;

import padroesGrasp.b.Correntista;
import padroesGrasp.b.questaoQuatro.AtualizarSaldoCorrentista;

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

        //Criando as movimentações
        Movimentacao[] movimentacao = new Movimentacao[9];
        movimentacao[0] = new Movimentacao("647.243.400-02", -2000);
        movimentacao[1] = new Movimentacao("136.052.500-92", 2000);
        movimentacao[2] = new Movimentacao("218.499.580-09", -5000);
        movimentacao[3] = new Movimentacao("578.510.340-00", 3000);
        movimentacao[4] = new Movimentacao("535.319.300-87", -2000);
        movimentacao[5] = new Movimentacao("565.445.430-71", 4000);
        movimentacao[6] = new Movimentacao("565.445.430-71", -8000);
        movimentacao[7] = new Movimentacao("910.012.190-82", 9000);
        movimentacao[8] = new Movimentacao("815.232.700-04", -7000);

        //Criando as contas bancários
        Correntista[] correntistas = new Correntista[11];
        correntistas[0] = new Correntista("136.052.500-92", 20000);
        correntistas[1] = new Correntista("218.499.580-09", 30000);
        correntistas[2] = new Correntista("578.510.340-00", 25000);
        correntistas[3] = new Correntista("565.445.430-71", 60000);
        correntistas[4] = new Correntista("815.232.700-04", 90000);
        correntistas[5] = new Correntista("740.158.250-39", 39000);
        correntistas[6] = new Correntista("460.141.690-67", 50090);
        correntistas[7] = new Correntista("742.516.110-98", 39580);
        correntistas[8] = new Correntista("143.201.840-09", 49809);
        correntistas[9] = new Correntista("182.434.990-40", 34098);
        correntistas[10] = new Correntista("031.930.400-02", 49098);

        //Imprimindo os correntistas
        System.out.println("Antes da atualização do saldo:");
        for (Correntista correntista : correntistas) {
            System.out.println("CPF: " + correntista.getCPFCliente());
            System.out.println("Saldo: " + correntista.getSaldo());
        }
        System.out.println();

        //Atualizando o saldo dos correntistas
        AtualizarSaldoCorrentista.atualizarSaldoCorrentistas(correntistas, movimentacao, new OperacoesBytebank());

        //Imprimindo os correntistas
        System.out.println("Depois da atualização do saldo:");
        for (Correntista correntista : correntistas) {
            System.out.println("CPF: " + correntista.getCPFCliente());
            System.out.println("Saldo: " + correntista.getSaldo());
        }

    }

}
