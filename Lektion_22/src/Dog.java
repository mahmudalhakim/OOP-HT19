/**
 * Created by Mahmud Al Hakim
 * Nackademin - Stockholm - Sweden
 * Project: OOP_HT19
 * Date: 2019-12-09 09:19
 * Copyright: MIT
 * <p>
 * Dog är en subklass som ärver från Animal
 */

public class Dog extends Animal {

    public void bark() {
        System.out.println("I can bark.");
    }

    @Override
    public String toString() {
        return "I'm a " + color + " dog";
    }

    @Override
    public void eat() {
        System.out.println("I eat \"dog\" food!");
    }
}
