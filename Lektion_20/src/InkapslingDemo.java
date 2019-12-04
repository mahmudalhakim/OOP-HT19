import java.time.Period;

/**
 * Created by Mahmud Al Hakim
 * Nackademin - Stockholm - Sweden
 * Project: OOP_HT19
 * Date: 2019-12-04 11:23
 * Copyright: MIT
 */

public class InkapslingDemo {

    public static void main(String[] args) {

        Person p1 = new Person();
        // p1.firstName = null;
        p1.setAge(50);
        // p1.setFirstName(null);
        // p1.setLastName("");

        Person p2 = new Person();
        System.out.println(p2.getFirstName());
        System.out.println(p2.getLastName());
        p2.setFirstName("James");
        p2.setLastName("Gosling");
        p2.setAge(60);

        System.out.println(p2.getFirstName() + " " + p2.getLastName());

        System.out.println(p2);

        Point punkt1 = new Point();
        punkt1.setX(10);
        punkt1.setY(10);
        System.out.println("(" + punkt1.getX() + "," + punkt1.getY() + ")");
        System.out.println(punkt1);

        Person p4 = new Person("Mahmud", "Al Hakim", 45);
        // Person p5 = new Person(null, "");
        Person p6 = new Person("James, Gosling");
        System.out.println(p6);

        Person p7 = new Person(1.7, 88);
        System.out.println(p7);


        // Anrop av en instansmetod
        // OBS! Vi måste skapa en instans (ett objekt)
        Person p8 = new Person(1.8, 75);
        p8.setFirstName("Mahmud");
        p8.setLastName("Al Hakim");
        System.out.println(p8.getBMI());

        // Anrop av en klassmetod
        // Inga instanser behövs
        System.out.println(Person.getBMI(1.8, 75));


    }
}
