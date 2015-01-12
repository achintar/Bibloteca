package com.company;


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

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public String getYearOfPublication() {
        return yearOfPublication;
    }

    public String getAvailabilityStatus() {
        return availabilityStatus;
    }
}
