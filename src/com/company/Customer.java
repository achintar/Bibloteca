package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Customer {


    public String seachBook() throws IOException {

        System.out.println("Please Enter The Book Name");
        String bookName = new BufferedReader(new InputStreamReader(System.in)).readLine();


        return bookName;
    }



}
