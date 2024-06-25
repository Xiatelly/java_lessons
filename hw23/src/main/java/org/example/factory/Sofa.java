package org.example.factory;

public class Sofa implements Furniture{

    @Override
    public FurnitureType getType() {
        return FurnitureType.Sofa;
    }

    @Override
    public float getWidth() {
        return 180.0f;
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
