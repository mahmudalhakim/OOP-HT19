/**
 * Created by Mahmud Al Hakim
 * Nackademin - Stockholm - Sweden
 * Project: OOP_HT19
 * Date: 2019-11-27 12:49
 * Copyright: MIT
 */

public class Exercise_02 {
    static int count; // 0

    public void init() {
        count = 1;
    }

    public void increment() {
        count = count + 1;
    }

    public int getCount() {
        return count;
    }

    public static void main(String[] args) {
        Exercise_02 theObject = new Exercise_02();
        theObject.init();      // count = 1
        theObject.increment(); // count = 2
        theObject.increment(); // count = 3
        System.out.println(theObject.getCount());
        // 3

        Exercise_02 theSecondObject = new Exercise_02();
        theSecondObject.increment(); // count = 4
        theSecondObject.increment(); // count = 5
        System.out.println(theSecondObject.getCount()); // 5
        // 5

    }
}
