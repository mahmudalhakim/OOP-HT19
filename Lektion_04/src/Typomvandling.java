/**
 * Created by Mahmud Al Hakim
 * Nackademin - Stockholm - Sweden
 * Project: OOP_HT19
 * Date: 2019-10-28 13:27
 * Copyright: MIT
 */

public class Typomvandling {
    public static void main(String[] args) {

        // Implicit typomvandling (automatisk)

        // Enklare typ
        int heltal = 100;  // Plats för 32 bitar

        // Större typ
        double flyttal = heltal;  // Plats för 64 bitar
        flyttal = 100.90;
        // heltal =  flyttal; // Fel

        // Explicit typomvandling (cast)
        heltal = (int) flyttal; // Kan vara farligt!
        System.out.println(heltal);
        
        // Flera exempel
        double d1 = 1.9999;
        int i1 =  (int) d1;  // 1 (decimaler kapas)
        System.out.println("i1 = " + i1);

        int i2 = 127;
        byte b1 = (byte) i2;
        System.out.println("b1 = " + b1);

        i2 = 128;
        b1 = (byte)i2; // OBS! Farligt!
        System.out.println("b1 = " + b1);

    }
}
