package com.company;


import java.util.ArrayList;
import java.util.List;

public class Librarian {

    private List<Customer> customerList = new ArrayList<Customer>();

    private String librarianID = "108-1991";
    private String librarianPassword = "bibloteca";


    public String getLibrarianID(){
        return librarianID;
    }
    public String getLibrarianPassword(){
        return librarianPassword;
    }


    public void addCustomersToList(){
        customerList.add(new Customer("110-1991","#include","Achinta","achintar@thoughtworks.com","9040876005"));
        customerList.add(new Customer("910-1991", "System.out", "Ishan", "ishan.sipun@gmail.com", "9777926037"));
        customerList.add(new Customer("113-1993", "krsnaankit", "M.Ankit", "ankit11031993@gmail.com", "8763494152"));
        customerList.add(new Customer("241-1993", "Subbuk.015", "K.S Subramanyam", "kannepalis@gmail.com", "9124927024"));
    }

    public List<Customer> getCustomersList(){
        return customerList;
    }

    public Customer findBook(String bookName){

        for (Customer customer : customerList) {
                    List<Book> book = customer.getCheckoutList();
                    for (Book book1 : book) {
                        if (book1.getName().equals(bookName))
                            return customer;
                    }

            }
        return null;
    }
}

