package org.example.Books;

import org.example.Services.NotForSale;
import org.example.Services.Service;

public class DemoBook implements BookType {
   private final Service notForSale;

    public DemoBook() {
        this.notForSale = new NotForSale();
    }

    @Override
    public Service getService() {
        return this.notForSale;
    }

    @Override
    public int getBookQuantity() {
        return Integer.MAX_VALUE;
    }

    @Override
    public void setBookQuantity(int quantity) {}
}
