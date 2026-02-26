package griffith;

// Polina Batanova 3168473
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShapeTest {

    // test circle area
    @Test
    public void testCircleArea() {
        Circle c = new Circle("Circle", 3);
        assertEquals(Math.PI * 9, c.area(), 0);
    }

    // test circle perimeter
    @Test
    public void testCirclePerimeter() {
        Circle c = new Circle("Circle", 3);
        assertEquals(2 * Math.PI * 3, c.perimeter(), 0);
    }

    // test circle string representation
    @Test
    public void testCircleToString() {
        Circle c = new Circle("Circle", 3);
        assertEquals("Circle radius: 3.0", c.toString());
    }

    @Test
    public void testRhombusArea() {
        Rhombus r = new Rhombus("Rhombus", 4, 5);
        assertEquals(20, r.area(), 0);
    }
    @Test
    public void testRhombusPerimeter() {
        Rhombus r = new Rhombus("Rhombus", 4, 5);
        assertEquals(16, r.perimeter(), 0);
    }
    @Test
    public void testRhombusToString() {
        Rhombus r = new Rhombus("Rhombus", 4, 5);
        assertEquals("Rhombus side: 4.0 height: 5.0", r.toString());
    }

    @Test
    public void testTriangleArea() {
        RightAngledTriangle t = new RightAngledTriangle("Triangle", 3, 4);
        assertEquals(6, t.area(), 0);
    }
    @Test
    public void testTrianglePerimeter() {
        RightAngledTriangle t = new RightAngledTriangle("Triangle", 3, 4);
        assertEquals(12, t.perimeter(), 0);
    }

    @Test
    public void integrationTestShapes() {

        ArrayList<Shape> shapes = new ArrayList<>();

        shapes.add(new Circle("Circle", 3));
        shapes.add(new Circle("Circle", 2));
        shapes.add(new Rhombus("Rhombus", 4, 5));
        shapes.add(new Rhombus("Rhombus", 3, 2));
        shapes.add(new RightAngledTriangle("Triangle", 3, 4));
        shapes.add(new RightAngledTriangle("Triangle", 6, 8));

        double[] expectedAreas = {
                Math.PI*9,
                Math.PI*4,
                20,
                6,
                6,
                24
        };

        double[] expectedPerimeters = {
                2*Math.PI*3,
                2*Math.PI*2,
                16,
                12,
                12,
                24
        };

        for(int i = 0; i < shapes.size(); i++) {
            assertEquals(expectedAreas[i], shapes.get(i).area(), 0);
            assertEquals(expectedPerimeters[i], shapes.get(i).perimeter(), 0);
        }
    }
}
