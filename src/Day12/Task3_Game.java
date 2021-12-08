package Day12;

import java.util.Scanner;

public class Task3_Game {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int userInput = scanner.nextInt();

        int random = (int) Math.random() * 5;
        System.out.println(random);

        if (userInput >= 0 && userInput <= 5) {

            if (userInput == random) {
                System.out.println("You win");
            } else {
                System.out.println("You lose");
            }
        } else {
            System.out.println("You should enter a number between 0 and 5");
        }

    }
}
