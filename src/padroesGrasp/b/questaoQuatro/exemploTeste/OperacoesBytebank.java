package padroesGrasp.b.questaoQuatro.exemploTeste;

import padroesGrasp.b.Correntista;
import padroesGrasp.b.OperacoesBanco;

/**
 * Implementação das interface OperacoesBanco para o banco fictício Bytebank.
 */
public class OperacoesBytebank implements OperacoesBanco {

    /**
     * Procura o correntista pelo cpf.
     *
     * @param todosCorrentistas Vetor contendo todos as instâncias da classe Correntista.
     * @param cpfProcurado      Cpf do correntista procurado.
     * @return Instância da classe Correntista encontrada. Ou null, caso não seja encontrada.
     */
    @Override
    public Correntista encontraCorrentista(Correntista[] todosCorrentistas, String cpfProcurado) {

        Correntista correntistaProcurado = null;

        for (Correntista correntista : todosCorrentistas) {

            if (correntista.getCPFCliente().equals(cpfProcurado)) {
                correntistaProcurado = correntista;
                break;
            }
        }

        return correntistaProcurado;
    }
}