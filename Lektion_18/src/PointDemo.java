import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Mahmud Al Hakim
 * Nackademin - Stockholm - Sweden
 * Project: OOP_HT19
 * Date: 2019-11-28 09:10
 * Copyright: MIT
 */

public class PointDemo {

    /**********************************************************
     *
     *    Arbeta med arrayer med objekt (kap. 14)
     *
     ***********************************************************/
    public static void main(String[] args) {

        // Skapa en array som innehåller 5 punkter
        Point[] points = new Point[5];
        System.out.println(Arrays.toString(points));
        // [null, null, null, null, null]

        // Viktigt! Vi har inte skapat punkterna än.
        // points[0].x = 5;
        // Exception in thread "main" java.lang.NullPointerException
        // OBS! Vi behöver skapa punkterna

        // Hur skapar man en punkt?
        // Hur skapar man en instans av klassen Point?
        points[0] = new Point();

        System.out.println(Arrays.toString(points));
        // [Point@77459877, null, null, null, null]

        // Manipulera punkten (ändra instansvariabler)
        points[0].x = 5;
        points[0].y = 10;

        // Hur skriver man info om den första punkten?
        // Utskriften skall se ut så här (5.0,10.0)
        System.out.println(
                "(" + points[0].x + "," + points[0].y + ")"
        );

        // Hur skapar man alla punkter?
        // (skapa flera objekt av klassen Point)
        for (int i = 0; i < points.length; i++) {
            points[i] = new Point();
        }
        System.out.println(Arrays.toString(points));

        // Vart ligger alla dessa punkter i vårt koordinatsystem?
        // Skriv ut info om alla punkter!
        // Utskriften skall se ut så här
        // (0.0, 0.0)
        // (0.0, 0.0)
        // (0.0, 0.0)
        // (0.0, 0.0)
        // (0.0, 0.0)
        print(points);

        System.out.println();

        // Flytta alla punkter 5 steg till höger
        for (int i = 0; i < points.length; i++) {
            points[i].x = 5;
        }
        print(points);


        // Flytta alla punkter 5 steg uppåt
        for (int i = 0; i < points.length; i++) {
            points[i].y = 5;
        }
        print(points);


        // Flytta en valfri punkt till (3,3)
        points[2].x = 3;
        points[2].y = 3;
        print(points);

        // Söka efter en specifik punkt i arrayen t.ex. (3,3)
        // Visa index (på vilken plats i arrayen)
        // Visa ett felmeddelande om punkten saknas!
        // Lösning 1
        search(points, 3.0, 3.0);

        // Leta efter punkten (10,20)
        search(points, 10.0, 20.0);

        System.out.println(" --- Lösning 2 --- ");
        Point test = new Point();
        test.x = 5;
        test.y = 5;
        int index = search(points, test);
        if (index != -1)
            System.out.println("Punkten finns på plats " + index);
        else
            System.out.println("Punkten saknas!");

        System.out.println("******************************************");

        System.out.println("Övning 14.3, sidan 336");
        Point[] punkter = new Point[100];

        try {
            Scanner file = new Scanner(new File("kurva.txt"));
            for (int i = 0; file.hasNextLine(); i++) {
                punkter[i] = new Point();
                punkter[i].x = file.nextDouble();
                punkter[i].y = file.nextDouble();
            }
            file.close();
        } catch (FileNotFoundException e) {
            System.out.println("Filen saknas!");
        }
        print(punkter);

        // Sök efter den första negativa punkten!
        int i;
        for (i = 0; i < punkter.length; i++) {
            if (punkter[i] == null)
                break;
            if (punkter[i].x < 0 && punkter[i].y < 0)
                break;
        }

        if (i < punkter.length)
            System.out.println("Punkten finns på plats nr: " + i);
        else
            System.out.println("Punkten finns inte i arrayen!");


        // Sortering
        // Tips: https://www.youtube.com/watch?v=lyZQPjUT5B4
    }

    /**
     * En klassmetod om söker efter en punkt
     *
     * @param points en array av typen Point[]
     * @param point  en referens till ett objekt av typen Point
     */
    static int search(Point[] points, Point point) {
        int i;
        for (i = 0; i < points.length; i++) {
            if (points[i].x == point.x && points[i].y == point.y)
                break;
        }

        if (i < points.length)
            return i;
        else
            return -1;
    }


    /**
     * En klassmetod om söker efter en punkt
     *
     * @param points en array av typen Point[]
     * @param x      x-koordinat av typen double
     * @param y      x-koordinat av typen double
     */
    static void search(Point[] points, double x, double y) {
        int i;
        for (i = 0; i < points.length; i++) {
            if (points[i].x == x && points[i].y == y)
                break;
        }

        if (i < points.length)
            System.out.println("Punkten finns på plats nr: " + i);
        else
            System.out.println("Punkten finns inte i arrayen!");
    }

    /**
     * En klassmetod som skriver ut alla punkter
     *
     * @param points en array som innehåller punkter
     *               (Objekt av klassen Point)
     */
    static void print(Point[] points) {
        // Skriv ut alla punkter
        for (int i = 0; i < points.length; i++) {
            if (points[i] == null)
                break;
            System.out.println(
                    "(" + points[i].x + ", " + points[i].y + ")"
            );
        }
        System.out.println();
    }
}
