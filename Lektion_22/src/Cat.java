/**
 * Created by Mahmud Al Hakim
 * Nackademin - Stockholm - Sweden
 * Project: OOP_HT19
 * Date: 2019-12-09 09:40
 * Copyright: MIT
 * <p>
 * Cat är subklass som ärver från Animal
 */

public class Cat extends Animal {

    public void meow() {
        System.out.println("I can meow");
    }

    @Override
    public String toString() {
        return "I'am a " + color + " cat";
    }

    @Override
    public void eat() {
        System.out.println("I eat \"cat\" food!");
    }
}
