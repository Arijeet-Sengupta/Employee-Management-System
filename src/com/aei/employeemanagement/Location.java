package com.aei.employeemanagement;
import java.util.*;

class Location extends Employee{

    public Location(int empId, String empName, String gender, int salary, String designation, String location) {
        super(empId, empName, gender, salary, designation, location);
    }
    public static void highest_sal(){
        // Storing Employee Data
        //comment
        List<Employee> employee = new ArrayList<>();
        employee.add(new Employee(1,"Ary", "male",700000, "Ass software developer", "Pune"));
        employee.add(new Employee(11,"Arsh", "male",700000, "Ass software developer", "Pune"));
        employee.add(new Employee(12,"Aryan", "male",700000, "Ass software developer", "Pune"));
        employee.add(new Employee(13,"Ani", "male",700000, "Ass software developer", "Pune"));
        employee.add(new Employee(2,"Sahil", "male",600000, "Sr software developer", "Mumbai"));
        employee.add(new Employee(3,"Purva", "female",700000, "software developer", "Pune"));
        employee.add(new Employee(4,"Shweta", "female",400000, "team lead", "Hydrabad"));
        employee.add(new Employee(5,"Nupur", "female",600000, "software developer", "Nagpur"));

        // list to access salaries according to cities
        List<String>location= new ArrayList<>();
        location.add("Pune");
        location.add("Mumbai");
        location.add("Hydrabad");
        location.add("Nagpur");

        //hashmaps to store total salary locationwise
        Map<String, Integer > location_sal = new HashMap<>();
        //Map<String, Integer > average = new HashMap<>();

        int total_sal=0;
        int num_of_employee=0;

        for(String city:location){//each city

            for(Employee emp: employee){//each employee

                if(city==emp.location) {//whose location=selected city
                    total_sal=total_sal+emp.salary;
                    num_of_employee= num_of_employee+1;
                }

            }
            //storing in hashmap
            location_sal.put(city,total_sal);
            //average.put(city,num_of_employee);

            int average_salary=total_sal/num_of_employee;//calculating Average salary of city
            System.out.println("Average Salary of City "+ city +" is:"+ average_salary );
            System.out.println();
            total_sal=0;
            num_of_employee=0;

        }

        System.out.println(location_sal);
        System.out.println();
        //System.out.println(average);

        //calculating highest salary
        int highest_sal=0;
        String highest_sal_location=null;
        for(Map.Entry<String,Integer> entry: location_sal.entrySet()){

            if(entry.getValue() > highest_sal){
                highest_sal= entry.getValue();
                highest_sal_location=entry.getKey();
            }

        }
        System.out.println("Location with highest Salary is "+ highest_sal_location);

    }
}
