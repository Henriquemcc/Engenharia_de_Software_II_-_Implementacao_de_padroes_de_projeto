package padroesGoF.exercicioUm;

interface Log {

    /**
     * Imprime um valor booleano.
     *
     * @param x Valor booleano que será impresso.
     */
    void print(boolean x);

    /**
     * Imprime um caractere.
     *
     * @param x Caractere que será impresso.
     */
    void print(char x);

    /**
     * Imprime um número inteiro de 32 bits.
     *
     * @param x Número inteiro de 32 bits que será impresso.
     */
    void print(int x);

    /**
     * Imprime um número inteiro de 64 bits.
     *
     * @param x Número inteiro de 64 bits que será impresso.
     */
    void print(long x);

    /**
     * Imprime um número real de 32 bits.
     *
     * @param x Número real de 32 bits que será impresso.
     */
    void print(float x);

    /**
     * Imprime um número real de 64 bits.
     *
     * @param x Número real de 64 bits que será impresso.
     */
    void print(double x);

    /**
     * Imprime um arranjo de caracteres.
     *
     * @param x Arranjo de caracteres que será impresso.
     */
    void print(char[] x);

    /**
     * Imprime uma String.
     *
     * @param x String que será impressa.
     */
    void print(String x);

    /**
     * Imprime um objeto.
     *
     * @param x Objeto que será impresso.
     */
    void print(Object x);

    /**
     * Imprime uma quebra de linha.
     */
    void println();

    /**
     * Imprime um valor booleano e uma quebra de linha.
     *
     * @param x Valor booleano que será impresso.
     */
    void println(boolean x);

    /**
     * Imprime um caractere e uma quebra de linha.
     *
     * @param x Caractere que será impresso.
     */
    void println(char x);

    /**
     * Imprime um número inteiro de 32 bits e uma quebra de linha.
     *
     * @param x Número inteiro de 32 bits que será impresso.
     */
    void println(int x);

    /**
     * Imprime um número inteiro de 64 bits e uma quebra de linha.
     *
     * @param x Número inteiro de 64 bits que será impresso.
     */
    void println(long x);

    /**
     * Imprime um número real de 32 bits e uma quebra de linha.
     *
     * @param x Número real de 32 bits que será impresso.
     */
    void println(float x);

    /**
     * Imprime um número real de 64 bits e uma quebra de linha.
     *
     * @param x Número real de 64 bits que será impresso.
     */
    void println(double x);

    /**
     * Imprime um arranjo de caracteres e uma quebra de linha.
     *
     * @param x Arranjo de caracteres que será impresso.
     */
    void println(char[] x);

    /**
     * Imprime uma String e uma quebra de linha.
     *
     * @param x String que será impressa.
     */
    void println(String x);

    /**
     * Imprime um objeto e uma quebra de linha.
     *
     * @param x Objeto que será impresso.
     */
    void println(Object x);
}
