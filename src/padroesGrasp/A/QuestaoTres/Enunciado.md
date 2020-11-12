# Questão A.3
Um jardim zoológico definiu a seguinte interface que estende a interface Animal:

```
public interface AnimalOrcamento extends Animal {
    public ItemOrcamentoComplexo orcamentoGastosAnimal();
}
```

O método orcamentoGastosAnimal retorna o orçamento para gastos de um animal no
zoológico.

O zoológico deseja saber quais de seus animais têm a “vacina W” prevista no seu orçamento.

Escreva um método que receba como parâmetro um vetor de objetos que implementam a
interface AnimalOrcamento representando todos os animais do zoológico e seus respectivos
orçamentos.

O método deve retornar um outro vetor de objetos que implementam a interface
AnimalOrcamento apenas com aqueles animais que possuem um subitem com histórico “vacina
W” prevista no seu orçamento.

Nesta questão basta implementar o método, não é necessária a especificação da classe.
