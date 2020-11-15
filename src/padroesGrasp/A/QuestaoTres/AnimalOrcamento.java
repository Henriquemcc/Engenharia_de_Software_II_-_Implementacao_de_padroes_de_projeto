package padroesGrasp.A.QuestaoTres;

import padroesGrasp.A.Animal;
import padroesGrasp.A.QuestaoDois.ItemOrcamentoComplexo;

/**
 * Representa um animal de zoológico, que possuí um orçamento.
 */
public interface AnimalOrcamento extends Animal {

    /**
     * Obtém o orçamento do animal.
     *
     * @return Instância da classe ItemOrcamentoComplexo contendo o orçamento do animal.
     */
    ItemOrcamentoComplexo orcamentoGastosAnimal();
}