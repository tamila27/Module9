package com.goit.gojavaonline;

import com.goit.gojavaonline.module3_2.Bouquet;
import com.goit.gojavaonline.module3_2.FlowerFactory;

public class Runner {
    public static final int FLOWERS_COUNT = 10;
    public static String encryptedTable;
    public static void main(String[] args){

        int flowersCount = getFlowersCount(args);

        Bouquet bouquet = new Bouquet();
        for(int i = 0; i < flowersCount; i++){
            bouquet.addFlower(FlowerFactory.getRandomFlower());
        }

        printFlowersInBouquetTable(bouquet);

        printEncryptedFlowersInBouquetTable(bouquet);

        printDecryptedFlowersInBouquetTable();

    }
    private static int getFlowersCount(String[] args){
        int flowersCount;
        if(args != null && args.length != 0){
            String flowersCountValue = args[0];
            try {
                flowersCount = Integer.parseInt(flowersCountValue);
                if(flowersCount <= 0){
                    System.out.println("Program argument should be positive integer value. Using default value "+ FLOWERS_COUNT);
                    flowersCount = FLOWERS_COUNT;
                }
            } catch (NumberFormatException e) {
                System.out.println("Specified program argument is not an integer value. Using default value "+ FLOWERS_COUNT);
                flowersCount = FLOWERS_COUNT;
            }
        } else {
            flowersCount = FLOWERS_COUNT;
        }
        return flowersCount;
    }

    private static void printFlowersInBouquetTable(Bouquet bouquet){
        if(bouquet != null){
            System.out.printf(bouquet.toTableString());
        }
    }

    private static void printEncryptedFlowersInBouquetTable(Bouquet bouquet){
        if(bouquet != null){
            encryptedTable = EncryptionUtility.encryptString(bouquet.toTableString()).toString();
            System.out.println(encryptedTable);
        }
    }

    private static void printDecryptedFlowersInBouquetTable(){
        if(encryptedTable != null){
            System.out.println(EncryptionUtility.decryptString(encryptedTable));
        }
    }
}
