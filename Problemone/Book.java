package com.TaskThree.Problemone;

//creating a class for Book
public class Book {

    //instance variables
    int bookID;
    String title;
    String author;
    boolean isAvailable;

    public Book(){  //default constructor
        this.bookID=0;
        this.title="null";
        this.author="null";
        this.isAvailable=false;
    }
    public Book(int bookID,String title,String author){  //parametrized constructor
        this.bookID=bookID;
        this.title=title;
        this.author=author;
    }

    public Book(int bookID,String title,String author,boolean isAvailable){
        this.bookID=bookID;
        this.title=title;
        this.author=author;
        this.isAvailable=isAvailable;
    }

}
