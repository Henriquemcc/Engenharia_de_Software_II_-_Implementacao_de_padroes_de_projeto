package padroesGrasp.A.QuestaoTres.ExemploTeste;

import padroesGrasp.A.QuestaoDois.ItemOrcamentoComplexo;
import padroesGrasp.A.QuestaoTres.AnimalOrcamento;

public class Zebra implements AnimalOrcamento {

    private final String nomeAnimal;
    private final ItemOrcamentoComplexo orcamento;

    public Zebra(String nomeAnimal, ItemOrcamentoComplexo orcamento) {
        this.nomeAnimal = nomeAnimal;
        this.orcamento = orcamento;
    }

    @Override
    public ItemOrcamentoComplexo orcamentoGastosAnimal() {
        return this.orcamento;
    }

    @Override
    public String getNomeEspecie() {
        return "Equus grevyi";
    }

    @Override
    public String getNomeAnimal() {
        return this.nomeAnimal;
    }
}
