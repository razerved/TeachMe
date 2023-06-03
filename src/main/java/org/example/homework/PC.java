package org.example.homework;

public class PC {
    private String model;
    private String processor;
    private double hz;
    private HDD hdd;
    private RAM ram;

    public PC (String model, String processor, double hz, HDD hdd, RAM  ram)
    {
        this.model = model;
        this.processor = processor;
        this.hz = hz;
        this.hdd = hdd;
        this.ram = ram;
    }
}