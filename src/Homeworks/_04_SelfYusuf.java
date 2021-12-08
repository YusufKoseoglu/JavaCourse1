package Homeworks;

import java.util.Scanner;

public class _04_SelfYusuf {
//    Ucak Bileti Hesaplama
public static void main(String[] args) {
     Scanner scan = new Scanner(System.in);
     int km,yas,tip;
     System.out.println("Mesafeyi giriniz");
     km = scan.nextInt();
     System.out.println("Yasinizi giriniz");
     yas = scan.nextInt();
     System.out.println("Yolculuk tipini seciniz (1=Tek Gidis, 2=Gidis Donus) :");
     tip = scan.nextInt();

     double normalFiyat,yasIndirimi;

     if (km > 0 && yas > 0 && (tip==1 || tip==2 )) {
          normalFiyat = km * 0.10;
          if (yas < 12) {
               yasIndirimi = normalFiyat * 0.5;
               normalFiyat = normalFiyat - yasIndirimi;
          } else if (yas >= 12 && yas <= 24) {
               yasIndirimi = normalFiyat * 0.10;
               normalFiyat -= yasIndirimi;
          } else if (yas > 65) {
               yasIndirimi = normalFiyat * 0.30;
          } else {
               yasIndirimi = 0;
          }
          normalFiyat -= yasIndirimi;{
               if (tip ==2);
          }
          }else {
          System.out.println("Girdiginiz degerler eksik veya yanlis ");
     }
     }}
