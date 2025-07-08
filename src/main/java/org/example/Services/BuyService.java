package org.example.Services;

import org.example.Books.Book;
import org.example.Books.DemoBook;
import org.example.Inventory;

public class BuyService {
    Inventory inventory;

    public BuyService(Inventory inventory){
        this.inventory = inventory;
    }

    public void buy(int isbn, int quantity, String email, String address){
        Book book = inventory.search(isbn);
        if(book != null){
            if(book.getType().getBookQuantity() == 0)
                throw new RuntimeException("Book is out of stock");
            if(book.getType().getBookQuantity() < quantity)
                throw new RuntimeException("Book quantity is not enough");
            if(book.getType() instanceof DemoBook)
                throw new RuntimeException("Book is not for sale");
            if(book.getType().getBookQuantity() >= quantity){
                System.out.println("Book " + isbn + " is bought successfully");
                book.getType().setBookQuantity(quantity);
            }
            book.getType().getService().deliver(email, address);
        }
        else{
            throw new RuntimeException("Book is not found");
        }
    }
}
