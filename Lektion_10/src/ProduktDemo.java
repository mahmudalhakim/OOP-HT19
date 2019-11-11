/**
 * Created by Mahmud Al Hakim
 * Nackademin - Stockholm - Sweden
 * Project: OOP_HT19
 * Date: 2019-11-11 13:31
 * Copyright: MIT
 */

public class ProduktDemo {

    public static void main(String[] args) {
        double pris = 100; // Exkl. moms
        int moms = 25;  // Momssats
        System.out.println("Pris inkl. moms: " + Product.price(pris,moms));

        System.out.println(Product.price(50, 25));

    }
}
