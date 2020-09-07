package com.mucenic.chaining;

public class Main {
    public static void main(String[] args) {
        Employee janeJones = new Employee("Jane", "Jones", 123);


        ChainedHashtable ht = new ChainedHashtable();
        ht.put("Jones", janeJones);

    }
}
