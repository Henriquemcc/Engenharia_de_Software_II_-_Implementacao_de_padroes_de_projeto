package padroesGoF.ExercicioUm;

import java.io.IOException;

/**
 * Classe principal do pacote ex1, que contém o código fonte da resposta do exercício 1 da lista de exercícios sobre os padrões GoF.
 */
public class Main {

    /**
     * Função principal
     *
     * @param args Argumentos da função (inútil).
     * @throws IOException Exceção das classes File e PrintStream.
     */
    public static void main(String[] args) throws IOException {

        FabricaDeFerramentaLog fabricaDeFerramentaLog = new FabricaDeFerramentaLog();

        System.out.println("Log no Console:");
        Log log = fabricaDeFerramentaLog.getLog("console");
        for (short i = 0; i <= 10; i++) {
            log.println(i);
        }

        System.out.println("Log no Arquivo:");
        log = fabricaDeFerramentaLog.getLog("arquivo");
        for (short i = 0; i <= 10; i++) {
            log.println(i);
        }
    }
}
