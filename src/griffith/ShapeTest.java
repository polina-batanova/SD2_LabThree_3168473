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

    // test rhombus area
    @Test
    public void testRhombusArea() {
        Rhombus r = new Rhombus("Rhombus", 4, 5);
        assertEquals(20, r.area(), 0);
    }

    // test rhombus perimeter
    @Test
    public void testRhombusPerimeter() {
        Rhombus r = new Rhombus("Rhombus", 4, 5);
        assertEquals(16, r.perimeter(), 0);
    }

    // test rhombus string representation
    @Test
    public void testRhombusToString() {
        Rhombus r = new Rhombus("Rhombus", 4, 5);
        assertEquals("Rhombus side: 4.0 height: 5.0", r.toString());
    }

    // test triangle area
    @Test
    public void testTriangleArea() {
        RightAngledTriangle t = new RightAngledTriangle("Triangle", 3, 4);
        assertEquals(6, t.area(), 0);
    }

    // test triangle perimeter
    @Test
    public void testTrianglePerimeter() {
        RightAngledTriangle t = new RightAngledTriangle("Triangle", 3, 4);
        assertEquals(12, t.perimeter(), 0);
    }

    // test triangle string representation
    @Test
    public void testTriangleToString() {
        RightAngledTriangle t = new RightAngledTriangle("Triangle", 3, 4);
        assertEquals("Triangle base: 3.0 height: 4.0", t.toString());
    }

    // integration test
    @Test
    public void integrationTestShapes() {

        // method for storing different types of Shape objects
        ArrayList<Shape> shapes = new ArrayList<>();

        // add two Circles
        shapes.add(new Circle("Circle", 3));
        shapes.add(new Circle("Circle", 2));

        // add two Rhombuses
        shapes.add(new Rhombus("Rhombus", 4, 5));
        shapes.add(new Rhombus("Rhombus", 3, 2));

        // add two Right Angled Triangles
        shapes.add(new RightAngledTriangle("Triangle", 3, 4));
        shapes.add(new RightAngledTriangle("Triangle", 6, 8));

        // expected area values
        double[] expectedAreas = {
                Math.PI*9, // circle radius 3
                Math.PI*4, // circle radius 2
                20, // rhombus
                6, // rhombus
                6, // triangle
                24 // triangle
        };

        // expected perimeter values
        double[] expectedPerimeters = {
                2*Math.PI*3, // circle radius 3
                2*Math.PI*2, // circle radius 2
                16, // rhombus
                12, // rhombus
                12, // triangle
                24 // triangle
        };

        // loop for comparing actual results with expected values
        for(int i = 0; i < shapes.size(); i++) {
            assertEquals(expectedAreas[i], shapes.get(i).area(), 0);
            assertEquals(expectedPerimeters[i], shapes.get(i).perimeter(), 0);
        }
    }
}
