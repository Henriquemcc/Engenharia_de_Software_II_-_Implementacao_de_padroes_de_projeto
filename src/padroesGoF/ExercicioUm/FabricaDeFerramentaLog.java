package padroesGoF.ExercicioUm;

import java.io.IOException;

/**
 * Possuí método que fabrica a ferramenta Log.
 */
public class FabricaDeFerramentaLog {

    /**
     * Método construtor: Cria um novo objeto que implementa a interface Log.
     *
     * @param tipoLog String contendo informações sobre o tipo de Log que será criado. Tipos possíveis: "arquivo", "console".
     * @return Instância de objeto que implementa a interface Log.
     * @throws IOException Exceções das classes File e PrintStream.
     */
    public Log getLog(String tipoLog) throws IOException {
        Log log = null;

        //Criando o log
        if (tipoLog.toLowerCase().trim().equals("arquivo"))
            log = new LogArquivo();
        else if (tipoLog.toLowerCase().trim().equals("console"))
            log = new LogConsole();

        return log;
    }
}
