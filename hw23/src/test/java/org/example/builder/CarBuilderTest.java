package org.example.builder;

import org.junit.Assert;
import org.junit.Test;

public class CarBuilderTest {
    @Test
    public void testCarBuilder(){
        CarBuilder carBuilder = new CarBuilder();
        carBuilder.setShell("Iron");
        carBuilder.setElectric("Full");
        carBuilder.setWheels(4);
        carBuilder.setColor("Red");
        Car car = carBuilder.build();
        Assert.assertEquals("Iron", car.getShell());
        Assert.assertEquals("Full", car.getElectric());
        Assert.assertEquals(4, car.getWheels());
        Assert.assertEquals("Red", car.getColor());
    }
}