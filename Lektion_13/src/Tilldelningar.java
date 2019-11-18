import java.util.Arrays;

/**
 * Created by Mahmud Al Hakim
 * Nackademin - Stockholm - Sweden
 * Project: OOP_HT19
 * Date: 2019-11-18 11:29
 * Copyright: MIT
 */

public class Tilldelningar {

    /**
     * Tilldelningar, kopiering och jämförelse av arrayer
     */
    public static void main(String[] args) {


        /*******************************************
         *     Tilldelning av arrayer
         *******************************************/

        int[] a = {1, 2, 3, 4, 5};
        int[] b = {6, 7, 8, 9, 10};

        // Tilldelning
        b = a; // Farligt!

        // Vad innehåller a och b efter tilldelningen?
        // a och b kommer att peka på samma array
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));

        a[0] = 11;  // Ändringar görs i samma array
        b[1] = 12;  // Ändringar görs i samma array
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));

        // OBS!
        // Tilldelning av arrayer är INTE kopiering av arrayer
        // enligt exemplet ovan


        /*******************************************
         *     Kopiering av arrayer
         *******************************************/


        // Metod 1: Kopiera med hjälp av en loop
        int[] c = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            c[i] = a[i];
            // OBS!
            // Tilldelning av primitiva typer,
            // kopierar innehållet
        }
        System.out.println(Arrays.toString(c));
        a[0] = 100;

        System.out.println("Efter kopiering");
        System.out.println("a: " + Arrays.toString(a));
        System.out.println("b: " + Arrays.toString(b));
        System.out.println("c: " + Arrays.toString(c));
        /*
            a: [100, 12, 3, 4, 5]
            b: [100, 12, 3, 4, 5]
            c: [11, 12, 3, 4, 5]
        */

        // Metod 2
        // Kopiering med hjälp av en inbyggd metod i Java
        System.out.println("--- Metoden arraycopy() --- ");

        int[] d = new int[a.length];

        System.arraycopy(a, 0, d, 0, a.length);

        System.out.println("a: " + Arrays.toString(a));
        System.out.println("d: " + Arrays.toString(d));
        a[0] = 500;
        d[0] = 600;
        System.out.println("Efter ändring");
        System.out.println("a: " + Arrays.toString(a));
        System.out.println("d: " + Arrays.toString(d));

        // Metod 3
        // Kopiering med hjälp av metoden copyOf
        // som finns i standardklassen Arrays
        System.out.println("--- Metoden copyOf() --- ");
        int[] e = Arrays.copyOf(a, a.length);
        System.out.println("e: " + Arrays.toString(e));

        System.out.println();
        System.out.println();


        /******************************************
         * Jämförelser av arrayer
         *****************************************/
        if(a == b)
            System.out.println("a och b pekar på samma array");
        else
            System.out.println("a och b pekar INTE på samma array");


        if(a == c)
            System.out.println("a och c pekar på samma array");
        else
            System.out.println("a och c pekar INTE på samma array");


        System.out.println();
        System.out.println();

        // En riktig jämförelse med en loop
        boolean isEqual = true;
        for (int i = 0; i < a.length ; i++) {
            if(a[i] != e[i]){
                isEqual = false;
                break;
            }
        }
        System.out.println(isEqual ? "a och e är lika" : "a och e är olika");

        // Jämförelse mellan a och d
        isEqual = true;
        if(a.length != d.length)
            isEqual = false;
        for (int i = 0; i < a.length ; i++) {
            if(a[i] != d[i]){
                isEqual = false;
                break;
            }
        }
        System.out.println("a och d är "
                +  (isEqual ? "lika" : "olika")
        );

        // Metod 2
        // Jämförelse av två arrayer med hjälp av metoden equals
        if(Arrays.equals(a, e))
            System.out.println("a och e är lika");
        else
            System.out.println("a och e är olika");

        if(Arrays.equals(a, d))
            System.out.println("a och d är lika");
        else
            System.out.println("a och d är olika");

    }
}
