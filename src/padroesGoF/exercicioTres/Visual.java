package padroesGoF.exercicioTres;

/**
 * Representa a classe Visual solicitada pelo enunciado.
 */
public class Visual
{

	/**
	 * Desenha uma linha.
	 *
	 * @param x1 Coordenada x do ponto de origem.
	 * @param y1 Coordenada y do ponto de origem.
	 * @param y2 Coordenada y do ponto de destino.
	 */
	public static void drawLine(int x1, int y1, int y2)
	{
		Linha linha = new Linha(x1, y1, y2);
		linha.desenhar();
	}

	/**
	 * Desenha um retângulo.
	 *
	 * @param x       Coordenada X do canto esquerdo superior.
	 * @param y       Coordenada Y do canto esquerdo superior.
	 * @param altura  Altura do retângulo.
	 * @param largura Largura do retângulo.
	 */
	public static void drawRectangle(int x, int y, int altura, int largura)
	{
		Retangulo retangulo = new Retangulo(x, y, altura, largura);
		retangulo.desenhar();
	}

	/**
	 * Desenha um círculo.
	 *
	 * @param x    Coordenada x do centro.
	 * @param y    Coordenada Y do centro.
	 * @param raio Raio do círculo.
	 */
	public static void drawCircle(int x, int y, int raio)
	{

		Circulo circulo = new Circulo(x, y, raio);
		circulo.desenhar();
	}
}
