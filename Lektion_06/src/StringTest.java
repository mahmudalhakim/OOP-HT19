/**
 * Created by Mahmud Al Hakim
 * Nackademin - Stockholm - Sweden
 * Project: OOP_HT19
 * Date: 2019-10-31 10:05
 * Copyright: MIT
 */

public class StringTest {

    /**
     * <strong>Exempel på strängjämförelser i Java </strong> <br>
     * Metoden equals och equalsIgnoreCase <br>
     * String immutability <br>
     * @param args
     */
    public static void main(String[] args) {
        String hello = "Hello";
        String bye = "Goodbye";
        System.out.println(hello.equals(bye)); // false
        System.out.println(hello == bye); // false. Farligt!

        String hi = hello;
        System.out.println(hello.equals(hi)); // true
        System.out.println(hello == hi); // true. Farligt!

        String s1 = "Java";
        String s2 = "JavaScript";
        String s3 = s2.substring(0,4);
        System.out.println("s1 = " + s1);
        System.out.println("s2 = " + s2);
        System.out.println("s3 = " + s3);
        System.out.println(s1 == s3);  // OBS! false, felaktigt svar
        System.out.println(s1.equals(s3)); // true, korrekt svar 
        
        s1 = "JAVA";
        System.out.println("s1 = " + s1);
        System.out.println("s3 = " + s3);
        System.out.println(s1.equals(s3)); // false
        System.out.println(s1.equalsIgnoreCase(s3)); // true

        // Strängkonstanter
        String s4 = "Apple";
        String s5 = "Apple";
        System.out.println(s4 == s5);  // true, farligt!

        // Strängar är oföränderliga (immutable)
        String name = "Mahmud";
        System.out.println("name = " + name);

        // Objektet name ändras inte med metoder!
        System.out.println(name.concat(" Al Hakim"));
        System.out.println("name = " + name);

        // För att ändra objektet måste vi tilldela en ny sträng
        name = name.concat(" Al Hakim");
        System.out.println("name = " + name);



    }
}
