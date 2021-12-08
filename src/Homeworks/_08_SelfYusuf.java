package Homeworks;

import java.util.Scanner;

public class _08_SelfYusuf {

//        public static void main(String[] args) {
//            int sayi = 1234, tersi = 0;
//            int yedek=sayi;
//
//            for(;sayi != 0; sayi /= 10) {
//                int basamak = sayi % 10;
//                tersi = tersi * 10 + basamak;
//            }
//            System.out.println("Sayının      : " + yedek);
//            System.out.println("Sayının Tersi: " + tersi);
//        }
//
//    }

//    public static void main(String[] args) {
//        Scanner reader = new Scanner(System.in);
//        System.out.print("Bir Sayı Girin:");
//
//        int sayi = reader.nextInt();
//        long faktoriyel = 1;
//        for(int i = 1; i <= sayi; ++i)
//        {
//            // faktoriyel = faktoriyel * i;
//            faktoriyel *= i;
//        }
//        System.out.printf("%d! = %d \n", sayi, faktoriyel);
//    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Bir sayi giriniz: ");
        int sayi = scan.nextInt();
        int faktoriyel = 1;
        for (int i = 1; i<=sayi ; i++){
            faktoriyel *= i;
        }
        System.out.println(faktoriyel);
    }



}

