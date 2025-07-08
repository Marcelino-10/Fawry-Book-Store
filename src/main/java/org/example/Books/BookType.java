package org.example.Books;

import org.example.Services.Service;

public interface BookType {
    Service getService();
    int getBookQuantity();
    void setBookQuantity(int quantity);
}
