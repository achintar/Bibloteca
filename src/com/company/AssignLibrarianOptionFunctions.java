package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AssignLibrarianOptionFunctions {

    public void assignLibrarianOptionFunctions(Librarian librarian) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String usersChoice = reader.readLine();

        while (!usersChoice.equals("2")) {
            if (usersChoice.equals("1")) {
                System.out.println("Enter The Book Name");
                new Printer().displayUserInfo(librarian.findBook(reader.readLine()));
            }
            usersChoice = reader.readLine();
        }
    }
}
