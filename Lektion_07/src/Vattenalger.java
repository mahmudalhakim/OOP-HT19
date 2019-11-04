/**
 * Created by Mahmud Al Hakim
 * Nackademin - Stockholm - Sweden
 * Project: OOP_HT19
 * Date: 2019-11-04 10:36
 * Copyright: MIT
 */

public class Vattenalger {
    public static void main(String[] args) {
/*
 Övning
• Anta att en viss typ av vattenalger under gynnsamma förhållanden
 förökar sig så fort att de varje dygn fördubblar den area de täcker.
• Anta vidare att man i en liten sjö råkat få in sådana alger
  och att de efter en dag täcker en area av 1 dm2, dvs. 0,01 m2.
• Sjön är ungefär 100 gånger 100 m stor, dvs. dess area är 10000 m2.
• Skapa ett program som beräknar hur lång tid det tar
  innan hela sjön blir täckt med alger.
*/
        // Skapa några nödvändiga variabler
        int dag = 1;
        double algerArea = 0.01; // m^2 = 1d^2
        double totalArea = 10000; // m^2 = 100x100 m
        // Problemet är följande
        // Hur många dagar tar det tills hela arean täcks med alger
        // Vi vet att
        //  - Varje dygn fördubblar den area de täcker (algerArea)
        // Lösning
        while(algerArea < totalArea){
            algerArea = algerArea * 2;
            dag++;
        }
        System.out.println("Sjön blir täcket efter " + dag + " dagar!");
    }
}
