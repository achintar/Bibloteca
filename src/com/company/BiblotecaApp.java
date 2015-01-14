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
        printStream.printf("%-15s %-14s %n", "4:", "Return Books");
        printStream.printf("%-15s %-14s %n", "5:", "Quit");

    }
    public void assignOptionFunctions() throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String usersChoice = bufferedReader.readLine();
        Library library = new Library();
        library.getBookList();

        Printer printer = new Printer();

        while (!usersChoice.equals("5")) {

            if (usersChoice.equals("1")) {
                printer.print(library.bookList(), System.out);
            }
            else if(usersChoice.equals("2")) {
                System.out.println("Please select book to Check Out:");
                String selectedBook = bufferedReader.readLine();

                if(library.checkOut(selectedBook))
                    System.out.println("Thank You!Enjoy The Book");
                else
                    System.out.println("That Book Is Not Available");
            }
            else if(usersChoice.equals("3")) {
                printer.print(library.checkedOutbookList(), System.out);
            }
            else if(usersChoice.equals("4")){
                System.out.println("Please Choose The Book To Return");
                String selectedBookToReturn = bufferedReader.readLine();

                if(library.returnBooks(selectedBookToReturn))
                    System.out.println("Thank You For Returning The Book");
                else
                    System.out.println("That Is Not A Valid Book");
            }
            else {
                System.out.println("Select A Valid Option:");
            }
            usersChoice = bufferedReader.readLine();
        }
    }
}
