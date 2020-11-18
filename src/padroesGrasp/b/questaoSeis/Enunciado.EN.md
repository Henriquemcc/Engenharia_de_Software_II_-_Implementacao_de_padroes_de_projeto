[Versão em Português](Enunciado.md)

# Question B.6

Given the following class that represents the data of an account holder, and the expenses foreseen for it.

```
public class CorrentistaDespesa extends Correntista {
    private DespesasIndividuo despesasPrevistas; // despesas previstas
    public CorrentistaDespesa(String cpfCliente, float saldo,
    DespesasIndividuo despesas) {
        super(cpfCliente, saldo);
        this.despesasPrevistas = despesas;
    }
    public DespesasIndividuo getDespesasPrevistas() {
        return despesasPrevistas;
    }
}
```
Write a method that takes as a parameter a vector of objects of the class CorrentistaDespesa. This method should return another vector of the CorrentistaDespesa class only with those account holders whose expenses foreseen for March are not greater than the account balance.

In this matter, it is enough to just implement the method, it is not needed to specify the class.