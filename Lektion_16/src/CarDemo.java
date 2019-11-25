/**
 * Created by Mahmud Al Hakim
 * Nackademin - Stockholm - Sweden
 * Project: OOP_HT19
 * Date: 2019-11-25 10:04
 * Copyright: MIT
 */

public class CarDemo {

    public static void main(String[] args) {

        /*******************************************
         * Skapa ett antal instanser av klassen Car
         = Skapa några objekt av klassen
         *******************************************/

        // Steg 1: Deklarera en referensvariabel
        Car c1;

        // Steg 2: Skapa ett objekt med nyckelordet new
        c1 = new Car();

        // Steg 1 och Steg 2 i samma sats
        Car c2 = new Car();

        // Arbeta med objektens egenskaper (instansvariabler)
        c1.modelName = "Audi";
        c1.modelYear = 2019;

        c2.modelName = "Volvo";
        c2.price = 200_000;

        // Skriv ut objektens egenskaper
        System.out.println(" --- Bilen som har referensvariabeln c1 --- ");
        System.out.println("Objektet är an " + c1.modelName);
        System.out.println("Bilen kostar " + c1.price); // OBS 0.0


        System.out.println(" --- Bilen som har referensvariabeln c2 --- ");
        System.out.println("Mahmud har en " + c2.modelName);
        System.out.println("Bilen kostar " + Math.round(c2.price));
        System.out.println("Modell : " + c2.modelYear); // 0


    }
}
