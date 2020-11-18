[Versão em Português](Enunciado.md)

# Question B.5

Given the following classes:

Represents total expenses for a month
```
public class DespesaMes {
    private int mes; // mes da despesa
    private float valor; // valor da despesa
    public DespesaMes(int mes, float valor) {
        this.mes = mes;
        this.valor = valor;
    }
    public int getMes() {
        return mes;
    }
    public float getValor() {
        return valor;
    }
}
```
Represents total expenses for one day
```
public class DespesaDia extends DespesaMes {
    private int dia; // dia da despesa
    public DespesaDia(int dia, int mes, float valor) {
        super(mes, valor);
        this.dia = dia;
    }
    public int getDia() {
        return dia;
    }
}
```

Write a class that represents all an individual's expenses. It maintains a vector where both one-day expenses (DepesaDia) and one-month expenses (DepesaMes) can be recorded. The class implements the following methods:

* Builder Receives as a parameter the CPF and a vector with the expenses of an individual and keeps them.

* getCPF Returns the individual's CPF.

* totalizaMes It receives a parameter with a month (int) and returns an object of the DespesaMes class where the sum of all expenses that the individual made in that month will be recorded.
