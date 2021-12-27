package com.company;

public class Manager extends Employee{

    public Manager(long id, String name, int age, float salary, String gender, int fixedBugs) {
        super(id, name, age, salary, gender);
    }

    @Override
    public float getSalary() {
        return this.getSalary();
    }
}
