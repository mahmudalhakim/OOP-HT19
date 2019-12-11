/**
 * Created by Mahmud Al Hakim
 * Nackademin - Stockholm - Sweden
 * Project: OOP_HT19
 * Date: 2019-12-11 09:22
 * Copyright: MIT
 */

public class Person extends Human
        implements Printable, Comparable<Person> {

    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String print() {
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

    /* Om man inte använder en typparameter
    @Override
    public int compareTo(Object other) {
        Person p = (Person) other;
        if (this.age < p.age)
            return -1;
        else if (this.age > p.age)
            return 1;
        else
            return 0;
    }
     */
}
