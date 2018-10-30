class Triangle extends Figure{

    double side1;
    double side2;
    double angle;

    public Triangle(double side1, double side2, double angle) {
        this.side1 = side1;
        this.side2 = side2;
        this.angle = angle * Math.PI / 180;
    }

    @Override
    public double area() {
        return side1 * side2 * Math.sin(angle) / 2;
    }

    @Override
    public double circumfence() {
        double side3 = Math.sqrt(side1 * side1 + side2 * side2 - 2 * side1 * side2 * Math.cos(angle));
        return side3 + side2 + side1;
    }

    @Override
    public String output() {
        return "Dreieck mit a: " + side1 + " und b: " + side2 + " und alpha: " + angle + ":\nFläche -> " + area() + "\nUmfang -> " + circumfence() + "\n";
    }

}