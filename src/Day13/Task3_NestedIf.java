package Day13;

import java.util.Scanner;

public class Task3_NestedIf {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter temperature: ");
        int temperature = scanner.nextInt();

        if (temperature > 0) {
            System.out.print("Please enter atmospheric pressure: ");
            int pressure = scanner.nextInt();

            if (pressure > 5) {
                System.out.println("OK");
            } else {
                System.out.println("Not OK");
            }

        } else {
            System.out.println("Too cold to check!");
        }



    }

}