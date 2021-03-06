[English Version](Enunciado.EN.md)

# Bloco de Questões A

Dadas as seguintes interfaces:

Representa um animal

```
public interface Animal {
    public String getNomeEspecie();
    public String getNomeAnimal();
}
```

* getNomeEspecie Retorna o nome da espécie do animal.

* getNomeAnimal Retorna o nome do animal.

Representa um conjunto de rotinas utilitárias

```
public interface Ferramentas {
    public Animal[] filtraEspecie(Animal[] completo, String especieFiltrar);
    public String[] classificaEspecies(Animal[] completo);
}
```

* filtraEspecie Recebe como parâmetro um vetor contendo animais, que podem ser de várias espécies diferentes, e retorna um vetor que contém apenas os animais cuja espécie é especificada no parâmetro “especieFiltrar”. Se não houver nenhum animal da espécie especificada, retorna um vetor com zero posições.

* classificaEspecies Recebe como parâmetro um vetor contendo animais e retorna um vetor de Strings contendo o nome de todas as espécies que foram encontradas no vetor recebido como parâmetro. Cada nome de espécie só aparece uma vez no vetor de saída.
