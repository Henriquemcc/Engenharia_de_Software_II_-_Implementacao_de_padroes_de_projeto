package padroesGoF.ExercicioUm;

/**
 * Implementa a interface Log, escrevendo os logs no console.
 */
public class LogConsole implements Log {

    /**
     * Imprime um valor booleano.
     *
     * @param x Valor booleano que será impresso.
     */
    @Override
    public void print(boolean x) {
        System.out.print(x);
    }

    /**
     * Imprime um caractere.
     *
     * @param x Caractere que será impresso.
     */
    @Override
    public void print(char x) {
        System.out.print(x);
    }

    /**
     * Imprime um número inteiro de 32 bits.
     *
     * @param x Número inteiro de 32 bits que será impresso.
     */
    @Override
    public void print(int x) {
        System.out.print(x);
    }

    /**
     * Imprime um número inteiro de 64 bits.
     *
     * @param x Número inteiro de 64 bits que será impresso.
     */
    @Override
    public void print(long x) {
        System.out.print(x);
    }

    /**
     * Imprime um número real de 32 bits.
     *
     * @param x Número real de 32 bits que será impresso.
     */
    @Override
    public void print(float x) {
        System.out.print(x);
    }

    /**
     * Imprime um número real de 64 bits.
     *
     * @param x Número real de 64 bits que será impresso.
     */
    @Override
    public void print(double x) {
        System.out.print(x);
    }

    /**
     * Imprime um arranjo de caracteres.
     *
     * @param x Arranjo de caracteres que será impresso.
     */
    @Override
    public void print(char[] x) {
        System.out.print(x);
    }

    /**
     * Imprime uma String.
     *
     * @param x String que será impressa.
     */
    @Override
    public void print(String x) {
        System.out.print(x);
    }

    /**
     * Imprime um objeto.
     *
     * @param x Objeto que será impresso.
     */
    @Override
    public void print(Object x) {
        System.out.print(x);
    }

    /**
     * Imprime uma quebra de linha.
     */
    @Override
    public void println() {
        System.out.println();
    }

    /**
     * Imprime um valor booleano e uma quebra de linha.
     *
     * @param x Valor booleano que será impresso.
     */
    @Override
    public void println(boolean x) {
        System.out.println(x);
    }

    /**
     * Imprime um caractere e uma quebra de linha.
     *
     * @param x Caractere que será impresso.
     */
    @Override
    public void println(char x) {
        System.out.println(x);
    }

    /**
     * Imprime um número inteiro de 32 bits e uma quebra de linha.
     *
     * @param x Número inteiro de 32 bits que será impresso.
     */
    @Override
    public void println(int x) {
        System.out.println(x);
    }

    /**
     * Imprime um número inteiro de 64 bits e uma quebra de linha.
     *
     * @param x Número inteiro de 64 bits que será impresso.
     */
    @Override
    public void println(long x) {
        System.out.println(x);
    }

    /**
     * Imprime um número real de 32 bits e uma quebra de linha.
     *
     * @param x Número real de 32 bits que será impresso.
     */
    @Override
    public void println(float x) {
        System.out.println(x);
    }

    /**
     * Imprime um número real de 64 bits e uma quebra de linha.
     *
     * @param x Número real de 64 bits que será impresso.
     */
    @Override
    public void println(double x) {
        System.out.println(x);
    }

    /**
     * Imprime um arranjo de caracteres e uma quebra de linha.
     *
     * @param x Arranjo de caracteres que será impresso.
     */
    @Override
    public void println(char[] x) {
        System.out.println(x);
    }

    /**
     * Imprime uma String e uma quebra de linha.
     *
     * @param x String que será impressa.
     */
    @Override
    public void println(String x) {
        System.out.println(x);
    }

    /**
     * Imprime um objeto e uma quebra de linha.
     *
     * @param x Objeto que será impresso.
     */
    @Override
    public void println(Object x) {
        System.out.println(x);
    }
}