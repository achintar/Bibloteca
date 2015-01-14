package com.company;
import java.io.IOException;

public class BiblotecaApp {

    Printer printer = new Printer();

    public void printMessage() {
        printer.displayWelcome();
    }

    public void listsOptions() {
        printer.listMenuOptions();
    }

    public void assignOptionFunctions() throws IOException {

        Library library = new Library();
        library.getBookList();

        String usersChoice = printer.askUserInput();

        while (!usersChoice.equals("5")) {

            if (usersChoice.equals("1")) {
                printer.print(library.bookList(), System.out);
            }
            else if(usersChoice.equals("2")) {
                printer.tellUserCheckoutStatus(library.checkOut(printer.getBookFromUser()));
            }
            else if(usersChoice.equals("3")) {
                printer.print(library.checkedOutbookList(), System.out);
            }
            else if(usersChoice.equals("4")){
                printer.tellUserReturnStatus(library.returnBooks(printer.getBookFromUser()));
            }
            else {
                printer.askUserForValidOption();
            }
            usersChoice = printer.askUserInput();
        }
    }
}
