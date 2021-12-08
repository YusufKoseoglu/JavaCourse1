package Day14;

import java.util.Scanner;

public class Task7_PrintCharInString {
    // INTERVIEW QUESTION
    // Get a String from user and Print each char from String

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter input:");
        String userInput = scanner.nextLine();

        for (int i = 0; i < userInput.length(); i++) {
            System.out.println(userInput.charAt(i));
        }

//        String hello = "Hey";
//        System.out.println(hello.charAt(0));
//        System.out.println(hello.charAt(1));
//        System.out.println(hello.charAt(2));

    }



    }


