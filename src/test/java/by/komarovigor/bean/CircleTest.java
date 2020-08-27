package by.komarovigor.bean;

import org.junit.Test;

import static org.junit.Assert.*;

public class CircleTest {

    @Test
    public void getRadius() {
        var circle = new Circle();
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
    }

    @Test
    public void testToString() {
    }
}