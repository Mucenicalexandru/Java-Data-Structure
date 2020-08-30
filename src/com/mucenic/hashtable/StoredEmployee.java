package com.mucenic.hashtable;

public class StoredEmployee {

    //public - like this we don't have getters and setters
    public String key; // the raw key, not the hashed one
    public Employee employee;

    public StoredEmployee(String key, Employee employee) {
        this.key = key;
        this.employee = employee;
    }
}
