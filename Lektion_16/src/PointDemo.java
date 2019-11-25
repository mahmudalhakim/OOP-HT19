/**
 * Created by Mahmud Al Hakim
 * Nackademin - Stockholm - Sweden
 * Project: OOP_HT19
 * Date: 2019-11-25 13:22
 * Copyright: MIT
 */

public class PointDemo {


    public static void main(String[] args) {

        // LHS        RHS
        Point p1 = new Point();
        Point p2 = new Point();

        // LHS
        // Java skapar två referenser av typen Point, p1 och p2 i Stack
        // RHS
        // Java skapar två instanser av klassen Point i Heap
        // Dessa instanser är två olika objekt
        // Varje objekt får två instansvariabler x och y av typen double
        // Instansvariablerna får ett default-värde (0.0)
        // Tilldelning =
        // p1 pekar på det första objektet
        // p2 pekar på det andra objektet

        // Fråga
        // Skall nya objekt alltid instansieras i main metoden?
        // Svar: Nej
        // t.ex. metoden nedan skapar två punkter utanför main
        demo1();

        // Demo av metoden mittpunkt
        demo2();

    }

    /**
     * Demo av metoden mittpunkt som finns i klassen Point
     */
    static void demo2() {

        // Skapa två punkter
        Point punkt1 = new Point();
        Point punkt2 = new Point();

        // Flytta punkterna
        punkt1.x = 5;
        punkt1.y = 0;
        punkt2.x = 0;
        punkt2.y = 5;

        // Beräkna mittpunkten
        Point punkt3 = Point.midpoint(punkt1, punkt2);
        System.out.println(
                "(" + punkt3.x + "," + punkt3.y + ")"
        );


    }

    /**
     * Demo av metoden distans som finns i klassen Point
     */
    static void demo1() {
        Point A = new Point(); // (0.0, 0.0)
        Point B = new Point(); // (0.0, 0.0)

        double distance = Point.distance(A, B);
        System.out.printf("%.2f \n", distance);

        // Flytta punkterna
        A.x = 0;
        A.y = 5;
        B.x = 5;
        B.y = 0;
        System.out.printf("%.2f \n", Point.distance(A, B));


        // Flytta punkterna
        A.x = 3;
        A.y = 0;
        B.x = 0;
        B.y = 4;
        System.out.printf("%.2f \n", Point.distance(A, B));
    }


}
