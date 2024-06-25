package org.example.strategy;

import org.junit.Assert;
import org.junit.Test;

public class SquareStrategyTest {
    @Test
    public void testTriangleSquareStrategy(){
        Triangle triangle = new Triangle(3.0f, 4.0f, 5.0f);
        Assert.assertEquals(6.0f, triangle.calculateSquare(), Math.ulp(1.0f));
    }

    @Test
    public void testRectangleSquareStrategy(){
        Rectangle rectangle = new Rectangle(4.0f, 5.0f);
        Assert.assertEquals(20.0f, rectangle.calculateSquare(), Math.ulp(1.0f));
    }
}