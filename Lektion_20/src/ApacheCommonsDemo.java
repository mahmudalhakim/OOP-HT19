import org.apache.commons.lang3.StringUtils;

/**
 * Created by Mahmud Al Hakim
 * Nackademin - Stockholm - Sweden
 * Project: OOP_HT19
 * Date: 2019-12-04 10:33
 * Copyright: MIT
 */

public class ApacheCommonsDemo {
    public static void main(String[] args) {
        if (StringUtils.isNumeric("123456XXXXX"))
            System.out.println("Strängen består av siffror");


        String test = "11%12";
        if (StringUtils.containsOnly(test, "0123456789+-*/")) {
            System.out.println("OK");
        } else {
            System.out.println("Det finns ogiltiga tecken i strängen!");
        }
    }
}
