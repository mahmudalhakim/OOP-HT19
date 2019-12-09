/**
 * Created by Mahmud Al Hakim
 * Nackademin - Stockholm - Sweden
 * Project: OOP_HT19
 * Date: 2019-12-04 11:23
 * Copyright: MIT
 */

class Person {

    // Instansvariabler
    private String firstName;
    private String lastName;
    private int age;
    private double length;
    private double weight;

    // Default-konstruktor
    public Person() {
        this.firstName = "";
        this.lastName = "";
    }

    // En konstruktor med en parameter
    public Person(String name) {
        setName(name);
    }

    // En konstruktor med två parametrar
    public Person(String firstName, String lastName) {
        setFirstName(firstName);
        setLastName(lastName);
    }

    // En konstruktor med tre parametrar
    public Person(String firstName, String lastName, int age) {
        setFirstName(firstName);
        setLastName(lastName);
        setAge(age);
    }

    public Person(double length, double weight) {
        firstName = "";
        lastName = "";
        setLength(length);
        setWeight(weight);
    }

    /**
     * Sätter förnamnet
     *
     * @return
     */
    public String getFirstName() {
        if (this.firstName != null)
            return firstName;
        else
            return "Guest";
    }

    public void setFirstName(String firstName) {
        if (firstName != null)
            this.firstName = firstName;
        else
            throw new NullPointerException("Invalid first name");
    }

    public String getLastName() {
        if (this.lastName != null)
            return lastName;

        return "";
    }

    public void setLastName(String lastName) {
        if (lastName != null)
            this.lastName = lastName;
        else
            throw new NullPointerException("Invalid last name");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 0 || age < 150)
            this.age = age;
        else
            throw new IllegalArgumentException("Invalid age");
    }

    private void setName(String name) {
        int comma = name.indexOf(",");
        if (comma == -1)
            throw new IllegalArgumentException("Kommatecken saknas!");

        this.firstName = name.substring(0, comma).trim();
        this.lastName = name.substring(comma + 1).trim();

    }


    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if (length > 0)
            this.length = length;
        else
            throw new IllegalArgumentException("Invalid length");
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        if (weight > 0)
            this.weight = weight;
        else
            throw new IllegalArgumentException("Invalid weight");
    }

    // Instansmetod
    public double getBMI() {
        return Math.round(weight / (length * length));
    }

    // Klassmetod
    public static double getBMI(double length, double weight) {
        return Math.round(weight / (length * length));
    }


    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", length=" + length +
                ", weight=" + weight +
                ", BMI=" + getBMI() +
                '}';
    }
}
