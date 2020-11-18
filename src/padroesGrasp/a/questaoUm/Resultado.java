package padroesGrasp.a.questaoUm;

/**
 * Representa a quantidade de animais de uma determinada espécie.
 */
public class Resultado {

    private final String nomeEspecie; // nome da espécie
    private final int quantidade; // quantidade de animais da espécie

    /**
     * Cria uma nova instância da classe Resultado.
     *
     * @param nomeEspecie Nome da espécie dos animais.
     * @param quantidade  Quantidade de animais desta mesma espécie.
     */
    public Resultado(String nomeEspecie, int quantidade) {
        this.nomeEspecie = nomeEspecie;
        this.quantidade = quantidade;
    }

    /**
     * Obtém o nome da espécie do animal.
     *
     * @return Nome da espécie do animal.
     */
    public String getNomeEspecie() {
        return nomeEspecie;
    }

    /**
     * Obtém a quantidade de animais desta mesma espécie.
     *
     * @return Quantidade de animais desta mesma espécie.
     */
    public int getQuantidade() {
        return quantidade;
    }
}