/**
 * Created by Mahmud Al Hakim
 * Nackademin - Stockholm - Sweden
 * Project: OOP_HT19
 * Date: 2019-10-28 10:28
 * Copyright: MIT
 */

public class ModulusOperator {
    public static void main(String[] args) {

        // Heltalsdivision
        int x = 10;
        int y = 3;

        System.out.println(x/y);  // 3 OBS! Heltal returneras
        // För att hämta resten vid heltalsdivisionen används modulus (%)
        System.out.println(x%y); // 1

        // Övningar
        // Testa om ett tal > 0 är jämnt eller udda
        int num = 234234768; // Testkod (Test Code)
        System.out.println(num % 2 == 0);  // true
        // Det finns ingen rest
        // Talet är jämnt

        num = 9;  // Testkod
        // Testa om talet är udda
        // Metod 1: kolla om talet är inte delbart med 2
        System.out.println(num % 2 != 0); // true
        // Metod 2: Kolla om talet är delbart med 2
        System.out.println(num % 2 == 0); // false

        // Testa om talet är delbart med 3
        num = 9;
        System.out.println(num % 3 == 0);  // true
        num = 16;
        System.out.println(num % 3 == 0);  // false



    }
}
