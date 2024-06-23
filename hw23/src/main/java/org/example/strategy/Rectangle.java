package org.example.strategy;

public class Rectangle extends Figure{
    private float sideA;
    private float sideB;
    public Rectangle(float sideA, float sideB){
        this.sideA = sideA;
        this.sideB = sideB;
    }
    @Override
    protected SquareStrategy getSquareStrategy() {
        return new RectangleSquareStrategy(sideA, sideB);
    }
}
