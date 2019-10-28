import java.util.Random;

/**
 * Created by Mahmud Al Hakim
 * Nackademin - Stockholm - Sweden
 * Project: OOP_HT19
 * Date: 2019-10-28 14:08
 * Copyright: MIT
 */

public class Matematik {
    public static void main(String[] args) {

        // Konstanter i standardklassen Math
        double PI = Math.PI;
        System.out.println("PI = " + PI);
        System.out.println("PI = " + Math.PI);

        double E = Math.E;
        System.out.println("E = " + E);
        System.out.println("E = " + Math.E);

        // Absolutvärde
        double tal = -22;
        System.out.println(Math.abs(tal));

        // Avrundning till närmaste heltal
        System.out.println(Math.round(10.4)); // 10
        System.out.println(Math.round(10.5)); // 11

        // Upphöjt till
        System.out.println(Math.pow(2,1)); // 2
        System.out.println(Math.pow(2,2)); // 2*2
        System.out.println(Math.pow(2,3)); // 2*2*2
        System.out.println(Math.pow(2,4)); // 2*2*2*2

        System.out.println(Math.pow(3,1)); // 3
        System.out.println(Math.pow(3,2)); // 3*3
        System.out.println(Math.pow(3,3)); // 3*3*3
        System.out.println(Math.pow(3,4)); // 3*3*3*3

        // Kvadratrot
        System.out.println(Math.sqrt(25));  // 5
        System.out.println(Math.sqrt(16));  // 4
        System.out.println(Math.sqrt(100));  // 10
        System.out.println('\u221A' + "25 = " + Math.sqrt(25));

        // Max och Min
        int tal1 = 2;
        int tal2 = 5;
        System.out.println(Math.max(tal1,tal2)); // 5
        System.out.println(Math.min(2,5)); // 2

        System.out.println(Math.ceil(1.1)); // 2.0
        System.out.println(Math.ceil(1.9)); // 2.0
        System.out.println(Math.floor(1.9)); // 1.0

        // Slumptal mellan 0.0 och 1.0 (exklusive)
        System.out.println(Math.random());
        System.out.println(Math.random());

        // Slumptal mellan 1 och 100
        System.out.println( (int) (Math.random() * 100) + 1 );
        System.out.println( (int) (Math.random() * 100) + 1 );

        // Klassen Random
        Random random = new Random();
        System.out.println(random.nextInt());
        System.out.println(random.nextInt());

        System.out.println(random.nextInt(3));
        System.out.println(random.nextInt(3));

    }
}
