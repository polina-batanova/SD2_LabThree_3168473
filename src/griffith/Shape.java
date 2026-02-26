package griffith;

// Polina Batanova 3168473
public abstract class Shape {
    private String name;

    public Shape(String name) {
        this.name = name;
    }

    // getter and setter
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    // abstract methods
    public abstract double area();

    public abstract double perimeter();

    public String toString() {
        return name;
    }

}
