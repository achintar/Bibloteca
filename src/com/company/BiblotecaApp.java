package com.company;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

public class BiblotecaApp {

    Printer printer = new Printer();
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public void printMessage(PrintStream printStream) {
        printer.displayWelcome(printStream);
    }

    private void listsOptions() {
        printer.listMenuOptions();
    }

    private void listsLibrarianOptions() {
        printer.listLibrarianMenuOptions();
    }

    public void login()throws IOException
    {

        List<Book> libraryBookList = new ArrayList<Book>();
        libraryBookList.add(new Book("Black Lotus", "Satyaraj Das", "2007"));
        libraryBookList.add(new Book("Harry Potter", "J.K Rowling", "1998"));
        libraryBookList.add(new Book("Journey Home", "Richard Salvin", "2005"));
        libraryBookList.add(new Book("Let Us C", "Yashwant K", "2010"));

        List<Movie> moviesList = new ArrayList<Movie>();
        moviesList.add(new Movie("Dragon Ball Z:Battle Of Gods", "Masahiro Hosoda", "2013", "4.5"));
        moviesList.add(new Movie("Despicable Me 2", "Pierre Coffin", "2013", "5.0"));
        moviesList.add(new Movie("Frozen", "Chris Buck", "2013", "5.0"));
        moviesList.add(new Movie("Pokémon:Legend Awakened", "Kunihiko Yuyama", "2013", "4.0"));

        Librarian librarian = new Librarian();
        librarian.addCustomersToList();
        List<Customer> customerList = librarian.getCustomersList();

        System.out.println("WELCOME BIBLOTECA\n");

        System.out.println("1. USER LOGIN\n");
        System.out.println("2. LIBRARIAN LOGIN\n");
        System.out.println("3. QUIT\n");
        int usersChoice = Integer.parseInt(reader.readLine());

        while(usersChoice != 3){
            if(usersChoice == 1) {
                System.out.println("\nEnter UserName:");
                String userName = reader.readLine();

                System.out.println("\nEnter Password:");
                String password = reader.readLine();


                Customer customer = checkDetails(userName, password, customerList);
                if (customer != null) {
                    listsOptions();
                    new AssignOptionFunctions().assignOptionFunctions(libraryBookList, moviesList, customer);
                } else
                    System.out.println("INVALID LOGIN DETAILS:");
            }
            else if(usersChoice == 2) {
                System.out.println("\nEnter UserName:");
                String userName = reader.readLine();

                System.out.println("\nEnter Password:");
                String password = reader.readLine();

                if(librarian.getLibrarianID().equals(userName) && librarian.getLibrarianPassword().equals(password)) {
                    listsLibrarianOptions();
                    new AssignLibrarianOptionFunctions().assignLibrarianOptionFunctions(librarian);
                }
            }
            usersChoice = Integer.parseInt(reader.readLine());
        }
    }

    private Customer checkDetails(String userName, String password, List<Customer> customerList){

        for (Customer customer : customerList) {
            if (userName.equals(customer.getLibrary_number()) && password.equals(customer.getPassword())) {
                System.out.println("LOGIN SUCCESSFUL");
                return customer;
            }
        }
        return null;
    }

}
