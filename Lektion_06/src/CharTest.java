/**
 * Created by Mahmud Al Hakim
 * Nackademin - Stockholm - Sweden
 * Project: OOP_HT19
 * Date: 2019-10-31 11:38
 * Copyright: MIT
 */

public class CharTest {

    /**
     * Skapa en switch-sats vars syfte är att analysera ett tecken.
     * Satsen undersöker om tecknet är en siffra (0-9),
     * eller ett vitt tecken (blankt tecken).
     * Testa enbart, mellanslag, tabulator \t och nyradstecken \n.
     *
     * Om tecknet är en siffra, skriv ut ”Tecknet är en siffra”.
     * Om tecknet är ett blankt tecken skriv ut, ”Vitt tecken”.
     * I annat fall skriver satsen ut ”Specialtecken”.
     *
     * Skriv testkod för att testa med olika slags tecken.
     *
     * @param args
     */
    public static void main(String[] args) {

        // Testkod
        char tecken = '!';
        switch (tecken){
            case '0': case '1': case '2': case '3': case '4':
            case '5': case '6': case '7': case '8': case '9':
                System.out.println("Tecknet är en siffra");
                break;
            case ' ': case '\t': case '\n':
                System.out.println("Vitt tecken");
                break;
            default:
                System.out.println("Specialtecken");
        }

    }
}
