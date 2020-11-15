package padroesGoF.ExercicioTres;

import javax.swing.*;
import java.awt.*;
import java.util.Map;

public class ObjetoGeomatrico {

    private FormasGeometricas formaGeometrica;
    private Map<String, Integer> dadosFormaGeometrica;

    public static enum FormasGeometricas
    {
        linha,
        retangulo,
        circulo
    }

    public ObjetoGeomatrico(FormasGeometricas formaGeometrica, Map<String, Integer> dadosFormaGeometrica) {
        this.formaGeometrica = formaGeometrica;
        this.dadosFormaGeometrica = dadosFormaGeometrica;
    }

    public void desenhar() {

        //Criando o JFrame
        JFrame application = new JFrame();
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        application.setSize(800, 800);
        //application.setExtendedState(application.getExtendedState()|JFrame.MAXIMIZED_BOTH);
        application.setVisible(true);
        Dimension tamanhoTela = application.getSize();
        int centroX = tamanhoTela.width / 2;
        int centroY = tamanhoTela.height / 2;

        //Criando o JPanel de acordo com o objeto a ser desenhado
        JPanel panel = null;
        if (formaGeometrica == FormasGeometricas.linha) {
            int x1 = centroX + dadosFormaGeometrica.get("x1");
            int x2 = centroX + 0;
            int y1 = centroY + dadosFormaGeometrica.get("y1");
            int y2 = centroY + dadosFormaGeometrica.get("y2");
            panel = new DesenharLinha(x1, y1, x2, y2);
        }
        else if (formaGeometrica == FormasGeometricas.circulo) {
            int largura = dadosFormaGeometrica.get("raio") * 2;
            int altura = dadosFormaGeometrica.get("raio") * 2;
            int x = centroX + dadosFormaGeometrica.get("x") - largura/2;
            int y = centroY + dadosFormaGeometrica.get("y") - altura/2;
            panel = new DesenharCirculo(x, y, largura, altura);
        }
        else if (formaGeometrica == FormasGeometricas.retangulo) {
            int x = centroX + dadosFormaGeometrica.get("x");
            int y = centroY + dadosFormaGeometrica.get("y");
            int altura = dadosFormaGeometrica.get("altura");
            int largura = dadosFormaGeometrica.get("largura");
            panel = new DesenharRetangulo(x, y, largura, altura);
        }

        application.add(panel);
    }

    private class DesenharCirculo extends JPanel {

        private final int x;
        private final int y;
        private final int largura;
        private final int altura;

        public DesenharCirculo(int x, int y, int largura, int altura) {
            this.x = x;
            this.y = y;
            this.largura = largura;
            this.altura = altura;
        }

        public void paintComponent(Graphics g) {
            g.drawOval(x, y, largura, altura);
        }

    }

    private class DesenharLinha extends JPanel {

        private final int x1;
        private final int y1;
        private final int x2;
        private final int y2;

        public DesenharLinha(int x1, int y1, int x2, int y2) {
            this.x1 = x1;
            this.y1 = y1;
            this.x2 = x2;
            this.y2 = y2;
        }

        public void paintComponent(Graphics g) {
            g.drawLine(x1, y1, x2, y2);
        }

    }

    private class DesenharRetangulo extends JPanel {
        private final int x;
        private final int y;
        private final int altura;
        private final int largura;

        public DesenharRetangulo(int x, int y, int altura, int largura) {
            this.x = x;
            this.y = y;
            this.altura = altura;
            this.largura = largura;
        }

        public void paintComponent(Graphics g) {
            g.drawRect(x, y, largura, altura);
        }

    }





}
