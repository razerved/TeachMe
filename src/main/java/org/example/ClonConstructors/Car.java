package org.example.ClonConstructors;

import java.util.Arrays;

public class Car {
    private String model;
    private String color;
    private String[] spareParts;

    public Car (String model, String color, String[] spareParts)
    {
        this.model = model;
        this.color = color;
        this.spareParts = Arrays.copyOf(spareParts, spareParts.length); // когда работаем с массивами
        // надо убедиться, что мы вкладываем не ссылку, а значение
    }

    public Car (Car obj)
    {
        this.model = obj.model;
        this.color = obj.color;
        this.spareParts = Arrays.copyOf(obj.spareParts, obj.spareParts.length);
    }

    public String getColor() {
        return color;
    }

    public String getModel() {
        return model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setModel(String model) {
        this.model = model;
    }


    public String[] getSpareParts() {
        return spareParts;
    }
}