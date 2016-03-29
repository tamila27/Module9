package com.goit.gojavaonline;

import com.goit.gojavaonline.module3_2.Flower;

import java.util.List;

public class ArrayUtility {
    public static int getMinInArray(int[] array){
        int min = 0;
        if(array != null){
            min = array[0];
            for(int i = 0; i < array.length; i++){
                if(array[i] < min){
                    min = array[i];
                }
            }
        }
        return min;
    }

    public static int getMaxInArray(int[] array){
        int max = 0;
        if(array != null){
            max = array[0];
            for(int i = 0; i < array.length; i++ ){
                if(array[i] > max){
                    max = array[i];
                }
            }
        }
        return max;
    }

    public static void quickSort(int[] array, int minIndex, int maxIndex) {
        int i = minIndex;
        int j = maxIndex;

        int middleElement = array[(minIndex + maxIndex)/2];

        do {
            while (array[i] < middleElement) {
                i++;
            }
            while (middleElement < array[j]) {
                j--;
            }
            if ( i <= j ) {
                if( i < j ) {
                    int t = array[i];
                    array[i] = array[j];
                    array[j] = t;
                }
                i++;
                j--;
            }
        } while (i <= j);

        if (minIndex < j) {
            quickSort(array, minIndex, j);
        }
        if (i < maxIndex) {
            quickSort(array, i, maxIndex);
        }
    }

    public static void quickSortForStringArray(String[] array, int minIndex, int maxIndex) {
        int i = minIndex;
        int j = maxIndex;

        String middleElement = array[(minIndex + maxIndex)/2];

        do {
            while(array[i].compareTo(middleElement) < 0){
                i++;
            }
            while(middleElement.compareTo(array[j]) < 0){
                j--;
            }
            if ( i <= j ) {
                if( i < j ) {
                    String t = array[i];
                    array[i] = array[j];
                    array[j] = t;
                }
                i++;
                j--;
            }
        } while (i <= j);

        if (minIndex < j) {
            quickSortForStringArray(array, minIndex, j);
        }
        if (i < maxIndex) {
            quickSortForStringArray(array, i, maxIndex);
        }
    }

    public static void quickSortForFlowerArray(List<Flower> array, int minIndex, int maxIndex) {
        int i = minIndex;
        int j = maxIndex;

        Flower middleElement = array.get((minIndex + maxIndex)/2);

        do {
            while(array.get(i).getFlowerSpecies().compareTo(middleElement.getFlowerSpecies()) < 0){
                i++;
            }
            while(middleElement.getFlowerSpecies().compareTo(array.get(j).getFlowerSpecies()) < 0){
                j--;
            }
            if ( i <= j ) {
                if( i < j ) {
                    Flower t1 = array.get(i);
                    Flower t2 = array.get(j);
                    array.set(j, t1);
                    array.set(i, t2);
                }
                i++;
                j--;
            }
        } while (i <= j);

        if (minIndex < j) {
            quickSortForFlowerArray(array, minIndex, j);
        }
        if (i < maxIndex) {
            quickSortForFlowerArray(array, i, maxIndex);
        }
    }

}
