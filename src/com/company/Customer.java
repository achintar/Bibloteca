package com.company;


import java.util.ArrayList;
import java.util.List;

public class Customer {

    private String library_number;
    private String password;
    private String name;
    private String email;
    private String phone_number;

    private List<Book> checkedOutBookList = new ArrayList<Book>();
    private List<Movie> checkedOutMovieList = new ArrayList<Movie>();

    public Customer(String library_number, String password, String name, String email, String phone_number){
        this.library_number = library_number;
        this.password = password;
        this.name = name;
        this.email = email;
        this.phone_number = phone_number;
    }


    public void addBookToCheckoutList(Book book){
        checkedOutBookList.add(book);
    }
    public List<Book> getCheckoutList(){
        return checkedOutBookList;
    }
    public void removeBookFromCheckoutList(Book foundBook) {
        checkedOutBookList.add(foundBook);
    }


    public void addMovieToCheckoutList(Movie movie){
        checkedOutMovieList.add(movie);
    }
    public List<Movie> getCheckoutMovieList(){
        return checkedOutMovieList;
    }


    public String getPassword()
    {
        return password;
    }
    public String getLibrary_number()
    {
        return library_number;
    }
    public String getName(){
        return name;
    }
    public String getEmail(){
        return email;
    }
    public String getPhone_number(){
        return phone_number;
    }

}
