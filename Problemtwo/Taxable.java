package com.TaskThree.Problemtwo;

//Creating an interface Taxable
public interface Taxable {

    //instance variables which are final and static
    double salesTax = 0.07;
    double incomeTax = 0.105;

    //abstract class
    double calcTax();
}

