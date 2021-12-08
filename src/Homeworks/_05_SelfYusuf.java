package Homeworks;

import java.util.Scanner;

public class _05_SelfYusuf {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sicaklik ;
        System.out.println("Hava sicakligini giriniz : ");
        sicaklik = scan.nextInt();

        if (sicaklik > 30 ){
            System.out.println("Bu havada yuzmeye gidilir !");
        }else if (sicaklik<=30 && sicaklik>5)
        {
            System.out.println("Bu havada en iyi sinemaya gidilir!");
    }else {
            System.out.println("Bu havada en iyi kayaga gidilir");
        }
        }
}
