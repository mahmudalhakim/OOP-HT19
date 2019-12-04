
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

    }
}
