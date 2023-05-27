package org.example.figures;

public class Rectangle implements Figure {

    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }



    @Override
    public int radius() {
        int area = width * height;
        return area;
    }

    @Override
    public int perimeter() {
        int perimeter = (width + height) * 2;
        return perimeter;
    }

    @Override
    public String mas() {
        return "Это прямоугольник";
    }

}
