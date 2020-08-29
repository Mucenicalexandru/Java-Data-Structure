package com.mucenic.hashtable;

import java.util.ArrayList;

public class SimpleHashtable {

    //the array
    private Employee [] hashtable;

    //Constructor that will create our array
    public SimpleHashtable(){
        hashtable = new Employee[10];
    }

    //Method - adding employees to the hashedTable
    public void add(String key, Employee employee){
        int hashedKey = hashKey(key);
        if(hashtable[hashedKey] != null){
            System.out.println("Sorry, the position is already occupied");
        }else{
            hashtable[hashedKey] = employee;
        }
    }

    //Method - for retrieving from hashTable
    public Employee get(String key){
        int hashedKey = hashKey(key);
        return hashtable[hashedKey]; // Constant time O(1)
    }

    //Method - this is exactly what hash function does
    //THE HASHED VALUE IS ALWAYS AN INTEGER
    private int hashKey(String key){
        return key.length() % hashtable.length;
    }

    public void printHashtable(){
        for (int i = 0; i < hashtable.length; i++){
            System.out.println(hashtable[i]);
        }
    }

}
