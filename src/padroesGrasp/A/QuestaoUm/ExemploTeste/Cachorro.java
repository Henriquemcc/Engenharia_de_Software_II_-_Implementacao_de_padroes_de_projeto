package padroesGrasp.A.QuestaoUm.ExemploTeste;

import padroesGrasp.A.Animal;

/**
 * Representa um animal do tipo Cachorro.
 */
public class Cachorro implements Animal {

    private final String nomeAnimal;

    /**
     * Cria uma nova instância da classe Cachorro.
     *
     * @param nomeAnimal Nome do animal.
     */
    public Cachorro(String nomeAnimal) {
        this.nomeAnimal = nomeAnimal;
    }

    /**
     * Obtém o nome da espécie do animal.
     *
     * @return Nome da espécie do animal.
     */
    @Override
    public String getNomeEspecie() {
        return "Canis lupus familiaris";
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
