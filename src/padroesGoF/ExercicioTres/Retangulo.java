package padroesGoF.ExercicioTres;

import javax.swing.*;
import java.awt.*;

/**
 * Representa um objeto geométrico simples do tipo Retângulo.
 */
public class Retangulo implements Objeto {
    final int x, y, altura, largura;

    /**
     * Cria uma nova instância da classe Retângulo.
     *
     * @param x       Coordenada no eixo x do retângulo.
     * @param y       Coordenada no eixo x do retângulo.
     * @param altura  Altura do retângulo.
     * @param largura Largura do retângulo.
     */
    public Retangulo(int x, int y, int altura, int largura) {
        this.x = x;
        this.y = y;
        this.altura = altura;
        this.largura = largura;
    }

    /**
     * Desenha, utilizando interface gráfica um retângulo.
     */
    @Override
    public void desenhar() {
        JFrame jFrame = new JFrame("Retângulo");
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setSize(800, 800);
        jFrame.setVisible(true);

        desenhar(jFrame);
    }

    /**
     * Desenha, utilizando interface gráfica um retângulo.
     *
     * @param jFrame Referência para o JFrame onde será desenhado o retângulo.
     */
    @Override
    public void desenhar(JFrame jFrame) {
        int centroX = jFrame.getSize().width / 2;
        int centroY = jFrame.getSize().height / 2;
        int x = centroX + this.x - largura / 2;
        int y = centroY + this.y - altura / 2;
        Desenho desenho = new Desenho(jFrame, x, y, largura, altura);
        jFrame.add(desenho);
    }

    /**
     * Desenha, utilizando interface gráfica um retângulo.
     *
     * @param jFrame Referência para o JFrame onde será desenhado o retângulo.
     * @param g      Referência para o Graphics onde será desenhado o retângulo.
     */
    @Override
    public void desenhar(JFrame jFrame, Graphics g) {

        int centroX = jFrame.getSize().width / 2;
        int centroY = jFrame.getSize().height / 2;
        int x = centroX + this.x - largura / 2;
        int y = centroY + this.y - altura / 2;
        Desenho desenho = new Desenho(jFrame, x, y, largura, altura);
        desenho.paintComponent(g);
    }

    /**
     * Subclasse de JPanel modificada para poder desenhar o retângulo.
     */
    private class Desenho extends JPanel {
        final JFrame jFrame;
        final int x, y, largura, altura;

        /**
         * Cria uma nova instância da classe Desenho.
         *
         * @param jFrame  Referência para o JFrame onde será desenhado o retângulo.
         * @param x       Coordenada no eixo x do retângulo.
         * @param y       Coordenada no eixo y do retângulo.
         * @param largura Largura do retângulo.
         * @param altura  Altura do retângulo.
         */
        public Desenho(JFrame jFrame, int x, int y, int largura, int altura) {
            this.jFrame = jFrame;
            this.x = x;
            this.y = y;
            this.largura = largura;
            this.altura = altura;
        }

        /**
         * Desenha o retângulo, quando uma instância desta classe é passada por parâmetro para o método add da classe JFrame.
         *
         * @param g Referência para uma instância da classe Graphics.
         */
        public void paintComponent(Graphics g) {
            g.drawRect(x, y, largura, altura);
        }
    }
}
