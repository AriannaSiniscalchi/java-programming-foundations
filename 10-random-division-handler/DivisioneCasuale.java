package RandomDivision;

import java.util.Scanner;
import java.util.Random;
import java.util.InputMismatchException;

public class DivisioneCasuale {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random randomGenerator = new Random();

        try {
            System.out.print("Enter an integer (dividend): ");
            // This will throw InputMismatchException if the user enters non-integer data
            int dividend = scanner.nextInt();

            /* 
             * GENERATING A RANDOM NUMBER BETWEEN 0 AND 3 (inclusive)
             * Demonstrating both required methods:
             */

            // Method 1: Using java.util.Random
            // nextInt(4) returns a value from 0 (inclusive) to 4 (exclusive) -> 0, 1, 2, 3
            int randomDivisor = randomGenerator.nextInt(4);

            /* 
             * Method 2: Using Math.random() (Alternative)
             * Generates a double between 0.0 and 1.0 (exclusive).
             * Multiplying by 4 and casting to int results in 0, 1, 2, or 3.
             * int randomDivisor = (int)(Math.random() * 4); 
             */

            System.out.println("Generated random divisor: " + randomDivisor);

            // Performing integer division
            // If randomDivisor is 0, Java throws an ArithmeticException
            int result = dividend / randomDivisor;
            System.out.println("Integer division result: " + result);

        } catch (InputMismatchException e) {
            // Handles cases where the user input is not a valid integer
            System.out.println("Error: You must enter a valid integer.");
        } catch (ArithmeticException e) {
            // Specifically catches the division by zero error
            System.out.println("Critical Error: Division by zero! The random divisor was 0.");
        } finally {
            // Ensure the scanner is closed regardless of whether an exception occurred
            scanner.close();
            System.out.println("Program execution finished.");
        }
    }
}
