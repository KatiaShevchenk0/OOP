package com.company;

public class Employee {
    long id;
    String name;
    int age;
    float salary;
    String gender;
    float getTotalSalary;

    public Employee(long id, String name, int age, float salary, String gender) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.gender = gender;
    }

    public Employee(int i, String name, int i1, String[] female) {
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setGetTotalSalary(float getTotalSalary) {
        this.getTotalSalary = getTotalSalary;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public float getSalary() {
        return salary;
    }

    public String getGender() {
        return gender;
    }

    public Employee[] getSalaryCalculation(){
        return getSalaryCalculation();
    }
    public float getTotalSalary(){
        return getTotalSalary;
    }

}
