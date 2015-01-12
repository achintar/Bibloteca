package com.company;

import java.io.PrintStream;
import java.util.Arrays;
import java.util.List;

public class Library {

    List<Book> books;

    public Library(Book... books) {
        this.books = Arrays.asList(books);
    }

    public void showBookList(PrintStream printStream) {
        for (Book book : books) {
            printStream.print(book.toString());
        }
    }
}
