package com.company;

public class EmployeeService extends EmployeeFactory {
    Employee[] employees;

    public EmployeeService(Employee[] employees) {
        this.employees = employees;
    }


    void printEmployees() {
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee);
            }
        }
    }

    public Employee getId(long id) {
        for (Employee employee : employees) {
            if (employee.id == id) {
                return employee;
            }
        }
        return null;
    }

    public Object getName(String names) {
        for (Employee empl : employees) {
            if (empl.getName().equals(empl.name)) {
                return empl;
            }
        }
        return null;
    }

    public void sortName() {
        for (int i = 0; i < employees.length; i++) {
            for (int j = 0; j < employees.length; j++) {
                Employee temporary;
                if (employees[i].getName().compareTo(employees[j].getName()) > 0) {
                    temporary = employees[i];
                    employees[i] = employees[j];
                    employees[j] = temporary;
                }
            }
        }
    }

    public Employee[] getSalaryCalculation() {

        for (int i = 0; i < employees.length; i++) {
            for (int j = i + 1; j < employees.length; j++) {
                Employee temp;
                if (employees[i].name.compareTo(employees[j].name) > 0) {
                    temp = employees[i];
                    employees[i] = employees[j];
                    employees[j] = temp;
                } else if (employees[i].name.equals(employees[j].name)) {
                    if (employees[i].salary > employees[j].salary) {
                        temp = employees[i];
                        employees[i] = employees[j];
                        employees[j] = temp;
                    }
                }
            }
        }
        return employees;
    }

    public void sortByNameAndSalary() {
        Employee sortName;
        for (int i = 0; i < employees.length; i++) {
            for (int j = 0; j < employees.length; j++) {
                if (employees[i].name.equals(employees[j].name) && employees[j].salary > employees[i].salary) {
                    sortName = employees[i];
                    employees[i] = employees[j];
                    employees[j] = sortName;
                }
            }
        }
    }

    public Employee edit(Employee employee) {
        Employee searchEmployee = getId(employee.id);
        Employee oldInformation = null;
        if (searchEmployee != null) {
            for (int i = 0; i < employees.length; i++) {
                if (employees[i].id == employee.id) {
                    oldInformation = employees[i];
                    employees[i] = employee;
                    break;
                }
            }
        }
        return oldInformation;
    }


    Employee remove(long id){
        Employee deleteEmployee = getId(id);
        // there is no Employee with such id!
        if (null == deleteEmployee) {
            return null;
        }
        Employee[] modernEmployee = new Employee[employees.length-1];
        int j = 0;
        for (Employee value : employees) {
            if (!value.equals(deleteEmployee)) {
                modernEmployee[j] = value;
                j++;
            }
        }
        employees = modernEmployee;
        return deleteEmployee;
    }

    public Employee add(Employee employee){
        Employee[] modernEmployee = new Employee[employees.length+1];
        int j = 0;
        for (Employee value : employees) {
            modernEmployee[j] = value;
            j++;
        }
        modernEmployee[j] = employee;
        employees = modernEmployee;
        return employee;
    }
}