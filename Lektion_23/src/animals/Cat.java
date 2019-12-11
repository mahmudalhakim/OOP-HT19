package animals;

/**
 * Created by Mahmud Al Hakim
 * Nackademin - Stockholm - Sweden
 * Project: OOP_HT19
 * Date: 2019-12-11 11:26
 * Copyright: MIT
 */

public class Cat implements Animal {
    @Override
    public void eat() {
        System.out.println("I eat cat food");
    }

    @Override
    public String toString() {
        return "Cat";
    }
}
