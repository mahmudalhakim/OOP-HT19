import javax.swing.*;

/**
 * Created by Mahmud Al Hakim
 * Nackademin - Stockholm - Sweden
 * Project: OOP_HT19
 * Date: 2019-11-21 09:10
 * Copyright: MIT
 */

public class Ovning_12_2 {

    /*************************************
     * Övning 12.2
     * Sidan 278
     *************************************/
    public static void main(String[] args) {

        // Övning
        // Att skapa en multiplikationstabell
        // Pseudokod
        // ---------
        // 1. Be användaren mata in storleken
        // Begränsa till 1-10
        // Starta alltid med testkod
        // 2. Skapa en 2D-tabell (rader = kolumner)
        // Använd två nästlade loopar
        // Lagra i varje cell (rad+1)*(kolumn+1)
        // 3. Skriv ut tabellen

        // 1. Läs in ett tal
        // Testkod
        int n = -6;
        // OBS! Vid negativa värden => NegativeArraySizeException
        // OBS! Vid stora tal => OutOfMemoryError: Java heap space

        // TODO: 2019-11-21  Be användaren mata in talet n mellan 1-10
        // 1.1. Läs in via terminalen
        /*
        Scanner scan = new Scanner(System.in);
        System.out.println("Ange ett tal mellan 1 och 10");
        // TODO: 2019-11-21 Testa felaktig inmatning t.ex. text (sträng)
        if(scan.hasNextInt()){
            n = scan.nextInt();
            // TODO: 2019-11-21 Testa negativa tal
            // TODO: 2019-11-21 Testa stora tal
            if(n<1 || n>10){
                System.out.println("Felaktig inmatning (utanför gränserna)");
                System.exit(0);
            }

        }
        else{
            System.out.println("Felaktig inmatning");
            System.exit(0);
            // TODO: 2019-11-21
            // Visa ett felmeddelande och be användaren mata in ett nytt tal
        }

         */


        // 1.2 Läs in via en dialogruta
        String input = JOptionPane.showInputDialog("Ange ett tal mellan 1-10");
        try {
            n = Integer.parseInt(input);
            if (n < 1 || n > 10) {
                JOptionPane.showMessageDialog(null,
                        "Felaktig inmatning (utanför gränserna)");
                System.exit(0);
            }
            // TODO: 2019-11-21 Vid parse error (NumberFormatException)

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(
                    null,
                    "Felaktig inmatning. \n"
                            + e.getMessage()
            );
            System.exit(0);
        }

        // 2. Skapa tabellen
        int[][] table = new int[n][n];

        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                table[row][col] = (row + 1) * (col + 1);
            }
        }

        // 3. Skriv ut tabellen
        for (int[] row : table) {
            for (int col : row) {
                System.out.print(col + "\t");
            }
            System.out.println();
        }


    }
}
