/**
 * Created by Mahmud Al Hakim
 * Nackademin - Stockholm - Sweden
 * Project: OOP_HT19
 * Date: 2019-12-02 11:09
 * Copyright: MIT
 */

public class Book {

    // Instansvariabler
    String title;
    String author;
    String text;

    // Instansmetoder

    public boolean isWordInText(String word) {
        return text.contains(word);
    }

    public void print() {
        System.out.println(text);
    }
}
