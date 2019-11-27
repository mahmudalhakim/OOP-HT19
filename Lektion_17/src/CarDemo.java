/**
 * Created by Mahmud Al Hakim
 * Nackademin - Stockholm - Sweden
 * Project: OOP_HT19
 * Date: 2019-11-27 09:24
 * Copyright: MIT
 */

public class CarDemo {
    public static void main(String[] args) {

        // Skapa ett antal bilar
        // = Skapa några instanser av klassen Car
        // = Skapa några objekt
        Car car1 = new Car();
        Car car2 = new Car();

        // Skapa några personer
        Person person1 = new Person();
        Person person2 = new Person();

        // Arbeta med instansvariabler
        System.out.println(car1.price); // 0.0
        car1.price = 100_000;
        car1.modelName = "Nisan";
        car1.modelYear = 2020;
        car1.owner = person1;

        person1.name = "James Gosling";

        // Arbeta med klassvariabler
        System.out.println("Pris exkl. moms : " + car1.price);
        System.out.println("Pris inkl. moms : "
                + Math.round(car1.price * (1 + Car.moms)) + "kr");
        //                                  OBS! Viktigt

        // Kan vi ändra klassvariabler?
        // Ja, t.ex
        Car.moms = 0.20; // Moms sänks till 20%
        System.out.println("Pris inkl. moms : "
                + car1.price * (1 + Car.moms));
        // OBS! Alla bilar får den nya momssatsen.

    }

}
