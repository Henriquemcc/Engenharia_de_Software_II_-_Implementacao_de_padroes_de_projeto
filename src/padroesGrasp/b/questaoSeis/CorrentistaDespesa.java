package padroesGrasp.b.questaoSeis;

import padroesGrasp.b.Correntista;
import padroesGrasp.b.questaoCinco.DespesasIndividuo;

/**
 * Representa os dados de um correntista mais as despesas.
 */
public class CorrentistaDespesa extends Correntista
{

	private final DespesasIndividuo despesasPrevistas; // despesas previstas

	/**
	 * Cria uma nova instância da classe CorrentistaDespesa.
	 *
	 * @param cpfCliente Cpf do cliente.
	 * @param saldo      Saldo da conta corrente.
	 * @param despesas   Despesas do correntista.
	 */
	public CorrentistaDespesa(String cpfCliente, float saldo, DespesasIndividuo despesas)
	{
		super(cpfCliente, saldo);
		this.despesasPrevistas = despesas;
	}

	/**
	 * Obtém as despesas do correntista.s
	 *
	 * @return Instância da classe DespesasIndividuo contendo as despesas do indivíduo.
	 */
	public DespesasIndividuo getDespesasPrevistas()
	{
		return despesasPrevistas;
	}
}

