package com.challenge.daily;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Main {
    static int[] testArray1 = {1, 2, 3, 4, 5};
    static int[] testArray2 = {123, 657, 8, 8, 5};
    static int[] testArray3 = {21, 77, 68, 92, 59};
    static int[] testArray4 = {-12, 23, -50, 41, -13};

    public static void main(String[] args) {
        int[] outputArray = productArray(testArray4);
        for (int x: outputArray
             ) {
            System.out.println(x);
        }
//        System.out.println(outputArray);
    }

    public static int[] productArray(int[] inputArray) {
        int arrayLength = inputArray.length;
        int counter = 0;
        int[] outputArray = new int[arrayLength];

        while (counter < arrayLength) {
            int finalCounter = counter;
            int[] arrayWithoutCurrentIndex = Arrays.stream(inputArray).filter(i -> i!=inputArray[finalCounter]).toArray();
            int x = 0;
            int y =1 ;
            while (x < arrayWithoutCurrentIndex.length){
                y = y * arrayWithoutCurrentIndex[x];
                x+=1;
            }
            outputArray[counter] = y;
            counter +=1;
        }

        return outputArray;
    }
}
