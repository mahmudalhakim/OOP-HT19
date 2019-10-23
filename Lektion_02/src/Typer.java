import javax.swing.*;

/**
 * Created by Mahmud Al Hakim
 * Nackademin - Stockholm - Sweden
 * Project: Lektion2
 * Date: 2019-10-23 09:24
 * Copyright: MIT
 */

public class Typer {

    public static void main(String[] args) {


        System.out.println("Variabler och typer i Java");

        // Variabeldeklarationer
        // Referenstyper
        String name;

        // Primitiva typer
        // 1. Heltalstyper
        byte b;
        short s;
        int i;
        long l;

        // 2. Flyttalstyper (tal med decimaler)
        float f;
        double d;

        // 3. Booleska typer
        boolean bool;

        // 4. Enkla tecken
        char c;

        // Tilldelning
        name = "Mahmud";

        // Initiering
        int age = 45;
        double weight = 89.5; // kg
        double length = 1.70; // m

        System.out.println("Hej " + name);
        System.out.println("Du väger " + weight + "kg") ;
        System.out.println("Du är " + length + "m");

        JOptionPane.showMessageDialog(null ,
                "Hej " + name + "\nDu väger " +
                        weight + "kg\nDu är " + length + "m");

    }

}
