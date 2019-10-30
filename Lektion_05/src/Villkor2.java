/**
 * Created by Mahmud Al Hakim
 * Nackademin - Stockholm - Sweden
 * Project: OOP_HT19
 * Date: 2019-10-30 12:48
 * Copyright: MIT
 */

public class Villkor2 {
    public static void main(String[] args) {


        System.out.println("Nästlade satser");

        int income = 600_000;    // Årsinkomst
        boolean married = false;  // ture = gift

        if (income >= 500_000) {
            if (married)  // Onödigt att skriva  (married == true)
            {
                System.out.println("Du får ansöka om bolån");
            } else {
                System.out.println("Du måste vara gift för att ansöka om bolån");
            }
        } else {
            System.out.println("Din årsinkomst måste vara högre än 500 000kr");
        }
        System.out.println("------------------------");

        System.out.println("Logiska operatorer");
        System.out.println("------------------------");

        System.out.println("!-Operator (icke-operator)");
        married = false;
        if(!married)
            System.out.println("Du måste vara gift för att ansöka om bolån");


        System.out.println("------------------------");
        System.out.println("&&-Operator (Och-Operator)");

        married = true;
        income = 400_000;
        //     TRUE          &&  TRUE
        if(income >= 500_000 && married){
            System.out.println("Du får ansöka om bolån!");
        }
        else
            System.out.println("Tyvärr, du får inte låna pengar!");

        // Tärningskast
        int dice = 6;
        if(dice >= 1 && dice <= 6)
            System.out.println("Between 1 and 6");
        else
            System.out.println("Error: outside range");

        System.out.println("------------------------");
        System.out.println("||-Operator (Eller-Operator)");

        // En annan bank godkänner folk som är antingen gifta
        // eller har årsinkomst över 250000kr
        married = true;
        income = 250_000;
        if(married || income >= 400_000)
            System.out.println("Välkommen till Hakim Bank AB");
        else
            System.out.println("Du kan hyra en lägenhet än så länge!");

        // Övning
        boolean harProgrammering = false;
        boolean harPreparandkurs = true;
        if(harProgrammering || harPreparandkurs)
            System.out.println("Grattis! du får söka utbildningen");
        else
            System.out.println("Tyvärr, Du måste ha läst programmering" +
                    ", eller preparandkurs hos oss!");
    }
}
