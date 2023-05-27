package org.example;

import org.example.figures.Circle;
import org.example.figures.Figure;
import org.example.figures.Rectangle;
import org.example.figures.Triangle;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Figure> list = new ArrayList<>();
        list.add(new Triangle(2, 4,4));
        list.add(new Triangle(2, 6,6));
        list.add(new Circle(10));
        list.add(new Rectangle(15,20));
        list.add(new Rectangle(15,30));


        System.out.println("сумма периметра всех фигур " + (list.get(0).perimeter()+list.get(1).perimeter()
                +list.get(2).perimeter()+list.get(3).perimeter()+list.get(4).perimeter()));


    }
}