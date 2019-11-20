import java.util.Arrays;

/**
 * Created by Mahmud Al Hakim
 * Nackademin - Stockholm - Sweden
 * Project: OOP_HT19
 * Date: 2019-11-20 12:57
 * Copyright: MIT
 */

public class MultiArray {
    public static void main(String[] args) {

        /****************************************
         * Arbeta med multidimensionella arrayer
         ***************************************/

        // Steg 1. Skapa en referensvariabel
        String[][] demo ;

        // Steg 2. Skapa objektet (reservera minne)
        demo = new String[4][5]; // 4 rader, 5 kolumner

        System.out.println(demo);
        // Hash Code skrivs ut t.ex. 38af3868

        // Skriv ut den första cellen
        System.out.println(demo[0][0]); // null

        demo[0][0] = "Test";
        System.out.println(demo[0][0]);

        // Exempel från Oracle, The Java Tutorials
        // https://docs.oracle.com/javase/tutorial/java/nutsandbolts/arrays.html
        String[][] names = {
        // Rad 1 har index 0
                {"Mr. " , "Mrs." , "Ms. "} ,
        // Kolumn  0         1       2
        // Rad 2 har index 1
                {"Smith", "Jones" }
        // Kolumn  0         1
        } ;

        // Skriv ut Mr. Smith
        System.out.println(names[0][0] + names[1][0]);

        // Skriv ut Ms. Jones
        System.out.println(names[0][2] + names[1][1]);

        System.out.println(Arrays.toString(names));
        // [[Ljava.lang.String;@77459877, [Ljava.lang.String;@5b2133b1]
        // OBS!
        // Metoden toString som finns i klassen Arrays,
        // fungerar enbart med enkla arrayer.
        // Vi måste använda metoden deepToString,
        // för att skriva ut en multi-array.

        System.out.println(Arrays.deepToString(names));
        // [[Mr. , Mrs., Ms. ], [Smith, Jones]]

        System.out.println();
        print2D(names);
        print2DArray(names);

        // Skapa en tabell 10x10
        // Tabellen ska innehålla en multiplikationstabell
        // av alla tal från 1 till 10
        String[][] table = new String[10][10];
        for (int row = 0; row < 10 ; row++) {
            for (int col = 0; col < 10; col++) {
                table[row][col] = "" + (row+1) * (col+1) ;
            }
        }

        print2DArray(table);



        System.out.println();

        // Mer om metoden deepToString
        System.out.println(
                Arrays.deepToString(table)
                        .replace("[[", "")
                        .replace("]]" , "")
                        .replace("], [", "\n")
                        .replace("," , "\t")
        );


    }

    /**
     * En klassmetod som skriver ut en 2D-Array
     * med foreach-loopar
     * @param names en 2D-Array
     */
    static void print2DArray(String[][] names) {
        // Skriv ut names med foreach-loopar
        for (String[] row : names) {
            for (String col : row) {
                System.out.print(col + "\t");
            }
            System.out.println();
        }
    }

    /**
     * En klassmetod som skriver ut en 2D-Array med for-loopar
     * @param names en 2D-Array
     */
    static void print2D(String[][] names) {
        // Skriv ut arrayen names med for-loopar
        for (int row = 0; row < names.length ; row++) {
            // Gå igenom raderna
            // System.out.println(names[row]);  // OBS! HashCode skrivs ut
            for (int col = 0; col < names[row].length ; col++) {
                System.out.print(names[row][col] + "\t");
            }
            System.out.println();
        }
    }
}
