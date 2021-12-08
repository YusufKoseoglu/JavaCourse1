package Day10.MathClassPack;

import java.util.Scanner;

public class ScannerTask2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your name ? - ");
        String name = scanner.nextLine();

        System.out.println("Where is your hometown? - ");
        String hometown = scanner.nextLine();

        System.out.println("Where do you live - ");
        String placeTheyLive = scanner.nextLine();

        System.out.println("How old are you? - ");
        byte age = scanner.nextByte();

        System.out.println("Height? -");
        short height = scanner.nextShort();

        System.out.println("You like where you live " + placeTheyLive);
        boolean likePlaceTheyLive = scanner.nextBoolean();



    }
    }
