/**
 * Created by Mahmud Al Hakim
 * Nackademin - Stockholm - Sweden
 * Project: OOP_HT19
 * Date: 2019-11-11 13:24
 * Copyright: MIT
 */

public class Product {

    /**
     * Övning
     * Skriv en metod som beräknar vad en vara kostar, inklusive moms.
     * Som parametrar skall metoden få dels priset exklusive moms
     * och dels momssatsen uttryckt i procent t.ex 25
     */
    public static double price(double priceExklusiveMoms, int moms) {
        // Tre olika lösningar
        // return priceExklusiveMoms + ( priceExklusiveMoms * moms * 0.01 );
        // return priceExklusiveMoms * ( 1 + moms / 100.0); // OBS! Heltalsdivision
        return priceExklusiveMoms * ( 1 + moms * 0.01);
    }
}
