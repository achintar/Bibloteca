package com.company;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Library {

    /*List<Book> books;

    public Library(Book... books) {
        this.books = Arrays.asList(books);
    }*/

    ArrayList<Book> myList = new ArrayList<Book>();

    public void getBookList() {

            myList.add(new Book("Black Lotus", "Satyaraj Das", "2007", "availbale"));
            myList.add(new Book("Harry Potter", "J.K Rowling", "1998", "availbale"));
            myList.add(new Book("Journey Home", "Richard Salvin", "2005", "availbale"));
            myList.add(new Book("Let Us C", "Yashwant K", "2010", "availbale"));
    }

    public void showBookList(PrintStream printStream) {

        int i;
        for(i=0;i<myList.size();i++) {
                printStream.println(myList.get(i).returnBookDetails());
            }
        }
}
