package com.mucenic;

import java.util.LinkedList;

public class LinkedListCourse {
    //In linked list, the items from the lists are aware of which item comes next after them

    //When we have an array of integers we just have to store the integer value while in a LinkedList we have
    //to store the integer value and a reference to the next integer in the list.

    //The first item is called the head
    //The last item points to null
    //Each item is called a Node


    //As long as you insert in front or in the end of the list, the time complexity will be O(1) - constant time
    //A linked list can grow without the need to resize it.

    //FOR RANDOM ACCESS LINKED LIST IS NOT A GOOD CHOICE
    //IS VERY GOOD TO LOAD A BUNCH OF DATA IN FRONT OF THE LIST

    public static Employee janeJones = new Employee("Alexandru", "Mucenic", 123);
    public static Employee johnDoe = new Employee("Alexandra", "Mucenic", 456);
    public static Employee marySmith = new Employee("Ema", "Mucenic", 789);
    public static Employee mikeWilson = new Employee("Eric", "Mucenic", 963);


    public static void main(String[] args) {

        EmployeeLinkedList list = new EmployeeLinkedList();
        list.addToFront(janeJones);
        list.addToFront(johnDoe);
        list.addToFront(marySmith);
        list.addToFront(mikeWilson);

        list.printList();
        System.out.println(list.getSize());
        System.out.println(list.isEmpty());
        list.removeFromFront();
        System.out.println(list.getSize());
        list.printList();
    }


}
