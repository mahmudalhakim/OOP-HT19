import java.time.Period;

/**
 * Created by Mahmud Al Hakim
 * Nackademin - Stockholm - Sweden
 * Project: OOP_HT19
 * Date: 2019-12-02 12:52
 * Copyright: MIT
 */

public class PersonDemo {

    public static void main(String[] args) {

        Person p1 = new Person();
        Person p2 = new Person();

        p1.setFirstName("Mahmud");
        p1.setLastName("Al Hakim");
        p1.setAge(46);

        // Skriv ut en klassvariabel
        System.out.println(Person.info);
        System.out.println(Person.konstant);
        // Anrop av en klassmetod (statisk metod)
        Person.info();
        Person.print();

        p2.setName("James", "Gosling");
        System.out.println(p2.firstName);

        Person p3 = new Person();
        p3.setName("Kalle , Anka");

        System.out.println(p1); // toString() anropas automatiskt
        System.out.println(p2);
        System.out.println(p3);

    }
}
