/**
 * Created by Mahmud Al Hakim
 * Nackademin - Stockholm - Sweden
 * Project: OOP_HT19
 * Date: 2019-12-11 09:19
 * Copyright: MIT
 */

public class Book implements Printable {

    private String text;

    @Override
    public String print() {

        return text;
    }
}
