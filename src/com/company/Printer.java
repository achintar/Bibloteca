package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.ArrayList;

public class Printer {

    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    public void displayWelcome() {
        System.out.println("WELCOME:");
    }

    public void listMenuOptions() {
        System.out.printf("%-15s %-14s %n", "1:", "List Books");
        System.out.printf("%-15s %-14s %n", "2:", "CheckOut Books");
        System.out.printf("%-15s %-14s %n", "3:", "Show CheckOut Booklist");
        System.out.printf("%-15s %-14s %n", "4:", "Return Books");
        System.out.printf("%-15s %-14s %n", "5:", "Quit");
    }

    public String askUserInput() throws IOException {
        return (bufferedReader.readLine());
    }

    public void askUserForValidOption() {
        System.out.println("Please Enter A Valid Option");
    }

    public void print(ArrayList<Book> booklist, PrintStream printStream) {
        printStream.printf("%-30s %-25s %-20s %n", "Book_Name", "Author", "Year");
        printStream.println("-------------------------------------------------------------------");
        for (Book book : booklist) {
            printStream.printf("%-30s %-25s %-20s %n", book.getName(), book.getAuthor(), book.getYearOfPublication());
        }
    }

    public String getBookFromUser() throws IOException {
        System.out.println("Please Select The Book");
        return (bufferedReader.readLine());
    }

    public void tellUserCheckoutStatus(boolean result) {
        if(result)
            System.out.println("Thank You! Enjoy The Book");
        else
            System.out.println("That Book Is Not Available");
    }

    public void tellUserReturnStatus(boolean result) {
        if(result)
            System.out.println("Thank You! For Returning The Book");
        else
            System.out.println("That Is Not A Valid Book");
    }
}
