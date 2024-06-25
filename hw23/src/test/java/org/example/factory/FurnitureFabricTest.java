package org.example.factory;


import org.junit.Assert;
import org.junit.Test;

public class FurnitureFabricTest {

    @Test
    public void testFurnitureFabric(){
        FurnitureFabric fabric = new FurnitureFabric();
        Furniture furnitureSofa = fabric.createFurniture(FurnitureType.Sofa);
        Assert.assertEquals(FurnitureType.Sofa, furnitureSofa.getType());
    }

}