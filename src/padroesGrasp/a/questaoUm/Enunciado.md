[English Version](Enunciado.EN.md)

# Questão A.1

  Escreva um método que receba dois parâmetros:
* um vetor A de objetos que implementam a interface Animal representando diversos animais
* um objeto que implementa a interface Ferramentas

O método deve contabilizar o número de animais disponíveis em cada uma das espécies e
retornar os resultados como um vetor de objetos da classe Resultado (apresentada abaixo).
Cada objeto conterá uma espécie e o número de animais da mesma contabilizados. Devem ser
consideradas apenas as espécies cujos animais estão presentes no vetor.

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

Nesta questão basta implementar o método, não é necessária a especificação da classe.
