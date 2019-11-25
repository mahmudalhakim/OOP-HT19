import java.util.Arrays;

/**
 * En klass som beskriver en student
 */
public class Student {
    // Instansvariabler
    String firstName;
    String lastName;
    String[] courses;

    public static void main(String[] args) {
        Student test = new Student();
        test.firstName = "Test";
        test.lastName = "Student";
        test.courses = new String[]{"Frontend", "Backend", "OOP"};

        System.out.println(test.firstName + " " + test.lastName);
        System.out.println(
                Arrays.toString(test.courses)
        );
    }
}
