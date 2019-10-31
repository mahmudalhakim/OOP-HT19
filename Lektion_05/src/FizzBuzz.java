/**
 * Created by Mahmud Al Hakim
 * Nackademin - Stockholm - Sweden
 * Project: OOP_HT19
 * Date: 2019-10-30 11:24
 * Copyright: MIT
 */

public class FizzBuzz {

    /***********************************************************
     * Skapa ett program som testar om ett tal är jämnt delbart med 3.
     * I så fall skriver programmet ut "Fizz".
     * Om talet är jämnt delbart med 5 skrivs "Buzz" ut.
     * Slutligen skrivs "FizzBuzz" ut om talet är
     * jämnt delbart med både 3 och 5.
     *
     * Testa talen från 1 till 100.
     *
     ***********************************************************/

    public static void main(String[] args) {

        // Testkod
        int number = 15;

        // Visa alla tal från 1 till 100
        for (number = 1; number <= 100; number++) {

            System.out.print(number + ": ");

            // Testa delbarhet med 3 och 5
            if ((number % 3 == 0) && (number % 5 == 0))
                System.out.println("FizzBuzz");

                // Testa delbarhet med 3
            else if (number % 3 == 0)
                System.out.println("Fizz");

                // Testa delbarhet med 5
            else if (number % 5 == 0)
                System.out.println("Buzz");

                // Visa number om det är varken delbart med 3 eller 5
            else
                System.out.println(number);
        }


        System.out.println("*** FizzBuzz - Ternary Version ***");
        for (number = 1; number <= 100; number++) {
            System.out.println(
                    (number % 3 == 0 && number % 5 == 0) ? "FizzBuzz"
                            : (number % 3 == 0) ? "Fizz"
                            : (number % 5 == 0) ? "Buzz"
                            : Integer.toString(number)
            );
        }


    }
}
