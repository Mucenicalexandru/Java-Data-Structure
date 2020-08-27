package com.mucenic;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Lists {
    //List is abstract data type
    //doesn't dictate how date is organized
    //When we talk about abstract data type, interfaces are involved
    //Popular classes that implement the List interface are : ArrayList, LinkedList, Vector etc



    public static void main(String[] args) {
        List<Object> myArrayList = new ArrayList<>();
        List<Integer> myLinkedList = new LinkedList<>();

        myArrayList.add("Alexandru");
        myLinkedList.add(101);

        System.out.println(myArrayList);
        System.out.println(myLinkedList);


    }


}
