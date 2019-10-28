import javax.swing.*;

/**
 * Created by Mahmud Al Hakim
 * Nackademin - Stockholm - Sweden
 * Project: OOP_HT19
 * Date: 2019-10-28 13:57
 * Copyright: MIT
 */

public class Mobil {
    
    /*

    Skapa ett program som läser in antalet minuter man i genomsnitt ringer per månad
    samt kostnaden per minut.

• Programmet beräknar kostnaden per månad.
• Skriv testkod för att testa olika input-värden.
• Visa resultatet i terminalen.
• Använd dialogrutor för att läsa in data.
• Visa resultatet i en dialogruta.
• OBS! För att visa decimalkomma och flera decimaler behövs en speciell redigerare. (se avsnitt 9.5 i boken)

     */

    public static void main(String[] args) {
        
        // Testkod 
        // Antalet minuter man i genomsnitt ringer per månad 
        // int antal = 1000;
        // kostnaden per minut
        // double minutpris = 0.9;

        String input = JOptionPane.showInputDialog("Ange antal minuter per månad");
        int antal = Integer.parseInt(input);

        input = JOptionPane.showInputDialog("Ange pris per minut t.ex. 0.7");
        double minutpris = Double.parseDouble(input);
        
        // Programmet beräknar kostnaden per månad.
        double kostnad = antal * minutpris;

        // Testkod
        System.out.println("Din totala kostnad per månad är  " + kostnad);

        JOptionPane.showMessageDialog(null,
                "Din totala kostnad per månad är  " + kostnad);
        
    }
}
