import javax.swing.*;

/**
 * Created by Mahmud Al Hakim
 * Nackademin - Stockholm - Sweden
 * Project: OOP_HT19
 * Date: 2019-10-28 10:04
 * Copyright: MIT
 */

public class Dialogrutor {

    public static void main(String[] args) {

        String name = JOptionPane.showInputDialog("Ange ditt namn");
        System.out.println(name.getClass().getSimpleName());

        String  input = JOptionPane.showInputDialog("Ange ålder?");

        // Konvertera från String till int
        int age = Integer.parseInt(input);

        input = JOptionPane.showInputDialog("Ange längd i meter");
        // Konvertera från String till double
        double length = Double.parseDouble(input);

        System.out.println("Hej " + name);
        System.out.println("Du är " + age * 365 + " dagar gammal"  );
        System.out.println("Du är " + length + " meter lång");


    }
}
