package ovning;

/**
 * Created by Mahmud Al Hakim
 * Nackademin - Stockholm - Sweden
 * Project: OOP_HT19
 * Date: 2019-12-09 11:22
 * Copyright: MIT
 */

public class Main {
    public static void main(String[] args) {

        Person p = new Person();

        p.setNamn("Mahmud");
        p.setAdress("Sollentuna");
        p.setPersonnummer("730202");

        System.out.println(
                p.getNamn() + "\n" +
                        p.getPersonnummer() + "\n" +
                        p.getAdress()
        );

        Employee emp = new Employee();

        emp.setNamn("James");
        emp.setPersonnummer("501010");
        emp.setAdress("USA");
        emp.setBefattning("Programmer");
        emp.setLon(50000);

        System.out.println(
                emp.getNamn() + "\n" +
                        emp.getPersonnummer() + "\n" +
                        emp.getAdress() + "\n" +
                        emp.getBefattning() + "\n" +
                        emp.getLon()
        );

        emp.hojLon();
        // System.out.println(emp.getLon());
        System.out.printf("%.2f \n\n", emp.getLon());

        System.out.println(p);

        System.out.println();

        System.out.println(emp);

        Person p2 = new Person("Kalle", "Disney Land", "20100101");
        System.out.println(p2);

        Employee emp2 = new Employee("Steve", "USA", "501010", "Apple Owner", 10000000);
        System.out.println(emp2);
    }
}
