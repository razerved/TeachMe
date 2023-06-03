package org.example.ClonConstructors;

public class Main {
    public static void main(String[] args) {
        Car bmw = new Car("BMW", "Black", new String[] {"Wheel", "Windows"});
        Car bmwAdv = bmw;

        // Car -> ссылочный тип данных, он в себе хранит адрес
        // машина1 = машина2, в машину1 сохраняю адрес машины2
        // hasCode
        System.out.println("Class bmw: " + bmw);
        System.out.println("Class num hashCode: " + bmw.hashCode()); // long -> hashCode

        System.out.println();

        System.out.println("Class bmw: " + bmwAdv);
        System.out.println("Class num hashCode: " + bmwAdv.hashCode()); // long -> hashCode

        bmwAdv.setColor("Red");
        System.out.println(bmw.getColor());

        Car bmwNew = new Car(bmw);
        System.out.println();

        System.out.println("Class bmwNew: " + bmwNew);
        System.out.println("Class bmwNew hashCode: " + bmwNew.hashCode()); // long -> hashCode
        bmwNew.setColor("White");

        System.out.println();

        System.out.println("bmw color: " + bmw.getColor());
        System.out.println("bmwNew color: " + bmwNew.getColor());

        System.out.println();

        System.out.println(bmw.getSpareParts()[0]);

        System.out.println();

        System.out.println(bmwNew.getSpareParts()[1]);
    }
}