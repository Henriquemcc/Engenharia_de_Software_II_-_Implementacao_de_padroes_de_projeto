package padroesGoF.ExercicioTres;

import java.util.HashMap;

public class Visual {

    public static void drawLine(int x1, int y1, int y2) {
        HashMap<String, Integer> hashMap = new HashMap<String, Integer>();
        hashMap.put("x1", x1);
        hashMap.put("y1", y1);
        hashMap.put("y2", y2);
        ObjetoGeometrico linha = new ObjetoGeometrico(ObjetoGeometrico.FormasGeometricas.linha, hashMap);
        linha.desenhar();
    }

    public static void drawRectangle(int x, int y, int altura, int largura) {

        HashMap<String, Integer> hashMap = new HashMap<String, Integer>();
        hashMap.put("x", x);
        hashMap.put("y", y);
        hashMap.put("altura", altura);
        hashMap.put("largura", largura);
        ObjetoGeometrico retangulo = new ObjetoGeometrico(ObjetoGeometrico.FormasGeometricas.retangulo, hashMap);
        retangulo.desenhar();
    }

    public static void drawCircle(int x, int y, int raio) {

        HashMap<String, Integer> hashMap = new HashMap<String, Integer>();
        hashMap.put("x", x);
        hashMap.put("y", y);
        hashMap.put("raio", raio);
        ObjetoGeometrico circulo = new ObjetoGeometrico(ObjetoGeometrico.FormasGeometricas.circulo, hashMap);
        circulo.desenhar();
    }

}
