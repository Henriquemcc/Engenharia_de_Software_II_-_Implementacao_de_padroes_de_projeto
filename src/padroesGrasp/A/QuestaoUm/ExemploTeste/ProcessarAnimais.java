package padroesGrasp.A.QuestaoUm.ExemploTeste;

import padroesGrasp.A.Animal;
import padroesGrasp.A.Ferramentas;

import java.util.ArrayList;

public class ProcessarAnimais implements Ferramentas {

    @Override
    public Animal[] filtraEspecie(Animal[] completo, String especieFiltrar) {

        ArrayList<Animal> animaisDaEspecieEspecificada = new ArrayList<Animal>();

        for (Animal animal : completo) {
            if (animal.getNomeEspecie().equals(especieFiltrar))
                animaisDaEspecieEspecificada.add(animal);
        }

        return animaisDaEspecieEspecificada.toArray(new Animal[0]);
    }

    @Override
    public String[] classificaEspecies(Animal[] completo) {

        //Contando a quantidade de especies diferentes
        ArrayList<String> especiesDeAnimais = new ArrayList<String>();
        for (Animal animal : completo) {
            String nomeEspecie = animal.getNomeEspecie();
            if (!especiesDeAnimais.contains(nomeEspecie))
                especiesDeAnimais.add(nomeEspecie);
        }

        return especiesDeAnimais.toArray(new String[0]);
    }
}
