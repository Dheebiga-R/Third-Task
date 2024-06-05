package com.TaskThree.Problemtwo;

//Creating a class Employee which implements the taxable interface
public class Employee implements Taxable{
    long empId;
    String name;
    int salary;

    Employee(){  //default constructor
        this.empId=0;
        this.name="null";
        this.salary=0;
    }

    Employee(long empId,String name,int salary){  //parametrized constructor
        this.empId=empId;
        this.name=name;
        this.salary=salary;
    }

    //Child class which overrides the parent abstract class
    @Override
    public double calcTax() {
         return incomeTax*this.salary;  //calculate income tax
    }
}
