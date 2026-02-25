package griffith;

public class RightAngledTriangle extends Shape {
    private double base;
    private double height;

    public RightAngledTriangle(String name, double base, double height) {
        super(name);
        this.base = base;
        this.height = height;
    }

    @Override
    public double area() {
        return (base * height) / 2;
    }
    @Override
    public double perimeter() {
        return 0;
    }

    public String toString() {
        return super.toString() + " base: " + base + " height: " + height;
    }
}
