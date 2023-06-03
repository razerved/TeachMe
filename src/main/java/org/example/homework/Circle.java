package org.example.homework;

public class Circle extends Figure{
    public Circle(String nameFigure, double r){
        super (nameFigure);
        this.r = r;
    }
    double r;

    @Override
    double figureArea() {
        double s = PI * r;
        return s;
    }

    @Override
    double getfigurePerimeter() {
        double p = 2 * PI * r;
        return p;
    }
}