package org.example.builder;

public class Car {
    private String shell;
    private String electric;
    private int wheels;
    private String color;

    public String getShell() {
        return shell;
    }

    public String getElectric() {
        return electric;
    }

    public int getWheels() {
        return wheels;
    }

    public String getColor() {
        return color;
    }

    public Car(String shell, String electric, int wheels, String color){
        this.shell = shell;
        this.electric = electric;
        this.wheels = wheels;
        this.color = color;
    }

}
