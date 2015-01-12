package com.company;

import java.io.PrintStream;

public class Book {
    public String name;
    public String author;
    public String yearOfPublication;
    public String availabilityStatus;

    public Book(String name, String author, String yearOfPublication, String availabilityStatus) {
        this.name = name;
        this.author = author;
        this.yearOfPublication = yearOfPublication;
        this.availabilityStatus = availabilityStatus;
    }

    public String returnBookDetails() {
        return (name + "," + author + "," + yearOfPublication + "," + availabilityStatus);
    }
}
