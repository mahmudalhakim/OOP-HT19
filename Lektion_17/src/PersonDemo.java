import java.io.*;

/**
 * Created by Mahmud Al Hakim
 * Nackademin - Stockholm - Sweden
 * Project: OOP_HT19
 * Date: 2019-11-27 13:24
 * Copyright: MIT
 */

public class PersonDemo {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        /*********************************************
         *****    Att lagra objekt i binära filer  ***
         *********************************************/

        // 1. Skapa en ström av typen ObjectOutputStream
        ObjectOutputStream fileWriter = new ObjectOutputStream(
                new FileOutputStream("persons.data")
        );

        // 2. Skapa några objekt
        Person p1 = new Person();
        p1.name = "Mahmud";
        p1.age = 45;

        Person p2 = new Person();
        p2.name = "Yasmin";
        p2.age = 43;

        // 3. Skicka objekten till filen
        fileWriter.writeObject(p1);
        fileWriter.writeObject(p2);
        System.out.println("Alla objekt har sparats i filen persons.data");
        // OBS! Du behöver inte öppna filen i en texteditor!


        fileWriter.close();

        /*********************************************
         *****    Att läsa objekt från en binärfil ***
         *********************************************/

        // 1. Skapa en ström av ObjectInputStream
        ObjectInputStream fileReader = new ObjectInputStream(
                new FileInputStream("persons.data")
        );

        // 2. Läs ett objekt i taget
        while (true) {

            Person p;
            // Java sparar objekt i den binära filen,
            // som objekt av typen Object (en superklass som finns i Java)
            // Vi behöver typomvandla Object till Person
            // genom att lägga till (Person) före metodanropet!
            // Detta kallas Cast på engelska
            try {
                p = (Person) fileReader.readObject();
            } catch (EOFException e) {
                // Viktigt! När filen är slut så hamnar vi här
                break;
            }
            System.out.println(p.name + " är " + p.age + " år gammal.");
        }


        System.out.println("-------------------------------------------");

        // För att tömma filen skapa en ström med samma filnamn
        fileWriter = new ObjectOutputStream(new FileOutputStream("persons.data"));
        p1 = new Person();
        p1.name = "Kalle";
        p1.age = 10;
        fileWriter.writeObject(p1);

        // Läs från filen igen
        fileReader = new ObjectInputStream(new FileInputStream("persons.data"));
        while (true) {
            Person p;
            try {
                p = (Person) fileReader.readObject();
            } catch (EOFException e) {
                break;
            }
            System.out.println(p.name + " är " + p.age + " år gammal.");
        }
    }
}
