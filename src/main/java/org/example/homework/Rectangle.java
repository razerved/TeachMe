package org.example.homework;

public class Rectangle extends Figure {
    public Rectangle (String nameFigure, int a, int b){
        super (nameFigure);
        this.a = a;
        this.b = b;
    }
    int a;
    int b;

    @Override
    double figureArea() {
        int s =  a * b;
        return s;
    }

    @Override
    double getfigurePerimeter() {
        double p = (a+b) * 2;
        return p;
    }
}