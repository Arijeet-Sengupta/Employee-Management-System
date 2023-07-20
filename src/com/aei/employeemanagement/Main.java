package com.aei.employeemanagement;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

//        List<Employee> employee = new ArrayList<>();
//        employee.add(new Employee(1,"Ary", "male",700000, "Ass software developer", "pune"));
//        employee.add(new Employee(2,"Sahil", "male",600000, "Sr software developer", "MUMBAI"));
//        employee.add(new Employee(3,"Purva", "female",500000, "software developer", "pune"));
//        employee.add(new Employee(4,"Shweta", "female",400000, "team lead", "HYDRABAD"));
//        employee.add(new Employee(5,"Nupur", "female",600000, "software developer", "pune"));
        //System.out.println(employee);

        Location.highest_sal();
        GenderRatio.calculateMaleFemaleRatio();
    }
}
