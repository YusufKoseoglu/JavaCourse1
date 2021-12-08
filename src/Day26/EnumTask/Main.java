package Day26.EnumTask;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine().toUpperCase();
        Months userMonths = Months.valueOf(userInput);
        switch (userMonths){
            case JANUARY :
                System.out.println("It is winer break");
                break;
            case APRIL:
                System.out.println("I just finished SDET course");
                break;
            case OCTOBER:
                System.out.println("I got my first job in IT");
                break;
            default:
                System.out.println("I am learning Java");
        }
    }
}
