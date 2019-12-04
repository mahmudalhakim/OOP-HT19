/**
 * Created by Mahmud Al Hakim
 * Nackademin - Stockholm - Sweden
 * Project: OOP_HT19
 * Date: 2019-12-04 12:52
 * Copyright: MIT
 */

public class CircleDemo {

    public static void main(String[] args) {

        Circle c1 = new Circle();
        c1.x = 10;
        c1.y = -10;
        c1.setRadie(100);

        System.out.println(c1);

        Circle c2 = new Circle(10.0, 20.0, 50);
        Circle c3 = new Circle(20.0, 30.0, 60);
        Circle c4 = new Circle(30.0, 30.0, 70);

        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);
    }
}
