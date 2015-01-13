package com.company;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        BiblotecaApp biblotecaApp = new BiblotecaApp();

        biblotecaApp.printMessage(System.out);
        biblotecaApp.listsOptions(System.out);
        biblotecaApp.assignOptionFunctions();

    }
}
