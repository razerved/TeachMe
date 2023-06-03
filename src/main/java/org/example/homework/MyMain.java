package org.example.homework;

public class MyMain {
    public static void main(String[] args) {
        ArrayFigures();
    }
    public static void ArrayFigures(){
        Figure[] array ={
                new Circle("Circle1", 5),
                new Triangle("Triangle", 5, 3, 7),
                new Rectangle("Rectangle", 5, 8),
                new Rectangle("Rectangle", 9, 7),
                new Circle("Circle2", 4)
        };

        double sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum += array[i].getfigurePerimeter();
        }
        System.out.println();
        System.out.println("The sum of the perimeters of all shapes in the array " + sum);
    }
}