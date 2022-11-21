package day02;

import java.util.Scanner;

public class NestedIfSoru12 {
    public static void main(String[] args) {
        /*
      Kullanıcıdan 4 basamaklı bır sayı alın girdigi sayı 5 e bölunuyırsa
      son rakamı kontrol edin
      son rakam 0 ise 5 e bolunen cift sayı
      sonrakam 5 ise 5 e bölunen tek sayı
      girdiği sayı 5 e bölunmuyorsa tekrar deneyin yazdırın
      */
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen 4 basamaklı bir sayi giriniz");
        int sayi = input.nextInt();

        if (sayi%5==0){
            if (sayi%10==0){
                System.out.println("5'e bölünen cift sayıdır");
            }else {
                System.out.println("5'e bölünen tek sayıdır");
            }
        }else {
            System.out.println("Lutfen tekrar deneyiniz");
        }




    }
}
