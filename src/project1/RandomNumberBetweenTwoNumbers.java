package project1;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class RandomNumberBetweenTwoNumbers {
    /*
    Given two positive integer numbers
    i.e.  "15 20"

     integer 1 is min
     integer 2 is max

    create a random number between min and max (inclusive)

    output should be int

    Challenge: what if we do not know that the first number is smaller than the second.
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.nextLine();
        String[] elements = s1.split(" ");
        int min = Integer.parseInt(elements[0]);
        int max = Integer.parseInt(elements[1]);

        // Please don't change anything before this line. Start your code after this line.

        System.out.println((int) (Math.random()*max-min)+min);
    }
}
