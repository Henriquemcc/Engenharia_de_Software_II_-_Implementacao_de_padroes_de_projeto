package padroesGrasp.A.QuestaoUm;

import padroesGrasp.A.Animal;
import padroesGrasp.A.Ferramentas;

import java.util.ArrayList;

/**
 * Contém o método contarAnimais
 */
public class ContarAnimais {

    /**
     * Conta a quantidade de animais de cada espécie.
     *
     * @param A           Vetor de animais a serem contados.
     * @param ferramentas Instância da classe Ferramentas, que contém os métodos filtraEspecie e classificaEspecies.
     * @return Vetor de instâncias da classe Resultado, contendo o nome da espécie e a quantidade.
     */
    public static Resultado[] contarAnimais(Animal[] A, Ferramentas ferramentas) {
        //Obtendo os nomes das especies de animais
        String[] nomeEspecieAnimais = ferramentas.classificaEspecies(A);

        //Criando o arranjo de Resultado
        ArrayList<Resultado> resultados = new ArrayList<Resultado>();
        for (String nomeEspecie : nomeEspecieAnimais) {
            int quantidade = ferramentas.filtraEspecie(A, nomeEspecie).length;
            Resultado resultado = new Resultado(nomeEspecie, quantidade);
            resultados.add(resultado);
        }

        return resultados.toArray(new Resultado[0]);
    }

}
