package padroesGoF.ExercicioTres;

import javax.swing.*;
import java.awt.*;

/**
 * Representa um objeto geométrico.
 */
public interface Objeto {

    /**
     * Desenha, utilizando interface gráfica um objeto.
     */
    public void desenhar();

    /**
     * Desenha, utilizando interface gráfica um objeto.
     *
     * @param jFrame Referência para o JFrame onde será desenhado o objeto.
     */
    public void desenhar(JFrame jFrame);

    /**
     * Desenha, utilizando interface gráfica um objeto.
     *
     * @param jFrame Referência para o JFrame onde será desenhado o objeto.
     * @param g      Referência para o Graphics onde será desenhado o objeto.
     */
    public void desenhar(JFrame jFrame, Graphics g);

}
