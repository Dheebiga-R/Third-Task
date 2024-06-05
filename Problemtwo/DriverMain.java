package com.TaskThree.Problemtwo;
import java.util.Scanner;

//Main method
public class DriverMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Get the employee details as input and calculate tax for yearly income
        System.out.println("Enter employee ID,name and salary::");
        Employee employee = new Employee(input.nextLong(),input.next(),input.nextInt());
        System.out.println("Income tax for ID " + employee.empId + " is::" + employee.calcTax());

        //Get the product details as input and calculate tax for product
        System.out.println("Enter product ID,price and quantity::");
        Product product = new Product(input.nextLong(),input.nextInt(),input.nextInt());
        System.out.println("Sales tax for ID " + product.pid + " is::" + product.calcTax());
    }
}
