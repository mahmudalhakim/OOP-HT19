/**
 * Created by Mahmud Al Hakim
 * Nackademin - Stockholm - Sweden
 * Project: OOP_HT19
 * Date: 2019-11-25 12:49
 * Copyright: MIT
 */

public class BookDemo {
    public static void main(String[] args) {
        Book book1 = new Book();
        Book book2 = new Book();

        System.out.println(book1);
        // HashCode t.ex. Book@77459877

        System.out.println(book1.title);
        // null

        // Initiera alla instansvariabler
        book1.title = "Java - steg för steg";
        book1.author = "Jan Skansholm";
        book1.pages = 501;
        book1.price = 450;

        // Skriv ut info om objektet
        System.out.println(book1.title);
        System.out.println(book1.author);
        System.out.println("Antal sidor: " + book1.pages);
        System.out.printf("Pris: %.2f", book1.price);
    }
}
