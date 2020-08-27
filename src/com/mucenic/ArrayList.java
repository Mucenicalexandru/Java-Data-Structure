package com.mucenic;

import java.util.Arrays;
import java.util.List;

public class ArrayList {

     //SIZE the actual number of the items that are in the list
     //CAPACITY the max number of the items that the list can hold before it will increase it's capacity
    //resizeable array implementation of the List Interface
    //is not good for inserting and removing items to the list in any position other than the end
    //is not good for searching when you don't have the index
    //inserting / removing (elements will be shifted around)

    public static void main(String[] args) {
        List<Employee> employeeList = new java.util.ArrayList<>(); // default capacity is 10

        employeeList.add(new Employee("Alex", "Mucenic", 123));
        employeeList.add(new Employee("John", "Doe", 456));
        employeeList.add(new Employee("Ada", "Mucenic", 789));
        employeeList.add(new Employee("Mike", "John", 741));

        employeeList.forEach(employee -> System.out.println(employee));

        System.out.println(employeeList.get(1)); // constant time O(1)
        System.out.println(employeeList.isEmpty()); // false

        //replace an employee
        employeeList.set(2, new Employee("John", "Adam", 568)); // constant time

        System.out.println(employeeList.size());


        //now we have the employees in an Employee array
        Employee [] employeeArray = employeeList.toArray(new Employee[employeeList.size()]);
        for(Employee employee : employeeArray){
            System.out.println(employee);
        }


        System.out.println(employeeList.indexOf(new Employee("John", "Doe", 456)));
        

        employeeList.remove(2);
        employeeList.forEach(employee -> System.out.println(employee));

    }
}
