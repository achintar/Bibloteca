package com.company;


public class Book {
    public String name;
    public String author;
    public String yearOfPublication;


    public Book(String name, String author, String yearOfPublication){
        this.name = name;
        this.author = author;
        this.yearOfPublication = yearOfPublication;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public String getYearOfPublication() {
        return yearOfPublication;
    }
}
