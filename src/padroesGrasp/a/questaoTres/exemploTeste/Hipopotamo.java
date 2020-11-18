package padroesGrasp.a.questaoTres.exemploTeste;

import padroesGrasp.a.questaoDois.ItemOrcamentoComplexo;
import padroesGrasp.a.questaoTres.AnimalOrcamento;

/**
 * Representa um animal do tipo Hipopótamo.
 */
public class Hipopotamo implements AnimalOrcamento
{

	private final String nomeAnimal;
	private final ItemOrcamentoComplexo orcamento;

	/**
	 * Cria uma nova instância da classe Hipopótamo.
	 *
	 * @param nomeAnimal Nome do animal.
	 * @param orcamento  Instância da classe ItemOrcamentoComplexo contendo o orçamento do animal.
	 */
	public Hipopotamo(String nomeAnimal, ItemOrcamentoComplexo orcamento)
	{
		this.nomeAnimal = nomeAnimal;
		this.orcamento = orcamento;
	}

	/**
	 * Obtém o orçamento do animal.
	 *
	 * @return Instância da classe ItemOrcamentoComplexo contendo o orçamento do animal.
	 */
	@Override
	public ItemOrcamentoComplexo orcamentoGastosAnimal()
	{
		return this.orcamento;
	}

	/**
	 * Obtém o nome da espécie do animal.
	 *
	 * @return Nome da espécie do animal.
	 */
	@Override
	public String getNomeEspecie()
	{
		return "Hippopotamus amphibius";
	}

	/**
	 * Obtém o nome do animal.
	 *
	 * @return Nome do animal.
	 */
	@Override
	public String getNomeAnimal()
	{
		return this.nomeAnimal;
	}
}
