package org.example.Books;

import org.example.Services.Service;
import org.example.Services.ShippingService;

public class PaperBook implements BookType {
    private final Service shippingService;
    private int quantity;

    public PaperBook(int quantity){
        this.shippingService = new ShippingService();
        this.quantity = quantity;
    }

    @Override
    public Service getService() {
        return this.shippingService;
    }

    @Override
    public int getBookQuantity() {
        return quantity;
    }

    public void setBookQuantity(int quantity){
        this.quantity -= quantity;
    }
}
