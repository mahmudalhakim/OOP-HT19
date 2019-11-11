/**
 * Created by Mahmud Al Hakim
 * Nackademin - Stockholm - Sweden <br>
 * Project: OOP_HT19 <br>
 * Date: 2019-11-11 10:08 <br>
 * Copyright: MIT <br>
 */

public class MyMath {

    /**
     * En klassmetod som beräknar summan av två tal
     *
     * @param a första talet
     * @param b andra talet
     * @return summa
     */
    public static double sum(double a, double b) {
        return a + b;
    }

    /**
     * En klassmetod som beräknar medelvärdet av två tal
     *
     * @param a första talet
     * @param b andra talet
     * @return medelvärdet
     */
    public static double mean(double a, double b) {
        return (a + b) / 2;
    }

    /**
     * En klassmetod som beräknar medelvärdet av 3 heltal
     * @param a första talet
     * @param b andra talet
     * @param c tredje talet
     * @return medelvärdet
     */
    public static double mean(int a, int b, int c) {
        return (a + b + c) /  3.0;
        // OBS! 3.0
        // Om du dividerar med 3 får du i Java,
        // Heltalsdivision, vilket innebär att decimaler kapas!
    }
}
