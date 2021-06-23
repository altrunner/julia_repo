package com.github.altrunner.javamarathon;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.joining;

public class EmployeeTest {


    public static void main(String args[]) {
        Employee emp1 = new Employee("JS", 1500.95F);
        Employee emp2 = new Employee("KM", 2359F);

        Employee[] employees = {emp1, emp2};

        String empInfo = Stream.of(employees)
                .map(Employee::toString)
                .collect(joining(",", "[", "]"));

        System.out.println(empInfo);
//
//        StringBuilder employeesInfo = new StringBuilder();
//
//        employeesInfo.append("[");
//
//        for (Employee employee : employees) {
//            employeesInfo
//                    .append(employee.toString())
//                    .append(",");
//
//        }
//
//        employeesInfo.deleteCharAt(employeesInfo.length() - 1);
//        employeesInfo.append("]");
//
//        System.out.println(employeesInfo);
    }
}
