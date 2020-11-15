package padroesGoF.ExercicioTres;

import java.util.HashMap;

public class Visual {

    public static void drawLine(int x1, int y1, int y2) {
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("x1", x1);
        hashMap.put("y1", y1);
        hashMap.put("y2", y2);
        ObjetoGeometrico.DadosObjetoGeometrico dados = new ObjetoGeometrico.DadosObjetoGeometrico();
        dados.formaGeometrica = ObjetoGeometrico.FormasGeometricas.linha;
        dados.dadosFormaGeometrica = hashMap;
        ObjetoGeometrico linha = new ObjetoGeometrico(dados);
        linha.desenhar();
    }

    public static void drawRectangle(int x, int y, int altura, int largura) {

        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("x", x);
        hashMap.put("y", y);
        hashMap.put("altura", altura);
        hashMap.put("largura", largura);
        ObjetoGeometrico.DadosObjetoGeometrico dados = new ObjetoGeometrico.DadosObjetoGeometrico();
        dados.formaGeometrica = ObjetoGeometrico.FormasGeometricas.retangulo;
        dados.dadosFormaGeometrica = hashMap;
        ObjetoGeometrico retangulo = new ObjetoGeometrico(dados);
        retangulo.desenhar();
    }

    public static void drawCircle(int x, int y, int raio) {

        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("x", x);
        hashMap.put("y", y);
        hashMap.put("raio", raio);
        ObjetoGeometrico.DadosObjetoGeometrico dados = new ObjetoGeometrico.DadosObjetoGeometrico();
        dados.formaGeometrica = ObjetoGeometrico.FormasGeometricas.circulo;
        dados.dadosFormaGeometrica = hashMap;
        ObjetoGeometrico circulo = new ObjetoGeometrico(dados);
        circulo.desenhar();
    }
}
