package com.company;
import java.util.Arrays;
import java.util.Comparator;

public class Test {
    private static Employee[] employees = EmployeeFactory.generateEmployees(35);
    private static EmployeeService employeeService = new EmployeeService(employees);
    public static void main(String[] args) {
    }


    private static void assertEquals(String testId, double expected, double actual) {
        if (expected == actual) {
            System.out.println("Тест " + testId + " Пройдено!");
        } else {
            System.out.println("Тест " + testId + " Провалено!");
            System.out.println("[expected]: " + expected);
            System.out.println("[actual]: " + actual);
        }
    };
    private static void testCalculateSalary(String testId){
        Employee[] copyEmployees = Arrays.copyOf(employees, employees.length);
        Arrays.stream(copyEmployees).forEach(employee -> employee.getSalaryCalculation());
        EmployeeService copyEmployeeService = new EmployeeService(copyEmployees);
        double expected = (10_000 +(100 * 5)) * 30;
        assertEquals(testId, expected, copyEmployeeService.getTotalSalary());
    }

    private static void assertEquals(String testId, boolean expected, boolean actual) {
        if (expected == actual) {
            System.out.println("Тест " + testId + "Пройдено!");
        } else {
            System.out.println("Тест " + testId + " Провалено!");
            System.out.println("[expected]: " + expected);
            System.out.println("[actual]: " + actual);
        }
    };
    private static void testGetById(String testId){
        Employee[] copyEmployees = Arrays.copyOf(employees, employees.length);
        for(int i = 0; i < copyEmployees.length; i++){
            copyEmployees[i].setId(i);
        }
        EmployeeService copyEmployeeService = new EmployeeService(copyEmployees);
        boolean actual = copyEmployeeService.getId(10).getId() ==10;
        assertEquals(testId, true, actual);
    }

    private static void testGetByName(String testId){
        Employee femaleEmployees = (Employee) employeeService.getName("Liza");
        boolean actual = Arrays.stream(new Employee[]{femaleEmployees}).allMatch(employee -> employee.getName().equals("Liza"));
        assertEquals(testId, true, actual);
    }

    private static void assertEqualsArray(String testId, String[] expected, String[] actual){
        boolean result = Arrays.equals(expected, actual);
        if(result){
            System.out.println("Тест " + testId + " Пройдено!");
        } else {
            System.out.println("Тест " + testId + " Провалено!");
            System.out.println("[expected]: " + Arrays.toString(expected));
            System.out.println("[actual]: " + Arrays.toString(actual));
        }
    }

    private static void testEdit(String testId){
        Employee[] copyEmployees = Arrays.copyOf(employees, employees.length);
        for(int i = 0; i < copyEmployees.length; i++){
            copyEmployees[i].setId(i);
        }
        EmployeeService copyEmployeeService = new EmployeeService(copyEmployees);
        Employee newEmployee = new Employee(6, "Linda", 10_000, EmployeeFactory.female);
        newEmployee.setId(5);
        Employee oldinformation = copyEmployeeService.edit(newEmployee);
        boolean actual = copyEmployeeService.getId(10).getName().equals("Nikita");
        assertEquals(testId, true, actual);
    }
}