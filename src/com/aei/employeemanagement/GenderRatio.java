package com.aei.employeemanagement;
import java.util.ArrayList;
import java.util.List;
class GenderRatio extends Employee {





    public GenderRatio(int empId, String empName, String gender, int salary, String designation, String location) {
        super(empId, empName, gender, salary, designation, location);
    }

    public static  void calculateMaleFemaleRatio() {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1, "John Doe", "male",100000,"software engg","pune"));
        employees.add(new Employee(2, "John1 Doe", "female",1000000,"softwa engg","pune"));
        employees.add(new Employee(1,"Ary", "male",700000, "Ass software developer", "Pune"));
        employees.add(new Employee(11,"Arsh", "male",700000, "Ass software developer", "Pune"));
        employees.add(new Employee(12,"Aryan", "male",700000, "Ass software developer", "Pune"));
        employees.add(new Employee(13,"Ani", "male",700000, "Ass software developer", "Pune"));
        employees.add(new Employee(2,"Sahil", "male",600000, "Sr software developer", "Mumbai"));
        employees.add(new Employee(3,"Purva", "female",700000, "software developer", "Pune"));
        employees.add(new Employee(4,"Shweta", "female",400000, "team lead", "Hydrabad"));
        employees.add(new Employee(5,"Nupur", "female",600000, "software developer", "Nagpur"));

        int maleCount = 0;
        int femaleCount = 0;

        for (Employee employee : employees) {
            if (employee.gender.equalsIgnoreCase("male")) {
                maleCount++;
            } else if (employee.gender.equalsIgnoreCase("female")) {
                femaleCount++;
            }
        }

        System.out.println("Male Count: " + maleCount);
        System.out.println("Female Count: " + femaleCount);
        System.out.println("Male-Female Ratio: " + maleCount + ":" + femaleCount);
    }
}