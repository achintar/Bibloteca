package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

public class Printer {

    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    public void displayWelcome() {
        System.out.println("WELCOME:");
    }

    public void listMenuOptions() {
        System.out.printf("%-15s %-14s %n", "1:", "List Books");
        System.out.printf("%-15s %-14s %n", "2:", "List Movies");
        System.out.printf("%-15s %-14s %n", "3:", "CheckOut Books");
        System.out.printf("%-15s %-14s %n", "4:", "CheckOut Movies");
        System.out.printf("%-15s %-14s %n", "5:", "Display CheckOut Book List");
        System.out.printf("%-15s %-14s %n", "6:", "Display CheckOut Movie List");
        System.out.printf("%-15s %-14s %n", "7:", "Return Books");
        System.out.printf("%-15s %-14s %n", "8:", "Quit");
    }

    public String askUserInput() throws IOException {
        return (bufferedReader.readLine());
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

    public String getBookFromUser() throws IOException {
        System.out.println("Please Select The Book");
        return (askUserInput());
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

    public void printMovies(List<Movie> movies){
        System.out.printf("%-30s %-20s %-15s %-10s %n", "Movie_Name", "Year", "Director", "Ratings");
        System.out.println("-------------------------------------------------------------------------------------");
        for (Movie movie : movies) {
            System.out.printf("%-30s %-20s %-15s %-10s %n", movie.getName(), movie.getYear(), movie.getDirector(), movie.getRatings());
        }
    }

    public String getMovieFromUser() throws IOException {
        System.out.println("Please Select The Movie");
        return (bufferedReader.readLine());
    }

    public void tellUserMoiveCheckoutStatus(boolean result) {
        if(result)
            System.out.println("Thank You! Enjoy The Movie");
        else
            System.out.println("That Movie Is Not Available");
    }
}
