/**
 * Created by Mahmud Al Hakim
 * Nackademin - Stockholm - Sweden
 * Project: OOP_HT19
 * Date: 2019-11-18 09:15
 * Copyright: MIT
 */

public class ArrayDemo {
    public static void main(String[] args) {

        /**********************************
         * Arbeta med arrayer (fält) i Java
         *
         **********************************/

        // Steg 1: Skapa en fältvariabel (referens)
        int[] a;

        // Steg 2: Skapa minnesutrymme / skapa själva arrayen
        a = new int[5];

        // Steg 1 och 2 i samma sats
        int[] b = new int[5];

        // Array Initializer (Array Literal / Arraylitteral)
        int[] c = {1, 2, 3, 4, 5};  // OBS! {} och inte []

        // Alternativ syntax
        int d[];
        int e[], f[], g[];

        // Array av strängar
        String[] lanugages = {
                "C",
                "C++",
                "Java",
                "C#"
        };

        // Egenskapen (field) length ger antal komponenter
        int count = lanugages.length;

        System.out.println("Det finns "
                + lanugages.length
                + " komponenter i arrayen."
        );

        // Indexering

        System.out.println(a[0]);
        // Det finns ett defaultvärde
        // Defaultvärdet på int är 0

        double[] d2 = new double[10];
        System.out.println(d2[0]);
        // Defaultvärdet på double är 0.0

        boolean[] b2 = new boolean[10];
        System.out.println(b2[0]);
        // Defaultvärdet på boolean är false

        String[] s1 = new String[10];
        System.out.println(s1[0]);
        // Defaultvärdet på String är null

        char[] c1 = new char[10];
        System.out.println(c1[0]);
        // Defaultvärdet på char är   på Mac och bara tomt på PC

        // Indexera en hel array
        int[] arr1 = new int[5];
        arr1[0] = 1;
        arr1[1] = 2;
        arr1[2] = 3;
        arr1[3] = 4;
        arr1[4] = 5;
        // arr1[5] = 5; // ArrayIndexOutOfBoundsException

        // Indexera med vanlig for-loop
        int[] arr2 = new int[5];
        for (int i = 0; i < arr2.length ; i++) {
            arr2[i] = i+1;
        }

        // Skriv ut en array med en standard for-loop
        System.out.println("Utskrift av arrayen arr1");
        for (int i = 0; i < arr1.length ; i++) {
            System.out.println("Element " + arr1[i] + " finns på plats " + i);
        }

        // Skriv ut med en foreach-loop (Enhanced for loop)
        System.out.println("Utskrift av arrayen arr2");
        for (int el : arr2) {
            System.out.println("Före ändringen " + el);
            el = 5;  // Du kan manipulera element inne i foreach
            System.out.println("Efter ändringen " + el);
        }

        // Vad skrivs ut när man skirver ut referensen?
        System.out.println(arr1);  // Ett unikt värde (Hashkod)
        System.out.println(arr2);  // T.ex. [I@119d7047

    }
}
