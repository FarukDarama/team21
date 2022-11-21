package day02;

import java.util.Scanner;

public class NestedIfSoru13 {
    public static void main(String[] args) {
        /*
        Kullanıcıdan bir yıl alın
        1. Kural: 4 e bolunmeyen yıllar artık yıl degıldır
        2. Kural: 4 ile bölünüp 100 e bölünmeyen yıllar artık yıldır
        3. Kural: 4'un katı olmasına ragmen 100 e bolunebilen yıllardan sadece 
        400 'un katı olanlar artık yıldır
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir yıl giriniz");
        int yil = input.nextInt();

        if (yil % 4 == 0) {
           if (yil%100==0){
              if (yil==400){
                  System.out.println("Artık yıl");
              }else {
                  System.out.println("Artık yıl degi");
              }
           }else {
               System.out.println("Artık yıl degil");
           }
        }else {
            System.out.println("Artık yıl degil");
        }
    }
}
