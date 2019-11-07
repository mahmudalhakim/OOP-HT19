import javax.swing.*;

/**
 * Created by Mahmud Al Hakim
 * Nackademin - Stockholm - Sweden
 * Project: OOP_HT19
 * Date: 2019-11-07 09:35
 * Copyright: MIT
 */

public class DemoAvFel {
    public static void main(String[] args) {
        String t = JOptionPane.showInputDialog("Ett tal?"); // 123456
        if(t == null)
            System.exit(0);

        boolean ok = true;

        for (int i = 0; i < t.length(); i++) {

            //  System.out.println(t.charAt(i));
            if (t.charAt(i) >= '0' && t.charAt(i) <= '9') {
                ok = true;
            } else {
                ok = false;
                break;
            }

        } // for

        if (ok)
            JOptionPane.showMessageDialog(null, "Talet är OK");
        else
            JOptionPane.showMessageDialog(null, "Inget tal.");

        // Skriv om if-else med ternary-operator
        String message = "Talet är"
                + (ok ? "" : " inte")  // Bra att kunna
                + " heltal";
        System.out.println(message);

    }
}
