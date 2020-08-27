package by.komarovigor.service;

import by.komarovigor.bean.Circle;

public class CircleService {

    public double calculateArea(){
        Circle circle = new Circle();
        return  3.14 * circle.getRadius();


    }
}
