package padroesGrasp.B.QuestaoQuatro.ExemploTeste;

import padroesGrasp.B.MovimentoConta;

/**
 * Implementa a interface MovimentoConta.
 */
public class Movimentacao implements MovimentoConta {

    private String cpf;
    private float valorMovimento;

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
