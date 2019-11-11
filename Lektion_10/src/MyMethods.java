/**
 * Created by Mahmud Al Hakim
 * Nackademin - Stockholm - Sweden
 * Project: OOP_HT19
 * Date: 2019-11-11 09:39
 * Copyright: MIT
 */

public class MyMethods {

    /**
     * En klassmetod som skriver ut ett meddelande
     * @param message är en parameter som skickas
     *                till metoden vid anropet.
     */
    public static void printMessage(String message){
        System.out.println(message);
    }


    public static void main(String[] args) {
        printMessage("Hello static method!");
        MyMethods.printMessage("Hello from same class!");
    }

}
