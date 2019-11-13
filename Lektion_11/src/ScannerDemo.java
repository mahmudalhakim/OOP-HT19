import javax.swing.*;
import java.util.Scanner;

/**
 * Created by Mahmud Al Hakim
 * Nackademin - Stockholm - Sweden
 * Project: OOP_HT19
 * Date: 2019-11-13 11:31
 * Copyright: MIT
 */

public class ScannerDemo {

    // Skapa ett scanner-objekt och koppla den till terminalen
    // (en instans av klasser Scanner)
    // scan är en klassvariabel (statiskt variabel)
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

//        exempel01();
//        exempel02();
//        exempel03();
//        exempel04();

          double x = readDouble();
          double y = readDouble();
          System.out.println("x+y=" + (x+y) );

    }

    static void exempel01() {

        // Läs in en rad från terminalen
        System.out.println("Skriv ditt namn och tryck på Enter");
        String rad = scan.nextLine();

        // Visa raden i terminalen
        System.out.print("Välkommen ");
        System.out.println(rad);
    }

    static void exempel02() {

        // Läs in ett heltal
        System.out.print("Ange ett heltal: ");
        int x = scan.nextInt();

        // Läs in ett decimaltal
        System.out.print("Ange ett decimaltal: ");
        double y = scan.nextDouble();

        // Beräkna och visa resultatet
        System.out.println("x^y = " + Math.pow(x,y));
    }

    static void exempel03() {

        System.out.println("Skriv ett antal heltal på en rad och tryck på Enter");
        System.out.println("Avsluta med EOF");
        int sum = 0;
        while(scan.hasNextInt()){
            sum += scan.nextInt();
        }
        System.out.println("Summan av alla tal : " + sum);
    }


    static void exempel04() {

        // Summa av ett antal godtyckliga heltal från en dialogruta

        String input = JOptionPane.showInputDialog("Ange ett antal heltal");
        if(input == null)  // Användaren vill avsluta metoden
            return;        // OBS! System.exit(0) avslutar programmet

        // Skapa ett scanner-objekt
        Scanner scan = new Scanner(input);

        int sum = 0;
        while (scan.hasNextInt()){
            sum += scan.nextInt();
        }

        JOptionPane.showMessageDialog(null, "Summa: " + sum);
    }



    /**
     * En klassmetod som ber användaren mata in ett decimaltal
     * Metoden hanterar felaktiga inmatningar
     * @return ett decimaltal
     */
     static double readDouble() {
        while(true) {
            try {
                System.out.println("Ange ett decimaltal");
                double tal = scan.nextDouble();
                return tal;
            } catch (Exception e) {
                System.out.println("Felaktig inmatning!");
                // e.printStackTrace();
                scan.next(); // Rensa scanner- objektet . OBS! Viktigt!
            }
        }
    }


}
