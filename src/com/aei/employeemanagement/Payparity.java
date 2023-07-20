package com.aei.employeemanagement;

import java.util.ArrayList;
import java.util.List;

class Payparity extends Employee {
    public Payparity(int empId, String empName, String gender, int salary, String designation, String location) {
        super(empId, empName, gender, salary, designation, location);

    }
    public static void calparity(){
        List<Employee> em = new ArrayList<>();

        em.add(new Employee(1,"qwerty","male",2000,"softwareengineeer","mumbai"));
        em.add(new Employee(2,"qwert","female",200,"eengineer","pune"));
        em.add(new Employee(3,"qwer","female",30,"seniorengineer","Nagpur"));
        em.add(new Employee(4,"qwe","male",2,"Jrengineer","pune"));
        em.add(new Employee(4,"qwe","male",2,"Jrengineer","Hydrabad"));

        List<String>location= new ArrayList<>();
        location.add("pune");
        location.add("mumbai");
        location.add("Hydrabad");
        location.add("Nagpur");



        int totalmalesal=0;
        int totalfemalesal=0;
        for(String city: location){
            for(Employee obj : em){
                if(obj.location==city){
                    if(obj.gender.equals("male")){
                        // malelist.add(obj);
                        totalmalesal+=obj.salary;


                    }
                    else{//femalelist.add(obj);
                        totalfemalesal+=obj.salary;
                    }



                }
            }
            if(totalmalesal>totalfemalesal){
                System.out.println("the payparity in " +city+ " is "+ (totalmalesal- totalfemalesal));

            }
            else{
                System.out.println("the payparity in " +city+ " is "+ (totalfemalesal- totalmalesal));
            }
            totalmalesal=0;
            totalfemalesal=0;

        }



        // for(Employee ob : malelist)
        // {for(Employee bo : femalelist){
        //     if(ob.location.equals((bo.location)) ){

        // }}
    }


}

