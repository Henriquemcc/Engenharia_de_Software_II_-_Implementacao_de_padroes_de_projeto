[English Version](Enunciado.EN.md)

# Questão B.6

Dada a seguinte classe que representa os dados de um correntista, mais as despesas previstas para o mesmo.

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
Escreva um método que receba como parâmetro um vetor de objetos da classe CorrentistaDespesa. Este método deve retornar outro vetor da classe CorrentistaDespesa apenas com aqueles correntistas cujas despesas previstas para março não sejam maiores que o saldo da conta.

Nesta questão basta implementar o método, não é necessária a especificação da classe.