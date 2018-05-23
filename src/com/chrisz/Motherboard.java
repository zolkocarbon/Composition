package com.chrisz;

public class Motherboard {
    private String model;
    private String manufacturer;
    private int ramSlots;

    public Motherboard(String model, String manufacturer, int ramSlots) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.ramSlots = ramSlots;
    }

    public void loadProgram(String programName) {
        System.out.println("Program " + programName + " is now loading.");
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getRamSlots() {
        return ramSlots;
    }
}
