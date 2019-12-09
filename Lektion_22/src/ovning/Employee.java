package ovning;

/**
 * Created by Mahmud Al Hakim
 * Nackademin - Stockholm - Sweden
 * Project: OOP_HT19
 * Date: 2019-12-09 11:15
 * Copyright: MIT
 * <br><br>
 * <strong>
 * Employee är en subklass som ärver från Person
 * Employee beskriver en anställd
 * </strong>
 */

public class Employee extends Person {

    private String befattning;
    private double lon;


    public Employee() {
    }

    public Employee(String namn, String adress, String personnummer, String befattning, double lon) {
        super(namn, adress, personnummer);
        this.befattning = befattning;
        this.lon = lon;
    }

    public String getBefattning() {
        return befattning;
    }

    public void setBefattning(String befattning) {
        this.befattning = befattning;
    }

    public double getLon() {
        return lon;
    }

    public void setLon(double lon) {
        this.lon = lon;
    }

    /**
     * Instansmetoden hojLon höjer lönen med 10%
     */
    public void hojLon() {
        lon = lon * 1.1;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nEmployee{" +
                "befattning='" + befattning + '\'' +
                ", lon=" + lon +
                '}';
    }
}
