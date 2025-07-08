package org.example.Services;

public class ShippingService implements Service {
    @Override
    public void deliver(String mail, String address) {
        System.out.println("This book is delivered to the following address " + address);
    }
}
