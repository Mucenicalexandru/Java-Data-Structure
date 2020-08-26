package com.mucenic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class ArraysDataStructure {

    public static void main(String[] args) {
        //array - not a dynamic data structure -> once created you cannot change it's size
        //all elements of an array are stored in one contiguous block in the memory (sharing a common border)
        //the array is one huge block

        int [] intArray = new int[7]; //we specify the size of the array to inform the JVM how much memory to allocate
        //if we have an array of strings, the elements of the arrays are actually object references to the string instances
        //and all the elements will have the same size in the memory

        //if we know the element index, we follow only 3 steps to find the memory address of that element : x + i * y
        //1.multiply the size of element (4bytes) with the index
        //2.get the start address of the array
        //3.add to the start address the multiplication value and we get the element memory location

        //WHEN WE KNOW THE INDEX WE HAVE O(1) time complexity - constant
        //WHEN WE LOOP THROUGH THE ARRAY WE HAVE O(n) time complexity - linear

        //x the array memory location, i the index, y the element memory.
        //Example x = 12 (Start address of the array); i the index (0...6); y = 4bytes(because we have integers)
        //So the address of "35" is 12 + 1 * 4 = 16
        //THIS IS THE REASON WHY INDEXES ARE 0 (ZERO) BASED. The first element is equal to Start address of array
        intArray[0] = 20;
        intArray[1] = 35;
        intArray[2] = -15;
        intArray[3] = 7;
        intArray[4] = 55;
        intArray[5] = 1;
        intArray[6] = -22;

        for(int i = 0; i< intArray.length; i++){
            System.out.println(intArray[i]);
        }

    }
}
