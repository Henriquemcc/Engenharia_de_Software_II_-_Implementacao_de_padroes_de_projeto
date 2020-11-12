package padroesGrasp.A.QuestaoUm.ExemploTeste;

import padroesGrasp.A.Animal;

public class Gato implements Animal {

    private final String nomeAnimal;

    public Gato(String nomeAnimal) {
        this.nomeAnimal = nomeAnimal;
    }

    @Override
    public String getNomeEspecie() {
        return "Felis catus";
    }

    @Override
    public String getNomeAnimal() {
        return this.nomeAnimal;
    }
}
