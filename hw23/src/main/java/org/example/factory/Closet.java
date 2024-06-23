package org.example.factory;

public class Closet implements Furniture{
    @Override
    public FurnitureType getType() {
        return FurnitureType.Closet;
    }

    @Override
    public float getWidth() {
        return 100.0f;
    }

    @Override
    public float getHeight() {
        return 200.0f;
    }

    @Override
    public float getLength() {
        return 40.0f;
    }
}
