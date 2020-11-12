package padroesGrasp.A.QuestaoUm.ExemploTeste;

import padroesGrasp.A.Animal;

public class Calopsita implements Animal {

    private final String nomeAnimal;

    public Calopsita(String nomeAnimal) {
        this.nomeAnimal = nomeAnimal;
    }

    @Override
    public String getNomeEspecie() {
        return "Nymphicus hollandicus";
    }

    @Override
    public String getNomeAnimal() {
        return this.nomeAnimal;
    }
}
