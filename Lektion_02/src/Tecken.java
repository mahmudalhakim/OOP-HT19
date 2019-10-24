/**
 * Created by Mahmud Al Hakim
 * Nackademin - Stockholm - Sweden
 * Project: OOP_HT19
 * Date: 2019-10-23 12:51
 * Copyright: MIT
 */

public class Tecken {

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    public static void main(String[] args) {

        char c1 = 'A';
        char c2 = '1'; // Detta är ett tecken
        System.out.println(c2 * 2); // 98, varför?
        System.out.println(c1 + c2); // 114, varför?
        System.out.println(c1 + "" + c2); // Nu får vi A1
        int number = c2; // 49 enligt Unicode-tabellen
        // https://en.wikipedia.org/wiki/List_of_Unicode_characters
        System.out.println("Number 1 = " + number);

        char copy = '\u00A9';
        System.out.println("Copyright " + copy + " 2019");
        // Du kan placera Unicode-tecken direkt i en sträng
        System.out.println("Copyright \u00A9 2019");

        // Symboler för upphöjd till 2 och 3
        System.out.println("x" + '\u00B2'); // x^2
        System.out.println("x" + '\u00B3'); // x^3
        System.out.println("Area 90m" + '\u00B2');

        System.out.println("Kortspel symboler");
        char spade = '\u2660';
        char heart = '\u2665';
        char diamond = '\u2666';
        char club = '\u2663';
        System.out.println("Spader : " + spade);
        System.out.println("Hjärter : " + heart);
        System.out.println("Ruter : " + diamond);
        System.out.println("Klöver : " + club);

        // För att skriva ut färger i terminalen
        // Använd konstanterna högst upp i filen
        System.out.println(ANSI_RED + "This text is red!" + ANSI_RESET);

        // Använd klassen ConsoleColors
        System.out.println(ConsoleColors.RED + "RED COLORED" +
                ConsoleColors.RESET + " NORMAL");
        System.out.println(ConsoleColors.BLUE + "Blå färg i terminalen");
        System.out.println("Lite mer text i terminalen!");
        System.out.print(ConsoleColors.RESET);
        System.out.println("Lite mer text i terminalen efter reset!");


        // Klassen Character
        char a1 = 'a';
        System.out.println("a1 = " + a1);
        System.out.println(a1 + " i versaler är " +
                Character.toUpperCase(a1));

        // Testa om tecknet är en bokstav
        System.out.println(Character.isAlphabetic(a1)); // true
        a1 = '1';
        System.out.println(Character.isAlphabetic(a1)); // false

        // Testa om tecknet är en siffra
        System.out.println(Character.isDigit(a1)); // true
        System.out.println(Character.isDigit('X')); // false

        // Escape-sekvenser (escape-tecken)
        System.out.println("Lite text.\nNy rad");
        System.out.println("Tecknet \\ heter \"backslash\"");
        System.out.println("Tecknet \\ heter \"omvänt snedstreck\" på svenska");
        System.out.println("Namn\tE-post");
        System.out.println("----\t------");
        System.out.println("Mahmud\tmahmud@hotmail.com");
        System.out.println("James\tjames@gosling.com");

        // Tips! Ascii Art Generator
        // http://patorjk.com/software/taag/#p=display&f=Graffiti&t=Welcome
        String welcome = "\n" +
                " __    __    ___  _        __   ___   ___ ___    ___      ______   ___       ___ ___   ____  __ __ \n" +
                "|  |__|  |  /  _]| |      /  ] /   \\ |   |   |  /  _]    |      | /   \\     |   |   | /    ||  |  |\n" +
                "|  |  |  | /  [_ | |     /  / |     || _   _ | /  [_     |      ||     |    | _   _ ||  o  ||  |  |\n" +
                "|  |  |  ||    _]| |___ /  /  |  O  ||  \\_/  ||    _]    |_|  |_||  O  |    |  \\_/  ||     ||  _  |\n" +
                "|  `  '  ||   [_ |     /   \\_ |     ||   |   ||   [_       |  |  |     |    |   |   ||  _  ||  |  |\n" +
                " \\      / |     ||     \\     ||     ||   |   ||     |      |  |  |     |    |   |   ||  |  ||  |  |\n" +
                "  \\_/\\_/  |_____||_____|\\____| \\___/ |___|___||_____|      |__|   \\___/     |___|___||__|__||__|__|\n" +
                "                                                                                                   \n";
        System.out.println(welcome);

        welcome = "\n" +
                " __      __       .__                               \n" +
                "/  \\    /  \\ ____ |  |   ____  ____   _____   ____  \n" +
                "\\   \\/\\/   // __ \\|  | _/ ___\\/  _ \\ /     \\_/ __ \\ \n" +
                " \\        /\\  ___/|  |_\\  \\__(  <_> )  Y Y  \\  ___/ \n" +
                "  \\__/\\  /  \\___  >____/\\___  >____/|__|_|  /\\___  >\n" +
                "       \\/       \\/          \\/            \\/     \\/ \n";

        System.out.println(welcome);

    } // Avslutar main-metoden
} // Avslutar klassen
