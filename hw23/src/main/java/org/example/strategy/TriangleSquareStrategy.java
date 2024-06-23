package org.example.strategy;

public class TriangleSquareStrategy implements SquareStrategy{
    private float sideA;
    private float sideB;
    private float sideC;

    public TriangleSquareStrategy(float sideA, float sideB, float sideC){
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override
    public float calculateSquare() {
        float p = (sideA + sideB + sideC) / 2;
        return (float) Math.sqrt(p * (p - sideA) * (p - sideB) * (p - sideC));
    }
}
