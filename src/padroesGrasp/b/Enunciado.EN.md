[Versão em Português](Enunciado.md)

# Block of Questions B

A bank has a system where the following class is defined, which represents an account holder and the balance of his bank account:

```
public class Correntista {
    private String cpfCliente; // cpf do correntista
    private float saldo; // saldo da conta
    public Correntista(String cpfCliente, float saldo) {
        this.cpfCliente = cpfCliente;
        this.saldo = saldo;
    }
    public String getCPFCliente() {
        return cpfCliente;
    }
    public float getSaldo() {
        return saldo;
    }
    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
}
```

In addition, the system defines the following interfaces:

Represents a financial transaction (debit or credit) in a account
```
public interface MovimentoConta {
 public String getCPFCorrentista();
 public float getValorMovimento();
}
```

* getCPFCorrentista Returns the CPF of the account holder in whose account the transaction will be applied.
* getValorMovimento Returns the value of the transaction (positive if it is credit and negative if it is debit).

Represents a utility routine
```
public interface OperacoesBanco {
 public Correntista encontraCorrentista(Correntista todosCorrentistas[],
 String cpfProcurado);
}
```

* encontraCorrentista Searches on vector todosCorrentistas for the account whose CPF is the same as that informed in the cpfProcurado parameter. If it finds it, it returns its respective object through the method, otherwise it returns null.