import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Stack;

/**
 * Created by Mahmud Al Hakim
 * Nackademin - Stockholm - Sweden
 * Project: OOP_HT19
 * Date: 2019-12-12 09:46
 * Copyright: MIT
 */

public class Ovning_18_2 {
    public static void main(String[] arg) throws FileNotFoundException {

        var stack = new Stack<String>();

        var file = new Scanner(new File("Lektion_24/namn.txt"));

        while (file.hasNextLine()) {
            stack.push(file.nextLine());
        }

        while (!stack.empty())
            System.out.println(stack.pop());
    }
}
