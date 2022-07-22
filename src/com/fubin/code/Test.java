package com.fubin.code;

import java.util.ArrayList;
import java.util.Comparator;

public class Test {

    public static void main(String[] args) {

        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee("java", 10000, new Mydate(2021, 12, 13)));
        employees.add(new Employee("c++", 10000, new Mydate(2021, 12, 13)));
        employees.add(new Employee("java", 10000, new Mydate(2021, 12, 14)));

        employees.sort(new Comparator<Employee>() {
            @Override
            public int compare(Employee employee1, Employee employee2) {
                if (!(employee1 instanceof Employee && employee2 instanceof Employee)) {
                    return 0;
                }
                int i = employee1.getName().compareTo(employee2.getName());
                if (i != 0) {
                    return i;
                }
                return employee1.getBirthday().compareTo(employee2.getBirthday());
            }
        });

        System.out.println(employees);
    }
}
