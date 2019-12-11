/**
 * Created by Mahmud Al Hakim
 * Nackademin - Stockholm - Sweden
 * Project: OOP_HT19
 * Date: 2019-12-11 09:31
 * Copyright: MIT
 */

public class InterfaceDemo {


    public static void main(String[] args) {

        // Vi får skapa referensvariabler av ett gränssnitt
        // och skapa objekt av alla klasser som implementerar gränssnittet
        // Referensvariablerna kan då peka på dessa objekt
        Printable print1;
        print1 = new Person("Demo", 10);
        Printable print2;
        print2 = new Book();

        Person p1 = new Person("Mahmud", 50);
        Person p2 = new Person("James", 45);
        if (p1.compareTo(p2) == 0)
            System.out.println("Samma ålder");
        else if (p1.compareTo(p2) > 0)
            System.out.println(p1.print() + " är äldre än " + p2.print());
        else
            System.out.println(p1.print() + " är yngre än " + p2.print());
    }
}
