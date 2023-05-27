package org.example.phone;

public class Phone {

    private String number;
    private String model;
    private int weight;

    private String name;

    public Phone(){

    }

    public Phone(String number, String model){
        this.number = number;
        this.model = model;
    }

    public Phone(String number, String model, int weight) {
        this(number, model);
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void receiveCall(String name){
        System.out.println("Звонит " + name);
    }

    public void receiveCall(String name, String number){
        this.name = name;
        this.number = number;
        System.out.println("Звонит " + name + " " + number);
    }

    public void sendMessage(String... number){
        for (String i : number){
        System.out.println(i);
        }
    }


    @Override
    public String toString() {
        return "Phone{" +
                "number='" + this.number + '\'' +
                ", model='" + this.model + '\'' +
                ", weight=" + this.weight +
                ", name='" + this.name + '\'' +
                '}';
    }



}
