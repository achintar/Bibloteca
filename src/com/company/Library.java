package com.company;

import java.io.PrintStream;
import java.util.ArrayList;

public class Library {

    ArrayList<Book> libraryBookList = new ArrayList<Book>();
    ArrayList<Book> checkedOutBookList = new ArrayList<Book>();
    private String status = "available";

    public void getBookList() {

        libraryBookList.add(new Book("Black Lotus", "Satyaraj Das", "2007", status));

        libraryBookList.add(new Book("Harry Potter", "J.K Rowling", "1998", status));

        libraryBookList.add(new Book("Journey Home", "Richard Salvin", "2005", status));

        libraryBookList.add(new Book("Let Us C", "Yashwant K", "2010", status));
    }

    public void showBookList(PrintStream printStream) {

        int i;
        printStream.printf("%-30s %-25s %-20s %-15s %n", "Book_Name", "Author", "Year", "Availability_Status");
        printStream.println("--------------------------------------------------------------------------------------------------");
        for (i = 0; i < libraryBookList.size(); i++) {
            Book book = libraryBookList.get(i);
            if (book.getAvailabilityStatus().equals(status))
                printStream.printf("%-30s %-25s %-20s %-15s %n", book.getName(), book.getAuthor(), book.getYearOfPublication(), book.getAvailabilityStatus());
        }
    }

    public void searchBooks(String selectedBook) {
        int i;
        boolean foundStatus = false;
        for (i = 0; i < libraryBookList.size(); i++) {
            if (selectedBook.equals(libraryBookList.get(i).getName())) {
                Book book = libraryBookList.get(i);
                book.changeStatus();
                System.out.println("Thank You! Enjoy The Book");
                checkedOutBookList.add(book);
                foundStatus = true;
                break;
            }
        }

        if(!foundStatus)
            System.out.println("That Book Is Not Available");

    }

    public void showCheckedOutBookList(PrintStream printStream) {
        int i;
        printStream.printf("%-30s %-25s %-20s %n", "Book_Name", "Author", "Year");
        printStream.println("----------------------------------------------------------------------");
        for(i=0;i<checkedOutBookList.size();i++){
            Book book = checkedOutBookList.get(i);
            System.out.printf("%-30s %-25s %-20s %n",book.getName(),book.getAuthor(),book.getYearOfPublication());
        }
    }
}
