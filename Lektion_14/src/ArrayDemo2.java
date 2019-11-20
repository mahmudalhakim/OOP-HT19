import java.util.Arrays;

/**
 * Created by Mahmud Al Hakim
 * Nackademin - Stockholm - Sweden
 * Project: OOP_HT19
 * Date: 2019-11-20 09:05
 * Copyright: MIT
 */

public class ArrayDemo2 {

    public static void main(String[] args) {

        // Att konvertera en sträng till en array
        String test1 = "A B C";
        String[] testArray1 = test1.split(" ");

        // Skriv ut med foreach-sats
        for (String s : testArray1) {
            System.out.println("Element: " + s);
        }

        System.out.println();

        // Skriv ut med en for-sats
        for (int i = 0; i < testArray1.length; i++) {
            System.out.println("Element " + i + ": " + testArray1[i]);

        }

        System.out.println();

        // Skriv ut med hjälp av klassen Arrays
        System.out.println(Arrays.toString(testArray1));

        System.out.println();

        // Exempel 2
        String test2 = "123456";
        String[] testArray2 = test2.split("");
        System.out.println(Arrays.toString(testArray2));

        System.out.println();

        // Exempel 3
        String test3 = "Mahmud;Al Hakim;45;Sollentuna";
        String[] testArray3 = test3.split(";");
        System.out.println(Arrays.toString(testArray3));

        System.out.println();

        // Konvertera en sträng till en char-array
        String test4 = "11+1213";
        String str;
        char[] testCharArray = test4.toCharArray();
        int count = 0;
        for (char c : testCharArray) {
            System.out.println(c +
                    (Character.isDigit(c) ? " is digit" : " not digit")
            );
            // Test om arrayen innehåller flera ogiltiga tecken
            if(!Character.isDigit(c)){
                if(count++ > 1){
                    System.out.println("Ogiltiga tecken i uttrycket");
                }
            }
        }
    }
}
