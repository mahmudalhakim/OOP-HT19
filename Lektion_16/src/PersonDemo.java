import java.time.LocalDate;
import java.util.Arrays;

/**
 * Created by Mahmud Al Hakim
 * Nackademin - Stockholm - Sweden
 * Project: OOP_HT19
 * Date: 2019-11-25 11:16
 * Copyright: MIT
 */

public class PersonDemo {
    public static void main(String[] args) {
        Person p1;
        Person p2;

        p1 = new Person();
        p2 = new Person();

        System.out.println(p1.firstName); // null

        p1.firstName = "Mahmud";
        p1.lastName = "Al Hakim";
        System.out.println(p1.firstName + " " + p1.lastName);
        // Mahmud Al Hakim
        p1.dateOfBirth = LocalDate.of(1973, 02, 02);
        System.out.println(p1.firstName + " är född " + p1.dateOfBirth);
        // Mahmud är född 1973-02-02

    }
}


