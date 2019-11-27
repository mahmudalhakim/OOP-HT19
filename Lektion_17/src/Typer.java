import java.util.Scanner;

/**
 * Created by Mahmud Al Hakim
 * Nackademin - Stockholm - Sweden
 * Project: OOP_HT19
 * Date: 2019-11-27 10:44
 * Copyright: MIT
 */

public class Typer {
    public static void main(String[] args) {
        // Primitiva typer
        byte b1 = 0;
        short s1 = 0;
        int i1 = 0;
        long l1 = 0;
        float f1 = 0.0f;
        double d1 = 0.0;
        char c1 = '\u00A9';

        // Referenstyper
        Car car1 = new Car();
        Person person1 = new Person();
        Scanner scan = new Scanner(System.in);

        String name1 = new String("Mahmud");
        String name2 = new String("Mahmud");
        // Vi får alltid ett nytt objekt

        String name3 = "Mahmud";
        String name4 = "Mahmud";
        // name4 pekar på samma objekt som name3 pekar på

        name3 = "Al Hakim";
        // Ett helt nytt objekt skapas
        // name4 pekar fortfarande på samma objekt

        String name5 = "Mahmud";
        // name5 pekar på samma objekt som name4 pekar på

        String name6 = "Al Hakim";
        // name6 pekar på samma objekt som name3 pekar på


    }
}
