class Square extends Figure{

    int length;

    public Square(int length) {
        this.length = length;
    }

    @Override
    public double area() {
        return length * length;
    }

    @Override
    public double circumfence() {
        return 4 * length;
    }

    @Override
    public String output() {
        return "Quadrat mit Seitenlänge " + this.length + ":\nFläche -> " + area() + "\nUmfang -> " + circumfence() + "\n";
    }

}