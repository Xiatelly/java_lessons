package org.example.strategy;

public class RectangleSquareStrategy implements SquareStrategy{
    private float sideA;
    private float sideB;
    public RectangleSquareStrategy(float sideA, float sideB){
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public float calculateSquare() {
        return sideA * sideB;
    }
}
