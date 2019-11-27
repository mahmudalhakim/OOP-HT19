/**
 * Created by Mahmud Al Hakim
 * Nackademin - Stockholm - Sweden
 * Project: OOP_HT19
 * Date: 2019-11-27 12:49
 * Copyright: MIT
 */

class Exercise_01 {

    // Instansvariabler
    int x1 = 2;
    int y1 = 4;

    // Klassvaraibler
    static int x2 = 1;
    static int y2 = 2;

    public static void main(String[] arg) {

        // System.out.println((x1 + y1));    // Fel
        // Error:(14, 29) java:
        // non-static variable x cannot be referenced from a static context

        // Lösning 1:
        // Skapa en instans för att få tillgång till alla instansvariabler
        Exercise_01 ex1 = new Exercise_01();
        System.out.println(ex1.x1 + ex1.y1);

        // Lösning 2:
        // Skapa klassvariabler (ingen instans behövs)
        // Klassvariabler är tillgängliga inne i metoden
        System.out.println(x2 + y2);
    }

}
