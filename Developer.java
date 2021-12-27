package com.company;

import java.util.Random;

public class Developer extends Employee {
    private int fixedBugs;

    public Developer(long id, String name, int age, float salary, String gender, double rate, int fixedBugs) {
        super(id, name, age, salary, gender);
        this.fixedBugs = fixedBugs;
    }
    //(ставка + fixedBugs * коэффициент) * (randomBoolean ? 2 : 0)


    @Override
    public float getSalary() {
        return salary;
    }

    public float getTotalSalary() {
       return  (salary+ fixedBugs * 54) * (new Random().nextBoolean() ? 2 : 0);
    }
}
