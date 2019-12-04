/**
 * Created by Mahmud Al Hakim
 * Nackademin - Stockholm - Sweden
 * Project: OOP_HT19
 * Date: 2019-12-04 11:23
 * Copyright: MIT
 */

public class Person {

    private String firstName;
    private String lastName;
    private int age;

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
            throw new IllegalArgumentException("Invalid name");
    }

    public String getLastName() {
        if (this.lastName != null)
            return lastName;

        return "";
    }

    public void setLastName(String lastName) {
        if (lastName != null && lastName != "")
            this.lastName = lastName;
        else
            throw new IllegalArgumentException("Invalid name");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 150)
            this.age = age;
        else
            throw new IllegalArgumentException("Ogiltig ålder!");
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
