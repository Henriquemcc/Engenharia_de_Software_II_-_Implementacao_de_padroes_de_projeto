package padroesGrasp.A.QuestaoUm.ExemploTeste;

import padroesGrasp.A.Animal;

public class Cachorro implements Animal {

    private final String nomeAnimal;

    public Cachorro(String nomeAnimal) {
        this.nomeAnimal = nomeAnimal;
    }

    @Override
    public String getNomeEspecie() {
        return "Canis lupus familiaris";
    }

    @Override
    public String getNomeAnimal() {
        return this.nomeAnimal;
    }
}
