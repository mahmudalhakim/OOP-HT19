import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.Random;

/**
 * Created by Mahmud Al Hakim
 * Nackademin - Stockholm - Sweden
 * Project: OOP_HT19
 * Date: 2019-12-12 10:20
 * Copyright: MIT
 */

public class CollectionsDemo {
    public static void main(String[] args) {

        /****************************************
         *   Demo på standardklassen Collections
         ****************************************/

        // Skapa listor
        var list1 = new ArrayList<String>();
        var list2 = new ArrayList<Integer>();

        // Metoden addAll()
        Collections.addAll(list1, "Steve", "Harry", "James");
        System.out.println(list1);

        Collections.addAll(list2, 4, 5, 3, 1, 2);
        System.out.println(list2);

        Random rand = new Random();
        for (int i = 0; i < 10; i++) {
            list2.add(rand.nextInt(6) + 1);
        }
        System.out.println(list2);

        // Metoden sort()
        Collections.sort(list1);
        System.out.println(list1);

        Collections.sort(list2);
        System.out.println(list2);

        // Metoden reverse()
        Collections.reverse(list2);
        System.out.println(list2);

        // Metoden shuffle()
        Collections.shuffle(list2);
        System.out.println(list2);

        // Arbeta med objektsamlingar
        var persons = new ArrayList<Person>();

        var p1 = new Person("James", 50);
        var p2 = new Person("Harry", 20);
        var p3 = new Person("Steve", 70);

        Collections.addAll(persons, p1, p2, p3);
        System.out.println(persons);

        Collections.shuffle(persons);
        System.out.println(persons);

        // Sortera listan från yngst till äldst
        Collections.sort(persons);
        System.out.println(persons);

        Collections.shuffle(persons);
        System.out.println(persons);

        p1.age = 10;
        p2.age = 20;
        if (p1.equals(p2)) {
            System.out.println("Samma ålder");
        }
    }
}

class Person implements Comparable<Person> {
    String name;
    int age;
    double length;
    double weight;

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public int compareTo(Person other) {
        if (this.age < other.age)
            return -1;
        else if (this.age > other.age)
            return 1;
        else
            return 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age;
    }


}