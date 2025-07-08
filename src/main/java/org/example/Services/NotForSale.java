package org.example.Services;

public class NotForSale implements Service {
    @Override
    public void deliver(String mail, String address) {
        throw new RuntimeException("This book is Not For Sale");
    }
}
