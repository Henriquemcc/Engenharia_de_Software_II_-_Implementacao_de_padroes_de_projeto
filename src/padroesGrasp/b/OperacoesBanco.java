package padroesGrasp.b;

/**
 * Representa uma rotina utilitária
 */
public interface OperacoesBanco
{

	/**
	 * Procura no vetor todosCorrentistas o correntista cujo CPF é igual ao informado no parâmetro cpfProcurado. Se o encontrar, retorna seu respectivo objeto através do método, caso contrário retorna null.
	 *
	 * @param todosCorrentistas Vetor contendo todos os correntistas.
	 * @param cpfProcurado      CPF do correntista procurado.
	 * @return Correntista procurado.
	 */
	Correntista encontraCorrentista(Correntista[] todosCorrentistas, String cpfProcurado);
}