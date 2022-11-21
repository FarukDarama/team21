package ssg;

import java.util.Scanner;

public class Exception01 {
    public static void main(String[] args) {
        /*
       Kullanicidan yasini isteyin
       kullanici yas olarak negatif bir sayi,
       0 veya
       120'den buyuk bir sayi girerse illegalArgumentException olusacak sekilde
       bir program yaziniz
       */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen Yasinizi giriniz");
        int age = scan.nextInt();

        if (age>120||age<=0){

            throw new IllegalArgumentException("yas 0 dan kucuk ve 120 den buyuk olamaz");

        }else {
            System.out.println(age);
        }






    }

}
