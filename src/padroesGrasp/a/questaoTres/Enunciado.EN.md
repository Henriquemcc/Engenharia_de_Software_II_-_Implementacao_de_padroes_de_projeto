[Versão em Português](Enunciado.md)

# Question A.3
A zoo has defined the following interface that extends the Animal interface:

```
public interface AnimalOrcamento extends Animal {
    public ItemOrcamentoComplexo orcamentoGastosAnimal();
}
```

The orcamentoGastosAnimal method returns the budget for spending an animal at the zoo.

The zoo wants to know which of its animals have the “vacina W” ("W vaccine") foreseen in its budget.

Write a method that takes as a parameter a vector of objects that implement the AnimalOrcamento interface representing all the animals in the zoo and their respective budgets.

The method should return another vector of objects that implement the AnimalOrcamento interface only with those animals that have a sub-item with a historic “vacina W” (“W vaccine”) foreseen in their budget.

In this matter, it is enough to just implement the method, it is not necessary to specify the class.
