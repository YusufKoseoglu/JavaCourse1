package Day11;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        // Get an integer from user
        // if it is greater than 0 - print POSITIVE
        // if it is equal to 0 - print ZERO
        // if it is less than 0 - print NEGATIVE

            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a number please: ");
            int userInput = scanner.nextInt();

            if (userInput > 0) {
                System.out.println("POSITIVE");
            }

            if (userInput == 0) {
                System.out.println("ZERO");
            }

            if (userInput < 0) {
                System.out.println("NEGATIVE");
            }
        }







    }
