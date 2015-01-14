package com.company;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class BiblotecaApp {

    Printer printer = new Printer();

    public void printMessage() {
        printer.displayWelcome();
    }

    public void listsOptions() {
        printer.listMenuOptions();
    }

    public void assignOptionFunctions() throws IOException {

        List<Movie> moviesList = new ArrayList<Movie>();
        List<Book> libraryBookList = new ArrayList<Book>();

        libraryBookList.add(new Book("Black Lotus", "Satyaraj Das", "2007"));
        libraryBookList.add(new Book("Harry Potter", "J.K Rowling", "1998"));
        libraryBookList.add(new Book("Journey Home", "Richard Salvin", "2005"));
        libraryBookList.add(new Book("Let Us C", "Yashwant K", "2010"));

        moviesList.add(new Movie("Dragon Ball Z:Battle Of Gods", "Masahiro Hosoda", "2013", "4.5"));
        moviesList.add(new Movie("Despicable Me 2", "Pierre Coffin", "2013", "5.0"));
        moviesList.add(new Movie("Frozen", "Chris Buck", "2013", "5.0"));
        moviesList.add(new Movie("Pokémon:Legend Awakened", "Kunihiko Yuyama", "2013", "4.0"));

        Library library = new Library(moviesList, libraryBookList);

        String usersChoice = printer.askUserInput();

        while (!usersChoice.equals("8")) {

            if (usersChoice.equals("1")) {
                printer.printBooks(library.bookList());
            }
            else if(usersChoice.equals("2")){
                printer.printMovies(library.moviesList());
            }
            else if(usersChoice.equals("3")){
                printer.tellUserCheckoutStatus(library.checkOutBook(printer.getBookFromUser()));

//                Ask which book to checkout
//                Check If it is available in the library :
//                  Yes : Get The Book No: Display Message
//
//

            }
            else if(usersChoice.equals("4")){
                printer.tellUserMoiveCheckoutStatus(library.checkOutMovie(printer.getMovieFromUser()));
            }
            else if(usersChoice.equals("5")){
                printer.printBooks(library.checkedOutbookList());
            }
            else if(usersChoice.equals("6")){
                printer.printMovies(library.checkOutMovieList());
            }
            else if(usersChoice.equals("7")){
                printer.tellUserReturnStatus(library.returnBooks(printer.getBookFromUser()));
            }
            else {
                printer.askUserForValidOption();
            }
            usersChoice = printer.askUserInput();
        }
    }
}
