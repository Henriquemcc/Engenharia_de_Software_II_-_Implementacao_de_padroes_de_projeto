package padroesGrasp.a.questaoTres;

import padroesGrasp.a.questaoDois.ItemOrcamento;

import java.util.ArrayList;

/**
 * Contém o método filtrarOrcamentoAnimais.
 */
public class FiltrarOrcamentoAnimais
{

	/**
	 * Filtra o vetor de objetos AnimalOrcamento que tiverem o histórico procurado.
	 *
	 * @param animalOrcamentos Vetor de instâncias da classe AnimalOrcamento a serem filtrados.
	 * @param historico        Histórico do orçamento procurado.
	 * @return Vetor de instâncias da classe AnimaisOrcamento que contém o histórico procurado no orçamento.
	 */
	public static AnimalOrcamento[] filtrarOrcamentoAnimais(AnimalOrcamento[] animalOrcamentos, String historico)
	{

		ArrayList<AnimalOrcamento> animalOrcamentosProcurados = new ArrayList<>();

		for (AnimalOrcamento animal : animalOrcamentos)
		{
			ItemOrcamento item = animal.orcamentoGastosAnimal().encontraItem(historico);
			if (item != null && item.getHistorico().equals(historico))
			{
				animalOrcamentosProcurados.add(animal);
			}
		}

		return animalOrcamentosProcurados.toArray(new AnimalOrcamento[0]);
	}
}
