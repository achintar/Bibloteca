package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

public class AssignOptionFunctions {

    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    Printer printer = new Printer();

    public void assignOptionFunctions(List<Book> libraryBookList, List<Movie> moviesList, Customer customer) throws IOException {
        Library library = new Library(moviesList, libraryBookList);


        String usersChoice = reader.readLine();

        while (!usersChoice.equals("9")) {

            if (usersChoice.equals("1")) {
                printer.printBooks(library.bookList());
            }
            else if(usersChoice.equals("2")){
                printer.printMovies(library.moviesList());
            }
            else if(usersChoice.equals("3")){
                System.out.println("Please Select The Book");
                String bookName = reader.readLine();
                new CheckoutOption(library, System.out).checkoutBook(bookName, customer);
            }
            else if(usersChoice.equals("4")){
                System.out.println("Please Select The Movie");
                String movieName = reader.readLine();
                new CheckoutOption(library, System.out).checkoutMovie(movieName, customer);
            }
            else if(usersChoice.equals("5")){
                printer.printBooks(library.displayCheckOutBookList(customer));
            }
            else if(usersChoice.equals("6")){
                printer.printMovies(library.displayCheckedOutMovieList(customer));
            }
            else if(usersChoice.equals("7")){
                System.out.println("Please Select The Book To Return");
                String bookName = reader.readLine();
                printer.tellUserReturnStatus(library.returnBooks(bookName, customer));
            }
            else if(usersChoice.equals(("8"))){
                printer.displayUserInfo(customer);
            }
            else {
                printer.askUserForValidOption();
            }
            usersChoice = reader.readLine();
        }
    }
}
