/**
 * Created by Mahmud Al Hakim
 * Nackademin - Stockholm - Sweden
 * Project: OOP_HT19
 * Date: 2019-12-02 12:50
 * Copyright: MIT
 */

public class Person {

    // Konstanter eller klassvariabler
    public static String info = "Klassen beskriver en person";
    public static final String konstant = "KONSTANT";
    public static final boolean canSpeak = true;


    // Instansvariabler
    String firstName;
    String lastName;
    int age;
    String personnummer;


    // Instansmetoder

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void setName(String name) {
        int comma = name.indexOf(",");
        if (comma == -1)
            throw new IllegalArgumentException("Kommatecken saknas!");

        this.firstName = name.substring(0, comma).trim();
        this.lastName = name.substring(comma + 1).trim();

    }

    // Klassmetoder (har alltid static)
    public static void info() {
        System.out.println(Person.info);
    }

    public static void print() {
        System.out.println("Klassen Person beskriver en person.");
    }

    @Override
    public String toString() {
        return firstName + " " + lastName;
    }
}
