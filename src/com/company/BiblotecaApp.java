package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class BiblotecaApp {

    public void printMessage(PrintStream printStream)
    {
        printStream.println("WELCOME\n");
    }

    public void listsOptions(PrintStream printStream)
    {
        printStream.printf("%-15s %-14s %n", "1:", "List Books");
        printStream.printf("%-15s %-14s %n", "2:", "CheckOut Books");
        printStream.printf("%-15s %-14s %n", "3:", "Show CheckOut Booklist");
        printStream.printf("%-15s %-14s %n", "4:", "Quit");

    }
    public void assignOptionFunctions() throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int usersChoice = Integer.parseInt(bufferedReader.readLine());
        Library library = new Library();
        library.getBookList();

        while (usersChoice != 4) {
            if (usersChoice == 1) {
                library.showBookList(System.out);
                usersChoice = Integer.parseInt(bufferedReader.readLine());
            }
            else if(usersChoice == 2)
            {

                System.out.println("Please select book to Check Out:");
                String selectedBook = bufferedReader.readLine();

                library.searchBooks(selectedBook);
                usersChoice = Integer.parseInt(bufferedReader.readLine());
                
            }
            else if(usersChoice == 3)
            {
                library.showCheckedOutBookList(System.out);
                usersChoice = Integer.parseInt(bufferedReader.readLine());
            }
            else {
                System.out.println("Select A Valid Option:");
                usersChoice = Integer.parseInt(bufferedReader.readLine());
            }
        }
    }
}
