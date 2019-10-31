import javax.swing.*;

/**
 * Created by Mahmud Al Hakim
 * Nackademin - Stockholm - Sweden
 * Project: OOP_HT19
 * Date: 2019-10-31 09:20
 * Copyright: MIT
 */

public class Dialogrutor {

    /**
     * Dialogrutor
     * Exempel på showConfirmDialog
     * @param args används ej
     */
    public static void main(String[] args) {

        // showConfirmDialog
        // Exempel 1
        /*
        int option =  JOptionPane.showConfirmDialog(null, "Är du över 18 år?");
        System.out.println("option = " + option);
        // option = 0 => YES eller Enter på första valet
        // option = 1 => NO
        // option = 2 => Cancel-knappen
        // option = -1 => Kryss-knappen eller Esc-tangent
        if(option == 0)  // YES / Ja / Enter
            JOptionPane.showMessageDialog(null, "Du får köpa tobak");
        else if(option == 1) // No /Nej
            JOptionPane.showMessageDialog(null, "Tyvärr, du får inte handla här");
        else
           System.exit(0);

        */

        // showConfirmDialog
        // Exempel 1
        int option = JOptionPane.showConfirmDialog(
                null, "Ange ålder", "Hur gammal är du?", JOptionPane.OK_CANCEL_OPTION);
        System.out.println("option = " + option);

    }
}
