package com.company;

import java.io.PrintStream;
import java.util.ArrayList;

public class Library {

    ArrayList<Book> libraryBookList = new ArrayList<Book>();
    ArrayList<Book> checkedOutBookList = new ArrayList<Book>();

    public void getBookList() {
        libraryBookList.add(new Book("Black Lotus", "Satyaraj Das", "2007"));
        libraryBookList.add(new Book("Harry Potter", "J.K Rowling", "1998"));
        libraryBookList.add(new Book("Journey Home", "Richard Salvin", "2005"));
        libraryBookList.add(new Book("Let Us C", "Yashwant K", "2010"));
    }

    public void showBookList(PrintStream printStream) {
        printStream.printf("%-30s %-25s %-20s %n", "Book_Name", "Author", "Year");
        printStream.println("-------------------------------------------------------------------");
        for (Book book : libraryBookList) {
            printStream.printf("%-30s %-25s %-20s %n", book.getName(), book.getAuthor(), book.getYearOfPublication());
        }
    }

    public void showCheckedOutBookList(PrintStream printStream) {
        printStream.printf("%-30s %-25s %-20s %n", "Book_Name", "Author", "Year");
        printStream.println("--------------------------------------------------------------------");
        for (Book book : checkedOutBookList) {
            System.out.printf("%-30s %-25s %-20s %n", book.getName(), book.getAuthor(), book.getYearOfPublication());
        }
    }

    public void checkOut(String bookName) {
        Book foundBook = findBook(bookName, libraryBookList);
        if (foundBook == null)
            System.out.println("That Book Is Not Available");
        else {
            checkedOutBookList.add(foundBook);
            libraryBookList.remove(foundBook);
            System.out.println("Thank You! Enjoy The Book");
        }
    }

    private Book findBook(String bookName, ArrayList<Book> bookList) {
        for (Book book : bookList) {
            if (bookName.equals(book.getName())) {
                return book;
            }
        }
        return null;
    }


    public void returnBooks(String bookName) {
        Book foundBook = findBook(bookName, checkedOutBookList);
        if (foundBook == null)
            System.out.println("That Is Not A Valid Book");
        else {
            libraryBookList.add(foundBook);
            checkedOutBookList.remove(foundBook);
            System.out.println("Thank You For Returning The Book");
        }
    }
}