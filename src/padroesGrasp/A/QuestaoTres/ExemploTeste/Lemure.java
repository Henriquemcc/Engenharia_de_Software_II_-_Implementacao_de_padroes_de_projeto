package padroesGrasp.A.QuestaoTres.ExemploTeste;

import padroesGrasp.A.QuestaoDois.ItemOrcamentoComplexo;
import padroesGrasp.A.QuestaoTres.AnimalOrcamento;

public class Lemure implements AnimalOrcamento {

    private final String nomeAnimal;
    private final ItemOrcamentoComplexo orcamento;

    public Lemure(String nomeAnimal, ItemOrcamentoComplexo orcamento) {
        this.nomeAnimal = nomeAnimal;
        this.orcamento = orcamento;
    }

    @Override
    public ItemOrcamentoComplexo orcamentoGastosAnimal() {
        return this.orcamento;
    }

    @Override
    public String getNomeEspecie() {
        return "Lemur catta";
    }

    @Override
    public String getNomeAnimal() {
        return this.nomeAnimal;
    }
}
