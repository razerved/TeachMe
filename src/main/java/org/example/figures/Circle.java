package org.example.figures;

public class Circle implements Figure {

    int radius;


    public Circle(int radius) {
        this.radius = radius;
    }


    @Override
    public int radius() {
        int area = (int)Math.PI * radius * radius;
       return area;
    }

    @Override
    public int perimeter() {
        int perimeter = (int) (2 * Math.PI * radius);
        return perimeter;
    }
    @Override
    public String mas() {
        return "Это круг";
    }




}
