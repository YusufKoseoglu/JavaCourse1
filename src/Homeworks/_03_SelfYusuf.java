package Homeworks;

import Day26.EnumTask.Main;

import java.util.Scanner;

public class _03_SelfYusuf {
//    NOT ORTALAMASI
public static void main(String[] args) {
    int turkce,matematik,fenBilgisi, sosyalBilgisi , bedenEgitimi;
    double ortalama;

    Scanner scan = new Scanner(System.in);
    System.out.print("Turkce notunu giriniz: ");
    turkce = scan.nextInt();
    System.out.print("Fen Bilgisi notunu giriniz: ");
    fenBilgisi = scan.nextInt();
    System.out.print("Matematik notunu giriniz: ");
    matematik = scan.nextInt();
    System.out.print("Sosyal Bilgisi notunu giriniz: ");
    sosyalBilgisi = scan.nextInt();
    System.out.print("Beden Egitimi notunu giriniz: ");
    bedenEgitimi = scan.nextInt();

    ortalama = (turkce+matematik+fenBilgisi+sosyalBilgisi+bedenEgitimi)/5;
    if (ortalama <= 50){
        System.out.println("KALDIN AQ");
    }else {
        System.out.println("GECTIN AQ");
    }

}
}
