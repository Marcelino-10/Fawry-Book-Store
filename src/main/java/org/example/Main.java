package org.example;

import org.example.Books.Book;
import org.example.Books.DemoBook;
import org.example.Books.EBook;
import org.example.Books.PaperBook;
import org.example.Services.BuyService;

import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        Book eBook = new Book(1234, "Seven Habits", new Date("07/07/2025"), 100, new EBook());
        Book paperBook = new Book(1235, "Health in Life", new Date("08/06/2013"), 200, new PaperBook(5));
        Book demoBook = new Book(1236, "Network Architectures", new Date("02/09/2020"), 1200, new DemoBook());
        Book aiBook = new Book(1237, "AI applications", new Date("02/09/2020"), 1200, new PaperBook(5));

        inventory.addBook(eBook);
        inventory.addBook(paperBook);
        inventory.addBook(demoBook);
        inventory.addBook(aiBook);

        List<Book> outDated = inventory.returnOutdated(10);
        System.out.println("OutDated books:");
        int cnt = 1;
        for(Book book : outDated)
            System.out.println(cnt++ + " " + book.getTitle());

        System.out.println();

        BuyService buyService = new BuyService(inventory);

//        buyService.buy(1237, 10, "marcelino@fawry.com", "Cairo EG."); // quantity not enough
        buyService.buy(1234, 5, "marcelino@fawry.com", "Cairo EG.");
        buyService.buy(1237, 5, "marcelino@fawry.com", "Cairo EG.");
//        buyService.buy(1237, 6, "marcelino@fawry.com", "Cairo EG."); // book is out of stock
//        buyService.buy(1235, 3, "marcelino@fawry.com", "12th Shoubra st."); //outDated book (not in inventory)
//        buyService.buy(1236, 1, "marcelino@fawry.com", "12th Shoubra st."); // demo book (not for sale)
    }
}