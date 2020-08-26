package com.mucenic;

import java.util.Arrays;

public class ArraysSortAlgorithms {
    public static void main(String[] args) {
        //Bubble sort - least efficient algorithm - very slow - not used very often
        //O(n2) time complexity  - quadratic - approximate we don't do math when deciding time complexity
        //it will take 100 steps to sort 10 elements (while loops and for loops) (for loops in for loops)

        int [] intArray = new int[7];
        intArray[0] = 20;
        intArray[1] = 35;
        intArray[2] = -15;
        intArray[3] = 7;
        intArray[4] = 55;
        intArray[5] = 1;
        intArray[6] = -22;

        System.out.println(Arrays.toString(intArray));

        // int unsortedPartitionIndex = 6; // the last index of the unsorted array
        // int i = 0; // index to traverse the array from left to right

        for(int lastUnsortedIndex = intArray.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--){
            for(int i = 0; i < lastUnsortedIndex; i++){
                if(intArray[i] > intArray[i+1]){
                    swap(intArray, i, i+1);
                }
            }
        }

        System.out.println(Arrays.toString(intArray));
    }

    public static void swap(int[] array, int i, int j){
        if(i == j){
            return;
        }

        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
