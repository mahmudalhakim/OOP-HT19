/**
 * Created by Mahmud Al Hakim
 * Nackademin - Stockholm - Sweden
 * Project: OOP_HT19
 * Date: 2019-11-25 12:56
 * Copyright: MIT
 */

public class Tilldelningar {

    public static void main(String[] args) {

        Car c1 = new Car();
        Car c2 = c1;  // OBS! Ingen kopiering
        System.out.println(c1 == c2);
        // true, därför att
        // c1 och c2 pekar på samma objekt
        c1.modelName = "Volvo";

        System.out.println(c2.modelName); // Volvo

        // Kopiering av objekt
        Car c3 = new Car();
        c3.modelName = c1.modelName;
        c3.modelYear = c1.modelYear;
        c3.price = c1.price;
        // c3 är just nu en kopia av c1

        // Jämförelser
        System.out.println(c3 == c1);      // false
        System.out.println(c3.equals(c1)); // false

        // OBS! Viktigt:
        // c3 och c1 pekar alltid på två olika objekt
        // true endast om c1 och c3 pekar på samma objekt


    }
}
