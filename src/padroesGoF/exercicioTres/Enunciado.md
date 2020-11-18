[English Version]()

# Exercício 3

Considere que uma biblioteca gráfica disponibiliza uma classe Visual os
seguintes métodos estáticos:

* drawLine(x1, y1, y2) Desenha uma linha. x1 e y1 - coordenadas do ponto de origem; x2 e y2 - coordenadas do ponto de destino.

* drawRectangle(x, y, altura, largura) Desenha um retângulo. x e y - coordenadas do canto esquerdo superior; altura e largura do retângulo.

* drawCircle(x, y, raio) Desenha um círculo. x e y - coordenadas do centro; raio - raio do círculo.

a) Escreve uma classe que seja capaz de armazenar o estado e plotar um objeto geométrico.

b) Usando o pattern Composite: defina uma interface única para desenhar os objetos e crie uma classe que permita agregar objetos geométricos simples (linha, retângulo e círculo) e compostos (objetos que já agregam outros objetos).

c) Considere a seguinte estratégia padronizada para definir as medidas de uma reta, um retângulo e 3 um círculo: para os três casos é definido um bounding box, ou seja, um retângulo delimitador com as coordenadas x1, y1, x2, y2.

* a linha é desenhada como uma diagonal partindo de x1, y1 até x2, y2;

* o retângulo tem seu canto esquerdo superior em x1, y1 e o esquerdo inferior em x2, y2;

* o círculo corresponde ao maior círculo que pode ser desenhado dentro do retângulo. Escreva uma fábrica (pattern Abstract Factory) para construir objetos simples (um único método) e compostos (outro método).