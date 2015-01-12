package com.company;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Main {

    public static void main(String[] args) {

        new Welcome().printMessage(System.out);


        Library library = new Library();
        library.getBookList();

        library.showBookList(System.out);

    }
}
