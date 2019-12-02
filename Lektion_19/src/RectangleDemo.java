/**
 * Created by Mahmud Al Hakim
 * Nackademin - Stockholm - Sweden
 * Project: OOP_HT19
 * Date: 2019-12-02 09:13
 * Copyright: MIT
 */

public class RectangleDemo {

    public static void main(String[] args) {

        // Skapa några instanser av klassen Rectangle
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle();

        // Manipulera objekt
        /*
        r1.height = 10;
        r1.width = 10;

        r2.height = -20; // OBS! Negativ bredd!
        r2.width = -15;  // OBS! Negativ bredd!

         */

        r1.setHeight(100); // OK

        try {
            r2.setHeight(-50); // OBS! Negativ bredd!
        } catch (Exception e) {
            // e.printStackTrace();
            System.out.println(e.getMessage());
        }

        try {
            r1.setWidth(50);
            r2.setWidth(-50);
        } catch (Exception e) {
            // e.printStackTrace();
            System.out.println(e.getMessage());
        }

        System.out.println("r1 omkrets = " + r1.perimeter());
        System.out.println("r2 omkrets = " + r2.perimeter());

        System.out.println("r1 area = " + r1.area());
        System.out.println("r2 area = " + r2.area());


    }
}
