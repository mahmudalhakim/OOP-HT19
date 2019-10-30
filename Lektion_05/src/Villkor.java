import javax.swing.*;

/**
 * Created by Mahmud Al Hakim
 * Nackademin - Stockholm - Sweden
 * Project: OOP_HT19
 * Date: 2019-10-30 09:13
 * Copyright: MIT
 */

public class Villkor {

    public static void main(String[] args) {

        /*********************************************
         * IF-SATSEN
         ***********************************************/

        if (true)
            System.out.println("Alltid sant!");

        boolean test = true;
        if (test)
            System.out.println("Sant");

        // Test
        int age;

        age = 10;
        if (age < 18)
            System.out.println("Du är ett barn!");

        age = 20;
        if (age >= 18)
            System.out.println("Du är en vuxen!");


//        String input = JOptionPane.showInputDialog("Ange ålder");
//        age = Integer.parseInt(input);

        if (age < 18) {
            JOptionPane.showMessageDialog(
                    null, "Du är ett barn");
            JOptionPane.showMessageDialog(
                    null, "Besök närmaste Disneybutik"
            );
        }

        if (age >= 18) {
//            JOptionPane.showMessageDialog(
//                    null, "Du är en vuxen!"
//            );
//            JOptionPane.showMessageDialog(
//                    null, "Välkommen till klubben"
//            );
        }

        /*********************************************
         * ELSE-SATSEN
         *********************************************/
        // Test
        int number = 5;

        if (number > 6) {
            System.out.println("Det här är IF-satsen");
        } else {
            System.out.println("Det här är ELSE-satsen");
        }

        /*********************************************
         * IF-ELSE-SATSEN
         *********************************************/
        if (age < 18) {
            System.out.println("Barn");
        } else {
            System.out.println("Vuxen");
        }

        /*********************************************
         * ELSE-IF-SATSEN
         *********************************************/

        int points = 21;
        if (points <= 10) {
            System.out.println("IG");
        } else if (points <= 20) {
            System.out.println("G");
        } else {
            System.out.println("VG");
        }

        /*********************************************
         * TERNARY-OPERATOR
         *********************************************/

        age = 17;
        String message = (age < 18) ? "Barn" : "Vuxen";
        System.out.println(message);

        age = 21;
        message = (age < 18) ? "Barn" : "Vuxen";
        System.out.println(message);

        // Övning
        // Skriv om denna sats med if-else
        // String msg = (age < 18) ? "Barn" : "Vuxen";

        String msg;
        if (age < 18)
            msg = "Barn";
        else
            msg = "Vuxen";

        /*****************************************************************
         *  Övning
         *  Skriv om följande if-else med en ternary-operator
         ****************************************************************/
        int time = 20;
        if (time < 18) {
            System.out.println("Good day.");
        } else {
            System.out.println("Good evening.");
        }

        // Lösning
        int tid = 20;
        System.out.println((tid < 18) ? "Good day!" : "Good evening!");

        tid = 9;
        System.out.println((tid < 18) ? "Good day!" : "Good evening!");


        /*****************************************************************
         * Övning
         * Skapa ett program som läser in antalet minuter man i genomsnitt
         *   ringer per månad samt kostnaden per minut.
         *
         * Ge kunden 10% rabatt om man ringer för minst 1000kr per månad.
         *
         * Skriv testkod för att testa olika input-värden.
         * Visa resultatet i terminalen.
         *
         ****************************************************************/

        System.out.println("------------------------------------");
        System.out.println("------------- FAKTURA --------------");
        // Testkod (Test Code)

        // Nödvändiga variabler
        int minutes = 5000;
        double pricePerMinute = 1.0;
        int procent = 20 ; // 20%

        System.out.println("Du har ringt " + minutes + " minuter denna månad");
        System.out.println("Pris per minut: " + pricePerMinute);
        // Beräkna totalkostnad per månad
        double total = minutes * pricePerMinute;
        System.out.println("Kostnad per månad: " + Math.round(total) + "kr");

        // Ge kunden 10% rabatt om man ringer över 1000
        if(total >= 1000){
            double rabatt = total * procent/100;
            total = total - rabatt;
            System.out.println("Du har fått " + procent +"% rabatt");
            // Tips: Explicit typomvandling (cast) för att ta bort decimalerna.
            System.out.println("Du har fått " + (int)rabatt + "kr rabatt");
            // Math.round() är bättre för att avrunda. Lita inte på (cast)
            System.out.println("Din totalkostnad blir: " + Math.round(total) + "kr");
        }






    }
}
