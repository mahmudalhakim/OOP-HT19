/**
 * Created by Mahmud Al Hakim
 * Nackademin - Stockholm - Sweden
 * Project: OOP_HT19
 * Date: 2019-11-25 13:21
 * Copyright: MIT
 *
 * <br> <br>
 * *********************************************** <br>
 * Point är en klass som beskriver punkter
 * i ett vanligt tvådimensionellt koordinatsystem
 ************************************************/
public class Point {
    // instansvariabler
    double x;  // x-coordinate
    double y;  // y-coordinate

    /**
     * En klassmetod som beräknar avståndet mellan två punkter
     * https://www.matteboken.se/lektioner/matte-2/geometri/avstandsformeln
     *
     * @param a referens till den första punkten
     * @param b referens till den andra punkten
     * @return avståndet mellan punkterna
     */
    public static double distance(Point a, Point b) {
        return Math.sqrt(
                (a.x - b.x) * (a.x - b.x) + (a.y - b.y) * (a.y - b.y)
        );
    }


    /**
     * En klassmetod som beräknar mittpunkten
     * http://www.malinc.se/math/geometry/midpointsv.php
     *
     * @param a referens till den första punkten
     * @param b referens till den andra punkten
     * @return mittpunkten
     */
    public static Point midpoint(Point a, Point b) {
        Point p = new Point();
        p.x = (a.x + b.x) / 2;
        p.y = (a.y + b.y) / 2;
        return p;
    }

}


