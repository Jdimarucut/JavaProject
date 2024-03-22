import java.util.Scanner;

public class DecimalConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int decimalNumber;

        // Input decimal number
        System.out.print("Enter a decimal number: ");
        decimalNumber = scanner.nextInt();

        // Choose conversion type
        System.out.println("Choose conversion type:");
        System.out.println("1 - Decimal to Binary");
        System.out.println("2 - Decimal to Octal");
        System.out.println("3 - Decimal to Hexadecimal");
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Binary representation: " + convertToBinary(decimalNumber));
                break;
            case 2:
                System.out.println("Octal representation: " + convertToOctal(decimalNumber));
                break;
            case 3:
                System.out.println("Hexadecimal representation: " + convertToHexadecimal(decimalNumber));
                break;
            default:
                System.out.println("Invalid choice!");
        }

        scanner.close();
    }

    public static String convertToBinary(int decimalNumber) {
        StringBuilder binaryString = new StringBuilder();
        while (decimalNumber > 0) {
            binaryString.insert(0, decimalNumber % 2);
            decimalNumber /= 2;
        }
        return binaryString.toString();
    }

    public static String convertToOctal(int decimalNumber) {
        StringBuilder octalString = new StringBuilder();
        while (decimalNumber > 0) {
            octalString.insert(0, decimalNumber % 8);
            decimalNumber /= 8;
        }
        return octalString.toString();
    }

    public static String convertToHexadecimal(int decimalNumber) {
        StringBuilder hexString = new StringBuilder();
        while (decimalNumber > 0) {
            int remainder = decimalNumber % 16;
            if (remainder < 10) {
                hexString.insert(0, (char) (remainder + 48));
            } else {
                hexString.insert(0, (char) (remainder + 55));
            }
            decimalNumber /= 16;
        }
        return hexString.toString();
    }
}
