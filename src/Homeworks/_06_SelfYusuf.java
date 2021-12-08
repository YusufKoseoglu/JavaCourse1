package Homeworks;

import java.util.Scanner;

public class _06_SelfYusuf {
//    While ornekleri
public static void main(String[] args) {
//      int i = 1;
//      while (i <= 100){
//            if (i % 2 == 0){
//                  System.out.println(i);
//            }
//            i++;
//      }
//
//      }
      Scanner scan = new Scanner(System.in);
       int toplam = 0;
       int input ;
       while (true){
             System.out.println("lUTFEN SAYI GIRINIZ");
             input = scan.nextInt();
             if (input <0){
                   System.out.println("Program bitti, Negatif sayi girdiniz ");
                 System.out.println("Girilen tek sayilarin toplami : " + toplam);
                   break;
             }if (input % 2 == 1){
                   toplam +=input;
             }
       }
}}

