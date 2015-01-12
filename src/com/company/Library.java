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
        for (i = 0; i < 4; i++) {
            book[i] = new Book("Black Lotus", "Satyaraj Das", "2007", "availbale");
        }
    }

    public void showBookList(PrintStream printStream) {

        int i;
        for(i=0;i<4;i++) {
                printStream.println(book[i].returnBookDetails());
            }
        }
}
