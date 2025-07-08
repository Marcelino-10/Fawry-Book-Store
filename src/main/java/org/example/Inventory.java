package org.example;

import org.example.Books.Book;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Inventory {
    private final List<Book> books;

    public Inventory() {
        books = new ArrayList<>();
    }

    public void addBook(Book book){
        books.add(book);
    }

    public List<Book> returnOutdated(int year){
        List<Book> outDated = new ArrayList<>();
        Date now = new Date();
        for(Book book : books){
            if((now.getYear() - book.getYear().getYear()) > year){
                outDated.add(book);
            }
        }
        for(Book book : outDated){
            books.remove(book);
        }
        return outDated;
    }

    public Book search(int isbn){
        for(Book book : books){
            if(book.getIsbn() == isbn)
                return book;
        }
        return null;
    }
}
