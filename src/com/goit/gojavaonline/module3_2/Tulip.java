package com.goit.gojavaonline.module3_2;

public class Tulip extends Flower {
    public Tulip(FlowerColor flowerColor){
        super(flowerColor);
        //System.out.println(flowerColor + " tulip created successfully.");
    }

    public FlowerSpecies getFlowerSpecies(){
        return FlowerSpecies.TULIP;
    }
}
