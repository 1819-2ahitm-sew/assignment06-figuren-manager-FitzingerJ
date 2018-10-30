abstract class Figure {

    static Square square = new Square(3);
    static Rectangle rectangle = new Rectangle(5, 5);
    static Circle circle = new Circle(5);
    static Ellipse ellipse = new Ellipse(10, 6);
    static Triangle triangle = new Triangle(3, 5, 45);

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