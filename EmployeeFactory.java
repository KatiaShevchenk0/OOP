package com.company;
import java.util.Random;

public class EmployeeFactory extends Employee{
    //generateEmployees(size) -> генерирует случайным образом заданое количество сотрудников

    private static String[] profession = {"Developer", "Manager", "Designer"};
    public static String[] female = {"Kate", "Liza", "Tanya", "Julia", "Irina", "Margarita", "Olena"};
    private static String[] male = {"Sergey", "Tolik", "Sasha", "Nikita", "Andrey", "Bogdan", "Max"};


    public EmployeeFactory(long id, String name, int age, float salary, String gender) {
        super(id, name, age, salary, gender);
    }


    static int random(int min, int max) {
        int delta = max - min;
        double random = Math.random();
        return (int) (random * delta + min);
    }

    static String generateGender(String name) {
        for (String value : female) {
            if (name.contains(value)) {
                return "female";
            }
        }
        return "male";
    }
    static String generateName(){
        Random random = new Random();
        boolean state = random.nextBoolean();
        if (state) {
            return male[(int)(Math.random() * male.length)];
        }
        else {
            return female[(int)(Math.random() * female.length)];
        }
    }


    public static Employee[] generateEmployees(int a) {
        Random random = new Random();
        int size = male.length + female.length;
        int id = 0;
        Employee[] employees = new Employee[size];
        for (int i = 0; i < size; i++) {
            String name = generateName();
            id++;
            String gender = generateGender(name);
            int age = random(18, 60);
            int salary = random(800, 3000);
            int fixedBugs = random(0, 30);
            float getSalaryCalculation = random(0, 5);

            double rate = random(1, 5);
            int workedDays = random(22, 31);
            String randomPosition = profession[random.nextInt(profession.length)];

            switch (randomPosition) {
                case "Developer" -> employees[i] = new Developer(id, name, age, salary, gender, rate, workedDays);
                case "Manager" -> employees[i] = new Manager(id, name, age, salary, gender, fixedBugs);
                case "Designer" -> employees[i] = new Designer(id, name, age, salary, gender);
            }
        }
        return employees;
    }

}
