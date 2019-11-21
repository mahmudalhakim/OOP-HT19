import java.util.Arrays;

/**
 * Created by Mahmud Al Hakim
 * Nackademin - Stockholm - Sweden
 * Project: OOP_HT19
 * Date: 2019-11-21 10:08
 * Copyright: MIT
 */

public class Uppgift_11_7 {
    /****************************************
     * Uppgift 11.7
     * Sidan 270
     ****************************************/
    public static void main(String[] args) {

        // Skapa en metod som roterar en int-array ett steg åt höger

        // Testkod 1
        int[] a = {1, 2, 3, 4, 5};

        System.out.println(Arrays.toString(a));

        rotate(a);

        System.out.println(Arrays.toString(a));

        System.out.println();

        // Testkod 2
        int[] b = {5, 6, 7, 8};
        System.out.println(Arrays.toString(b));
        rotate(b);
        System.out.println(Arrays.toString(b));

    }

    static void rotate(int[] a) {
        // Algoritmen
        // Steg 1 - Lagra den sista cellen i en temp-variabel
        int temp = a[a.length - 1];
        // System.out.println(temp);

        // Steg 2 - Iterera från slut till start+1
        for (int i = a.length - 1; i >= 1; i--) {
            // Steg 3 - Rotera (flytta cellerna ett steg åt höger)
            a[i] = a[i - 1];
        }

        // Steg 4 - Placera temp i den första cellen
        a[0] = temp;
    }
}
