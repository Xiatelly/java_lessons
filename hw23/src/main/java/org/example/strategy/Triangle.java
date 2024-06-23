package org.example.strategy;

public class Triangle extends Figure{
    private float sideA;
    private float sideB;
    private float sideC;

    public Triangle(float sideA, float sideB, float sideC){
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override
    protected SquareStrategy getSquareStrategy() {
        return new TriangleSquareStrategy(sideA, sideB, sideC);
    }
}
