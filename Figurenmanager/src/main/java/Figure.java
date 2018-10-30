abstract class Figure {

    static Square square = new Square(5);
    static Rectangle rectangle = new Rectangle(2, 3);
    static Circle circle = new Circle(3);
    static Ellipse ellipse = new Ellipse(3, 2);
    static Triangle triangle = new Triangle(4, 6, 45);

    static Figure[] figures = {
            square,
            rectangle,
            circle,
            ellipse,
            triangle
    };

    abstract public double area();

    abstract public double circumfence();

    abstract public String output();

}