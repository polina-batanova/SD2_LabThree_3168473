package griffith;

public class Circle extends Shape {

    private double radius;

    public Circle(String name, double radius) {
        super(name);
        this.radius = radius;
    }

    public double area() {
        return 0;
    }

    public double perimeter() {
        return 0;
    }

    public String toString() {
        return super.toString() + " radius: " + radius;
    }

}
