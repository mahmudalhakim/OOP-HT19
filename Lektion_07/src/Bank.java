import javax.swing.*;
import java.util.jar.JarOutputStream;

/**
 * Created by Mahmud Al Hakim
 * Nackademin - Stockholm - Sweden
 * Project: OOP_HT19
 * Date: 2019-11-04 12:59
 * Copyright: MIT
 */

public class Bank {

    public static void main(String[] args) {

/*
Övning
• Skriv ett program som beräknar hur mycket pengar man får på ett bankkonto,
om man sätter in 1000kr och låter pengarna stå inne under ett visst antal år.

• När man kör programmet frågar det efter räntesatsen, som anges i procent,
och hur många år pengarna skall stå inne.

• Som resultat visar programmet en tabell
där man kan se hur mycket kapitalet har växt efter varje år.
*/

        // Vi startar med 1000 kr
        // principle = kapitalet
        double principle = 1000;

        // Antal år
        String input = JOptionPane.showInputDialog("Antal år?");
        // int years = 5;
        int years = Integer.parseInt(input);

        // Ränta som anges i procent
        input = JOptionPane.showInputDialog("Ränta?");
        // double interest = 2.5;
        // double interest = Double.parseDouble(input);
        double interest = Double.parseDouble(input);

        // Lagra resultatet i en tabell
        String result = "";

        for (int i = 1; i <= years; i++) {
            // beräkna hur mycket kapitalet har växt efter varje år
            principle += principle * interest * 0.01; // eller interest/100
            System.out.println("År " + i + ": " + Math.round(principle));
            result += "År " + i + ": " + Math.round(principle) + "\n";
            // JOptionPane.showMessageDialog(null,"År " + i + ": " + Math.round(principle));
        }

        // Visa en tabell för resultatet
        JOptionPane.showMessageDialog(null,result);


    }
}
