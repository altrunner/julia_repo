package com.github.altrunner.javamarathon;

public class Employee {

    private String fullName;
    private float salary;

    public Employee() {}

    public Employee (String fullName, float salary){
        this.fullName = fullName;
        this.salary = salary;
    }

    public void setFullName(String fullName){
        this.fullName = fullName;
    }

    public String getFullName(){
        return fullName;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public float getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "fullName='" + fullName + '\'' +
                ", salary=" + salary +
                '}';
    }
}
