import javax.swing.*;

/**
 * Created by Mahmud Al Hakim
 * Nackademin - Stockholm - Sweden
 * Project: OOP_HT19
 * Date: 2019-11-04 13:52
 * Copyright: MIT
 */

public class DoDemo {
    public static void main(String[] args) {

        String result = "";
        int option;

        do {
            // Läs in (Input)
            String input = JOptionPane.showInputDialog("Ange ett tal");

            // Gör beräkningar
            // Visa resultat eller lagra i t.ex. variabeln result

            // Gå tillbaka till input om användaren klickar på YES/Ja-Knapp
            option = JOptionPane.showConfirmDialog(null,"Ny beräkning?");

        }while(option == JOptionPane.YES_OPTION);

        // Skriv ut resultatet
        System.out.println(result);
    }
}
