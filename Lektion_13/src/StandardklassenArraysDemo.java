import java.util.Arrays;

/**
 * Created by Mahmud Al Hakim
 * Nackademin - Stockholm - Sweden
 * Project: OOP_HT19
 * Date: 2019-11-18 10:19
 * Copyright: MIT
 */

public class StandardklassenArraysDemo {

    /**
     *  Demostration på några användbara metoder
     *  i standardklassen Arrays
     */
    public static void main(String[] args) {

        int[] a = {1, 2, 3, 4, 5};

        // Konvertera en array till en sträng
        System.out.println(Arrays.toString(a));
        // [1, 2, 3, 4, 5]

        String[] cars = {"Volvo", "Saab", "Mazda"};
        System.out.println(Arrays.toString(cars));
        // [Volvo, Saab, Mazda]

        // Sortera en array
        Arrays.sort(cars); // OBS! Arrayer i Java är mutable (föränderlig)
        System.out.println(Arrays.toString(cars));
        // [Mazda, Saab, Volvo]

        // Metoden fill()
        int[] arr = new int[5];
        System.out.println(Arrays.toString(arr));
        // [0, 0, 0, 0, 0]

        // Exempel 1
        Arrays.fill(arr, 1);
        System.out.println(Arrays.toString(arr));

        // Exempel 2
        String[] s2 = new String[5];
        System.out.println(Arrays.toString(s2));
        Arrays.fill(s2, "TEST");
        System.out.println(Arrays.toString(s2));


        /*
        Övning 1
        • Skapa en array som innehåller info om dina favoritböcker (minst 3).
        • Skriv ut den första boken.
        • Skriv ut den sista boken.
        • Sortera böckerna.
        • Skriv ut alla böcker.
        • Skriv ut antal böcker.
        • Lägg till en ny bok i arrayen. (Lite knepigt i Java).
        */

        String[] books = new String[3];
        books[0] = "Java steg för steg";
        books[1] = "Java Direkt med Swing";
        books[2] = "Computer Science: An Interdisciplinary Approach";

        // Skriv ut den första boken
        System.out.println(books[0]);

        // Skriv ut den sista boken
        System.out.println(books[books.length - 1]);

        // Sortera böckerna
        Arrays.sort(books);

        // Skriv ut alla böcker
        // Metod 1
        System.out.println(Arrays.toString(books));

        // Metod 2
        for (int i = 0; i < books.length; i++) {
            System.out.println(books[i]);
        }

        // Metod 3
        for (String book : books) {
            System.out.println(book);
        }

        // Skriv ut antal böcker
        System.out.println("Det finns "
                + books.length
                + " böcker i biblioteket just nu"
        );

        // Lägg till en ny bok i arrayen
        // books[3] = "En ny bok"; // OBS! ArrayIndexOutOfBoundsException

        // 1. Vi måste skapa en ny array (samma typ)
           // Storleken på den nya arrayen är:
           // books.length+1
        // 2. Kopiera böckerna från den första arrayen till den nya arrayen
           // Skapa en loop
           // Kopiera ett element i taget
        // 3. Lägg in den nya boken sist i arrayen

        // 1
        String[] books2 = new String[books.length+1];
        System.out.println(Arrays.toString(books2));

        // 2
        for (int i = 0; i < books.length ; i++) {
            books2[i] = books[i];
        }
        System.out.println(Arrays.toString(books2));

        // 3
        books2[books2.length-1] = "Big Java";
        System.out.println(Arrays.toString(books2));

    }
}
