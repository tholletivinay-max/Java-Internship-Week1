
import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {

        // Create Scanner object
        Scanner sc = new Scanner(System.in);

        // Get first number
        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();

        // Get operator
        System.out.print("Enter operator (+, -, *, /): ");
        char operator = sc.next().charAt(0);

        // Get second number
        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();

        double result;

        // Perform calculation
        switch (operator) {

            case '+':
                result = num1 + num2;
                System.out.println("Result: " + result);
                break;

            case '-':
                result = num1 - num2;
                System.out.println("Result: " + result);
                break;

            case '*':
                result = num1 * num2;
                System.out.println("Result: " + result);
                break;

            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("Result: " + result);
                } else {
                    System.out.println("Error: Division by zero is not allowed!");
                }
                break;

            default:
                System.out.println("Invalid operator!");
        }

        // Close Scanner
        sc.close();
    }
}
