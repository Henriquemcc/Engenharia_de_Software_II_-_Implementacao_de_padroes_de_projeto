[English Version](Enunciado.EN.md)

# Questão B.5

Dada as classes a seguir:

Representa o total de despesas de um mês
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
Representa o total de despesas de um dia
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
Escreva uma classe que representa todas as despesas de um indivíduo. Ela mantém um
vetor onde podem ser registradas tanto despesas de um dia (DespesaDia), quanto despesas de
um mês (DepesaMes). A classe implementa os seguintes métodos:

* Construtor Recebe como parâmetro o CPF e um vetor com as despesas de um indivíduo e as guarda.

* getCPF Retorna o CPF do indivíduo.

* totalizaMes Recebe um parâmetro com um mês (int) e retorna um objeto da classe DespesaMes onde estará registrada a soma de todas as despesas que o indivíduo fez naquele mês.
