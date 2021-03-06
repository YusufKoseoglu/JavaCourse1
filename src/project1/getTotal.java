package project1;

import java.util.Scanner;

public class getTotal {

      /*
        Given three positive numbers as a String with a space between numbers beginning with a symbol or a letter
        i.e. "$15 $20 $30" or "%3 %121 %67" or "€90 €123 €23987"
        remove all the non-numeric characters.
        parse the Strings to int
        and print the total

        Example:
        String num1 = "$15";
        String num2 = "$20";
        String num3 = "$30";
        output should be ==> 65;

        NOTE : if the output is less than 0 change the output to -1
     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String allElements = input.nextLine();

        String[] elements = allElements.split(" ");

        String num1 = elements[0];  // "$15"
        String num2 = elements[1];  // "$20"
        String num3 = elements[2];  // "$30"

        // Use Strings num1 , num2 , num3
        // Please don't change anything before this line. Start your code after this line.

        num1 = num1.substring(1) ;
        num2 = num2.substring(1);
        num3 = num3.substring(1);

        int number = Integer.parseInt(num1) + Integer.parseInt(num2) + Integer.parseInt(num3);

        System.out.println(number);


    }
}
