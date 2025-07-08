package org.example.Books;

import org.example.Services.MailService;
import org.example.Services.Service;

public class EBook implements BookType {
    Service mailService;

    public EBook(){
        this.mailService = new MailService();
    }

    @Override
    public Service getService() {
        return this.mailService;
    }

    @Override
    public int getBookQuantity() {
        return Integer.MAX_VALUE;
    }

    @Override
    public void setBookQuantity(int quantity) {}
}
