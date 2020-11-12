package padroesGrasp.A.QuestaoTres;

import padroesGrasp.A.Animal;
import padroesGrasp.A.QuestaoDois.ItemOrcamentoComplexo;

public interface AnimalOrcamento extends Animal {

    /**
     * Retorna o orçamento para gastos de um animal no zoológico.
     *
     * @return Orçamento para gastos de um animal no zoológico.
     */
    ItemOrcamentoComplexo orcamentoGastosAnimal();
}