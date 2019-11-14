import javax.swing.*;
import java.io.*;
import java.util.Scanner;

/**
 * Created by Mahmud Al Hakim
 * Nackademin - Stockholm - Sweden
 * Project: OOP_HT19
 * Date: 2019-11-14 10:30
 * Copyright: MIT
 */

public class FileWriterDemo {

    /**
     * Några exempel på att skapa och skriva till en textfil
     */
    public static void main(String[] args) throws IOException {
        exempel_01();
        exempel_02();
        exempel_03();
        exempel_04();
        exempel_05();
    }

    /**
     * Demo på att skapa textfiler i Java
     */
    static void exempel_01() throws IOException {
        // 1. Skapa en fil
        PrintWriter file = new PrintWriter(
                new BufferedWriter(
                        new FileWriter("test2.txt")));

        // 2. Arbeta med filen
        file.println("Hej!");
        file.println("Hur är läget?");
        file.print("Test ");
        file.print("Test ");
        file.print("Test ");

        System.out.println("Filen test2.txt har skapats!");

        // 3. Stäng filen (OBS! Viktigt)
        file.close();
    }

    /**
     * Demo på "Try with resources"
     */
    static void exempel_02() {

        try (
                // 1. Skapa en fil
                PrintWriter file = new PrintWriter(
                        new BufferedWriter(
                                new FileWriter("test3.txt")));

                // 3. Stäng filen
                // OBS! Filen stängs automatiskt tack vare "Try with resources".

        ) {

            // 2. Arbeta med filen
            file.println("Demo på try with resources!");


        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Filen test3.txt har skapats!");

    }

    /**
     * Demo på att skapa en textfil och lägga till data i filen
     */
    static void exempel_03() {

        try (PrintWriter file = new PrintWriter(
                new BufferedWriter(
                        new FileWriter("test4.txt")));
        ) {

            for (int i = 1; i <= 10; i++) {
                file.println("Inne i metoden exempel03() : " + i);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Filen test4.txt har skapats!");

    }

    /**
     * Att lägga till data i slutet av filen
     * OBS! Argument 2 i konstruktorn tillåter detta
     */
    private static void exempel_04() {
        try (PrintWriter file = new PrintWriter(
                new BufferedWriter(
                        new FileWriter("test4.txt", true)));
        ) {

            for (int i = 11; i <= 20; i++) {
                file.println("Inne i metoden exempel04() : " + i);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Filen test4.txt har skapats!");

    }

    /**
     * Demo på fildialogrutor
     * OBS! Överkurs
     */
    static void exempel_05() {
        // Hämta aktuell mapp
        String folder = System.getProperty("user.dir");// Repetera kap. 1
        System.out.println(folder);

        // Skapa en filväljare
        JFileChooser fc = new JFileChooser(folder);

        // Visa dialogrutan Öppna
        int result = fc.showOpenDialog(null);

        if (result != JFileChooser.APPROVE_OPTION) {
            System.out.println("Ingen fil valdes!");
            return;  // Avsluta metoden
        }

        String filename = fc.getSelectedFile().getAbsolutePath();
        System.out.println(filename);

        // Arbeta med filen enligt alla exempel under filen FilDemo.java
        try {
            Scanner file = new Scanner(new File(filename));
            int radNr = 1;
            while (file.hasNextLine()) {
                System.out.println("Rad " + radNr++ + ": " + file.nextLine());
            }

            file.close();

        } catch (FileNotFoundException e) {
            System.out.println("Filen saknas!");
        } catch (Exception e) {
            System.out.println("Okänt fel");
        }


    }

}
