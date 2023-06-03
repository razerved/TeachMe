package org.example.AbstractClasses;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("BMW", "Blue");

        Car car2 = new Car("Mercedes", "White"){
            @Override
            void getData() {
                System.out.println("This is anonymous class...");
            }

            @Override
            void getMsg() {
                System.out.println("This is anonymous class msg...");
            }
        };

        car.getData();
        car2.getData();

        Car car3 = new Car("Opel", "Red") {
            @Override
            public int compareTo(Object o) {
                return super.compareTo(o);
            }
        };
    }
}