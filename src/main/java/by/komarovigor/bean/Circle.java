package by.komarovigor.bean;

import java.util.Objects;

public class Circle {
    private double Radius;

    public Circle() {

    }

    public double getRadius() {
        return Radius;
    }

    public void setRadius(double radius) {
        Radius = radius;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        return Double.compare(circle.Radius, Radius) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(Radius);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "Radius=" + Radius +
                '}';
    }
}
