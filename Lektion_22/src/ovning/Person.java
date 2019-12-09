package ovning;

/**
 * Created by Mahmud Al Hakim
 * Nackademin - Stockholm - Sweden
 * Project: OOP_HT19
 * Date: 2019-12-09 11:11
 * Copyright: MIT
 * <p>
 * Person är en superklass som beskriver en person
 */

public class Person {

    private String namn;
    private String adress;
    private String personnummer;

    public Person() {
    }

    public Person(String namn, String adress, String personnummer) {
        this.namn = namn;
        this.adress = adress;
        this.personnummer = personnummer;
    }

    public String getNamn() {
        return namn;
    }

    public void setNamn(String namn) {
        if (namn != null)
            this.namn = namn;
        else
            throw new NullPointerException();
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getPersonnummer() {
        return personnummer;
    }

    public void setPersonnummer(String personnummer) {
        this.personnummer = personnummer;
    }

    @Override
    public String toString() {
        return "Person{" +
                "namn='" + namn + '\'' +
                ", adress='" + adress + '\'' +
                ", personnummer='" + personnummer + '\'' +
                '}';
    }
}
