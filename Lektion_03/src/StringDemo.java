/**
 * Created by Mahmud Al Hakim
 * Nackademin - Stockholm - Sweden
 * Project: OOP_HT19
 * Date: 2019-10-25 09:17
 * Copyright: MIT
 */

public class StringDemo {

    public static void main(String[] args) {

        // Metoden length() ger antal tecken
        String hello = "Hello World!";
        System.out.println("\"" + hello + "\" innehåller " +
                hello.length() + " tecken.");

        // Versaler och gemener
        System.out.println(hello.toUpperCase());
        System.out.println(hello.toLowerCase());

        // Hämta första tecknet i strängen
        char firstChar = hello.charAt(0);
        System.out.println("Första tecknet är: " + firstChar);

        // Hämta sista tecknet i strängen
        char lastChar = hello.charAt(hello.length() - 1);
        System.out.println("Sista tecknet är : " + lastChar);

        // Hämta index av ett specifikt tecken
        System.out.println("Första index av tecknet'o' : " + hello.indexOf('o'));
        System.out.println("Sista index av tecknet 'o' : " + hello.lastIndexOf('o'));
        // Testa med stora bokstäver (OBS! Java är Case Sensitive)
        System.out.println("Sista index av tecknet 'O' : " + hello.lastIndexOf('O'));
        // -1 innebär att tecknet saknas!

        // Sök om det finns en sträng inne i en annan sträng
        // (OBS! Java är Case Sensitive)
        System.out.println(hello.contains("hello")); // false
        System.out.println(hello.contains("Hello")); // true
        System.out.println(hello.contains("Hi")); // false
        System.out.println(hello.contains(" ")); // true
        System.out.println(hello.toLowerCase().contains("hello")); // true

        // Test om strängen startar med eller slutar med ett tecken
        System.out.println(hello.startsWith("H"));  // true
        System.out.println(hello.startsWith("h"));  // false (CaseSensitive)
        System.out.println(hello.endsWith("H"));  // false
        System.out.println(hello.endsWith("."));  // false
        System.out.println(hello.endsWith("!"));  // true

        // Ändra innehåll i en sträng
        System.out.println(hello.replace("World", "Mahmud"));
        System.out.println(hello); // Hello World
        hello = hello.replace("World", "Mahmud");
        System.out.println(hello); // Hello Mahmud

        /*
        Övning
        ------
        Om man har satsen
        String hello ="Hello live world!";
        Hitta ental mellanslag i strängen
        OBS! Lös övningen med hjälp av ovanstående metoder!
        Tips! Använd length() och replace()
        */
        hello = "Hello live world!";
        System.out.println(hello);
        System.out.println("Antal tecken: " + hello.length());

        System.out.println("Byt ut mellanslag med ,");
        System.out.println(hello.replace(" ", ","));

        System.out.println("Ta bort alla mellanslag");
        String hello2 = hello.replace(" ", "");
        System.out.println(hello2);

        System.out.println("Antal tecken: " + hello2.length());

        int antalMellansalg = hello.length() - hello2.length();
        System.out.println("Det finns " + antalMellansalg + " mellanslag");

        // Hämta antal l i strängen
        int count = hello.length() - hello.replace("l", "").length();
        System.out.println("Antal l: " + count);

        // Hämta antal h i strängen
        count = hello.length() - hello.replace("h", "").length();
        System.out.println("Antal h: " + count); // OBS! 0 (Case Sensitive)

        count = hello.length() - hello.toLowerCase().replace("h", "").length();
        System.out.println("Antal H: " + count); // 1

        // Testa om strängen är tom
        String test = "";
        System.out.println(test.isEmpty()); // true
        test = "Test Text";
        System.out.println(test.isEmpty()); // false

        // Rensa inledande och avslutande blanka tecken
        test = "       TEST        Mer Text.      ";
        System.out.println(test.length());
        System.out.println(test.trim()); // En ny sträng skrivs ut
        test = test.trim();  // Rensa originalet
        System.out.println(test.length());

        // Metoden substring()
        test = "Mahmud Al Hakim";

        int firstSpace = test.indexOf(' ');
        System.out.println("Första mellanslaget är på plats nr : " + firstSpace);

        String firstName = test.substring(0, firstSpace);
        System.out.println("Hej " + firstName + "!");

        String lastName = test.substring(firstSpace + 1);
        // Från och med första tecknet efter mellanslaget till slutet!
        System.out.println("Efternamn = " + lastName);

        /* Övning
        Följande sträng innehåller många mellanslag.
        Ta bort alla mellanslag men behåll ett mellanslag i mitten av stängen!
        String hello = "     Hello     World!     ";
        OBS!
        Använd enbart string-metoder vi lärt oss idag!
        Använd inte Regex (överkurs).
        */
        hello = "     Hello     World!     ";
        // Rensa i början och slutet
        hello = hello.trim();
        // Hämta index för första och sista mellanslag
        int space = hello.indexOf(' ');
        int lastSpace = hello.lastIndexOf(' ');
        // Skapa en ny sträng
        hello = hello.substring(0, space) + hello.substring(lastSpace);
        System.out.println(hello);

    }

}
