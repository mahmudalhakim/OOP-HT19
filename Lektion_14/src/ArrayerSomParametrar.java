/**
 * Created by Mahmud Al Hakim
 * Nackademin - Stockholm - Sweden
 * Project: OOP_HT19
 * Date: 2019-11-20 09:31
 * Copyright: MIT
 */

public class ArrayerSomParametrar {

    /**
     * En klassmetod som skriver ut en heltalsarray
     *
     * @param array av typen int[]
     */
    public static void print(int[] array) {
        System.out.println();
        for (int n : array) {
            System.out.println(n);
        }
        System.out.println();
    }

    /**
     * En klassmetod som skriver ut en double-array
     *
     * @param array av typen double[]
     */
    public static void print(double[] array) {
        System.out.println();
        for (double n : array) {
            System.out.println(n);
        }
        System.out.println();
    }


    // Repetition
    // Vi får skicka int eller double till nedanstående metod
    public static void print(double n) {
        System.out.println(n);
    }

    public static void subarray(int[] array, int startIndex, int endIndex) {
        for (int i = startIndex; i < endIndex; i++) {
            System.out.println(array[i]);
        }
    }


    public static void addOne(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i]++;
        }
    }

    // Funkar inte
    // En kopia av n skickas
    /*
    public static void addOne(int n){
        n++;
    }
    */

    // En ny version som funkar
    public static int addOne(int n) {
        n++;
        return n;
    }


    // Lite om Varargs
    public static void print(float... array) {
        for (float f : array) {
            System.out.printf("%.6f \n", f);
        }
        System.out.println();
    }


}
