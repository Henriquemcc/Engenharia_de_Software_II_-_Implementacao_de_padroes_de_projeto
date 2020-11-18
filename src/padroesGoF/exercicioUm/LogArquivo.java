package padroesGoF.exercicioUm;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;

/**
 * Implementa a interface Log, escrevendo os logs em um arquivo.
 */
public class LogArquivo implements Log {
    private final PrintStream printStream;

    /**
     * Cria uma instância da classe LogArquivo.
     *
     * @throws IOException Exceções relacionadas a File e PrintStream.
     */
    public LogArquivo() throws IOException {
        File file = new File("log.txt");
        if (!file.exists())
            if (!file.createNewFile())
                System.out.println("Não foi possível criar o arquivo.");

        this.printStream = new PrintStream(file);
    }

    /**
     * Imprime um valor booleano.
     *
     * @param x Valor booleano que será impresso.
     */
    @Override
    public void print(boolean x) {
        this.printStream.print(x);
    }

    /**
     * Imprime um caractere.
     *
     * @param x Caractere que será impresso.
     */
    @Override
    public void print(char x) {
        this.printStream.print(x);
    }

    /**
     * Imprime um número inteiro de 32 bits.
     *
     * @param x Número inteiro de 32 bits que será impresso.
     */
    @Override
    public void print(int x) {
        this.printStream.print(x);
    }

    /**
     * Imprime um número inteiro de 64 bits.
     *
     * @param x Número inteiro de 64 bits que será impresso.
     */
    @Override
    public void print(long x) {
        this.printStream.print(x);
    }

    /**
     * Imprime um número real de 32 bits.
     *
     * @param x Número real de 32 bits que será impresso.
     */
    @Override
    public void print(float x) {
        this.printStream.print(x);
    }

    /**
     * Imprime um número real de 64 bits.
     *
     * @param x Número real de 64 bits que será impresso.
     */
    @Override
    public void print(double x) {
        this.printStream.print(x);
    }

    /**
     * Imprime um arranjo de caracteres.
     *
     * @param x Arranjo de caracteres que será impresso.
     */
    @Override
    public void print(char[] x) {
        this.printStream.print(x);
    }

    /**
     * Imprime uma String.
     *
     * @param x String que será impressa.
     */
    @Override
    public void print(String x) {
        this.printStream.print(x);
    }

    /**
     * Imprime um objeto.
     *
     * @param x Objeto que será impresso.
     */
    @Override
    public void print(Object x) {
        this.printStream.print(x);
    }

    /**
     * Imprime uma quebra de linha.
     */
    @Override
    public void println() {
        this.printStream.println();
    }

    /**
     * Imprime um valor booleano e uma quebra de linha.
     *
     * @param x Valor booleano que será impresso.
     */
    @Override
    public void println(boolean x) {
        this.printStream.println(x);
    }

    /**
     * Imprime um caractere e uma quebra de linha.
     *
     * @param x Caractere que será impresso.
     */
    @Override
    public void println(char x) {
        this.printStream.println(x);
    }

    /**
     * Imprime um número inteiro de 32 bits e uma quebra de linha.
     *
     * @param x Número inteiro de 32 bits que será impresso.
     */
    @Override
    public void println(int x) {
        this.printStream.println(x);
    }

    /**
     * Imprime um número inteiro de 64 bits e uma quebra de linha.
     *
     * @param x Número inteiro de 64 bits que será impresso.
     */
    @Override
    public void println(long x) {
        this.printStream.println(x);
    }

    /**
     * Imprime um número real de 32 bits e uma quebra de linha.
     *
     * @param x Número real de 32 bits que será impresso.
     */
    @Override
    public void println(float x) {
        this.printStream.println(x);
    }

    /**
     * Imprime um número real de 64 bits e uma quebra de linha.
     *
     * @param x Número real de 64 bits que será impresso.
     */
    @Override
    public void println(double x) {
        this.printStream.println(x);
    }

    /**
     * Imprime um arranjo de caracteres e uma quebra de linha.
     *
     * @param x Arranjo de caracteres que será impresso.
     */
    @Override
    public void println(char[] x) {
        this.printStream.println(x);
    }

    /**
     * Imprime uma String e uma quebra de linha.
     *
     * @param x String que será impressa.
     */
    @Override
    public void println(String x) {
        this.printStream.println(x);
    }

    /**
     * Imprime um objeto e uma quebra de linha.
     *
     * @param x Objeto que será impresso.
     */
    @Override
    public void println(Object x) {
        this.printStream.println(x);
    }
}