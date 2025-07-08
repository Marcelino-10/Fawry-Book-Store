package org.example.Services;

public class MailService implements Service {
    @Override
    public void deliver(String mail, String address) {
        System.out.println("The book is delivered to the following email address " + mail);
    }
}
