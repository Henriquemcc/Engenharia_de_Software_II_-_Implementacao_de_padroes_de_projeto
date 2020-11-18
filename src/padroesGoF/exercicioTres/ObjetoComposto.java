package padroesGoF.exercicioTres;

import javax.swing.*;
import java.awt.*;

/**
 * Representa um objeto geométrico composto.
 */
public class ObjetoComposto implements Objeto
{
	final Objeto[] objetos;

	/**
	 * Cria uma nova instância da classe Objeto.
	 *
	 * @param objetos Arranjo de objetos contendo outros objetos geométricos.
	 */
	public ObjetoComposto(Objeto[] objetos)
	{
		this.objetos = objetos;
	}

	/**
	 * Desenha, utilizando interface gráfica um objeto composto.
	 */
	@Override
	public void desenhar()
	{
		JFrame jFrame = new JFrame("Objeto Composto");
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jFrame.setSize(800, 800);
		jFrame.setVisible(true);

		desenhar(jFrame);
	}

	/**
	 * Desenha, utilizando interface gráfica um objeto composto.
	 *
	 * @param jFrame Referência para o JFrame onde será desenhado o objeto composto.
	 */
	@Override
	public void desenhar(JFrame jFrame)
	{
		jFrame.add(new Desenho(jFrame, objetos));
	}

	/**
	 * Desenha, utilizando interface gráfica um objeto composto.
	 *
	 * @param jFrame Referência para o JFrame onde será desenhado o objeto composto.
	 * @param g      Referência para o Graphics onde será desenhado o objeto composto.
	 */
	@Override
	public void desenhar(JFrame jFrame, Graphics g)
	{
		Desenho desenho = new Desenho(jFrame, objetos);
		desenho.paintComponent(g);
	}

	/**
	 * Subclasse de JPanel modificada para poder desenhar um Objeto Composto.
	 */
	private static class Desenho extends JPanel
	{
		final JFrame jFrame;
		final Objeto[] objetos;


		/**
		 * Cria uma nova instância da classe Desenho.
		 *
		 * @param jFrame  Referência para o JFrame onde será desenhado o Objeto Composto.
		 * @param objetos Arranjo de outros objetos.
		 */
		public Desenho(JFrame jFrame, Objeto[] objetos)
		{
			this.jFrame = jFrame;
			this.objetos = objetos;
		}

		/**
		 * Desenha o objeto composto, quando uma instância desta classe é passada por parâmetro para o método add da classe JFrame.
		 *
		 * @param g Referência para uma instância da classe Graphics.
		 */
		public void paintComponent(Graphics g)
		{
			for (Objeto objeto : objetos)
			{
				objeto.desenhar(jFrame, g);
			}
		}
	}
}
