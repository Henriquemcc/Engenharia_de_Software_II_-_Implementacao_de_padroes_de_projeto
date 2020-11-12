package padroesGrasp.A.QuestaoUm;

import padroesGrasp.A.Animal;
import padroesGrasp.A.Ferramentas;

import java.util.ArrayList;

public class ContarAnimais {

    /**
     * O método deve contabilizar o número de animais disponíveis em cada uma das espécies e retornar os resultados como um vetor de objetos da classe Resultado (apresentada abaixo). Cada objeto conterá uma espécie e o número de animais da mesma contabilizados. Devem ser consideradas apenas as espécies cujos animais estão presentes no vetor.
     *
     * @param A           um vetor A de objetos que implementam a interface Animal representando diversos animais.
     * @param ferramentas um objeto que implementa a interface Ferramentas.
     * @return
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
