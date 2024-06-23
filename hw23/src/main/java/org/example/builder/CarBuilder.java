package org.example.builder;

public class CarBuilder {
    private String shell;
    private String electric;
    private int wheels;
    private String color;

    public void setShell(String shell) {
        this.shell = shell;
    }

    public void setElectric(String electric) {
        this.electric = electric;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Car build(){
        return new Car(shell, electric, wheels, color);
    }
}
