import java.util.Arrays;

/**
 * Created by Mahmud Al Hakim
 * Nackademin - Stockholm - Sweden
 * Project: OOP_HT19
 * Date: 2019-11-27 11:08
 * Copyright: MIT
 */

public class Variabler {

    public static void main(String[] args) {

        // Olika kategorier av variabler

        // 1. Lokala variabler
        int localVar;
        // Lokala variabler måste initieras
        // System.out.println("localVar = " + localVar);  // Fel
        // Error:(18, 44) java:
        // variable localVar might not have been initialized

        {
            // Lokala variabler är synliga inne i ett block
            int localVar2 = 123;
        }
        // System.out.println("localVar2 = " + localVar2); // Fel
        // Error:(28, 45) java: cannot find symbol
        //  symbol:   variable localVar2
        //  location: class Variabler


        // Parametrar till metoder
        int a = 1;
        double b = 2.0;
        parametrarDemo(a, b); // Call By Value
        // Viktigt! Värdet skickas m.a.o en kopia skickas
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        int[] arr = {1, 2, 3};  // OBS! Referenstyp
        parametrarDemo2(arr); // Call By Reference
        System.out.println(Arrays.toString(arr));
        // [0, 0, 0]

        // Demo av instansvariabler
        Student student1 = new Student();
        student1.name = "James";
        student1.email = "james@oracle.com";
        System.out.println("Student 1: ");
        System.out.println("Namn  : " + student1.name);
        System.out.println("E-post: " + student1.email);

        Student student2 = new Student();
        student2.name = "John";
        student2.email = "john@email.com";
        System.out.println("Student 2: ");
        System.out.println("Namn  : " + student2.name);
        System.out.println("E-post: " + student2.email);

        // Demo på klassvariabler
        System.out.println(student1.name
                + " läser på "
                + Student.school
        );
        System.out.println(student2.name
                + " läser på "
                + Student.school
        );
        System.out.println(student1.name + " läser följande kurser:");
        for (String course : Student.courses) {
            System.out.println("\u2022 " + course);
        }
        System.out.println(student2.name + " läser följande kurser:");
        for (String course : Student.courses) {
            System.out.println("\u2022 " + course);
        }
    }

    static void parametrarDemo2(int[] arr) {
        System.out.println(Arrays.toString(arr));
        // [1, 2, 3]
        arr[0] = 0;
        arr[1] = 0;
        arr[2] = 0;
        System.out.println(Arrays.toString(arr));
        // [0, 0, 0]
    }

    static void parametrarDemo(int a, double b) {
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        a = 0;
        b = 0;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}


/**
 * En klass som beskriver en student
 */
class Student {

    // Instansvariabler
    // OBS! Varje objekt får kopior av alla dessa variabler
    String name;
    String email;

    // Klassvariabler
    // Finns bara i en upplaga, gemensam för alla objekt
    static String school = "Nackademin";
    static String[] courses = {"Frontend", "Backend", "OOP"};

}