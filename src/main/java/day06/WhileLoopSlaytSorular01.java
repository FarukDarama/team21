package day06;

import java.util.Scanner;

public class WhileLoopSlaytSorular01 {
    public static void main(String[] args) {
     //Soru 2 3 basamaklı sayıalardan 15 , 20 ve 90 a tam bölünebilen sayıları yazdırın
      for (int i=100;i<1000;i++){
          if (i%15==0 && i%20==0 && i%90==0){
              System.out.print(i+" ");
          }

      }
        System.out.println();
      Scanner input = new Scanner(System.in);
      System.out.println("Lütfen başlangıc ve bidiş degerlerini giriniz");
      int bas =input.nextInt();
      int bit =input.nextInt();
      int i=bas;
      while (i<=bit){
       if(i%2==0){
           System.out.print(i+" ");
       }

          i++;
        }
      // Soru 4: Kullanıcıdan başlangıc ve bitiş harfini alın harfler dahil aradaki tüm harfleri buyuk harfle yazdırın
        System.out.println();
        System.out.println("Lufen baslangıc ve bitis harflerini giriniz");
        char harf1=input.next().toUpperCase().charAt(0);
        char harf2=input.next().toUpperCase().charAt(0);
        while (harf1<=harf2){
            System.out.print(harf1+" ");
            harf1++;
        }
        System.out.println();
       //Soru 6: Kullanıcıdan sayı alın ve sayıyı tam bölen sayıları ve toplam kactane olduklarınız yazdırın
         int counter=0;
        System.out.println("Lutfen sayi giriniz");
       int sayi=input.nextInt();
       for (int k=1;k<=sayi;k++){
           if (sayi%k==0){
               System.out.print(k+" ");
              counter = counter+1;
           }
       }
        System.out.println();
        System.out.println("Tam bölenleri sayisi: " + counter);









    }
}
