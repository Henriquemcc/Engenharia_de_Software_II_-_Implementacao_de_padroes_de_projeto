package padroesGrasp.a.questaoUm.exemploTeste;

import padroesGrasp.a.Animal;
import padroesGrasp.a.Ferramentas;

import java.util.ArrayList;

/**
 * Contém o método ProcessarAnimais.
 */
public class ProcessarAnimais implements Ferramentas
{

	/**
	 * Filtra os animais de acordo com o nome da espécie.
	 *
	 * @param completo       Vetor de animais que serão filtrados.
	 * @param especieFiltrar Nome da espécie do animal para realizar a filtragem.
	 * @return Vetor de animais da espécie especificada.
	 */
	@Override
	public Animal[] filtraEspecie(Animal[] completo, String especieFiltrar)
	{

		ArrayList<Animal> animaisDaEspecieEspecificada = new ArrayList<>();

		for (Animal animal : completo)
		{
			if (animal.getNomeEspecie().equals(especieFiltrar))
			{
				animaisDaEspecieEspecificada.add(animal);
			}
		}

		return animaisDaEspecieEspecificada.toArray(new Animal[0]);
	}

	/**
	 * Classifica as espécies de animais.
	 *
	 * @param completo Vetor de animais que serão classificados.
	 * @return Vetor com o nome das espécies de animais.
	 */
	@Override
	public String[] classificaEspecies(Animal[] completo)
	{

		//Contando a quantidade de espécies diferentes
		ArrayList<String> especiesDeAnimais = new ArrayList<>();
		for (Animal animal : completo)
		{
			String nomeEspecie = animal.getNomeEspecie();
			if (!especiesDeAnimais.contains(nomeEspecie))
			{
				especiesDeAnimais.add(nomeEspecie);
			}
		}

		return especiesDeAnimais.toArray(new String[0]);
	}
}
