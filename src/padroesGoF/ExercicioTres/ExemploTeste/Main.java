package padroesGoF.ExercicioTres.ExemploTeste;

import padroesGoF.ExercicioTres.ObjetoGeometrico;
import padroesGoF.ExercicioTres.Visual;

import java.util.HashMap;
import java.util.concurrent.TimeUnit;

/**
 * Classe principal.
 */
public class Main {

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
        //Linha
        HashMap<String, Integer> dadosLinha = new HashMap<>();
        dadosLinha.put("x1", -300);
        dadosLinha.put("y1", -300);
        dadosLinha.put("y2", 300);
        ObjetoGeometrico.DadosObjetoGeometrico linha = new ObjetoGeometrico.DadosObjetoGeometrico();
        linha.formaGeometrica = ObjetoGeometrico.FormasGeometricas.linha;
        linha.dadosFormaGeometrica = dadosLinha;

        HashMap<String, Integer> dadosRetangulo = new HashMap<>();
        dadosRetangulo.put("x", 0);
        dadosRetangulo.put("y", 0);
        dadosRetangulo.put("altura", 600);
        dadosRetangulo.put("largura", 600);
        ObjetoGeometrico.DadosObjetoGeometrico retangulo = new ObjetoGeometrico.DadosObjetoGeometrico();
        retangulo.formaGeometrica = ObjetoGeometrico.FormasGeometricas.retangulo;
        retangulo.dadosFormaGeometrica = dadosRetangulo;

        HashMap<String, Integer> dadosCirculo = new HashMap<>();
        dadosCirculo.put("x", 0);
        dadosCirculo.put("y", 0);
        dadosCirculo.put("raio", 350);
        ObjetoGeometrico.DadosObjetoGeometrico circulo = new ObjetoGeometrico.DadosObjetoGeometrico();
        circulo.formaGeometrica = ObjetoGeometrico.FormasGeometricas.circulo;
        circulo.dadosFormaGeometrica = dadosCirculo;

        ObjetoGeometrico varios = new ObjetoGeometrico(linha, retangulo, circulo);
        varios.desenhar();
        TimeUnit.SECONDS.sleep(5);
    }

    /**
     * Desenha em uma janela uma linha.
     *
     * @throws InterruptedException Exceção do método TimeUnit.SECONDS.sleep.
     */
    private static void desenharLinha() throws InterruptedException {
        System.out.println("Desenhando a Linha");
        Visual.drawLine(-300, -300, 300);
        TimeUnit.SECONDS.sleep(5);
    }

    /**
     * Desenha em uma janela um círculo.
     *
     * @throws InterruptedException Exceção do método TimeUnit.SECONDS.sleep.
     */
    private static void desenharCirculo() throws InterruptedException {
        System.out.println("Desenhando o Círculo");
        Visual.drawCircle(0, 0, 350);
        TimeUnit.SECONDS.sleep(5);
    }

    /**
     * Desenha um uma janela um retângulo.
     *
     * @throws InterruptedException Exceção do método TimeUnit.SECONDS.sleep.
     */
    private static void desenharRetangulo() throws InterruptedException {
        System.out.println("Desenhando o Retângulo");
        Visual.drawRectangle(0, 0, 600, 600);
        TimeUnit.SECONDS.sleep(5);
    }

}
