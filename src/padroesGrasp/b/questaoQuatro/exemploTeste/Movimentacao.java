package padroesGrasp.b.questaoQuatro.exemploTeste;

import padroesGrasp.b.MovimentoConta;

/**
 * Implementa a interface MovimentoConta.
 */
public class Movimentacao implements MovimentoConta {

    private final String cpf;
    private final float valorMovimento;

    /**
     * Cria uma nova instância da classe Movimentacao.
     *
     * @param cpf            cpf do correntista.
     * @param valorMovimento Valor do movimento da conta.
     */
    public Movimentacao(String cpf, float valorMovimento) {
        this.cpf = cpf;
        this.valorMovimento = valorMovimento;
    }

    /**
     * Obtém o cpf do correntista.
     *
     * @return Cpf do correntista.
     */
    @Override
    public String getCPFCorrentista() {
        return this.cpf;
    }

    /**
     * Obtém o valor do movimento da conta.
     *
     * @return Valor do movimento da conta.
     */
    @Override
    public float getValorMovimento() {
        return this.valorMovimento;
    }
}
