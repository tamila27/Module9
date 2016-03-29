package com.goit.gojavaonline.module3_2;

public class FlowerFactory {

    public static Flower getRandomFlower(){
        Flower flower = new Aster(FlowerColor.BLUE);

        //Min + (int)(Math.random() * ((Max - Min) + 1))

        if(FlowerSpecies.values()!=null && FlowerSpecies.values().length > 0){
            int flowerSpiciesOrdinal = (int)(Math.random()* FlowerSpecies.values().length);
            int flowerColorOrdinal = (int)(Math.random()* FlowerColor.values().length);
            FlowerSpecies flowerSpicies = FlowerSpecies.values()[flowerSpiciesOrdinal];
            FlowerColor flowerColor = FlowerColor.values()[flowerColorOrdinal];
            switch (flowerSpicies){
                case ASTER:
                    flower = new Aster(flowerColor);
                    break;
                case ROSE:
                    flower = new Rose(flowerColor);
                    break;
                case TULIP:
                    flower = new Tulip(flowerColor);
                    break;
                case CAMOMILE:
                    flower = new Camomile(flowerColor);
                    break;
            }
        }

        return flower;
    }
}
