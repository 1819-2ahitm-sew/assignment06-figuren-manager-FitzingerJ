class Rectangle extends Figure{

    int length;
    int width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double area() {
        return length * width;
    }

    @Override
    public double circumfence() {
        return 2 * (length + width);
    }

    @Override
    public String output() {
        return "Rechteck mit Länge " + this.length + " und Breite " + this.width + ":\nFläche -> " + area() + "\nUmfang -> " + circumfence() + "\n";
    }

}