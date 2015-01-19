package com.company;


import java.io.PrintStream;
import java.util.List;

public class Printer {


    public void displayWelcome(PrintStream printStream) {
        printStream.println("WELCOME:");
    }

    public void listMenuOptions() {
        System.out.printf("%-15s %-14s %n", "1:", "List Books");
        System.out.printf("%-15s %-14s %n", "2:", "List Movies");
        System.out.printf("%-15s %-14s %n", "3:", "CheckOut Books");
        System.out.printf("%-15s %-14s %n", "4:", "CheckOut Movies");
        System.out.printf("%-15s %-14s %n", "5:", "Display CheckOut Book List");
        System.out.printf("%-15s %-14s %n", "6:", "Display CheckOut Movie List");
        System.out.printf("%-15s %-14s %n", "7:", "Return Books");
        System.out.printf("%-15s %-14s %n", "8:", "Display User Info");
        System.out.printf("%-15s %-14s %n", "9:", "Quit");
    }

    public void askUserForValidOption() {
        System.out.println("Please Enter A Valid Option");
    }

    public void printBooks(List<Book> booklist) {
        System.out.printf("%-30s %-25s %-20s %n", "Book_Name", "Author", "Year");
        System.out.println("-------------------------------------------------------------------");
        for (Book book : booklist) {
            System.out.printf("%-30s %-25s %-20s %n", book.getName(), book.getAuthor(), book.getYearOfPublication());
        }
    }

    public void tellUserReturnStatus(boolean result) {
        if (result)
            System.out.println("Thank You! For Returning The Book");
        else
            System.out.println("That Is Not A Valid Book");
    }

    public void printMovies(List<Movie> movies) {
        System.out.printf("%-30s %-20s %-15s %-10s %n", "Movie_Name", "Year", "Director", "Ratings");
        System.out.println("-------------------------------------------------------------------------------------");
        for (Movie movie : movies) {
            System.out.printf("%-30s %-20s %-15s %-10s %n", movie.getName(), movie.getYear(), movie.getDirector(), movie.getRatings());
        }
    }

    public void displayUserInfo(Customer customer) {
        System.out.printf("%-30s %-20s %-15s %n", "NAME", "EMAIL", "PHONE-NUMBER");
        System.out.printf("%-30s %-20s %-15s %n", customer.getName(), customer.getEmail(), customer.getPhone_number());

    }

    public void listLibrarianMenuOptions() {
        System.out.printf("%-15s %-14s %n", "1:", "Check Book Info");
        System.out.printf("%-15s %-14s %n", "2:", "Quit");
    }
}
