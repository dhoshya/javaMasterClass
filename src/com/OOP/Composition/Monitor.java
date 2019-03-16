package com.OOP.Composition;

public class Monitor {

    private String model;
    private String manufacturer;
    private String size;
    private Resolution nativeResolution;

    public Monitor(String model, String manufacturer, String size, Resolution nativeResolution) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.size = size;
        this.nativeResolution = nativeResolution;
    }

    public void drawPixel(int x, int y, String colour){
        System.out.println("Drawing pixel at x "+x+" and y "+y+" in colour "+colour);
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public Resolution getResolution() {
        return nativeResolution;
    }

    public void setResolution(Resolution nativeResolution) {
        this.nativeResolution = nativeResolution;
    }
}
