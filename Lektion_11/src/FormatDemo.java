/**
 * Created by Mahmud Al Hakim
 * Nackademin - Stockholm - Sweden
 * Project: OOP_HT19
 * Date: 2019-11-13 14:05
 * Copyright: MIT
 */

public class FormatDemo {

    public static void main(String[] args) {

        /********************************************************
         ********* Introduktion till metoden format  ************
         ********************************************************/

        int data1 = 1;
        double data2 = 1.2;
        String data3 = "Test";
        String output = String.format("Formatsträng: %d %f %s", data1,data2,data3);
        System.out.println(output);

        // Heltalstyper
        int decimalform = 255;
        output = String.format("Heltal i decimal form: %d", decimalform);
        System.out.println(output);

        int hexadecimalform = 255;
        output = String.format("Heltal i hexadecimal form: %x", hexadecimalform);
        System.out.println(output);

        // Flyttal (reela tal) = Tal med decimaler
        double flyttal = 1.2;
        output = String.format("Flyttal: %f", flyttal);
        System.out.println(output);

        // Exponent Form
        double exponentform = 10_000_000;
        output = String.format("Exponent form: %e", exponentform);
        System.out.println(output);


        /***********************************************
         * *************** Ange bredd  *****************
         ***********************************************/

        int decimalform_2 = 255;
        System.out.printf("%2d \n", decimalform_2);
        System.out.printf("%3d \n", decimalform_2);
        System.out.printf("%4d \n", decimalform_2);
        System.out.printf("%5d \n", decimalform_2);
        System.out.printf("%6d \n", decimalform_2);
        System.out.printf("%7d \n", decimalform_2);
        // Flytta talet 8 steg till höger
        System.out.printf("%8d \n", decimalform_2);

        // Ange antal decimaler
        System.out.printf("%.1f \n", 1.2);
        System.out.printf("%.2f \n", 1.2);
        System.out.printf("%.3f \n", 1.2);
        System.out.printf("%.4f \n", 1.234567); // 1,2346 OBS! Avrundning
        System.out.printf("%.4f \n", 1.222222222222); // 1,2222

        // Ange bredd och bestäm antal decimaler
        System.out.printf("%10.2f \n" , 1.2);


        /***********************************************
         * ***************    Flaggor  *****************
         ***********************************************/


        // Flaggan - (minustecken)
        // Vänsterjustering
        System.out.printf("START %-10d SLUT \n", 1);
        System.out.printf("START %-10d SLUT \n", 12);
        System.out.printf("START %-10d SLUT \n", 123);
        System.out.printf("START %-10d SLUT \n", 1234);
        System.out.printf("START %-10d SLUT \n", 12345);

        // Flaggan +
        // Visa talets tecken
        System.out.printf("%d \n", -1);
        System.out.printf("%d \n", 1);
        System.out.printf("%+d \n", 1);
        System.out.printf("%+d \n", -1);
        System.out.println("------------------");

        // För positiva tal visas alltid ett blankt tecken först
        // Flaggan "ett blankt tecken"
        System.out.printf("% d\n", 1);
        System.out.printf("% d\n", -1);
        System.out.printf("% .2f\n", 100.1);
        System.out.printf("% .2f\n", -100.1);

        // Flaggan 0
        // Utfyllnad med nollor
        System.out.printf("%05d \n", 1);
        System.out.printf("%05d \n", 12);
        System.out.printf("%05d \n", 123);
        System.out.printf("%05d \n", 1234);
        System.out.printf("%05d \n", 12345);

        // Flaggan , (kommatecken)
        // Siffror grupperas tre och tre
        System.out.printf("%,d \n", 123);
        System.out.printf("%,d \n", 1234);
        System.out.printf("%,d \n", 12345);
        System.out.printf("%,d \n", 123456);
        System.out.printf("%,d \n", 1234567);
        System.out.printf("%,d \n", 12345678);
        System.out.printf("%,d \n", 123456789);

    }
}

/*
Formatsträng: 1 1,200000 Test
Heltal i decimal form: 255
Heltal i hexadecimal form: ff
Flyttal: 1,200000
Exponent form: 1,000000e+07
255
255
 255
  255
   255
    255
     255
1,2
1,20
1,200
1,2346
1,2222
      1,20
START 1          SLUT
START 12         SLUT
START 123        SLUT
START 1234       SLUT
START 12345      SLUT
-1
1
+1
-1
------------------
 1
-1
 100,10
-100,10
00001
00012
00123
01234
12345
123
1 234
12 345
123 456
1 234 567
12 345 678
123 456 789

*/
