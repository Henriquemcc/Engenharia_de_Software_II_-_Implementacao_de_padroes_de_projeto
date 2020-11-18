package padroesGrasp.a.questaoTres;

import padroesGrasp.a.Animal;
import padroesGrasp.a.questaoDois.ItemOrcamentoComplexo;

/**
 * Representa um animal de zoológico, que possuí um orçamento.
 */
public interface AnimalOrcamento extends Animal
{

	/**
	 * Obtém o orçamento do animal.
	 *
	 * @return Instância da classe ItemOrcamentoComplexo contendo o orçamento do animal.
	 */
	ItemOrcamentoComplexo orcamentoGastosAnimal();
}