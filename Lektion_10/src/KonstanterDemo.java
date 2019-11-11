/**
 * Created by Mahmud Al Hakim
 * Nackademin - Stockholm - Sweden
 * Project: OOP_HT19
 * Date: 2019-11-11 14:07
 * Copyright: MIT
 */

public class KonstanterDemo {

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_BLUE = "\u001B[34m";

    public static void main(String[] args) {
        System.out.println(ANSI_RED + "Text en rött.");
        System.out.println("Lite text efter ANSI_RED");
        System.out.print(ANSI_RESET);
        System.out.println("Lite text efter ANSI_RESET");
        System.out.print(ANSI_BLUE);
        System.out.println("Lite text i blått" + ANSI_RESET);

        // Konstanter från en annan klass
        System.out.println(ConsoleColors.GREEN + "Lite text i grönt!");
        System.out.print(ConsoleColors.RESET);


    }
}
