package padroesGrasp.a.questaoDois.exemploTeste;

import padroesGrasp.a.questaoDois.ItemOrcamento;
import padroesGrasp.a.questaoDois.ItemOrcamentoComplexo;

import java.util.ArrayList;

/**
 * Classe principal.
 */
public class Main {

    /**
     * Método principal.
     *
     * @param args Argumentos do método (inútil).
     */
    public static void main(String[] args) {

        //Criando os subitens do orçamento
        ArrayList<ItemOrcamento> itensOrcamento = new ArrayList<>();
        itensOrcamento.add(new ItemOrcamento("Alimentação", 1000));
        itensOrcamento.add(new ItemOrcamento("Educação", 5000));
        itensOrcamento.add(new ItemOrcamento("Saúde", 2000));
        itensOrcamento.add(new ItemOrcamento("Lazer", 2000));

        //Criando o item complexo do orçamento para armazenar os subitens.
        ItemOrcamentoComplexo itemOrcamentoComplexo = new ItemOrcamentoComplexo("Orçamento", 0, itensOrcamento.toArray(new ItemOrcamento[0]));

        //Obtendo um subitem e imprimindo seus valores
        ItemOrcamento educacao = itemOrcamentoComplexo.encontraItem("Educação");
        System.out.println("Histórico: " + educacao.getHistorico());
        System.out.println("Valor: " + educacao.getValor());
        System.out.println();

        //Imprimindo o valor do item complexo
        System.out.println("Histórico: " + itemOrcamentoComplexo.getHistorico());
        System.out.println("Valor: " + itemOrcamentoComplexo.getValor());
        System.out.println();

    }

}
