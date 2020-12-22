package com.challenge.daily;

//    Could subtract a number from the list from k and see if that is equal
//    remaining number...
//
//    Could also add the 0th to the others and proceed through...

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

//
public class Main {
    static Integer[] testArray1 = {1,2,3,4};
    static Integer[] testArray2 = {50, 67, 89, -100};
    static Integer[] testArray3 = {12,15,777,6};
    static Integer[] testArray4 = {90, 50, 67, 3, 4};

    static int k1 = 4;
    static int k2 = -11;
    static int k3 = 27;
    static int k4 = 7;



    public static void main(String[] args) {
	// write your code here
        try {
            doesItAddToK(testArray3, k3);
        }
        catch (ArrayIndexOutOfBoundsException e){

        }
    }

    public static boolean doesItAddToK (Integer[] inputArray, int kNumber) throws ArrayIndexOutOfBoundsException{
        boolean doesItAddToK = false;


        for (Integer i: inputArray
             ) {
            Object[] pairInt = Arrays.stream(inputArray).filter(j -> kNumber - i ==j).toArray();

            System.out.println(i + " + " + pairInt[0] +  " make " + kNumber);
        }

        return true;
    }
}
