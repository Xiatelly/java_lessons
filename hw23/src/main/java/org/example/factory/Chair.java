package org.example.factory;

public class Chair implements Furniture{
    @Override
    public FurnitureType getType() {
        return FurnitureType.Chair;
    }

    @Override
    public float getWidth() {
        return 50.0f;
    }

    @Override
    public float getHeight() {
        return 60.0f;
    }

    @Override
    public float getLength() {
        return 50.0f;
    }
}
