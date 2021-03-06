package padroesGrasp.a.questaoUm.exemploTeste;

import padroesGrasp.a.Animal;
import padroesGrasp.a.questaoUm.ContarAnimais;
import padroesGrasp.a.questaoUm.Resultado;

import java.util.ArrayList;

/**
 * Classe principal.
 */
public class Main
{

	/**
	 * Método principal.
	 *
	 * @param args Argumentos do método (inútil).
	 */
	public static void main(String[] args)
	{

		ArrayList<Animal> animais = new ArrayList<>();
		animais.add(new Gato("Chumbinho"));
		animais.add(new Gato("Greta"));
		animais.add(new Gato("Tom"));
		animais.add(new Cachorro("Sorriso"));
		animais.add(new Cachorro("Pintcher sem nome 1"));
		animais.add(new Cachorro("Fera"));
		animais.add(new Calopsita("Calopsita sem nome 1"));
		animais.add(new Calopsita("Calopsita sem nome 2"));
		animais.add(new Calopsita("Calopsita sem nome 3"));

		Resultado[] resultados = ContarAnimais.contarAnimais(animais.toArray(new Animal[0]), new ProcessarAnimais());

		for (Resultado resultado : resultados)
		{
			System.out.println("Nome da espécie: " + resultado.getNomeEspecie());
			System.out.println("Quantidade: " + resultado.getQuantidade());
		}

	}
}
