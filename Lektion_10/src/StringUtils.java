/**
 * Created by Mahmud Al Hakim
 * Nackademin - Stockholm - Sweden
 * Project: OOP_HT19
 * Date: 2019-11-11 11:29
 * Copyright: MIT
 */

public class StringUtils {

    public static boolean isWhite(Character c) {

        return (c == ' ' || c == '\t');

    }

    public static boolean isEmpty(String s){
        return s.equals("");
    }
}
