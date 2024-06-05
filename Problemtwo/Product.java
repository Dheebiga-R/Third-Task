package com.TaskThree.Problemtwo;

//Creating a class Product which implements the taxable interface
public class Product implements Taxable{

    //instance variables
    long pid;
    int price;
    int quantity;

    Product(){  //default constructor
        this.pid=0;
        this.price=0;
        this.quantity=0;
    }

    Product(long pid,int price,int quantity){ //parametrized constructor
        this.pid=pid;
        this.price=price;
        this.quantity=quantity;
    }

    //Child class which overrides the parent abstract class
    @Override
    public double calcTax() {
        return salesTax*this.price*this.quantity;  //calculate sales tax
    }
}
