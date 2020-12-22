package com.challenge.daily;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    static Integer[] testArray1 = {1,2,3,4};
    static Integer[] testArray2 = {3,1,2,4};
    static Integer[] testArray3 = {0,-1,15,1};

    public static void main(String[] args) {
	// write your code here
        System.out.println(arraySorter(testArray3));

    }
    public static int arraySorter (Integer[] inputArray){
        int firstMissingInt = 1;
        List<Integer> arrayToList = new ArrayList(Arrays.asList(inputArray));
        while (arrayToList.contains(firstMissingInt)){
//            System.out.println(firstMissingInt + " is in the array");
            firstMissingInt +=1;
        }
//        System.out.println(firstMissingInt + " Is not in the array");
        return firstMissingInt;
    }

}
