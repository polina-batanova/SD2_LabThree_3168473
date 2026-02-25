package griffith;

public class Rhombus extends Shape {
    private double side;
    private double height;

    public Rhombus(String name, double side, double height) {
        super(name);
        this.side = side;
        this.height = height;
    }

    public double area() {
        return side * height;
    }

    public double perimeter() {
        return 4 * side;
    }
    public String toString() {
        return super.toString() + " side: " + side + " height: " + height;
    }

}
