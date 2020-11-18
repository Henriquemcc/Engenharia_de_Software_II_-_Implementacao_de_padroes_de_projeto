package padroesGoF.ExercicioTres;

import javax.swing.*;
import java.awt.*;

/**
 * Representa um objeto geométrico simples do tipo Linha.
 */
public class Linha implements Objeto {
    final int x1, y1, y2;

    /**
     * Cria uma nova instância da classe Linha.
     *
     * @param x1 Coordenada no eixo x do ponto 1.
     * @param y1 Coordenada no eixo y do ponto 1.
     * @param y2 Coordenada no eixo y do ponto 2.
     */
    public Linha(int x1, int y1, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.y2 = y2;
    }

    /**
     * Desenha, utilizando interface gráfica uma linha.
     */
    @Override
    public void desenhar() {
        JFrame jFrame = new JFrame("Linha");
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setSize(800, 800);
        jFrame.setVisible(true);

        desenhar(jFrame);
    }

    /**
     * Desenha, utilizando interface gráfica uma linha.
     *
     * @param jFrame Referência para o JFrame onde será desenhado a linha.
     */
    @Override
    public void desenhar(JFrame jFrame) {
        int centroX = jFrame.getSize().width / 2;
        int centroY = jFrame.getSize().height / 2;
        int x1 = centroX + this.x1;
        int y1 = centroY + this.y1;
        int y2 = centroY + this.y2;
        @SuppressWarnings("UnnecessaryLocalVariable") int x2 = y2;
        Desenho desenho = new Desenho(jFrame, x1, y1, x2, y2);
        jFrame.add(desenho);
    }

    /**
     * Desenha, utilizando interface gráfica uma linha.
     *
     * @param jFrame Referência para o JFrame onde será desenhado a linha.
     * @param g      Referência para o Graphics onde será desenhado a linha.
     */
    @Override
    public void desenhar(JFrame jFrame, Graphics g) {
        int centroX = jFrame.getSize().width / 2;
        int centroY = jFrame.getSize().height / 2;
        int x1 = centroX + this.x1;
        int y1 = centroY + this.y1;
        int y2 = centroY + this.y2;
        @SuppressWarnings("UnnecessaryLocalVariable") int x2 = y2;
        Desenho desenho = new Desenho(jFrame, x1, y1, x2, y2);
        desenho.paintComponent(g);
    }

    /**
     * Subclasse de JPanel modificada para poder desenhar a linha.
     */
    private class Desenho extends JPanel {
        final JFrame jFrame;
        final int x1, y1, x2, y2;

        /**
         * Cria uma nova instância da classe Desenho.
         *
         * @param jFrame Referência para o JFrame onde será desenhado a linha.
         * @param x1     Coordenada no eixo x do ponto 1.
         * @param y1     Coordenada no eixo y do ponto 1.
         * @param x2     Coordenada no eixo x do ponto 2.
         * @param y2     Coordenada no eixo y do ponto 2.
         */
        public Desenho(JFrame jFrame, int x1, int y1, int x2, int y2) {
            this.jFrame = jFrame;
            this.x1 = x1;
            this.x2 = x2;
            this.y1 = y1;
            this.y2 = y2;
        }

        /**
         * Desenha a linha, quando uma instância desta classe é passada por parâmetro para o método add da classe JFrame.
         *
         * @param g Referência para uma instância da classe Graphics.
         */
        public void paintComponent(Graphics g) {
            g.drawLine(x1, y1, x2, y2);
        }
    }
}
