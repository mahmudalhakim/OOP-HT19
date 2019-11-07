import javax.swing.*;

/**
 * Created by Mahmud Al Hakim
 * Nackademin - Stockholm - Sweden
 * Project: OOP_HT19
 * Date: 2019-10-31 10:36
 * Copyright: MIT
 */

public class SwitchDemo {


    /**
     * Exempel på switch-satsen
     * Lite mer om dialogrutor
     * och magic numbers
     * @param args används ej
     */
    public static void main(String[] args) {

        // IF-else från lektion 5
        int points = 5;
        String grade;
        if (points <= 10) {
            grade = "IG";
        } else if (points <= 20) {
            grade = "G";
        } else {
            grade = "VG";
        }

        // Exempel 1
        switch (grade) {
            case "G":
                System.out.println("Du är fått G i kursen");
                break;
            case "VG":
                System.out.println("Du är fått VG i kursen");
                break;
            case "IG":
                System.out.println("Du är fått IG i kursen");
                break;
            default:
                System.out.println("Felaktig input");
        }

        // Exempel 2
        // Testa talen 1 till 9
        // Visa om ett tal är udda eller jämnt med en switch-sats
        int number = 2;
        switch (number) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 9:
                System.out.println("Udda");
                break;
            case 2:
            case 4:
            case 6:
            case 8:
                System.out.println("Jämnt");
                break;
        }

        // Exempel 3
        int option =  JOptionPane.showConfirmDialog(null, "Är du över 18 år?");

        /*
        Skriv om följane if-else med switch
         if(option == 0)  // YES / Ja / Enter
            JOptionPane.showMessageDialog(null, "Du får köpa tobak");
        else if(option == 1) // No /Nej
            JOptionPane.showMessageDialog(null, "Tyvärr, du får inte handla här");
        else
            System.exit(0);
         */
        // System.out.println("option = " + option);
        // option = 0  => YES eller Enter på första valet
        // option = 1  => NO
        // option = 2  => Cancel-knappen
        // option = -1 => Kryss-knappen eller Esc-tangent


        switch (option){
            case JOptionPane.YES_OPTION:
                JOptionPane.showMessageDialog(null, "Du får köpa tobak");
                break;
            case JOptionPane.NO_OPTION:
                JOptionPane.showMessageDialog(null, "Tyvärr, du får inte handla här");
                break;
            default:
                System.exit(0);
        }
    }
}
