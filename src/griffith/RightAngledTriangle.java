package griffith;

// Polina Batanova 3168473
public class RightAngledTriangle extends Shape {
    private double base;
    private double height;

    public RightAngledTriangle(String name, double base, double height) {
        super(name);
        this.base = base;
        this.height = height;
    }

    // method for finding area
    @Override
    public double area() {
        return (base * height) / 2;
    }

    // method for finding perimeter
    @Override
    public double perimeter() {
        double hypotenuse = Math.sqrt(base * base + height * height);
        return base + height + hypotenuse;
    }

    // method for string representation
    @Override
    public String toString() {
        return super.toString() + " base: " + base + " height: " + height;
    }
}
