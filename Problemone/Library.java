package com.TaskThree.Problemone;

//creating a class of library
public class Library {

    //instance variables
    private Book[] books;
    int i=0;

    public Library(){  //creating a library of book having size of 5
        this.books=new Book[5];
    }

    public void addBook(Book book){  //method for add book
        if(i<books.length) {         //check the no of books in library
            this.books[i] = book;
            i++;
        }
        else{                        //If it doesn't have enough space
            System.out.println("Not have sufficient space to add books in library!!");
        }
    }

    public void replaceBook(int bookID,Book book){  //method for replace book
        int index=-1;
        for(int i=0;i<books.length;i++){
            if(bookID==books[i].bookID){            //If book ID is found and after try to replace
                index=i;
            }
        }
        if(index==-1){                             //If book ID is not found print this statement
            System.out.println("The book that you need to replace was not found!! Try another book");
        }
        else{
            this.books[index] = book;              //Replace the book
            System.out.println("**Book was replace successfully**");
        }
    }

    public void displayBooks(){  //method for display books in library
        for (Book book : books) {
            System.out.println("{BookID :" + book.bookID + ", Title :" + book.title + ", Author :" + book.author + "}");
        }
    }

}
