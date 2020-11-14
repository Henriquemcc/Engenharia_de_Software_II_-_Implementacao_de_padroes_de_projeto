package padroesGrasp.B;

/**
 * Representa um movimento (débito ou crédito) na conta de um correntista.
 */
public interface MovimentoConta {

    /**
     * Retorna o CPF do correntista em cuja conta o movimento será aplicado.
     *
     * @return CPF do cliente.
     */
    public String getCPFCorrentista();

    /**
     * Retorna o valor do movimento (positivo se for crédito e negativo se for débito).
     *
     * @return Valor do movimento da conta.s
     */
    public float getValorMovimento();
}
