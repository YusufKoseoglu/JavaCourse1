package Day12;

import java.util.Scanner;

public class _05_StringtoPrimitive {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter first number: ");
        String userInput1 = scanner.nextLine();

        System.out.print("Please enter second number: ");
        String userInput2 = scanner.nextLine();

        int number1ConvertedToInt = Integer.parseInt(userInput1);
        int number2ConvertedToInt = Integer.parseInt(userInput2);

        System.out.println("sum: " + (number1ConvertedToInt+number2ConvertedToInt));


    }
}
