package com.mucenic;

import java.util.Arrays;

public class ArraysSelectionSort {
    public static void main(String[] args) {

        //Selection sort is O(n2) time complexity - quadratic (it will take 100 steps to sort 10 items)
        //Unstable algorithm - bubble sort is stable algorithm (if two elements are equal we let them like that)
        //Unstable is not a big problem for numbers but be aware of objects

        int [] intArray = new int[7];
        intArray[0] = 20;
        intArray[1] = 35;
        intArray[2] = -15;
        intArray[3] = 7;
        intArray[4] = 55;
        intArray[5] = 1;
        intArray[6] = -22;
        System.out.println("Unsorted : " + Arrays.toString(intArray));
        /**
         *int lastUnsortedIndex = intArray.length-1;
         *int i = 1; index to traverse the array from left to right
         *int largest = 0;  we say that the first element is the largest and we compare it to the other elements
         */

        //we consider the first element the largest, we compare to each remaining element from the list
        //if we find an element bigger than it, the bigger element will be the new largest
        //and we start again the loop to see if we find a bigger element or not
        //having the biggest element, we set it's position to the last index in the list

        for(int lastUnsortedIndex = intArray.length-1; lastUnsortedIndex > 0; lastUnsortedIndex-- ){

            int largest = 0;

            for(int i = 1; i <= lastUnsortedIndex; i++){
                if(intArray[i]>intArray[largest]){
                    largest = i;
                }
            }

            swap(intArray, largest, lastUnsortedIndex);

        }
        System.out.println("Sorted : " + Arrays.toString(intArray));

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
