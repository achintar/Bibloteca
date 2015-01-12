package com.company;

import java.io.PrintStream;
import java.util.Arrays;
import java.util.List;

public class Library {

    /*List<Book> books;

    public Library(Book... books) {
        this.books = Arrays.asList(books);
    }*/

    Book[] book = new Book[4];

    public void getBookList() {
        int i;
            book[0] = new Book("Black Lotus", "Satyaraj Das", "2007", "availbale");
            book[1] = new Book("Harry Potter", "J.K Rowling", "1998", "availbale");
            book[2] = new Book("Journey Home", "Richard Jones", "2005", "availbale");
            book[3] = new Book("Let Us C", "Yashwant K", "2010", "availbale");
    }

    public void showBookList(PrintStream printStream) {

        int i;
        for(i=0;i<4;i++) {
                printStream.println(book[i].returnBookDetails());
            }
        }
}
