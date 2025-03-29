package com.bridgelabz.map;


import java.util.Arrays;
import java.util.*;

class Employee{
    String name;
    String department;

    public Employee(String name, String department) {
        this.name = name;
        this.department = department;
    }

    @Override
    public String toString(){
        return name;
    }
}



public class GroupEmployees {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Alice", "HR"),
                new Employee("Bob", "IT"),
                new Employee("Carol", "HR")
        );

        Map<String, List<Employee>> departmentMap = new HashMap<>();

        for (Employee emp : employees) {
            String department = emp.department;

        if(!departmentMap.containsKey(department)){
            departmentMap.put(department,new ArrayList<>());
        }
        departmentMap.get(department).add(emp);
        }
        for (Map.Entry<String, List<Employee>> entry : departmentMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
