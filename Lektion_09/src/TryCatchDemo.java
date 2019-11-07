import java.applet.Applet;

/**
 * Created by Mahmud Al Hakim
 * Nackademin - Stockholm - Sweden
 * Project: OOP_HT19
 * Date: 2019-11-07 11:07
 * Copyright: MIT
 */

public class TryCatchDemo {
    public static void main(String[] args) throws InterruptedException {

        /**********************************************************
         * *******  Okontrollerade felsignaler (unchecked)  *******
         ******************************************************* */

        // Exempel 1
        int a = 5;
        int b = 0;
        try {
            int c = a / b;
        } catch (ArithmeticException e) {
            // e.printStackTrace();
            System.out.println("OBS! Division med noll");
        }

        // Exempel 2
        String test = null; // Vid t.ex. avbryt i en dialogruta

        try {
            System.out.println(test.length());

        } catch (NullPointerException e) {
            System.out.println("OBS! Du får inte använda String-metoder på null-referenser");
        }


        // Exempel 3
        String name = "Mahmud";
        try{
        System.out.println(name.charAt(10));

        }catch (StringIndexOutOfBoundsException e){
            System.out.println("OBS! Du försöker indexera utanför strängen");
        }finally {
            System.out.println("Detta block körs alltid");
        }

        // Exempel 4
        try {
            System.out.println("Mahmud".charAt(10));
            System.out.println(1/0);
        }catch (ArithmeticException e){
            System.out.println("Första felet");
            e.getMessage();
        }catch (StringIndexOutOfBoundsException e){
            System.out.println("Andra felet");
            e.getMessage();
        }catch (Exception e){
            System.out.println("Okänt fel");
            e.printStackTrace();
        }
        finally {
            System.out.println("Finally efter alla catch-block");
        }

        /**********************************************************
         * *******  kontrollerade felsignaler (checked)  *******
         ******************************************************* */

        // Pausa main i 1 sekund
        Thread.sleep(1000);
        // Titta på main-metodens signatur (huvud)

    }
}
