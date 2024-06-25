package org.example.factory;

public class FurnitureFabric {
    public Furniture createFurniture(FurnitureType type) {
        Furniture furniture = null;
        switch (type){
            case Sofa: {
                furniture = new Sofa();
                break;
            }
            case Chair: {
                furniture = new Chair();
                break;
            }
            case Closet: {
                furniture = new Closet();
                break;
            }
            default: throw new IllegalArgumentException("Unsupported furniture type");
        }

        return furniture;
    }
}
