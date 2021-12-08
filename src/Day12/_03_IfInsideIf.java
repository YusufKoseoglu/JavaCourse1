package Day12;

import java.util.Scanner;

public class _03_IfInsideIf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number from 0 to 5: ");

        int number = scanner.nextInt();

        if(number >= 0 && number <= 5){
            int randomNumber = (int) (Math.random()*5);
            System.out.println("Your random number: " + randomNumber);
            if(number==randomNumber) {
                System.out.println("You win");
            }else{
                System.out.println("You lose");
            }

        }else{
            System.out.println("Invalid");
        }

    }
}
