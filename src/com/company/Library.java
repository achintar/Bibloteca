package com.company;

import java.io.PrintStream;
import java.util.ArrayList;

public class Library {

    ArrayList<Book> myList = new ArrayList<Book>();

    public void getBookList() {

            myList.add(new Book("Black Lotus", "Satyaraj Das", "2007", "availbale"));
            myList.add(new Book("Harry Potter", "J.K Rowling", "1998", "availbale"));
            myList.add(new Book("Journey Home", "Richard Salvin", "2005", "availbale"));
            myList.add(new Book("Let Us C", "Yashwant K", "2010", "availbale"));
    }

    public void showBookList(PrintStream printStream) {

        int i;
        String divider = "--------------------------------------------------------------------------------------------------";
        printStream.printf("%-30s %-25s %-20s %-15s %n","Book_Name","Author","Year","Availability_Status");
        printStream.println(divider);
        for (i = 0; i < myList.size(); i++) {
            Book book = myList.get(i);
            printStream.printf("%-30s %-25s %-20s %-15s %n", book.getName(), book.getAuthor(), book.getYearOfPublication(), book.getAvailabilityStatus());
            }
        }
}
