package com.company;

import java.io.PrintStream;

public class CheckoutOption {

    private Library library;
    private PrintStream printStream;

    public CheckoutOption(Library library, PrintStream printStream) {
        this.library = library;
        this.printStream = printStream;
    }

    public void checkoutBook(String bookName, Customer customer) {
        boolean checkoutStatus = library.checkOutBook(bookName, customer);
        if(checkoutStatus) {
            printStream.println("Thank You! Enjoy The Book");
        }
        else
            printStream.println("That Book Is Not Available");

    }

    public void checkoutMovie(String movieName, Customer customer) {
        boolean checkoutStatus = library.checkOutMovie(movieName, customer);
        if(checkoutStatus){
            printStream.println("Thank You! Enjoy The Movie");
        }
        else
            printStream.println("That Movie Is Not Available");
    }
}
