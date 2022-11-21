package day06;

import java.util.Scanner;

public class ForLoopSlaytSorular02 {
    public static void main(String[] args) {
        //Kullanıcan 100 den kucuk sayı isteyin 1 den sayıya kadar tumsayıalrı yazdırın
        // ancak 3 un kati ise yerine Java
        // 5 in kati ise Guzeldir
        // hem 3 hemde 5 in kati ise yerien Java Guzeldir yazdırın
        Scanner input= new Scanner(System.in);
        System.out.println("Bir sayi girin");
        int num =input.nextInt();

        for (int i=1;i<=num;i++){

            if (i%3==0 && i%5!=0){
                System.out.print("Java ");
             continue;
            } else if (i%5==0 && i%3!=0) {
                System.out.print("Guzeldir ");
            continue;
            } else if (i%3==0 && i%5==0) {
                System.out.print("Java Guzeldir ");
            continue;
            }

            System.out.print(i+" ");
        }
        // Bir string alın ve tersini yazdırın .
        String isim = "Faruk";
        String ters ="";
        for (int i=isim.length()-1;i>=0;i--){
            char ch =isim.charAt(i);
            ters =ters+ch;
        }
        System.out.print(ters);

input.close();




    }
}
