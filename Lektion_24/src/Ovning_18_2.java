import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Stack;

/**
 * Created by Mahmud Al Hakim
 * Nackademin - Stockholm - Sweden
 * Project: OOP_HT19
 * Date: 2019-12-12 09:46
 * Copyright: MIT
 */

public class Ovning_18_2 {

    /***********************************************************
     *   Övning 18.2 , sidan 471
     ***********************************************************/
    public static final String NAMN_TXT = "Lektion_24/namn.txt";

    public static void main(String[] arg) throws FileNotFoundException {

        var stack = new Stack<String>();
        var file = new Scanner(new File(NAMN_TXT));

        // Läs in alla namn och lägg i stacken
        while (file.hasNextLine())
            stack.push(file.nextLine());

        // Skriv ut namnen i omvänd ordning
        while (!stack.empty())
            System.out.println(stack.pop());
    }
}
