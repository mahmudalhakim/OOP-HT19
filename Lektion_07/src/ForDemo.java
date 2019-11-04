import javax.swing.*;

/**
 * Created by Mahmud Al Hakim
 * Nackademin - Stockholm - Sweden
 * Project: OOP_HT19
 * Date: 2019-11-04 11:10
 * Copyright: MIT
 */

public class ForDemo {

    public static void main(String[] args) {

        // Demo på for-satsen

        // Exempel 1

        for (; ; ) { // Oändlig loop
            String input = JOptionPane.showInputDialog("Ange talet n: ");
            if (input == null)  // Vid avbryt går ur loopen
                break;

            int n = Integer.parseInt(input);
            int summa = 0;


            for (int k = 0; k <=n ; k++) {
                summa = summa + k;
            }
            System.out.println("Summa = " + summa);


            // Eller så här
            // En for-loop utan body
            // OBS! Semikolon för att avsluta loopen
            summa = 0;
            for (int k = 1; k <= n; summa += k++) ;

            JOptionPane.showMessageDialog(
                    null,
                    "Summan av n = " + summa);

        } // avslutar for (;;)
    }
}
