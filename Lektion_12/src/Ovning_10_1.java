import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by Mahmud Al Hakim
 * Nackademin - Stockholm - Sweden
 * Project: OOP_HT19
 * Date: 2019-11-14 14:18
 * Copyright: MIT
 */

public class Ovning_10_1 {
    public static void main(String[] args) {

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

        try {
            Scanner file = new Scanner(new File(filename));

            int rows = 0;        // totala antalet rader i filen
            int comments = 0;    // antalet rader med kommentarer

            while (file.hasNextLine()) {
                rows++;

                if (file.nextLine().indexOf("//") >= 0)
                    comments++;
            }

            System.out.println(Math.round(100.0 * comments / rows) + " % av raderna innehåller kommentarer");

            file.close();

        } catch (FileNotFoundException e) {
            System.out.println("Filen saknas!");
        } catch (Exception e) {
            System.out.println("Okänt fel");
        }
    }
}
