package griffith;

// Polina Batanova 3168473
public class Circle extends Shape {

    private double radius;

    public Circle(String name, double radius) {
        super(name);
        this.radius = radius;
    }

    // method finding area
    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    // method finding perimeter
    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }

    // method for string representation
    @Override
    public String toString() {
        return super.toString() + " radius: " + radius;
    }

}
