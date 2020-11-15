package padroesGoF.ExercicioTres.ExemploTeste;

import padroesGoF.ExercicioTres.Visual;

import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[]args) throws InterruptedException {

        System.out.println("Desenhando o Retângulo");
        Visual.drawRectangle(0, 0, 600, 600);
        TimeUnit.SECONDS.sleep(5);

        System.out.println("Desenhando o Círculo");
        Visual.drawCircle(0, 0, 350);
        TimeUnit.SECONDS.sleep(5);

        System.out.println("Desenhando a Linha");
        Visual.drawLine(-300, -300, 300);
        TimeUnit.SECONDS.sleep(5);
    }

}
