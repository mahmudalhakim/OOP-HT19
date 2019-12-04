/**
 * Created by Mahmud Al Hakim
 * Nackademin - Stockholm - Sweden
 * Project: OOP_HT19
 * Date: 2019-12-04 12:47
 * Copyright: MIT
 */

class Circle {

    // Instansvariabler
    public double x, y;   // Mittpunktens koordinater
    private double radie;

    public Circle() {

    }

    public Circle(double x, double y, double radie) {
        this.x = x;
        this.y = y;
        setRadie(radie);

    }

    // Instansmetoder
    double getRadie() {
        return radie;
    }

    void setRadie(double radie) {
        if (radie > 0)
            this.radie = radie;
        else
            throw new IllegalArgumentException("Negativ radie");
    }

    @Override
    public String toString() {
        return "(" + x + "," + y + "), Radie: " + radie;
    }
}
