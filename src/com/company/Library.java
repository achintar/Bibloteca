package com.company;

import java.util.ArrayList;
import java.util.List;

public class Library {

    private List<Book> libraryBookList = new ArrayList<Book>();
    private List<Movie> moviesList = new ArrayList<Movie>();


    public Library(List<Movie> moviesList, List<Book> libraryBookList){

        this.moviesList = moviesList;
        this.libraryBookList = libraryBookList;
    }

    public List<Book> bookList() {
        return libraryBookList;
    }

    public  List<Book> displayCheckOutBookList(Customer customer) {
           return customer.getCheckoutList();
    }

    public boolean checkOutBook(String bookName, Customer customer) {
        Book foundBook = findBookIn(bookName, libraryBookList);
        if (foundBook == null)
            return false;
        else {
            customer.addBookToCheckoutList(foundBook);
            libraryBookList.remove(foundBook);
            return true;
        }
    }

    private Book findBookIn(String bookName, List<Book> bookList) {
        for (Book book : bookList) {
            if (bookName.equals(book.getName())) {
                return book;
            }
        }
        return null;
    }

    public boolean returnBooks(String bookName, Customer customer) {
        Book foundBook = findBookIn(bookName, customer.getCheckoutList());
        if (foundBook == null)
            return false;
        else {
            libraryBookList.add(foundBook);
            customer.removeBookFromCheckoutList(foundBook);
            return true;
        }
    }

    public List<Movie> moviesList() {
        return moviesList;
    }

    public  List<Movie> displayCheckedOutMovieList(Customer customer) {
        return customer.getCheckoutMovieList();
    }

    public boolean checkOutMovie(String movieName, Customer customer) {
        Movie foundMovie = findMovieIn(movieName, moviesList);
        if (foundMovie == null)
            return false;
        else {
            customer.addMovieToCheckoutList(foundMovie);
            moviesList.remove(foundMovie);
            return true;
        }
    }

    public Movie findMovieIn(String movieName, List<Movie> movieList) {
        for (Movie movie : movieList) {
            if (movieName.equals(movie.getName())) {
                return movie;
            }
        }
        return null;
    }
}