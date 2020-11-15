[English Version]()

# Bloco de Questões B

Um banco possui um sistema onde é definida a seguinte classe que representa um correntista e o
saldo de sua conta bancária:

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

Além disto, o sistema define as seguintes interfaces:

Representa um movimento (débito ou crédito) na conta de um correntista
```
public interface MovimentoConta {
 public String getCPFCorrentista();
 public float getValorMovimento();
}
```

* getCPFCorrentista Retorna o CPF do correntista em cuja conta o movimento será aplicado.
* getValorMovimento Retorna o valor do movimento (positivo se for crédito e negativo se for débito).

Representa uma rotina utilitária
```
public interface OperacoesBanco {
 public Correntista encontraCorrentista(Correntista todosCorrentistas[],
 String cpfProcurado);
}
```

* encontraCorrentista Procura no vetor todosCorrentistas o correntista cujo CPF é igual ao informado no parâmetro cpfProcurado. Se o encontrar, retorna seu respectivo objeto através do método, caso contrário retorna null.