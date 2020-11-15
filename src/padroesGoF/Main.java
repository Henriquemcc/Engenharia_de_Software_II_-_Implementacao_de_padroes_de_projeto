package padroesGoF;

import java.io.IOException;

/**
 * Classe principal do pacote padroesGoF.
 */
public class Main {
    /**
     * Função principal.
     *
     * @param args Argumentos do método (inútil).
     * @throws IOException Exceção das classes File e PrintStream.
     */
    public static void main(String[] args) throws IOException, InterruptedException {
        System.out.println("Padrões GoF:");
        System.out.println("------------");
        System.out.println();
        System.out.println("Exercício 1:");
        padroesGoF.ExercicioUm.Main.main(args);
        System.out.println();

        System.out.println("Exercício 3:");
        padroesGoF.ExercicioTres.ExemploTeste.Main.main(args);
        System.out.println();

    }
}
