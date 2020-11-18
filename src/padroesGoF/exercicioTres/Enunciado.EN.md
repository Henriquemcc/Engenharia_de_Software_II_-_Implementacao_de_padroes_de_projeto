[Versão em Português](Enunciado.md)

# Exercício 3

Consider that a graphic library provides a Visual class
following static methods:

* drawLine (x1, y1, y2) Draws a line. x1 and y1 - coordinates of the point of origin; x2 and y2 - coordinates of the destination point.

* drawRectangle (x, y, height, width) Draws a rectangle. x and y - coordinates of the upper left corner; height and width of the rectangle.

* drawCircle (x, y, radius) Draws a circle. x and y - center coordinates; radius - radius of the circle.

a) Write a class which is able to store the state and plot a geometric object.

b) Using the Composite pattern: define a single interface to draw the objects and create a class that allows aggregating simple geometric objects (line, rectangle and circle) and compounds (objects that already aggregate other objects).

c) Consider the following standardized strategy to define the measures of a line, a rectangle and 3 a circle: for the three cases a bounding box is defined, that is, a bounding rectangle with the coordinates x1, y1, x2, y2.

* the line is drawn as a diagonal from x1, y1 to x2, y2;

* the rectangle has its upper left corner at x1, y1 and the lower left at x2, y2;

* the circle corresponds to the largest circle that can be drawn within the rectangle. Write a factory (pattern Abstract Factory) to build simple objects (a single method) and compounds (another method).