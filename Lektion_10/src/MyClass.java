/**
 * Created by Mahmud Al Hakim
 * Nackademin - Stockholm - Sweden
 * Project: OOP_HT19
 * Date: 2019-11-11 09:13
 * Copyright: MIT
 */

/**
 * Du kan skapa flera klasser i samma fil
 *
 * En klass bör vara publik (public)
 *    I så fall måste klassnamnet = Filnamnet
 *
 * Klasser i Java måste inte innehålla en main-metod
 * För att köra programmet måste minst en klass innehålla en main-metod
 */
public class MyClass {
    public static void main(String[] args) {
        System.out.println("MyClass");
    }

}

class MyFirstClass {
    public static void main(String[] args) {
        System.out.println("MyFristClass");
    }
}

class MySecondClass{

    // Klassen behöver inte innehålla en main-metod

}