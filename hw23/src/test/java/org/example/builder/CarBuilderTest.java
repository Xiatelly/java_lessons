package org.example.builder;

import org.junit.Assert;
import org.junit.Test;

public class CarBuilderTest {
    @Test
    public void testCarBuilder(){
        Car car = new CarBuilder()
                .shell("Iron")
                .electric("Full")
                .wheels(4)
                .color("Red")
                .build();
        Assert.assertEquals("Iron", car.getShell());
        Assert.assertEquals("Full", car.getElectric());
        Assert.assertEquals(4, car.getWheels());
        Assert.assertEquals("Red", car.getColor());
    }
}