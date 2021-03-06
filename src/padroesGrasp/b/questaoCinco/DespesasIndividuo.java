package padroesGrasp.b.questaoCinco;

/**
 * Mantém as despesas de um indivíduo.
 */
public class DespesasIndividuo
{

	private final DespesaMes[] despesas;
	private final String cpf;

	/**
	 * Cria uma nova instância da classe DespesasIndividuo.
	 *
	 * @param cpf      Cpf do indivíduo.
	 * @param despesas Vetor contendo instâncias de DespesaMes e DespesaDia.
	 */
	public DespesasIndividuo(String cpf, DespesaMes[] despesas)
	{
		this.cpf = cpf;
		this.despesas = despesas;
	}

	/**
	 * Obtém o cpf do indivíduo.
	 *
	 * @return Cpf do individuo.
	 */
	public String getCPF()
	{
		return this.cpf;
	}

	/**
	 * Obtém a soma de todas as despesas de um mês.
	 *
	 * @param mes Número do mês.
	 * @return Instância da classe DespesaMes contendo a soma das despesas do mês.
	 */
	public DespesaMes totalizaMes(int mes)
	{
		float totalDespesas = 0;

		for (DespesaMes despesa : this.despesas)
		{
			if (despesa.getMes() == mes)
			{
				totalDespesas += despesa.getValor();
			}
		}

		return new DespesaMes(mes, totalDespesas);
	}

}
