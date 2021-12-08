package Day10.MathClassPack;

import java.util.Scanner;

public class ScannerTask1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number is ");
        int userAge1 = scanner.nextInt();
        System.out.print("Enter second number is");
        int userAge2 = scanner.nextInt();
        int sum = userAge1 + userAge2;


        System.out.print("Sum is ");
        System.out.println(sum);
    }
    }

