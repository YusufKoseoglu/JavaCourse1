package Day22;

import java.util.Scanner;

public class Mentoring_WhileLoop {
////    Print all the even numbers between 0 - 100 using while loop
//    public static void main(String[] args) {
//    int number = 0;
//        while (number <= 100){
//        if (number % 2 == 0)
//            System.out.println(number);
//        number++;
//    }}}
//public static void main(String[] args) {
//    String  stringArray[] = {"Hello", "I", "am", "student", "in", "Techno", "Study", "and", "I", "will", "get", "a", "job", "in", "5", "months"};
//    int number1 = 0;
//        while (number1 <= stringArray.length) {
//            if (stringArray.length >= number1 + 1)
//                System.out.print(stringArray[number1] + " ");
//            number1++;
//        }}}

    public static void main(String[] args) {
        int randomValue = (int) (Math.random() * 10);

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a guess: ");
        int userInput = input.nextInt();

        if (userInput == randomValue){
            System.out.println("Correct!");
        }else{
            System.out.println("Wrong");
            System.out.println(randomValue);
        }

    }
    }

