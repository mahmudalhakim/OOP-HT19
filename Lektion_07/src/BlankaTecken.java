import javax.swing.*;

/**
 * Created by Mahmud Al Hakim
 * Nackademin - Stockholm - Sweden
 * Project: OOP_HT19
 * Date: 2019-11-04 11:37
 * Copyright: MIT
 */

public class BlankaTecken {
    public static void main(String[] args) {

        /*
        Övning
        Skapa ett program som läser in en mening från en dialogruta.
        Programmet räknar antalet blanka tecken (mellanslag) i texten.
         */
        // TEST CODE
        // String test = "Mahmud     Al    Hakim";
        String test = JOptionPane.showInputDialog("Skriv en mening");
        int counter = 0;
        for (int i = 0; i < test.length() ; i++) {
            if(test.charAt(i) == ' '){
                counter++;
            }
        }
        // System.out.println("Antal blanka tecken: " + counter);
        JOptionPane.showMessageDialog(
                null, "Antal blanka tecken: " + counter);
    }
}
