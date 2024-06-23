package org.example.strategy;

public abstract class Figure {
    protected abstract SquareStrategy getSquareStrategy();
    public float calculateSquare(){
        return getSquareStrategy().calculateSquare();
    }
}
