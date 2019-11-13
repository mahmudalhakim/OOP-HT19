import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Mahmud Al Hakim
 * Nackademin - Stockholm - Sweden
 * Project: OOP_HT19
 * Date: 2019-11-13 09:33
 * Copyright: MIT
 */

public class TerminalDemo {

    public static void main(String[] args) throws IOException {

        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        exempel01();

        exempel02(input);

        exempel03(input);
    }


    /**
     * En klassmetod som visar hur man använder strömmar i Java
     *
     * @throws IOException
     */
    static void exempel01() throws IOException {

        // Exempel 1

        // Skapa strömmar
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));


        // Prompt
        // https://it-ord.idg.se/?s=prompt
        System.out.print("Vad heter du? ");

        // Töm bufferten (spola)
        System.out.flush();  // Inte nödvändigt

        // Använd metoden readLine för att läsa en rad från termineln
        // OBS! readLine slänger en felsignal (undantag) av typen IOException
        // Vi måste deklarera felsignalen i metodens signatur
        // Titta på rad 15 efter main()
        String indata = "";    // Data kommer att lagras
        indata = input.readLine();

        // Arbeta med data
        System.out.println("Hej " + indata);

    }

    /**
     * En klassmetod som visar hur man läser in text från terminalen
     * och konverterar texten till int eller double
     * Metoden beräknar x^y
     *
     * @param input
     * @throws IOException
     */
    static void exempel02(BufferedReader input) throws IOException {
        // Exempel 2
        System.out.print("Ange ett heltal: ");
        String indata = input.readLine();
        int x = Integer.parseInt(indata);

        System.out.print("Ange ett decimaltal: ");
        indata = input.readLine();
        double y = Double.parseDouble(indata);

        System.out.println("x^y = " + Math.round(Math.pow(x, y)));
    }


    /**
     * En klassmetod som demostrerar EOF
     * Man läser in ett godtyckligt antal tecken från terminalen
     * Vid avbryt med EOF-tecknet, får vi null tillbaka
     * och då avslutas loopen
     *
     * @param input
     * @throws IOException
     */
    static void exempel03(BufferedReader input) throws IOException {

        // Exempel 3

        int sum = 0;
        while (true) {
            System.out.println("Mata in ett heltal och tryck på Enter/Retur");
            // Be användaren avsluta med EOF-tecknet
            System.out.println("Avsluta med CTRL+Z / CTRL+D (Win) CMD-D (Mac)");
            String in = input.readLine();
            if (in == null)
                break;

            sum += Integer.parseInt(in);
        }
        System.out.println("Summan av alla tal är : " + sum);
    }

}
