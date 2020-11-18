[Versão em Português](Enunciado.md)

# Questão A.2

Given the ItemOrcamento class that represents a budget item:

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

Write an inheriting class of ItemOrcamento named ItemOrcamentoComplexo
that maintains a vector with budget sub-items that can be from the ItemOrcamento class
or from the complexComplianceItem class. The class implements the following methods:

* Constructor In addition to the parameters of the superclass, it receives the vector with the budget sub-items as a parameter.

* getValor Overrides the superclass method, returning the sum of values for all budget subitems.

* encontraItem Receives the history of a sub-item as a parameter (String) and returns the object corresponding to the sub-item that has this history, if it exists. If not, return null.
