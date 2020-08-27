package com.mucenic;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListJDK {
    //The class is actually a Double Linked List implementation
    //Implements List and Deque interface
    //We can use the class with any type of objects
    //We don't need to write the Node class, is already implemented

    public static Employee janeJones = new Employee("Alexandru", "Mucenic", 123);
    public static Employee johnDoe = new Employee("Alexandra", "Mucenic", 456);
    public static Employee marySmith = new Employee("Ema", "Mucenic", 789);
    public static Employee mikeWilson = new Employee("Eric", "Mucenic", 963);
    public static Employee billEnd = new Employee("Bill", "End", 548);

    public static void main(String[] args) {
        LinkedList<Employee> list = new LinkedList<>();
        list.addFirst(janeJones);
        list.addFirst(johnDoe);
        list.addFirst(marySmith);
        list.addFirst(mikeWilson);

        Iterator iter = list.iterator();
        System.out.print("HEAD - > ");
        while (iter.hasNext()){
            System.out.print(iter.next());
            System.out.print(" <=> ");
        }
        System.out.println("null");
//        for(Employee employee : list){
//            System.out.print(employee);
//        }

        list.addLast(billEnd);
        
    }
}
