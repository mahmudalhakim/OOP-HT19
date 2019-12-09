/**
 * Created by Mahmud Al Hakim
 * Nackademin - Stockholm - Sweden
 * Project: OOP_HT19
 * Date: 2019-12-09 09:20
 * Copyright: MIT
 */

public class AnimalDemo {

    public static void main(String[] args) {

        System.out.println("--- Klassen Animal --- ");

        /*
        Error:(15, 26) java: Animal is abstract; cannot be instantiated
        Animal animal1 = new Animal();
        animal1.eat();
        animal1.sleep();
        animal1.color = "Green";
        */

        System.out.println("--- Klassen Dog --- ");

        Dog dog1 = new Dog();
        dog1.eat();
        dog1.sleep();
        dog1.bark();
        dog1.color = "black";
        System.out.println(dog1);

        System.out.println("--- Klassen Cat --- ");
        Cat cat1 = new Cat();
        cat1.eat();
        cat1.sleep();
        cat1.meow();
        cat1.color = "white";
        System.out.println(cat1);

        System.out.println("--- Objektsamlingar ---");

        Animal[] animals = new Animal[2];
        animals[0] = new Dog();
        animals[1] = new Cat();

        for (Animal animal : animals) {
            System.out.println(animal);
            /*
            I'm a null dog
            I'am a null cat
             */
        }

        for (Animal animal : animals) {
            animal.sleep();
           /*
           I can sleep.
           I can sleep.
            */
        }

        for (Animal animal : animals) {
            animal.eat();
           /*
            I eat "dog" food
            I eat "cat" food
            */
        }


    }
}
