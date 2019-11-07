import javax.swing.*;

/**
 * Created by Mahmud Al Hakim
 * Nackademin - Stockholm - Sweden
 * Project: OOP_HT19
 * Date: 2019-11-06 11:27
 * Copyright: MIT
 */

public class Pseudokod {

    public static void main(String[] args) {

        /****************************************************************
         * Pseudokod - Övning
         * 1. Beskriv i pseudokod en algoritm som läser in 10 tal
         *    och som beräknar och skriver ut medelvärdet av de inlästa talen.
         *
         * 2. Implementera pseudokoden (skriv källkod)
         *
         ****************************************************************

         Pseudokod - Iteration 1
         --------------------
         1. Läs in 10 tal
         2. Summera alla tal
         3. Dela summa med 10
         4. Visa resultatet

         Pseudokod - Iteration 2
         --------------------
         1. Läs in 10 tal
         1.1. Skapa nödvändiga variabler
              summa och medel
         1.2. Läs in 10 tal via 10 olika dialogrutor i en for-loop

         2. Summera alla tal
         2.1. Vi antar att alla tal är heltal
              Konvertera (parse) String till int
         2.2. Lägg in varje tal i summa

         3. Dela summa med 10
            OBS! Heltalsdivision är farlig!
            Dividera med 10.0 för att undvika heltalsdivision
            Lagra resultatet i variabeln medel

         4. Visa resultatet
         4.1. Visa medel i en dialogruta
         ****************************************************************/


        /*******  Implementera pseudokoden (skriv källkod) *************/

        // 1. Läs in 10 tal
        // Nödvändiga variabler
        int summa = 0;
        double medel = 0;

        for (int number = 1; number <= 10; number++) {

            // Testkod
            // Använd number för att testa 10 olika tal från 1 till 10

            // TODO: Läs in 10 tal via 10 olika dialogrutor

            // TODO: Konvertera String till int

            // 2. Summera alla tal
            summa += number;

        }

        // 3. Dela summa med 10
        medel = summa / 10.0;

        // 4. Visa resultatet
        System.out.println("Medel = " + medel);

        // TODO: Visa medel i en dialogruta


        /*****************************************************************
         * *******************  Extra övning *****************************
         *
         *      Hur läser man in alla tal via en enda dialogruta?
         *
         *      Begränsningar
         *      1. Vi får inte använda arrayer (t.ex. metoden split).
         *      2. Vi får inte använda en Scanner.
         *
         *****************************************************************/

        String numbers;

        // Testkod
        numbers = "1 2 3 4 5 6 7 8 9 10";
        //         0123456789

        // Läs in via en dialogruta
        // numbers = JOptionPane.showInputDialog("Skriv 10 tal, separera med mellanslag");

        // Lägg till ett mellanslag i slutet (krävs av algoritmen nedan)
        numbers = numbers + " ";

        int space = 0;
        for (int index = 0; index < numbers.length(); index++) {

            // Leta efter ett mellanslag från en specifik index
            space = numbers.indexOf(" ", index);

            // Hämta ett tal från index till mellanslag
            String number = numbers.substring(index, space);

            // Flytta index till nästa mellanslag
            index = space;

            // TODO: Arbeta med talet
            System.out.println(number);
        }
    }
}
