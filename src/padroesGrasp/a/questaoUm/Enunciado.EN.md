[Versão em Português](Enunciado.md)

# Questão A.1

Write a method that takes two parameters:
* an A vector of objects that implement the Animal interface representing several animals
* an object that implements the Ferramentas(Tools) interface

The method should account for the number of animals available in each species and return the results as a vector of objects of the Resultado(Result) class (shown below). Each object will contain a species and the number of animals counted. Only species whose animals are present in the vector should be considered.

```
public class Resultado {
    private String nomeEspecie; // nome da especie
    private int quantidade; // quantidade de animais da especie
    public Resultado(String nomeEspecie, int quantidade) {
        this.nomeEspecie = nomeEspecie;
        this.quantidade = quantidade;
    }
    public String getNomeEspecie() {
        return nomeEspecie;
    }
    public int getQuantidade() {
        return quantidade;
    }
}
```

In this matter, it is enough to just implement the method, it is not needed to specify the class.
