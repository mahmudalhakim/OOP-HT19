/**
 * Created by Mahmud Al Hakim
 * Nackademin - Stockholm - Sweden
 * Project: OOP_HT19
 * Date: 2019-10-31 06:20
 * Copyright: MIT
 */

public class TruthTable {

    public static void main(String[] args) {


        System.out.println("******* Truth Table V 1.0 *****");
        System.out.println("p    \tq    \tAND \tOR  ");

        boolean p, q;

        p = q = true;
        System.out.println(p + "\t" + q + "\t" + (p && q) + "\t" + (p || q));

        p = true;
        q = false;
        System.out.println(p + "\t" + q + "\t" + (p && q) + "\t" + (p || q));

        p = false;
        q = true;
        System.out.println(p + "\t" + q + "\t" + (p && q) + "\t" + (p || q));

        p = q = false;
        System.out.println(p + "\t" + q + "\t" + (p && q) + "\t" + (p || q));

        System.out.println("******************************");


        System.out.println("******* Truth Table V 2.0 *****");
        System.out.println("p\tq\t&&\t||");

        p = q = true;
        System.out.println((p ? 1 : 0) + "\t" + (q ? 1 : 0) + "\t" + (p && q ? 1 : 0) + "\t" + ((p || q ? 1 : 0)));

        p = true;
        q = false;
        System.out.println((p ? 1 : 0) + "\t" + (q ? 1 : 0) + "\t" + (p && q ? 1 : 0) + "\t" + ((p || q ? 1 : 0)));

        p = false;
        q = true;
        System.out.println((p ? 1 : 0) + "\t" + (q ? 1 : 0) + "\t" + (p && q ? 1 : 0) + "\t" + ((p || q ? 1 : 0)));

        p = q = false;
        System.out.println((p ? 1 : 0) + "\t" + (q ? 1 : 0) + "\t" + (p && q ? 1 : 0) + "\t" + ((p || q ? 1 : 0)));

        System.out.println("*****************************");


        System.out.println("******* Truth Table V 3.0 *****");
        System.out.println("p\tq\t&&\t||");

        p = q = true;
        for (int i = 1; i <= 4; i++) {
            if (i == 2) {
                p = true;
                q = false;
            }
            if (i == 3) {
                p = false;
                q = true;
            }
            if (i == 4)
                p = q = false;

            System.out.println((p ? 1 : 0) + "\t" + (q ? 1 : 0) + "\t" + (p && q ? 1 : 0) + "\t" + ((p || q ? 1 : 0)));
        }
        System.out.println("*****************************");


    }
}
