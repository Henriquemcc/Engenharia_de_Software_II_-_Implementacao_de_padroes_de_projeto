[Versão em Português](Enunciado.md)

# Block of Questions A

Given the following interfaces:

Represents an animal

```
public interface Animal {
    public String getNomeEspecie();
    public String getNomeAnimal();
}
```

* getNomeEspecie Returns the specie name of the animal.

* getNameAnimal Returns the name of the animal.

Represents a set of utility routines

```
public interface Ferramentas {
    public Animal[] filtraEspecie(Animal[] completo, String especieFiltrar);
    public String[] classificaEspecies(Animal[] completo);
}
```

* filtraEspecie Receives as a parameter a vector containing animals, which may be of several different species, and returns a vector that contains only animals whose species is specified in the “especieFiltrar” parameter. If there is no animal of the specified species, a vector with zero positions is returned.

* classificaEspecies Receives as a parameter a vector containing animals and returns a vector of Strings containing the name of all species that were found in the vector received as a parameter. Each species name only appears once in the output vector.
