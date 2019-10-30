import javax.swing.*;

/**
 * Created by Mahmud Al Hakim
 * Nackademin - Stockholm - Sweden
 * Project: OOP_HT19
 * Date: 2019-10-30 09:13
 * Copyright: MIT
 */

public class Villkor {

    public static void main(String[] args) {

        /*********************************************
         * IF-SATSEN
         ***********************************************/

        if (true)
            System.out.println("Alltid sant!");

        boolean test = true;
        if (test)
            System.out.println("Sant");

        // Test
        int age;

        age = 10;
        if (age < 18)
            System.out.println("Du är ett barn!");

        age = 20;
        if (age >= 18)
            System.out.println("Du är en vuxen!");


//        String input = JOptionPane.showInputDialog("Ange ålder");
//        age = Integer.parseInt(input);

        if (age < 18) {
            JOptionPane.showMessageDialog(
                    null, "Du är ett barn");
            JOptionPane.showMessageDialog(
                    null, "Besök närmaste Disneybutik"
            );
        }

        if (age >= 18) {
//            JOptionPane.showMessageDialog(
//                    null, "Du är en vuxen!"
//            );
//            JOptionPane.showMessageDialog(
//                    null, "Välkommen till klubben"
//            );
        }

        /*********************************************
         * ELSE-SATSEN
         *********************************************/
        // Test
        int number = 5;

        if (number > 6) {
            System.out.println("Det här är IF-satsen");
        } else {
            System.out.println("Det här är ELSE-satsen");
        }

        /*********************************************
         * IF-ELSE-SATSEN
         *********************************************/
        if (age < 18) {
            System.out.println("Barn");
        } else {
            System.out.println("Vuxen");
        }

        /*********************************************
         * ELSE-IF-SATSEN
         *********************************************/

        int points = 21;
        if (points <= 10) {
            System.out.println("IG");
        } else if (points <= 20) {
            System.out.println("G");
        } else {
            System.out.println("VG");
        }

    }
}
