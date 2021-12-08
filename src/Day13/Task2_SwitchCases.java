package Day13;

import java.util.Scanner;

public class Task2_SwitchCases {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Your result: ");
        String results = scanner.nextLine();

        switch (results) {
            case "A":
                System.out.println("Excellent") ;
                break;
            case "B":
                System.out.println("Good");
                break;
            case "C":
                System.out.println("Fair");
                break;
            default:
                System.out.println("You have not put a valid answer ");
        }
    }
}
