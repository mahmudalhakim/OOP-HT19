import java.util.Arrays;

/**
 * Created by Mahmud Al Hakim
 * Nackademin - Stockholm - Sweden
 * Project: OOP_HT19
 * Date: 2019-11-20 09:34
 * Copyright: MIT
 */

public class ArrayMainDemo {
    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        ArrayerSomParametrar.print(arr1);

        double[] arr2 = {1.5, 2.5, 3.5};
        ArrayerSomParametrar.print(arr2);


        // Repetition
        // Vi får skicka alla möjliga tal
        // till metoden print som har
        // en double som parameter.
        int n1 = 2;
        ArrayerSomParametrar.print(n1);
        double n2 = 5.5;
        ArrayerSomParametrar.print(n2);
        long n3 = 123_000_000_000_000L;
        ArrayerSomParametrar.print(n3);



        // Att skapa en anonym array
        ArrayerSomParametrar.print(new int[] {11,22,33});
        ArrayerSomParametrar.print(new double[] {1.2,2.3,3.3});

        // Skriv ut en del av en array (subarray)
        int[] arr4 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        //            0  1  2  3  4  5
        ArrayerSomParametrar.subarray(arr4, 2, 5);


        System.out.println();


        int n = 5;
        // OBS! Call By Value (copy)
        ArrayerSomParametrar.addOne(n); // Funkar inte
        System.out.println(n);  // 5

        n = ArrayerSomParametrar.addOne(n);
        System.out.println(n);


        // Call By Reference
        ArrayerSomParametrar.addOne(arr4);
        ArrayerSomParametrar.print(arr4);

        System.out.println();

        // Demo på Varargs
        ArrayerSomParametrar.print(1.2f, 2.2f);
        ArrayerSomParametrar.print(1.2f, 2.2f, 3.3f);


    }
}
