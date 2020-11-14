package padroesGrasp.A.QuestaoTres.ExemploTeste;

import padroesGrasp.A.QuestaoDois.ItemOrcamentoComplexo;
import padroesGrasp.A.QuestaoTres.AnimalOrcamento;

/**
 * Representa um animal do tipo Girafa.
 */
public class Girafa implements AnimalOrcamento {

    private final String nomeAnimal;
    private final ItemOrcamentoComplexo orcamento;

    /**
     * Cria uma nova instância da classe Girafa.
     *
     * @param nomeAnimal Nome do animal.
     * @param orcamento  Instancia da classe ItemOrcamentoComplexo contendo o orçamento do animal.
     */
    public Girafa(String nomeAnimal, ItemOrcamentoComplexo orcamento) {
        this.nomeAnimal = nomeAnimal;
        this.orcamento = orcamento;
    }

    /**
     * Obtém o orçamento do animal.
     *
     * @return Instancia da classe ItemOrcamentoComplexo contendo o orçamento do animal.
     */
    @Override
    public ItemOrcamentoComplexo orcamentoGastosAnimal() {
        return this.orcamento;
    }

    /**
     * Obtém o nome da espécie do animal.
     *
     * @return Nome da espécie do animal.
     */
    @Override
    public String getNomeEspecie() {
        return "Giraffa camelopardalis giraffa";
    }

    /**
     * Obtém o nome do animal.
     *
     * @return Nome do animal.
     */
    @Override
    public String getNomeAnimal() {
        return this.nomeAnimal;
    }
}