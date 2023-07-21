package com.aei.employeemanagement;
//commenting for SourceTree

import java.util.ArrayList;

import java.util.List;

class TaxCalculation extends Employee {
    public TaxCalculation(int empId, String empName, String gender, int salary, String designation, String location) {
        super(empId, empName, gender, salary, designation, location);
    }

    public static void taxCalculation() {
        List<Employee> empList = new ArrayList<>();
        List<Employee> maleList = new ArrayList<>();
        List<Employee> femaleList = new ArrayList<>();
        empList.add(new Employee(101, "Arijeet", "Male", 1100000, "Team Lead", "Nagpur"));
        empList.add(new Employee(102, "Nayan", "Male", 500000, "Ass. Software Engg", "Mumbai"));
        empList.add(new Employee(103, "Utkarsha", "Female", 2000000, "Team Lead", "Pune"));
        empList.add(new Employee(104, "Isha", "Female", 1100000, "Senior Software Engg", "Hyderabad"));
        empList.add(new Employee(105, "Yash", "Male", 7000000, "Software Engg", "Pune"));
        empList.add(new Employee(106, "Sam", "Male", 60000, "Team Lead", "Nagpur"));
        //int cnt = 0;
        for (Employee emp : empList) {
            if (emp.gender.equals("Male")) {
                maleList.add(emp);
            } else
                femaleList.add(emp);
        }
        checkTaxForMale(maleList);
        checkTaxForFemale(femaleList);

    }

    private static void checkTaxForMale(List<Employee> maleList) {
        for (Employee emp : maleList) {
            double tax = 0;
            int mSlab1 = 0;
            int mSlab2 = 0;
            int mSlab3 = 0;
            int mSlab4 = 0;
            if (emp.salary > 1000000) {
                mSlab1 = 250000;
                mSlab2 = 250000;
                mSlab3 = 500000;
                mSlab4 = emp.salary - 1000000;
                tax += (mSlab1 * 0) + ((5.0 / 100) * mSlab2) + ((20.0 / 100) * mSlab3) + ((30.0 / 100) * mSlab4);
            }
            if (emp.salary > 500000 && emp.salary <= 1000000) {
                mSlab1 = 250000;
                mSlab2 = 250000;
                mSlab3 = emp.salary - 500000;
                tax += (mSlab1 * 0) + ((5.0 / 100) * mSlab2) + ((20.0 / 100) * mSlab3);
            }
            if (emp.salary > 250000 && emp.salary <= 500000) {
                mSlab1 = 250000;
                mSlab2 = emp.salary - 250000;
                tax += (mSlab1 * 0) + ((5.0 / 100) * mSlab2);
            }

            System.out.println("The deducted for " + emp.empName + " is " + tax);

        }
    }

    private static void checkTaxForFemale(List<Employee> femaleList) {
        for (Employee emp : femaleList) {
            double tax = 0;
            int fSlab1 = 0;
            int fSlab2 = 0;
            int fSlab3 = 0;
            int fSlab4 = 0;
            int fSlab5 = 0;
            int fSlab6 = 0;
            if (emp.salary > 1500000) {
                fSlab1 = 300000;
                fSlab2 = 300000;
                fSlab3 = 300000;
                fSlab4 = 300000;
                fSlab5 = 300000;
                fSlab6 = emp.salary - 1500000;
                tax += (fSlab1 * 0) + ((5.0 / 100) * fSlab2) + ((10.0 / 100) * fSlab3) + ((15.0 / 100) * fSlab4) + ((20.0 / 100) * fSlab5 + ((30.0 / 100) * fSlab6));
            }
            if (emp.salary > 120000 && emp.salary <= 1500000) {
                fSlab1 = 300000;
                fSlab2 = 300000;
                fSlab3 = 300000;
                fSlab4 = 300000;
                fSlab5 = emp.salary - 300000;
                tax += (fSlab1 * 0) + ((5.0 / 100) * fSlab2) + ((10.0 / 100) * fSlab3) + ((15.0 / 100) * fSlab4) + ((20.0 / 100) * fSlab5);
            }
            if (emp.salary > 900000 && emp.salary <= 1200000) {
                fSlab1 = 300000;
                fSlab2 = 300000;
                fSlab3 = 300000;
                fSlab4 = emp.salary - 300000;

                tax += (fSlab1 * 0) + ((5.0 / 100) * fSlab2) + ((10.0 / 100) * fSlab3) + ((15.0 / 100) * fSlab4);
            }
            if (emp.salary > 600000 && emp.salary <= 900000) {
                fSlab1 = 300000;
                fSlab2 = 300000;
                fSlab3 = emp.salary - 300000;

                tax += (fSlab1 * 0) + ((5.0 / 100) * fSlab2) + ((10.0 / 100) * fSlab3);
            }
            if (emp.salary > 300000 && emp.salary <= 600000) {
                fSlab1 = 300000;
                fSlab2 = emp.salary - 300000;
                tax += (fSlab1 * 0) + ((5.0 / 100) * fSlab2);


            }
            System.out.println("The deducted for " + emp.empName + " is " + tax);
        }


//
        }
    }

