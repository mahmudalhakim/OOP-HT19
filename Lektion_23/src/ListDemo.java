import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mahmud Al Hakim
 * Nackademin - Stockholm - Sweden
 * Project: OOP_HT19
 * Date: 2019-12-11 10:19
 * Copyright: MIT
 */

public class ListDemo {

    public static void main(String[] args) {

        List<String> names;
        names = new ArrayList<String>();

        // Från Java 10
        var persons = new ArrayList<Person>();

        // Lite om var (bra att veta från och med Java 10)
        var x = 10;     // Typen blir int
        // x = "Fel";   // Fel

        var y = 10.5;   // Typen blir double

        var p = new Person("Mahmud", 45);
        p.print();  // Referensvariabelns typ är Person

        // var z;
        // Error:(29, 14) java: cannot infer type for local variable z
        //  (cannot use 'var' on variable without initializer)

        // Lägg till några strängar i listan names
        names.add("Mahmud");
        names.add("Mehdi");
        names.add("Hoda");
        names.add("Mariam");
        names.add("Dania");
        names.add("Yasir");

        // names.add(123);  // Fel

        // Skriv ut alla namn
        for (String name : names) {
            System.out.println(name);
        }
        // Eller använd toString()
        System.out.println(names);
        // [Mahmud, Mehdi, Hoda, Mariam, Dania, Yasir]

        // Infoga ett element
        names.add(1, "Yasmin");
        System.out.println(names);

        // Hämta ett element
        String name = names.get(0);
        System.out.println(name);

        // Ändra ett element
        names.set(0, "Mahmud Al Hakim");
        //names.set(0, names.get(0) + " Al Hakim");
        System.out.println(names);

        // Ta bort ett element
        String temp = names.remove(0);
        System.out.println(names);
        System.out.println(temp);

        // Sök efter ett element
        if (names.contains("Mariam"))
            System.out.println("Mariam finns");
        else
            System.out.println("Mariam saknas!");

        // Testa om listan är tom
        if (names.isEmpty())
            System.out.println("Listan är tom");
        else
            System.out.println("Listan är inte tom");

        // Hämta antal element
        System.out.println("Antal : " +
                names.size());

        // Hitta index
        int index = names.indexOf("Dania");
        System.out.println("Dania har index " + index);

        index = names.indexOf("Saknas!");
        System.out.println(index);  // -1

        // Kopiera en lista
        var namesCopy = new ArrayList<String>(names);

        // Töm listan
        names.clear();
        System.out.println(names);
        System.out.println(namesCopy);

    }
}
