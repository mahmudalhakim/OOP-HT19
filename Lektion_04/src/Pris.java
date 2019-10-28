import javax.swing.*;

/**
 * Created by Mahmud Al Hakim
 * Nackademin - Stockholm - Sweden
 * Project: OOP_HT19
 * Date: 2019-10-28 12:45
 * Copyright: MIT
 */

public class Pris {

/*
1)
Skriv ett program som läser in en varas pris, inkl. moms.
Programmet skall också till en variabel av typen int läsa in
momssatsen som skall vara ett helt antal procent.
2)
Programmet skall beräkna dels varans pris exkl. moms och dels momsen.
3)
Skriv testkod för att testa olika input-värden.
Visa resultatet i terminalen.
4)
Läs in data via olika dialogrutor.
Visa resultatet i en dialogruta.
*/
    public static void main(String[] args) {

        // Testkod (Test Code)
        // Deklarera några variabler
        // Pris, inkl. moms
        // int prisInklMoms = 100;
        // Momssatsen (ett helt antal procent)
        // int momssats = 25;

        String input = JOptionPane.showInputDialog(("Ange pris inkl. moms"));
        int prisInklMoms = Integer.parseInt(input);

        input = JOptionPane.showInputDialog("Ange momssatsen t.ex. 25");
        int momssats = Integer.parseInt(input);

        // Problemet
        // Programmet skall beräkna dels varans pris exkl. moms och dels momsen.
        // En formel som löser 50% av problemet
        // Beräkna pris utan moms: (pris inkl. moms) / (1 + (moms /100))
        // https://www.momsens.se/rakna-moms-baklanges
        double prisExklMoms = prisInklMoms / (1 + momssats / 100.0) ;
        double moms = prisInklMoms - prisExklMoms;

        // Testkod
        // System.out.println("Pris exkl. moms: " + prisExklMoms);
        // System.out.println("Moms: " + moms);

        JOptionPane.showMessageDialog(null,
                "Pris exkl. moms: " + prisExklMoms + "\n" +
                        "Moms: " + moms
        );

    }
}
