package org.example.homework;

public abstract class Figure {
    private String nameFigure;
    final double PI = 3.14;


    public  Figure(String nameFigure) {
        this.nameFigure = nameFigure;
    }
    public String getNameFigure(){

        return nameFigure;
    }

    abstract double getfigurePerimeter();

    abstract double figureArea();
}