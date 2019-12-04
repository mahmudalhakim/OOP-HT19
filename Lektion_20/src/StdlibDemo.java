/**
 * Created by Mahmud Al Hakim
 * Nackademin - Stockholm - Sweden
 * Project: OOP_HT19
 * Date: 2019-12-04 10:46
 * Copyright: MIT
 */

public class StdlibDemo {
    public static void main(String[] args) {
        Out file = new Out("demo-file.txt");
        file.println("Hello från CS stdlib");
        file.println("Hej från Mahmud");
        file.close();
    }
}
