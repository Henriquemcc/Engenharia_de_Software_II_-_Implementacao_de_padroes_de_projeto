package padroesGoF.exercicioUm;

import java.io.IOException;

/**
 * Classe principal.
 */
public class Main
{

	/**
	 * Método principal.
	 *
	 * @param args Argumentos do método (inútil).
	 * @throws IOException Exceção das classes File e PrintStream.
	 */
	public static void main(String[] args) throws IOException
	{

		FabricaDeFerramentaLog fabricaDeFerramentaLog = new FabricaDeFerramentaLog();

		System.out.println("Log no Console:");
		Log log = fabricaDeFerramentaLog.getLog("console");
		for (short i = 0; i <= 10; i++)
		{
			log.println(i);
		}

		System.out.println("Log no Arquivo:");
		log = fabricaDeFerramentaLog.getLog("arquivo");
		for (short i = 0; i <= 10; i++)
		{
			log.println(i);
		}
	}
}
