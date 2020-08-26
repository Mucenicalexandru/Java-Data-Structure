package com.mucenic;

import java.util.Arrays;

public class ArraysInsertionSort {
    public static void main(String[] args) {
        int [] intArray = new int[7];
        intArray[0] = 20;
        intArray[1] = 35;
        intArray[2] = -15;
        intArray[3] = 7;
        intArray[4] = 55;
        intArray[5] = 1;
        intArray[6] = -22;

        //int [] intArray = {20, 35, -15, 7, 55, 1, -22}
        //For this sorting method we don't swap elements
        //It's a O(n2) time complexity - like bubble and selection sort

        //assuming element at index 0 is the sorted partition
        for(int firstUnsortedIndex = 1; firstUnsortedIndex<intArray.length; firstUnsortedIndex++){
            int newElement = intArray[firstUnsortedIndex];

            int i;

            for(i = firstUnsortedIndex; i > 0 &&  intArray[i-1] > newElement; i--){
                //shifting from left to right
                intArray[i] = intArray[i-1];
            }
            intArray[i] = newElement;
        }
        System.out.println(Arrays.toString(intArray));
    }
}
