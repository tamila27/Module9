package com.goit.gojavaonline.module3_2;

public class Rose extends Flower {
    public Rose(FlowerColor flowerColor){
        super(flowerColor);
        //System.out.println(flowerColor + " rose created successfully.");
    }

    public FlowerSpecies getFlowerSpecies(){
        return FlowerSpecies.ROSE;
    }
}
