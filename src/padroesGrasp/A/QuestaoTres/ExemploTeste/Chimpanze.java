package padroesGrasp.A.QuestaoTres.ExemploTeste;

import padroesGrasp.A.QuestaoDois.ItemOrcamentoComplexo;
import padroesGrasp.A.QuestaoTres.AnimalOrcamento;

public class Chimpanze implements AnimalOrcamento {

    private final String nomeAnimal;
    private final ItemOrcamentoComplexo orcamento;

    public Chimpanze(String nomeAnimal, ItemOrcamentoComplexo orcamento) {
        this.nomeAnimal = nomeAnimal;
        this.orcamento = orcamento;
    }

    @Override
    public ItemOrcamentoComplexo orcamentoGastosAnimal() {
        return this.orcamento;
    }

    @Override
    public String getNomeEspecie() {
        return "Pan troglodytes";
    }

    @Override
    public String getNomeAnimal() {
        return this.nomeAnimal;
    }
}
