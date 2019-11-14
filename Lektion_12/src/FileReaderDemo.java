import java.io.*;
import java.util.Scanner;

/**
 * Created by Mahmud Al Hakim
 * Nackademin - Stockholm - Sweden
 * Project: OOP_HT19
 * Date: 2019-11-14 09:13
 * Copyright: MIT
 */

public class FileReaderDemo {

    /**
     *  Exempel på att läsa från en textfil i Java
     */
    public static void main(String[] args) {
        System.out.println("Exempel 1");
        exempel_01();

        System.out.println("-----------------------");

        System.out.println("Exempel 2");
        exempel_02();
    }

    /**
     * En klassmetod som läser filen text.txt
     * via en buffert (BufferedReader) och fileReader
     */
    static void exempel_01() {
        try {
            // 1. Öppna en fil
            BufferedReader in = new BufferedReader(
                    new FileReader("test.txt"));

            // 2. Arbeta med filen
            int radNr = 1;
            while (true) {
                String rad = in.readLine();
                if (rad == null)  // Vid EOF
                    break;
                System.out.println("Rad " + radNr + ": " + rad);
                radNr++;
            }
            System.out.println("Filen är slut");

            // 3. Stäng filen
            in.close();

        } catch (FileNotFoundException e) {
            System.out.println("Fel: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Problem med readLine");
            e.printStackTrace();
        }
    }

    /**
     * En klassmetod som läser filen text.txt
     * via en scanner
     */
    static void exempel_02() {

        try{
            Scanner file = new Scanner(new File("test.txt"));
            int radNr = 1;
            while(file.hasNextLine()){
                System.out.println("Rad " + radNr++ + ": " + file.nextLine());
            }

            file.close();

        }catch (FileNotFoundException e){
            System.out.println("Filen saknas!");
        }catch (Exception e) {
            System.out.println("Okänt fel");
        }

    }



}
