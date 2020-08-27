package by.komarovigor.bean;

import org.junit.Test;

import static org.junit.Assert.*;

public class CircleTest {

    @Test
    public void getRadius() {
        var circle = new Circle(0.0);
        circle.setRadius(40.5);
        double expected = 40.5;
        double actual = circle.getRadius();
        assertEquals(expected, actual, 0);
    }

    @Test
    public void testEqualsTrue() {
        var circle1 = new Circle();
        circle1.setRadius(40.5);

        var circle2 = new Circle();
        circle2.setRadius(40.5);

        boolean expected = true;
        boolean actual = circle1.equals(circle2);
        assertEquals(expected, actual);

    }

    @Test
    public void testEqualsFalse() {
        var circle1 = new Circle();
        circle1.setRadius(40.5);

        var circle2 = new Circle();
        circle2.setRadius(40.7);

        boolean expected = false;
        boolean actual = circle1.equals(circle2);
        assertEquals(expected, actual);

    }


    @Test
    public void testHashCode() {
        var circle = new Circle();
        long expected = 31;
        long actual = circle.hashCode();
        assertEquals(expected,actual);
    }

    @Test
    public void testToString() {
        var circle = new Circle();
        String expected = "Circle{radius=0.0}";
        String actual = circle.toString();
        assertEquals(expected, actual);
    }
}