package org.example.builder;

public class CarBuilder {
    private String shell;
    private String electric;
    private int wheels;
    private String color;

    public CarBuilder shell(String shell) {
        this.shell = shell;
        return this;
    }

    public CarBuilder electric(String electric) {
        this.electric = electric;
        return this;
    }

    public CarBuilder wheels(int wheels) {
        this.wheels = wheels;
        return this;
    }

    public CarBuilder color(String color) {
        this.color = color;
        return this;
    }

    public Car build(){
        return new Car(shell, electric, wheels, color);
    }
}
