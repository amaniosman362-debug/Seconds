package vu.hexadecimal;
import java.util.Scanner;

public class HexaDecimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a hexadecimal digit (0-9, A-F): ");
        String hexDigit = scanner.nextLine().toUpperCase();

        if (hexDigit.length() == 1) {
            char ch = hexDigit.charAt(0);
            int decimalValue;

            if (ch >= '0' && ch <= '9') {
                decimalValue = ch - '0'; // Convert '0'-'9' to 0-9
                System.out.println("Decimal value: " + decimalValue);
            } else if (ch >= 'A' && ch <= 'F') {
                decimalValue = 10 + (ch - 'A'); // Convert 'A'-'F' to 10-15
                System.out.println("Decimal value: " + decimalValue);
            } else {
                System.out.println("Invalid hexadecimal digit.");
            }
        } else {
            System.out.println("Please enter only a single character.");
        }

        scanner.close();
    }
}



    

