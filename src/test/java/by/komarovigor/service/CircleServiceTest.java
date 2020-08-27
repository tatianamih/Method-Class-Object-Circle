package by.komarovigor.service;

import by.komarovigor.bean.Circle;
import org.junit.Test;

import static org.junit.Assert.*;

public class CircleServiceTest {

    @Test
    public void calculateArea() {
        CircleService circleService = new CircleService();
        Circle circle = new Circle();
        double expected = 3.14 * circle.getRadius();
        double actual = circleService.calculateArea();
        assertEquals(expected, actual,0);

    }
}