import javax.swing.*;

/**
 * Created by Mahmud Al Hakim
 * Nackademin - Stockholm - Sweden
 * Project: OOP_HT19
 * Date: 2019-11-06 13:16
 * Copyright: MIT
 */

public class Primtaltest {
    public static void main(String[] args) {

        // Extra beställning
        // Man ska kunna läsa in flera tal
        // Lösning med while(true)
        while (true) {
            // 1. Läs in ett tal
            // TODO: Läs in via en dialogruta
            String input = JOptionPane.showInputDialog("Ange ett tal");
            // TODO: Avbryt om null
            if (input == null)
                break;  // Hoppa till rader efter while

            // TODO: Konvertera String till int
            int number = Integer.parseInt(input);
            // Testkod
            // int number = 11;

            // 2. Testa om talet är ett primtal
            boolean isPrime = true;

            // 2.1 Upprepa följande för alla tal n i intervallet 2 till talet-1
            for (int n = 2; n < number; n++) {
                // 2.2 Om resten (%) blir 0 när man dividerar talet med n
                if (number % n == 0) {
                    // Sätt isPrime till false
                    isPrime = false;
                }
            }

            // 3. Visa resultatet
            // Visa resultatet i terminalen
            System.out.println(isPrime);

            // TODO: Visa resultatet i en dialogruta
            JOptionPane.showMessageDialog(
                    null, "Talet "
                            + number
                            + " är "
                            + (isPrime ? "" : " inte ")
                            + " primtal"

            );
        } // while
        // Hit kommer man om användaren avbryter
    }
}
