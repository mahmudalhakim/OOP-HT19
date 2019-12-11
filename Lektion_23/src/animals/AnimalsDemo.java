package animals;

import java.util.ArrayList;

/**
 * Created by Mahmud Al Hakim
 * Nackademin - Stockholm - Sweden
 * Project: OOP_HT19
 * Date: 2019-12-11 11:26
 * Copyright: MIT
 */

public class AnimalsDemo {
    public static void main(String[] args) {
        var animals = new ArrayList<Animal>();
        animals.add(new Dog());
        animals.add(new Dog());
        animals.add(new Dog());
        animals.add(new Cat());
        animals.add(new Cat());
        animals.add(new Cat());

        System.out.println(animals);

        for (Animal a : animals) {
            a.eat();
            // Detta är "Polymorfism"
        }
    }
}
