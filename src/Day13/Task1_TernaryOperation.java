package Day13;

import java.util.Scanner;

public class Task1_TernaryOperation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int temperature = scanner.nextInt();
        int weather = 25;
        String message = temperature<15 ? "Cold" : "Warm";
        System.out.println(message);

    }
}
