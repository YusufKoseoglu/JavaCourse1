package Day11;

import javax.swing.*;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number please = ");
        int userNumber = scanner.nextInt();
        if (userNumber>100){
            System.out.println("PASSED");
        }
    }
}
