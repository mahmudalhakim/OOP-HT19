import java.util.Stack;

/**
 * Created by Mahmud Al Hakim
 * Nackademin - Stockholm - Sweden
 * Project: OOP_HT19
 * Date: 2019-12-12 09:18
 * Copyright: MIT
 */

public class StackDemo {

    public static void main(String[] args) {

        var stackDemo = new Stack<Integer>();

        // Metoden push()
        // Lägg till element
        stackDemo.push(1);
        stackDemo.push(2);
        stackDemo.push(3);
        stackDemo.push(4);
        stackDemo.push(5);

        // Skriv ut en stack
        System.out.println(stackDemo);
        // [1, 2, 3, 4, 5]

        // Metoden pop()
        // Ta bort element
        stackDemo.pop();
        stackDemo.pop();
        stackDemo.pop();
        stackDemo.pop();
        stackDemo.pop();
        // Vad händer om man tar bort från en tom stack
        // stackDemo.pop();
        // Exception in thread "main" java.util.EmptyStackException

        // Metoden empty()
        // Testa om stacken är tom innan en pop-operation
        if (!stackDemo.empty())
            stackDemo.pop();

        stackDemo.push(10);
        stackDemo.push(11);
        stackDemo.push(12);

        // Metoden peek()
        // Titta på sista ett element men ta inte bort
        System.out.println(stackDemo.peek());

        // Metoden search()
        System.out.println(stackDemo.search(11));  // 2 (ligger näst överst)
        System.out.println(stackDemo.search(12));  // 1 (ligger överst)
        System.out.println(stackDemo.search(15));  // -1 (saknas)

    }
}
