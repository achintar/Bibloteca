package com.company;

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

    public ArrayList<Book> bookList() {
        return libraryBookList;
    }
    public  ArrayList<Book> checkedOutbookList() {
           return checkedOutBookList;
    }

    public boolean checkOut(String bookName) {
        Book foundBook = findBookIn(bookName, libraryBookList);
        if (foundBook == null)
            return false;
        else {
            checkedOutBookList.add(foundBook);
            libraryBookList.remove(foundBook);
            return true;
        }
    }

    private Book findBookIn(String bookName, ArrayList<Book> bookList) {
        for (Book book : bookList) {
            if (bookName.equals(book.getName())) {
                return book;
            }
        }
        return null;
    }


    public boolean returnBooks(String bookName) {
        Book foundBook = findBookIn(bookName, checkedOutBookList);
        if (foundBook == null)
            return false;
        else {
            libraryBookList.add(foundBook);
            checkedOutBookList.remove(foundBook);
            return true;
        }
    }
}