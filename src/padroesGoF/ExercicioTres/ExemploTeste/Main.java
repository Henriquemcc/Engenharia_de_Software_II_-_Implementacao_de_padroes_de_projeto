package padroesGoF.ExercicioTres.ExemploTeste;

import padroesGoF.ExercicioTres.*;

import java.util.concurrent.TimeUnit;

/**
 * Classe principal.
 */
public class Main {

    private static final int timeOut = 5;

    /**
     * Função principal.
     *
     * @param args Argumentos do método (inútil).
     * @throws InterruptedException Exceção do método TimeUnit.SECONDS.sleep.
     */
    public static void main(String[] args) throws InterruptedException {

        desenharRetangulo();

        desenharCirculo();

        desenharLinha();

        desenharLinhaRetanguloCirculo();
    }

    /**
     * Desenha em uma mesma janela uma linha, um retângulo e um círculo.
     *
     * @throws InterruptedException Exceção do método TimeUnit.SECONDS.sleep.
     */
    private static void desenharLinhaRetanguloCirculo() throws InterruptedException {
        System.out.println("Desenhando Retângulo, Círculo e Linha na mesma janela");

        Retangulo retangulo = new Retangulo(0, 0, 600, 600);
        Circulo circulo = new Circulo(0, 0, 350);
        Linha linha = new Linha(-350, -350, 350);

        ObjetoComposto objetoComposto = new ObjetoComposto(new Objeto[]{retangulo, circulo, linha});
        objetoComposto.desenhar();
        TimeUnit.SECONDS.sleep(timeOut);
    }

    /**
     * Desenha em uma janela uma linha.
     *
     * @throws InterruptedException Exceção do método TimeUnit.SECONDS.sleep.
     */
    private static void desenharLinha() throws InterruptedException {
        System.out.println("Desenhando a Linha");
        Visual.drawLine(-300, -300, 300);
        TimeUnit.SECONDS.sleep(timeOut);
    }

    /**
     * Desenha em uma janela um círculo.
     *
     * @throws InterruptedException Exceção do método TimeUnit.SECONDS.sleep.
     */
    private static void desenharCirculo() throws InterruptedException {
        System.out.println("Desenhando o Círculo");
        Visual.drawCircle(0, 0, 350);
        TimeUnit.SECONDS.sleep(timeOut);
    }

    /**
     * Desenha um uma janela um retângulo.
     *
     * @throws InterruptedException Exceção do método TimeUnit.SECONDS.sleep.
     */
    private static void desenharRetangulo() throws InterruptedException {
        System.out.println("Desenhando o Retângulo");
        Visual.drawRectangle(0, 0, 600, 600);
        TimeUnit.SECONDS.sleep(timeOut);
    }

}
