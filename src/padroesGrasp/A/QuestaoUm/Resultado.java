package padroesGrasp.A.QuestaoUm;

public class Resultado {
    private final String nomeEspecie; // nome da especie

    private final int quantidade; // quantidade de animais da especie

    /**
     * @param nomeEspecie
     * @param quantidade
     */
    public Resultado(String nomeEspecie, int quantidade) {
        this.nomeEspecie = nomeEspecie;
        this.quantidade = quantidade;
    }

    /**
     * @return
     */
    public String getNomeEspecie() {
        return nomeEspecie;
    }

    /**
     * @return
     */
    public int getQuantidade() {
        return quantidade;
    }
}