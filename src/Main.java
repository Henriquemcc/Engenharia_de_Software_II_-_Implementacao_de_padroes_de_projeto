import java.io.IOException;

/**
 * Classe principal dos exercícios de Engenharia de Software II.
 */
public class Main {

    /**
     * Função principal.
     *
     * @param args Argumentos da função (inútil).
     * @throws IOException Exceção das classes File e PrintStream.
     */
    public static void main(String[] args) throws IOException {

        System.out.println("Aluno: Henrique Mendonça Castelar Campos");
        System.out.println("Curso: Ciência da Computação");
        System.out.println("Matéria: Engenharia de Software II");
        System.out.println();
        System.out.println("7º Exercício avaliativo - implementação de padrões");
        System.out.println("--------------------------------------------------");
        System.out.println();
        padroesGoF.Main.main(args);
        System.out.println();
        padroesGrasp.Main.main(args);
        System.out.println();
    }
}
