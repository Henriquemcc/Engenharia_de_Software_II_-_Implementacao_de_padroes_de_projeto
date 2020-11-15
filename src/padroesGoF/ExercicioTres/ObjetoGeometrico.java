package padroesGoF.ExercicioTres;

import javax.swing.*;
import java.awt.*;
import java.util.Map;

public class ObjetoGeometrico {

    private final DadosObjetoGeometrico[] dadosObjetoGeometrico;

    public ObjetoGeometrico(DadosObjetoGeometrico... dadosObjetoGeometrico) {
        this.dadosObjetoGeometrico = dadosObjetoGeometrico;
    }

    public void desenhar() {

        //Criando o JFrame
        JFrame application = new JFrame();
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        application.setSize(800, 800);
        application.setVisible(true);

        DesenharObjeto desenharObjeto = new DesenharObjeto(this.dadosObjetoGeometrico, application.getSize());
        application.add(desenharObjeto);
    }

    public enum FormasGeometricas {
        linha,
        retangulo,
        circulo
    }

    public static class DadosObjetoGeometrico {
        public FormasGeometricas formaGeometrica;
        public Map<String, Integer> dadosFormaGeometrica;
    }

    private static class DesenharObjeto extends JPanel {

        private final DadosObjetoGeometrico[] dadosObjetoGeometrico;
        private final Dimension tamanhoTela;

        public DesenharObjeto(DadosObjetoGeometrico[] dadosObjetoGeometrico, Dimension tamanhoTela) {
            this.dadosObjetoGeometrico = dadosObjetoGeometrico;
            this.tamanhoTela = tamanhoTela;
        }

        public void paintComponent(Graphics g) {

            int centroX = this.tamanhoTela.width / 2;
            int centroY = this.tamanhoTela.height / 2;

            for (DadosObjetoGeometrico d : dadosObjetoGeometrico) {

                //Desenhando a linha
                if (d.formaGeometrica == FormasGeometricas.linha) {
                    int x1 = centroX + d.dadosFormaGeometrica.get("x1");
                    int y1 = centroY + d.dadosFormaGeometrica.get("y1");

                    int y2 = centroY + d.dadosFormaGeometrica.get("y2");
                    @SuppressWarnings("UnnecessaryLocalVariable") int x2 = y2;//centroX + 0;

                    g.drawLine(x1, y1, x2, y2);
                }

                //Desenhando o retângulo
                else if (d.formaGeometrica == FormasGeometricas.retangulo) {

                    int altura = d.dadosFormaGeometrica.get("altura");
                    int largura = d.dadosFormaGeometrica.get("largura");
                    int x = centroX + d.dadosFormaGeometrica.get("x") - largura / 2;
                    int y = centroY + d.dadosFormaGeometrica.get("y") - altura / 2;

                    g.drawRect(x, y, largura, altura);
                }

                //Desenhando o círculo
                else if (d.formaGeometrica == FormasGeometricas.circulo) {
                    int largura = d.dadosFormaGeometrica.get("raio") * 2;
                    int altura = d.dadosFormaGeometrica.get("raio") * 2;
                    int x = centroX + d.dadosFormaGeometrica.get("x") - largura / 2;
                    int y = centroY + d.dadosFormaGeometrica.get("y") - altura / 2;

                    g.drawOval(x, y, largura, altura);
                }

            }

        }

    }
}
