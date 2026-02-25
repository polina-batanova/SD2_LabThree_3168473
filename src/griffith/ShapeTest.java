package griffith;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShapeTest {

    @Test
    public void testCircleArea() {
        Circle c = new Circle("Circle", 3);
        assertEquals(Math.PI * 9, c.area(), 0);
    }

    @Test
    public void testCirclePerimeter() {
        Circle c = new Circle("Circle", 3);
        assertEquals(2 * Math.PI * 3, c.perimeter(), 0);
    }

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
}
