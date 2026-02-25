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
        return 0;
    }

    public double perimeter() {
        return 0;
    }
    public String toString() {
        return super.toString() + " side: " + side + " height: " + height;
    }

}
