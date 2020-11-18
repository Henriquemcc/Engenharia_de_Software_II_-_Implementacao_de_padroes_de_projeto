package padroesGoF.ExercicioTres;

import javax.swing.*;
import java.awt.*;

/**
 * Representa um Objeto Geométrico simples do tipo Circulo.
 */
public class Circulo implements Objeto {
    final int x, y, raio;

    /**
     * Cria uma nova instância da classe Circulo.
     *
     * @param x    Posição do centro do círculo do eixo x.
     * @param y    Posição do centro do círculo do eixo y.
     * @param raio Raio do círculo.
     */
    public Circulo(int x, int y, int raio) {
        this.x = x;
        this.y = y;
        this.raio = raio;
    }

    /**
     * Desenha, utilizando interface gráfica um círculo.
     */
    @Override
    public void desenhar() {
        JFrame jFrame = new JFrame("Círculo");
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setSize(800, 800);
        jFrame.setVisible(true);

        desenhar(jFrame);
    }

    /**
     * Desenha, utilizando interface gráfica um círculo.
     *
     * @param jFrame Referência para o JFrame onde será desenhado o círculo.
     */
    @Override
    public void desenhar(JFrame jFrame) {
        int centroX = jFrame.getSize().width / 2;
        int centroY = jFrame.getSize().height / 2;
        int largura = raio * 2;
        int altura = raio * 2;
        int x = centroX + this.x - largura / 2;
        int y = centroY + this.y - altura / 2;

        Desenho desenho = new Desenho(jFrame, x, y, largura, altura);
        jFrame.add(desenho);
    }

    /**
     * Desenha, utilizando interface gráfica um círculo.
     *
     * @param jFrame Referência para o JFrame onde será desenhado o círculo.
     * @param g      Referência para o Graphics onde será desenhado o círculo.
     */
    @Override
    public void desenhar(JFrame jFrame, Graphics g) {
        int centroX = jFrame.getSize().width / 2;
        int centroY = jFrame.getSize().height / 2;
        int largura = raio * 2;
        int altura = raio * 2;
        int x = centroX + this.x - largura / 2;
        int y = centroY + this.y - altura / 2;

        Desenho desenho = new Desenho(jFrame, x, y, largura, altura);
        desenho.paintComponent(g);
    }

    /**
     * Subclasse de JPanel modificada para poder desenhar o círculo.
     */
    private class Desenho extends JPanel {
        final JFrame jFrame;
        final int x, y, largura, altura;

        /**
         * Cria uma nova instância da classe Desenho.
         *
         * @param jFrame  Referência para o JFrame onde será desenhado o círculo.
         * @param x       Coordenada x do canto superior esquerdo do círculo.
         * @param y       Coordenada y do canto superior esquerdo do círculo.
         * @param largura Largura do círculo.
         * @param altura  Altura do círculo.
         */
        public Desenho(JFrame jFrame, int x, int y, int largura, int altura) {
            this.jFrame = jFrame;
            this.x = x;
            this.y = y;
            this.altura = altura;
            this.largura = largura;
        }

        /**
         * Desenha o cículo, quando uma instância desta classe é passada por parâmetro para o método add da classe JFrame.
         *
         * @param g Referência para uma instância da classe Graphics.
         */
        public void paintComponent(Graphics g) {
            g.drawOval(x, y, largura, altura);
        }
    }
}
