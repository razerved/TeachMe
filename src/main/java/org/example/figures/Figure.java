package org.example.figures;

public abstract class Figure {
    private int height;
    private int width;
    private int round;
    private int partLength;

    public Figure() {
    }


    public Figure(int height, int width, int round, int partLength) {
        this.height = height;
        this.width = width;
        this.round = round;
        this.partLength = partLength;
    }

    void areaCalculation(){

    }



}
