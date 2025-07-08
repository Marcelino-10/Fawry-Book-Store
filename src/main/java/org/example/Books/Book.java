package org.example.Books;

import java.util.Date;

public class Book {
    private final int isbn;
    private final String title;
    private final Date year;
    private final double price;
    private final BookType type;

    public Book(int isbn, String title, Date year, double price, BookType type) {
        this.isbn = isbn;
        this.title = title;
        this.year = year;
        this.price = price;
        this.type = type;
    }

    public int getIsbn() {
        return isbn;
    }

    public Date getYear() {
        return year;
    }

    public BookType getType() {
        return type;
    }

    public String getTitle() {
        return title;
    }
}
