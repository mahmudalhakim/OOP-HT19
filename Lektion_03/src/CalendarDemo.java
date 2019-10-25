import java.util.Calendar;

/**
 * Created by Mahmud Al Hakim
 * Nackademin - Stockholm - Sweden
 * Project: OOP_HT19
 * Date: 2019-10-25 11:13
 * Copyright: MIT
 */

public class CalendarDemo {
    public static void main(String[] args) {
        String datum = Calendar.getInstance().getTime().toString();
        System.out.println(datum);

        // Övning
        // Visa klockan i följande format
        // HH:MM:SS

        // Hämta första kolon
        int kolon = datum.indexOf(":");
        System.out.println(kolon);
        String klockan = datum.substring(kolon-2, kolon+6);
        System.out.println("Klockan är " + klockan);


    }
}
