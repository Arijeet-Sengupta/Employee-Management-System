package com.aei.employeemanagement;

public class Employee {
    int empId;
    String empName;
    String gender;
    int salary;
    String designation;
    String location;

    public Employee(int empId,String empName,String gender, int salary, String designation, String location){
        this.empId = empId;
        this.empName =empName;
        this.gender = gender;
        this.salary = salary;
        this.designation = designation;
        this.location = location;

    }
}
