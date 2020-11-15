[English Version]()

# Questão A.2

Dada a classe ItemOrcamento que representa um item de um orçamento:

```
public class ItemOrcamento {
    private String historico; // historico do item
    private float valor; // valor do item
    public ItemOrcamento(String historico, float valor) {
        this.historico = historico;
        this.valor = valor;
    }

    public String getHistorico() {
        return historico;
    }

    public float getValor() {
        return valor;
    }
}
```

Escreva uma classe herdeira de ItemOrcamento denominada ItemOrcamentoComplexo
que mantenha um vetor com subitens de orçamento que podem ser da classe ItemOrcamento
ou da classe ItemOrcamentoComplexo. A classe implementa os seguintes métodos:

* Construtor Além dos parâmetros da superclasse, recebe como parâmetro o vetor com os subitens de orçamento.

* getValor Sobrescreve o método da superclasse, retornando a soma de valores de todos os subitens de orçamento.

* encontraItem Recebe como parâmetro o histórico de um subitem (String) e retorna o objeto correspondente ao subitem que possui este histórico, se existir. Se não existir retorna null.
