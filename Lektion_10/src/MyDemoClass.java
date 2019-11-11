import javax.swing.*;
import java.awt.*;

/**
 * Created by Mahmud Al Hakim
 * Nackademin - Stockholm - Sweden
 * Project: OOP_HT19
 * Date: 2019-11-11 09:46
 * Copyright: MIT
 */

public class MyDemoClass {

    public static void main(String[] args) {

        // Metodanrop
        // OBS! Du måste ante klassnamnet först
        // Eftersom metoden ligger i en annan klass!
        MyMethods.printMessage("Hello from another class");

        // Metodanrop från klassen MyMath
        double x = 1;
        double y = 2;
        double summma = MyMath.sum(x, y);
        System.out.println("Summa: " + summma);

        int x2 = 1;
        int y2 = 2;
        double summa1 = MyMath.sum(x2, y2);
        System.out.println("summa1 = " + summa1);
        int summa2 = (int) MyMath.sum(x2, y2);
        System.out.println("summa2 = " + summa2);


        System.out.println("Medelvärde: " + MyMath.mean(1.5, 2));

        System.out.println("Medelvärdet av tre heltal");
        System.out.println(MyMath.mean(5*5 , 2, 2));

        // Övning
        // Skapa ett program som ber användaren mata in 2 tal
        // via två olika dialogrutor
        // Visa summa och medelvärde i en dialogruta
        // OBS! Använd klassen MyMath
        try {
            String input;
            input = JOptionPane.showInputDialog("Ange tal 1");
            double tal1 = Double.parseDouble(input);

            input = JOptionPane.showInputDialog("Ange tal 2");
            double tal2 = Double.parseDouble(input);

            double medel = MyMath.mean(tal1, tal2);
            double summa = MyMath.sum(tal1, tal2);

            String message = "Medelvärde: " + medel + "\n" +
                    "Summa: " + summa;

            JOptionPane.showMessageDialog(null, message);
        } catch (Exception e) {
            // e.printStackTrace();
            System.out.println("Error: " + e.getMessage() );
        }


    }

}
