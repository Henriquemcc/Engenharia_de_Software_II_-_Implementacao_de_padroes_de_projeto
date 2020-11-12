package padroesGrasp.A.QuestaoTres;

import padroesGrasp.A.QuestaoDois.ItemOrcamento;

import java.util.ArrayList;

public class FiltrarOrcamentoAnimais {

    /**
     * Filtra o vetor de objetos AnimalOrcamento que tiverem o historico procurado.
     *
     * @param animalOrcamentos Vator de animalOrcamento que serão filtrados.
     * @param historico        Historico procurado.
     * @return Vetor de OrcamentoAnimais filtrado.
     */
    public static AnimalOrcamento[] filtrarOrcamentoAnimais(AnimalOrcamento[] animalOrcamentos, String historico) {

        ArrayList<AnimalOrcamento> animalOrcamentosProcurados = new ArrayList<AnimalOrcamento>();

        for (AnimalOrcamento animal : animalOrcamentos) {
            ItemOrcamento item = animal.orcamentoGastosAnimal().encontraItem(historico);
            if (item != null && item.getHistorico().equals(historico))
                animalOrcamentosProcurados.add(animal);
        }

        return animalOrcamentosProcurados.toArray(new AnimalOrcamento[0]);
    }
}
