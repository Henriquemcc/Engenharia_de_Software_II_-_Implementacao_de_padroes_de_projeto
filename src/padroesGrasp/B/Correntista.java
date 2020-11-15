package padroesGrasp.B;

/**
 * Representa um correntista e o saldo de sua conta bancária:
 */
public class Correntista {

    private final String cpfCliente; // cpf do correntista
    private float saldo; // saldo da conta

    /**
     * Cria uma nova instância da classe Correntista
     *
     * @param cpfCliente CPF do cliente.
     * @param saldo      Saldo da conta corrente do cliente.
     */
    public Correntista(String cpfCliente, float saldo) {
        this.cpfCliente = cpfCliente;
        this.saldo = saldo;
    }

    /**
     * Obtém o CPF do cliente
     *
     * @return CPF do cliente.
     */
    public String getCPFCliente() {
        return cpfCliente;
    }

    /**
     * Obtém o saldo da conta corrente.
     *
     * @return Valor do saldo da conta corrente.
     */
    public float getSaldo() {
        return saldo;
    }

    /**
     * Altera o saldo da conta corrente.
     *
     * @param saldo Novo valor para o saldo da conta corrente.
     */
    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
}
