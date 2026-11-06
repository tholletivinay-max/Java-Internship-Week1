
public class TypeCasting {

    public static void main(String[] args) {

        // 1. IMPLICIT TYPE CASTING

        System.out.println("===== IMPLICIT TYPE CASTING =====");

        int number = 100;

        double convertedNumber = number;

        System.out.println("Original Integer Value: " + number);

        System.out.println("Converted Double Value: " + convertedNumber);


        // 2. EXPLICIT TYPE CASTING

        System.out.println("\n===== EXPLICIT TYPE CASTING =====");

        double decimalNumber = 99.75;

        int convertedInteger = (int) decimalNumber;

        System.out.println("Original Double Value: " + decimalNumber);

        System.out.println("Converted Integer Value: " + convertedInteger);


        // 3. FLOAT TO INT CASTING

        System.out.println("\n===== FLOAT TO INT CASTING =====");

        float floatNumber = 45.89f;

        int intNumber = (int) floatNumber;

        System.out.println("Original Float Value: " + floatNumber);

        System.out.println("Converted Integer Value: " + intNumber);

    }
}
