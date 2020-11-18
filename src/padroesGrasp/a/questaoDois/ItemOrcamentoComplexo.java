package padroesGrasp.a.questaoDois;

/**
 *
 */
public class ItemOrcamentoComplexo extends ItemOrcamento
{

	public final ItemOrcamento[] subItemOrcamento;

	/**
	 * Cria uma nova instância da classe ItemOrcamentoComplexo.
	 *
	 * @param historico        Histórico do item do orçamento.
	 * @param valor            Valor do item do orçamento.
	 * @param subItemOrcamento Subitem do orçamento.
	 */
	public ItemOrcamentoComplexo(String historico, float valor, ItemOrcamento[] subItemOrcamento)
	{
		super(historico, valor);
		this.subItemOrcamento = subItemOrcamento;
	}

	/**
	 * Obtém o valor do item do orçamento.
	 *
	 * @return Valor do item do orçamento.
	 */
	@Override
	public float getValor()
	{
		float valor = super.getValor();

		for (ItemOrcamento subItem : this.subItemOrcamento)
		{
			valor += subItem.getValor();
		}

		return valor;
	}

	/**
	 * Encontra um subitem do orçamento de acordo com o seu histórico.
	 *
	 * @param historico Histórico do item do orçamento procurado.
	 * @return Subitem do orçamento com o histórico procurado.
	 */
	public ItemOrcamento encontraItem(String historico)
	{

		ItemOrcamento itemOrcamentoProcurado = null;

		for (ItemOrcamento item : this.subItemOrcamento)
		{
			if (item.getHistorico().equals(historico))
			{
				itemOrcamentoProcurado = item;
				break;
			}
		}

		return itemOrcamentoProcurado;
	}
}
