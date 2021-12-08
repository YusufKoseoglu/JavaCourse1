package Day14;

import java.util.Scanner;

public class Task2_SumNumbersFromUser {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter the limit: ");
        int limit = scanner.nextInt();

        int sum = 0;

        for (int i = 0; i <= limit; i++) {
            sum += i;
        }

        System.out.println(sum);

    }

}