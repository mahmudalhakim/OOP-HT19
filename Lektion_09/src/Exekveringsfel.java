import javax.swing.*;

/**
 * Created by Mahmud Al Hakim
 * Nackademin - Stockholm - Sweden
 * Project: OOP_HT19
 * Date: 2019-11-07 10:29
 * Copyright: MIT
 */

public class Exekveringsfel {

    public static void main(String[] args) throws InterruptedException {

        while (true) {
            String input = JOptionPane.showInputDialog("Ange ett tal");

            if (input == null)
                break;

            try {
                int tal = Integer.parseInt(input);
                // OBS! Vid fel hoppar programmet till catch
                System.out.println("Efter parse!");
                System.out.println("Du har matat in " + tal);
                JOptionPane.showMessageDialog(null, "Du har matat in " + tal);

                break;

            } catch (NumberFormatException e) {
                // e.printStackTrace();
                System.out.println("Felaktig inmatning");
                System.out.println(e.getMessage());
                JOptionPane.showMessageDialog(null, "Felaktig inmatning");
            }
        }
        System.out.println("Efter while");

    }
}
