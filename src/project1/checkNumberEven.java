package project1;

import java.util.Scanner;

public class checkNumberEven {

    /*
        Given an int number. Check if the number is even or not

        if the number is even print true

        if the number is odd print false

        result should be true or false.
     */


        // Please don't change anything before this line. Start your code after this line.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (number % 2 == 0) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

    }}


