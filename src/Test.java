import javax.swing.*;
import java.util.Random;

/**
 * Created by Mahmud Al Hakim
 * Nackademin - Stockholm - Sweden
 * Project: OOP_HT19
 * Date: 2019-10-18 06:26
 * Copyright: MIT
 */

public class Test {

    public static void main(String[] args) {


    // 1. Läs in ett tal via en dial
        // TODO: 2019-10-18
        // Vi startar med testkod t.ex. talet 11
        // 1. Läs in ett tal via en dialogruta
        String input = JOptionPane.showInputDialog("Ange ett heltal");
        if(input == null)
            System.exit(0);

    int number = Integer.parseInt(input);

    // 2. Undersök om talet är ett primtal
    boolean isPrime = true;
    // Upprepa följande för alla tal n i intervallet 2 till talet-1
        for (int n = 2 ; n < number ; n++) {
            // Om resten blir 0 när man dividerar talet med n
            if(number % n == 0){
                // Så sätt isPrime till false
                isPrime = false;
            }
        }

        System.out.println(number + " " + isPrime);

    // 3. Visa resultatet
//    if(isPrime)
//        System.out.println(number + " är primtal!");
//    else
//        System.out.println(number + " är inte primtal!");





    }
}
