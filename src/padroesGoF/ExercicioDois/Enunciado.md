# Exercício 2

O software que controla a venda de títulos privados de um banco de investimentos tem de ser flexível o suficiente para acomodar as variações nos procedimentos de venda de CDBs, letras de câmbio e debêntures. Entretanto, a sequência na qual esses procedimentos são executados é a mesma para todos os tipos de títulos. Sendo assim, os projetistas desse software adotaram o design descrito a seguir.

Em primeiro lugar, criaram uma classe abstrata contendo um método concreto, chamado compra(), que implementa a sequência de execução dos procedimentos, que é comum a todos os tipos de títulos, mas deixaram em aberto, por meio de métodos abstratos, a implementação de cada procedimento. Essa classe, chamada TituloPrivado, é mostrada a seguir.

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

O passo seguinte foi criar subclasses específicas para cada um dos três tipos de títulos.

Cada subclasse implementa os seus próprios procedimentos, por meio da concretização dos métodos abstratos da classe TituloPrivado. Isso é exemplificado pela classe Debenture, mostrada a seguir.

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

2.1) Qual(is) padrão(ões) de projeto foram empregados nesse design?

2.2) Especifique se o padrão (ou padrões) são GoF ou GRASP e se GoF, qual a
categoria (criacional, estrutural ou comportamental).