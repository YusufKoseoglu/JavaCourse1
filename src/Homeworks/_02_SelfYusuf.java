package Homeworks;

import java.util.Scanner;

public class _02_SelfYusuf {
//    HESAP MAKINESI
public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int sayi1, sayi2 ,secim;
    System.out.println("Ilk sayiyi giriniz: ");
    sayi1 = scan.nextInt();
    System.out.println("Ikinci sayiyi giriniz: ");
    sayi2 = scan.nextInt();
    System.out.println("Lutfen yapmak istediginiz islemi seciniz :");
    System.out.println(" 1-Toplama \n 2-Cikarma \n 3-Carpma \n 4-Bolme");
    System.out.println("Seciminiz:");
    secim = scan.nextInt();
    if (secim == 1){
        System.out.println("Toplama " + (sayi1+ sayi2));
    }else if (secim == 2){
        System.out.println("Cikarma: " + (sayi1-sayi2));
    }else if (secim == 3){
        System.out.println("Carpma :" + (sayi1*sayi2));
    }else if (secim == 4){
        System.out.println("Bolme :" + (sayi1/sayi2));
    if (sayi2 == 0){
        System.out.println("Sonuc belirsiz");
    }else {
        System.out.println("Gecersiz islem" );
    }
    }
}}
