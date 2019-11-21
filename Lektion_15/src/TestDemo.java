import javax.swing.*;

/**
 * Created by Mahmud Al Hakim
 * Nackademin - Stockholm - Sweden
 * Project: OOP_HT19
 * Date: 2019-11-21 10:32
 * Copyright: MIT
 */

public class TestDemo {

    public static void main(String[] args) {

        // Läs ett tal
        // String input = "4";   // Detta är en test-variabel
        // Anropa test-metoden
        test();

        int tal = -1;

        while (true) {
            tal = input("Ange ett heltal mellan 0 och 5");

            if (tal >= 0 && tal <= 5) {
                // Skicka talet till metoden omvandla
                String result = omvandla(tal);
                JOptionPane.showMessageDialog(null, result);

            } else {
                JOptionPane.showMessageDialog(null, "Utanför gränserna");
            }
        }

    }

    /**
     * En test-metod som testar alla tal från 0-5
     */
    public static void test() {

        for (int i = 0; i <= 5; i++) {
            System.out.println(omvandla(i));
        }
    }

    /**
     * En klassmetod som omvandlar ett tal till ord
     *
     * @param tal
     * @return
     */
    public static String omvandla(int tal) {

        // TODO: 2019-11-21 Testa gränserna
        // Omvandla talet till ord t.ex. 1 => ETT
        String[] ord = {"NOLL", "ETT", "TVÅ", "TRE", "FYRA", "FEM"};
        String result = ord[tal];
        return result;
    }

    /**
     * En klassmetod som läser in ett tal via en dialogruta
     * Metoden tar hand om felhantering
     *
     * @param msg är ett meddelande som visas i dialogrutan
     * @return ett heltal
     */
    public static int input(String msg) {

        int tal;

        while (true) {

            String input = JOptionPane.showInputDialog(msg);
            // Om användaren VILL avsluta programmet
            if (input == null)
                System.exit(0);

            try {
                // Konvertera text till tal
                tal = Integer.parseInt(input);
                break;

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null,
                        "Felaktig inmatning");
//            System.exit(0);
                // TODO: 2019-11-21 Be användaren mata in ett nytt tal
            }
        }

        return tal;
    }


}
