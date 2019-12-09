/**
 * Created by Mahmud Al Hakim
 * Nackademin - Stockholm - Sweden
 * Project: OOP_HT19
 * Date: 2019-12-09 09:18
 * Copyright: MIT
 * <p>
 * Animal är en superklass
 */

public abstract class Animal {

    protected String color;

    public void sleep() {
        System.out.println("I can sleep.");
    }

    public abstract void eat();

}
