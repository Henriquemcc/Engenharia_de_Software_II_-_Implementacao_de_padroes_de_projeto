[Versão em Português](Enunciado.md)

# Exercise 2

The software that controls the sale of private securities of an investment bank must be flexible enough to accommodate variations in the procedures for selling CDBs (Bank Deposit Certificates), bills of exchange and debentures. However, the sequence in which these procedures are performed is the same for all types of securities. Therefore, the designers of this software adopted the design described below.

First, they created an abstract class containing a concrete method, called compra() "buy" , which implements the sequence of execution of the procedures, which is common to all types of securities, but left open, through abstract methods, the implementation each procedure. This class, called TituloPrivado, is shown below.

```
public abstract class TituloPrivado {

    public final boolean compra(int qtd) {
        if(exibePropospectoInicial())
            if(realizaCadastro(qtd))
                return encerra();

        return false;
    }

    public abstract boolean exibePropospectoInicial();
    public abstract boolean realizaCadastro(int qtd);
    public abstract boolean encerra();
}
```

The next step was to create specific subclasses for each of the three types of headings.

Each subclass implements its own procedures, by implementing the abstract methods of the TituloPrivado class. This is exemplified by the Debenture class, shown below.

```
public class Debenture extends TituloPrivado {
    public boolean exibePropospectoInicial() {
        // código irrelevante para a questão
    }
    public boolean realizaCadastro(int qtd) {
        // código irrelevante para a questão
    }
    public boolean encerra() {
        // código irrelevante para a questão
    }
}
```

A realização de uma compra será feita por meio da instanciação de uma das subclasses concretas da classe TituloPrivado e da posterior execução do método compra(), que irá acionar os métodos que implementam os procedimentos específicos do tipo de título instanciado.

A purchase will be made by instantiating one of the specific subclasses of the TituloPrivado class and subsequently executing the compra() "purchase" method, which will trigger the methods that implement the specific procedures of the type of instantiated security.

2.1) What design pattern (s) were employed in this design?

2.2) Specify whether the standard (or standards) are GoF or GRASP and if GoF, what is
category (creational, structural or behavioral).