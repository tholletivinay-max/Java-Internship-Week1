
import java.util.Scanner;

public class JavaFundamentals {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Accept values from the user
        System.out.print("Enter an integer value: ");
        int intValue = sc.nextInt();

        System.out.print("Enter a float value: ");
        float floatValue = sc.nextFloat();

        System.out.print("Enter a double value: ");
        double doubleValue = sc.nextDouble();

        // Display original values
        System.out.println("\n===== ORIGINAL VALUES =====");
        System.out.println("Integer: " + intValue);
        System.out.println("Float: " + floatValue);
        System.out.println("Double: " + doubleValue);

        // Implicit type casting
        double implicitValue = intValue;

        System.out.println("\n===== IMPLICIT TYPE CASTING =====");
        System.out.println("Before Casting (int): " + intValue);
        System.out.println("After Casting (double): " + implicitValue);

        // Explicit type casting
        int explicitValue = (int) doubleValue;

        System.out.println("\n===== EXPLICIT TYPE CASTING =====");
        System.out.println("Before Casting (double): " + doubleValue);
        System.out.println("After Casting (int): " + explicitValue);

        // Float to double implicit casting
        double floatToDouble = floatValue;

        System.out.println("\n===== FLOAT TO DOUBLE CASTING =====");
        System.out.println("Before Casting (float): " + floatValue);
        System.out.println("After Casting (double): " + floatToDouble);

        // Double to float explicit casting
        float doubleToFloat = (float) doubleValue;

        System.out.println("\n===== DOUBLE TO FLOAT CASTING =====");
        System.out.println("Before Casting (double): " + doubleValue);
        System.out.println("After Casting (float): " + doubleToFloat);

        sc.close();
    }
}
