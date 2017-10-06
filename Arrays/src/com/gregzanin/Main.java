package com.gregzanin;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        printArray(sortIntegers(getIntegers(5)));
    }

    public static Integer[] getIntegers(Integer capacity){
        Integer[] valuesInt = new Integer[capacity];
        for (int i=0;i<valuesInt.length;i++){
            System.out.println("What is the " + (i+1) + "º integer of the array?");
            valuesInt[i]= sc.nextInt();
        }
        return valuesInt;
    }

    public static Integer[] sortIntegers(Integer[] sortingArray) {
//        int[] sortedArray = new int[sortingArray.length];
//        for (int i=0;i<sortingArray.length;i++){
//            sortedArray[i] = sortingArray[i];
//        }
//        boolean flag = true;
//        int temp;
//        while(flag) {
//            flag = false;
//            for(int i=0;i<sortedArray.length-1;i++){
//                if (sortedArray[i] < sortedArray[i+1]){
//                    temp = sortedArray[i];
//                    sortedArray[i] = sortedArray[i+1];
//                    sortedArray[i+1] = temp;
//                    flag = true;
//                }
//            }
//        }
        Arrays.sort(sortingArray, Collections.reverseOrder());
        return sortingArray;
    }

    public static void printArray(Integer[] intArray){
        for(int i=0;i<intArray.length;i++){
            System.out.println((i+1) + "º value: " + intArray[i]);
        }
    }
}
