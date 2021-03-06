package com.mucenic.hashtable;

public class Main {
    public static void main(String[] args) {
        Employee janeJones = new Employee("Jane", "Jones", 123);
        Employee johnDoe = new Employee("John", "Doe", 4567);
        Employee marySmith = new Employee("Mary", "Smith", 22);
        Employee mikeWilson = new Employee("Mike", "Wilson", 3245);
        Employee billEnd = new Employee("Bill", "End", 78);

        SimpleHashtable ht = new SimpleHashtable();
        ht.add("Jones", janeJones);
        ht.add("Doe", johnDoe);
        ht.add("Wilson", mikeWilson);
        ht.add("Smith", marySmith);

        ht.printHashtable();

        System.out.println(ht.get("Wilson"));
        ht.remove("Wilson");
        ht.remove("Jones");
        ht.printHashtable();
    }
}
