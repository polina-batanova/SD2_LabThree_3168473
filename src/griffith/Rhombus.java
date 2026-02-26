package griffith;

// Polina Batanova 3168473
public class Rhombus extends Shape {
    private double side;
    private double height;

    public Rhombus(String name, double side, double height) {
        super(name);
        this.side = side;
        this.height = height;
    }

    // method for finding area
    @Override
    public double area() {
        return side * height;
    }

    // method for finding perimeter
    @Override
    public double perimeter() {
        return 4 * side;
    }

    // method for string representation
    @Override
    public String toString() {
        return super.toString() + " side: " + side + " height: " + height;
    }

}
