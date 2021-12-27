package com.company;
public class Designer extends Employee {
    private int rate;
    private int workedDays;

    public Designer(long id, String name, int age, float salary, String gender) {
        super(id, name, age, salary, gender);
        this.rate = rate;
        this.workedDays = workedDays;
    }
    public float getTotalSalary(){
        return salary + rate * workedDays;
    }
}
