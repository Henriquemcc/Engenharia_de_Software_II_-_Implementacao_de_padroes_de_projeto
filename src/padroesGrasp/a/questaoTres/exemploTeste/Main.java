package padroesGrasp.a.questaoTres.exemploTeste;

import padroesGrasp.a.questaoDois.ItemOrcamento;
import padroesGrasp.a.questaoDois.ItemOrcamentoComplexo;
import padroesGrasp.a.questaoTres.AnimalOrcamento;
import padroesGrasp.a.questaoTres.FiltrarOrcamentoAnimais;

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

		ArrayList<AnimalOrcamento> animais = new ArrayList<>();

		//Criando os itens
		ItemOrcamento racao = new ItemOrcamento("Ração", 1000);
		ItemOrcamento vacinaG = new ItemOrcamento("Vacina G", 1000);
		ItemOrcamento banho = new ItemOrcamento("Banho", 1000);
		ItemOrcamento veterinario = new ItemOrcamento("Veterinário", 1000);
		ItemOrcamento vacinaW = new ItemOrcamento("vacina W", 3000);
		ItemOrcamento tosa = new ItemOrcamento("Tosa", 5000);

		//Criando uma Girafa
		ItemOrcamento[] itens = new ItemOrcamento[]{racao, vacinaG, banho, veterinario};
		animais.add(new Girafa("Melman", new ItemOrcamentoComplexo("Gastos", 0, itens)));

		//Criando um Leão
		itens = new ItemOrcamento[]{racao, vacinaW, banho, veterinario, tosa};
		animais.add(new Leao("Alex", new ItemOrcamentoComplexo("Gastos", 0, itens)));

		//Criando um hipopótamo
		itens = new ItemOrcamento[]{racao, vacinaG, vacinaW, veterinario};
		animais.add(new Hipopotamo("Glória", new ItemOrcamentoComplexo("Gastos", 0, itens)));

		//Criando uma zebra
		itens = new ItemOrcamento[]{racao, vacinaG, vacinaW, veterinario, tosa};
		animais.add(new Zebra("Marty", new ItemOrcamentoComplexo("Gastos", 0, itens)));

		//Criando quatro pinguins
		itens = new ItemOrcamento[]{racao, vacinaW, veterinario};
		animais.add(new Pinguim("Capitão", new ItemOrcamentoComplexo("Gastos", 0, itens)));
		animais.add(new Pinguim("Kowalski", new ItemOrcamentoComplexo("Gastos", 0, itens)));
		animais.add(new Pinguim("Rico", new ItemOrcamentoComplexo("Gastos", 0, itens)));
		animais.add(new Pinguim("Recruta", new ItemOrcamentoComplexo("Gastos", 0, itens)));

		//Criando três lêmures
		itens = new ItemOrcamento[]{racao, vacinaG, veterinario, banho, tosa};
		animais.add(new Lemure("Rei Julian", new ItemOrcamentoComplexo("Gastos", 0, itens)));
		animais.add(new Lemure("Maurice", new ItemOrcamentoComplexo("Gastos", 0, itens)));
		animais.add(new Lemure("Mork", new ItemOrcamentoComplexo("Gastos", 0, itens)));

		//Criando os chimpanzés
		itens = new ItemOrcamento[]{racao, vacinaW, veterinario, banho, tosa, vacinaG};
		animais.add(new Chimpanze("Mason", new ItemOrcamentoComplexo("Gastos", 0, itens)));
		animais.add(new Chimpanze("Phil", new ItemOrcamentoComplexo("Gastos", 0, itens)));

		//Imprimindo os animais
		System.out.println("Todos os animais");
		for (AnimalOrcamento animal : animais)
		{
			System.out.println("Nome da espécie: " + animal.getNomeEspecie());
			System.out.println("Nome do animal: " + animal.getNomeAnimal());

			System.out.println("Orçamento:");
			for (ItemOrcamento item : animal.orcamentoGastosAnimal().subItemOrcamento)
			{
				System.out.println("Histórico: " + item.getHistorico());
				System.out.println("Valor: $" + item.getValor());
			}
			System.out.println("Orçamento Total: $" + animal.orcamentoGastosAnimal().getValor());
		}
		System.out.println();

		//Filtrando o orçamento dos animais
		AnimalOrcamento[] animaisQueTomaraoVacinaW = FiltrarOrcamentoAnimais.filtrarOrcamentoAnimais(animais.toArray(new AnimalOrcamento[0]), "vacina W");

		//Imprimindo os animais que tem que tomar a vacina w
		System.out.println("Animais que tomarão a vacina W");
		for (AnimalOrcamento animal : animaisQueTomaraoVacinaW)
		{
			System.out.println("Nome da espécie: " + animal.getNomeEspecie());
			System.out.println("Nome do animal: " + animal.getNomeAnimal());

			System.out.println("Orçamento:");
			for (ItemOrcamento item : animal.orcamentoGastosAnimal().subItemOrcamento)
			{
				System.out.println("Histórico: " + item.getHistorico());
				System.out.println("Valor: $" + item.getValor());
			}
			System.out.println("Orçamento Total: $" + animal.orcamentoGastosAnimal().getValor());
		}
		System.out.println();


	}

}
