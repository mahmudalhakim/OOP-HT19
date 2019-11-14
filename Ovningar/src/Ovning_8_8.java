/**
 * Created by Mahmud Al Hakim
 * Nackademin - Stockholm - Sweden
 * Project: OOP_HT19
 * Date: 2019-11-14 06:49
 * Copyright: MIT
 */

public class Ovning_8_8 {

    /**
     * Java - steg för steg
     * Övning 8.8
     * Sidan 172
     */

    public static void main(String[] args) {
        String t = "11+12%";

        int i1 = StringMetoder.sökFörstaBland(t, "0123456789", 0);
        System.out.println("Första tecken som är siffra på plats nr " + i1);


        int i2 = StringMetoder.sökFörstaIckeBland(t, "0123456789", 0);
        System.out.println("Första tecken som inte är siffra på plats nr " + i2);


        int i3 = StringMetoder.sökFörstaIckeBland(t, "0123456789 +-*/", 0);
        if (i3 > 0){
        System.out.println("Ett otillåtet tecken finns på plats nr " + i3);
            System.out.println("Det finns ett otillåtet tecken!");
        }
    }
}


class StringMetoder {

    public static int sökFörstaBland(String s, String tecken, int start) {
        for (int i = start; i < s.length(); i++)
            if (tecken.indexOf(s.charAt(i)) >= 0)
                return i;
        return -1;
    }

    public static int sökFörstaIckeBland(String s, String tecken, int start) {
        for (int i = start; i < s.length(); i++)
            if (tecken.indexOf(s.charAt(i)) == -1)
                return i;
        return -1;
    }
}
