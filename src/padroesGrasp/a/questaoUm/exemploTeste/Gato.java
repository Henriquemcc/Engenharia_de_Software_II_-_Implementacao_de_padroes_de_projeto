package padroesGrasp.a.questaoUm.exemploTeste;

import padroesGrasp.a.Animal;

/**
 * Representa um animal do tipo Gato.
 */
public class Gato implements Animal
{

	private final String nomeAnimal;

	/**
	 * Cria uma nova instância da classe Gato.
	 *
	 * @param nomeAnimal Nome do animal.
	 */
	public Gato(String nomeAnimal)
	{
		this.nomeAnimal = nomeAnimal;
	}

	/**
	 * Obtém o nome da espécie do animal.
	 *
	 * @return Nome da espécie do animal.
	 */
	@Override
	public String getNomeEspecie()
	{
		return "Felis catus";
	}

	/**
	 * Obtém o nome do animal.
	 *
	 * @return Nome do animal.
	 */
	@Override
	public String getNomeAnimal()
	{
		return this.nomeAnimal;
	}
}