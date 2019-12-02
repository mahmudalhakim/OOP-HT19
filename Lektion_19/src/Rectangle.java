/**
 * Created by Mahmud Al Hakim
 * Nackademin - Stockholm - Sweden
 * Project: OOP_HT19
 * Date: 2019-12-02 09:11
 * Copyright: MIT
 */

public class Rectangle {

    // Instansvariabler
    private double height;
    private double width;

    // Instansmetoder (obs! har aldrig nyckelordet static)

    /**
     * En instansmetod som sätter höjden
     *
     * @param height - höjd
     */
    public void setHeight(double height) {
        if (height > 0)
            this.height = height;
        else
            throw new IllegalArgumentException("OBS! Negativ höjd");
    }

    /**
     * En instansmetod som sätter bredden
     *
     * @param width -  bredden
     */
    public void setWidth(double width) {
        if (width > 0)
            this.width = width;
        else
            throw new IllegalArgumentException("OBS! Negativ bredd");
    }


    /**
     * En instansmetod som beräknar omkretsen
     *
     * @return omkretsen
     */
    public double perimeter() {
        // OBS! Vi har tillgång till alla instansvariabler
        return width * 2 + height * 2;
    }

    /**
     * En instansmetod som beräknar area
     *
     * @return area
     */
    public double area() {
        return this.height * this.width;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "height=" + height +
                ", width=" + width +
                ", area=" + area() +
                ", omkrets=" + perimeter() +
                '}';
    }
}
