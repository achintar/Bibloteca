package com.company;

import java.io.PrintStream;
import java.util.ArrayList;

/**
 * Created by achintar on 13/01/15.
 */
public class Printer {
    public void print(ArrayList<Book> booklist, PrintStream printStream) {

        printStream.printf("%-30s %-25s %-20s %n", "Book_Name", "Author", "Year");
        printStream.println("-------------------------------------------------------------------");
        for (Book book : booklist) {
            printStream.printf("%-30s %-25s %-20s %n", book.getName(), book.getAuthor(), book.getYearOfPublication());
        }
    }
}
