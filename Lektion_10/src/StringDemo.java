/**
 * Created by Mahmud Al Hakim
 * Nackademin - Stockholm - Sweden
 * Project: OOP_HT19
 * Date: 2019-11-11 11:32
 * Copyright: MIT
 */

public class StringDemo {

    public static void main(String[] args) {

        String test = "Lite text och annat smått och gott";
        int counter = 0;
        for (int i = 0; i < test.length(); i++) {
            if(StringUtils.isWhite( test.charAt(i) )){
                counter++;
            }
        }
        System.out.println("Det finns " + counter + " blanka tecken i strängen!");
    }
}
