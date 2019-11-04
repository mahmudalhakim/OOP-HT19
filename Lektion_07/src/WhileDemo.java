import javax.swing.*;

/**
 * Created by Mahmud Al Hakim
 * Nackademin - Stockholm - Sweden
 * Project: OOP_HT19
 * Date: 2019-11-04 09:18
 * Copyright: MIT
 */

public class WhileDemo {

    public static void main(String[] args) {

        // While-loopar
        // Exempel 1
        // Skriv ut alla jämna tal mellan 1 och 10
        int number = 2;
        String result = "Jämna tal: ";
        while (number <= 10) {
            result = result + " " + number;
            number = number + 2;
        }
        System.out.println(result);

        // Exempel 2
        // Skriv ut alla udda tal mellan 1 och 10
        number = 1;
        result = "Udda tal: ";
        while (number <= 10) {
            result = result + " " + number;
            number = number + 2;
        }
        System.out.println(result);

/*
Övning
Skriv ett program som beräknar summan av ett heltal,
enligt följande: 1+2+3+4+... n
Använd en while-loop.
Skriv testkod för att testa olika heltal.
Exempel:
Om input är 5
Så skall programmet räkna ut 1+2+3+4+5
Output är 15
*/
        // Input
        // Testkod
        // int n = 15;
        while(true) { // Oändlig loop
            String input = JOptionPane.showInputDialog("Ange talet n: ");
            if(input == null)  // Vid avbryt går ur loopen
                break;

            int n = Integer.parseInt(input);
            int summa = 0;
            while (n > 0) {
                summa = summa + n;
                n--;
            }
            // Output
            System.out.println(summa);
            JOptionPane.showMessageDialog(
                    null,
                    "Summan av n = " + summa);
        } // while
        // Hit kommer man vid break
    }
}
