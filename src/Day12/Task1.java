package Day12;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = scan.nextInt();
        if (number > 100)
        {
            System.out.println("The number is bigger than 100! ");
        }
        else {
            System.out.println("The number is less than or equal to 100");
        }
}}
