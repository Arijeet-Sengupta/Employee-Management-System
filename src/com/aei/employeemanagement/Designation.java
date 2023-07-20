
    package com.aei.employeemanagement;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.*;
    public class Designation extends Employee {
        public Designation(int empId, String empName, String gender, int salary, String designation, String location)
        {
            super(empId, empName, gender, salary, designation, location);
        }
        public static void Salary() {

            List<Employee> sal = new ArrayList<>();

            sal.add(new Employee(1,"nayan","male",100000,"software_engineeer","pune"));
            sal.add(new Employee(2,"utkarsha","female",50000,"Assistant_Software_eng","pune"));
            sal.add(new Employee(3,"meena","female",200000,"Senior_software_eng","pune"));
            sal.add(new Employee(4,"arijeet","male",250000,"Teamlead","pune"));
           // sal.add(new Employee(5,"deena","female",250000,"Senior_software_eng","mumbai"));
            //sal.add(new Employee(6,"deena","male",250000,"software_engineeer","mumbai"));
            //sal.add(new Employee(7,"deena","female",150000,"eamlead","mumbai"));
            //sal.add(new Employee(8,"deena","male",200000,"Assistant_Software_eng","mumbai"));
            System.out.println(sal);


            List<String>designation= new ArrayList<>();
            designation.add("Teamlead");
            designation.add("Assistant_Software_eng");
            designation.add("Senior_software_eng");
            designation.add("software_engineeer");
            int total_sal=0;
            int num_of_employee=1;
            int average_salary=0;
            for(String post:designation) {

                for (Employee emp : sal) {

                    if (post == emp.designation) {
                        total_sal = total_sal + emp.salary;
                        num_of_employee = num_of_employee + 1;
                    }

                    average_salary = total_sal / num_of_employee;
                    //  System.out.println("Average Salary of designation " + post + " is:" + average_salary);
                   // System.out.println();
                   // total_sal = 0;
                    //num_of_employee = 1;
                }
                System.out.println("Average Salary of designation " + post + " is:" + average_salary);

            }








        }

    }












