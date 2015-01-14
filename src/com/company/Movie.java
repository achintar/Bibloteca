package com.company;

public class Movie {
    private String name;
    private String year;
    private String director;
    private String ratings;


    public Movie(String name, String year, String director, String ratings){
        this.name = name;
        this.year = year;
        this.director = director;
        this.ratings = ratings;
    }



    public String getName() {
        return name;
    }

    public String getYear() {
        return year;
    }

    public String getDirector() {
        return director;
    }

    public String getRatings() {
        return ratings;
    }

}
