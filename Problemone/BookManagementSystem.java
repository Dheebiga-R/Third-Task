package com.TaskThree.Problemone;
import java.util.Scanner;

public class BookManagementSystem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //creating an object library
        Library library = new Library();

        //creating an object of an array for book size 5
        Book[] book = new Book[5];

        for(int i=0;i<5;i++){  //Ask the user to add five book in library
            System.out.println("Book ::" + (i+1) + "\nEnter the bookID,title,author::");
            book[i] = new Book(input.nextInt(),input.nextLine(),input.nextLine(),input.nextBoolean());
            library.addBook(book[i]);
        }

        System.out.println("Enter the book you want to replace::");  //Ask the user to enter the book they want to replace
        library.replaceBook(input.nextInt(),new Book(input.nextInt(),input.nextLine(),input.nextLine()));

        System.out.println("Enter the book you want to add::");  //Ask the user to enter further books
        Book book1 = new Book(input.nextInt(),input.nextLine(),input.nextLine());
        library.addBook(book1);

        library.displayBooks();  //display the books that available in library
    }
}
