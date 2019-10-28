/**
 * Created by Mahmud Al Hakim
 * Nackademin - Stockholm - Sweden
 * Project: OOP_HT19
 * Date: 2019-10-28 09:11
 * Copyright: MIT
 */

public class NumeriskaTyper {
    public static void main(String[] args) {

        // Heltalstyper
        byte b = 127;
        short s = 32767;
        int i = 2_000_000_000;
        long l = 9_200_000_000_000_000_000L;

        // Flyttalstyper
        float f = 1.2F;
        double d = 1.7e308;  // 1,7 * 10^308

        // Hitta maxvärdet på numeriska typer
        System.out.println(Byte.MAX_VALUE);
        System.out.println(Byte.MIN_VALUE);
        System.out.println(Short.MAX_VALUE);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Long.MAX_VALUE);
        // float och double skrivs ut i grundpotensform
        System.out.println(Float.MAX_VALUE);
        System.out.println(Double.MAX_VALUE);
        // Minsta positiva värdet
        System.out.println(Double.MIN_VALUE);
        // Minsta negativa värdet
        System.out.println(-Double.MAX_VALUE);

        byte b1 = 100;
        // byte b2 = 200;

        int i1 = 10;
        // int i2 = 10.4;

        double d1 = 1.5;
        // double d2 = 1,5;

        // Typkonvertering

        // Från double till String
        // Metod 1
        String test = String.valueOf(d1);
        // Metod 2
        test = Double.toString(d1);
        // Metod 3 , se sid. 49 och 65
        test = "" + d1 ;

        // Från int till String
        int i3 = 100;
        test = Integer.toString(i3);
        test = String.valueOf(i3);
        test = i3 + "";
    }
}
