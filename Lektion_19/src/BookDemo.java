/**
 * Created by Mahmud Al Hakim
 * Nackademin - Stockholm - Sweden
 * Project: OOP_HT19
 * Date: 2019-12-02 11:12
 * Copyright: MIT
 */

public class BookDemo {
    public static void main(String[] args) {

        Book b1 = new Book();
        b1.title = "Java - steg för steg";
        b1.author = "Jan Skansholm";
        b1.text = "Lorem Ipsum Dolor Sit Amet";


        System.out.println(b1.isWordInText("Lorem")); // true
        System.out.println(b1.isWordInText("lorem")); // false

        if (b1.isWordInText("Lorem"))
            System.out.println("Ja, ordet finns i texten!");
        else
            System.out.println("Nej, ordet finns inte i texten!");

        b1.print();

        // Jämför med instansmetoder som finns i klassen String
        String words = "Test Text och annat smått och gott.";
        System.out.println(words.contains("Test")); // true

        System.out.println("Demo på BookService");
        BookService bs = new BookService();
        bs.printTextToConsole(b1);

    }
}
