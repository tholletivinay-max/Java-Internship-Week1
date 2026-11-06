
import java.util.Scanner;

public class StudentInput {

    public static void main(String[] args) {

        // Creating Scanner object
        Scanner sc = new Scanner(System.in);

        // Getting input from the user
        System.out.println("===== STUDENT REGISTRATION =====");

        System.out.print("Enter your Full Name: ");
        String name = sc.nextLine();

        System.out.print("Enter your Age: ");
        int age = sc.nextInt();

        // Consuming the leftover newline
        sc.nextLine();

        System.out.print("Enter your College Name: ");
        String college = sc.nextLine();

        System.out.print("Enter your Branch: ");
        String branch = sc.nextLine();

        System.out.print("Enter your City: ");
        String city = sc.nextLine();

        // Displaying the entered information
        System.out.println("\n===== STUDENT INFORMATION =====");

        System.out.println("Full Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("College: " + college);
        System.out.println("Branch: " + branch);
        System.out.println("City: " + city);

        // Closing Scanner
        sc.close();
    }
}
