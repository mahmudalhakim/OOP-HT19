/**
 * Created by Mahmud Al Hakim
 * Nackademin - Stockholm - Sweden
 * Project: OOP_HT19
 * Date: 2019-11-04 14:06
 * Copyright: MIT
 */

public class NestedLoops {

    public static void main(String[] args) {

        int rows = 5;
        int columns = 5;

        for (int row = 1; row <= rows; row++) {
            System.out.print("Rad " + row + ": ");
            for (int col = 1; col <= columns; col++) {
                System.out.print(col + " | ");
            }
            System.out.println(); // en tom rad
        }
        /*
                Rad 1: 1 | 2 | 3 | 4 | 5 |
                Rad 2: 1 | 2 | 3 | 4 | 5 |
                Rad 3: 1 | 2 | 3 | 4 | 5 |
                Rad 4: 1 | 2 | 3 | 4 | 5 |
                Rad 5: 1 | 2 | 3 | 4 | 5 |
         */


        // Övning
        // Skapa ett program som visar multiplikationstabellen i terminalen
        System.out.println("***************************************");
        System.out.println("****** Multiplikationstabellen ********");
        for (int row = 1; row <= 10; row++) {     // Hanterar rader
            for (int col = 1; col <= 10; col++) { // Hanterar kolumner
                System.out.print(row*col + "\t");
            }
            System.out.println();
        }
        System.out.println("***************************************");




    }
}
