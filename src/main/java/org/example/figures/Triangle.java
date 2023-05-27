package org.example.figures;

public class Triangle implements Figure{

    private int sideA;
    private int sideB;
    private int sideC;

    public Triangle(int sideA, int sideB, int sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }


    public int radius() {
        int i = (int) ((sideA + sideB + sideC) / 2.0);
        int area = (int)Math.sqrt(i * (i - sideA) * (i - sideB) * (i - sideC));
        return area;
    }

    @Override
    public int perimeter() {
        int perimeter = sideA + sideB + sideC;
        return perimeter;
    }

    @Override
    public String mas() {
        return "Это треугольник";
    }

}
