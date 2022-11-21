package day03;

import java.util.Scanner;

public class NestedTernarySoru1ve2 {
    public static void main(String[] args) {
      // Soru 1.
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir tam sayı girin");
        int sayi = input.nextInt();
       String sonuc = sayi<10 ? ("Rakam") : (sayi>9 && sayi<100 ?"Iki basamaklı sayi" : "Uc basamaklı veya daha buyuk sayı");
        System.out.println("sonuc = " + sonuc);

        // Soru 2.

        Scanner input1 = new Scanner(System.in);
        System.out.println("Lutfen bir harf girin");
        char harf =input1.next().charAt(0);

     String harfSonuc = harf>='a' && harf<='z' ? ("Kucuk Harf") : (harf>='A' && harf <='Z' ? "Buyuk Harf" : "Giridiginiz karakter harf degil");
     System.out.println("harfSonuc = " + harfSonuc);



    }
}
