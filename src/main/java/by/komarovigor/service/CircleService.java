package by.komarovigor.service;

import by.komarovigor.bean.Circle;

public class CircleService {

    public double calculateArea(){
        Circle circle = new Circle();
        double r = 3.14 * circle.getRadius();

        return r;
    }
}
