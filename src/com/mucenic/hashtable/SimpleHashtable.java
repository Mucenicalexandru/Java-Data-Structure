package com.mucenic.hashtable;

import java.util.ArrayList;

public class SimpleHashtable {

    //the array
    private StoredEmployee [] hashtable;

    //Constructor that will create our array
    public SimpleHashtable(){
        hashtable = new StoredEmployee[10];
    }

    //Method - adding employees to the hashedTable
    public void add(String key, Employee employee){
        int hashedKey = hashKey(key);
        if (occupied(hashedKey)){
            int stopIndex = hashedKey;
            if(hashedKey == hashtable.length-1){
                hashedKey = 0;
            }else{
                hashedKey++;
            }

            while(occupied(hashedKey) && hashedKey != stopIndex){
                hashedKey = (hashedKey + 1) % hashtable.length;
            }
        }

        if(occupied(hashedKey)){
            System.out.println("Sorry, the array is full");
        }else{
            hashtable[hashedKey] = new StoredEmployee(key, employee);
        }
    }

    //Method - for retrieving from hashTable
    public Employee get(String key){
        int hashedKey = findKey(key);
        if(hashedKey == -1){
            return null;
        }else{
            return hashtable[hashedKey].employee; // Constant time O(1)
        }

    }

    public Employee remove(String key){
        int hashedKey = findKey(key);
        if(hashedKey == -1){
            return null;
        }

        Employee employee = hashtable[hashedKey].employee;
        hashtable[hashedKey] = null;
        return employee;
    }

    private int findKey(String key){
        int hashedKey = hashKey(key);
        if(hashtable[hashedKey] != null &&
                hashtable[hashedKey].key.equals(key)){
            return hashedKey;
        }

        int stopIndex = hashedKey;
        if (hashedKey == hashtable.length - 1) {
            hashedKey = 0;
        } else {
            hashedKey++;
        }

        while (hashedKey != stopIndex &&
                hashtable[hashedKey] != null &&
                    !hashtable[hashedKey].key.equals(key)) {
            hashedKey = (hashedKey + 1) % hashtable.length;
        }

        if(hashtable[hashedKey] != null &&
                hashtable[hashedKey].key.equals(key)){
            return hashedKey;
        }else{
            return -1;
        }

    }

    //Method - this is exactly what hash function does
    //THE HASHED VALUE IS ALWAYS AN INTEGER
    private int hashKey(String key){
        return key.length() % hashtable.length;
    }

    private boolean occupied(int index){
        return hashtable[index] != null;
    }

    public void printHashtable(){
        for (int i = 0; i < hashtable.length; i++){
            if(hashtable[i] == null){
                System.out.println("The slot is empty");
            }else{
                System.out.println("Position " + i + ": " + hashtable[i].employee);
            }
        }
    }

}
