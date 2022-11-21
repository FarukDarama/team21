package day06;

import java.util.Scanner;

public class ForLoopSlaytSorular01 {
    public static void main(String[] args) {
    //  Soru 2: 10 ile 30 arasındsa aralarında virgül olacak sekilde yazdırın.

        for (int i=10;i<31;i++){
            System.out.print(i+", ");
        }
        System.out.println();
     // Soru 3: 100 den basla 50 ye kadar aralarında virgül olacak şekilde
        for (int i=100;i>49;i--){
            System.out.print(i+", ");
        }
        System.out.println();
    // Kullanıcıdan 100 den kucuk sayı isteyin.Birden baslayarak girilen sayıya kadar 3 un kati olanları yazdırın
        Scanner input= new Scanner(System.in);
        System.out.println("Lutfen 100 den kücük bir sayi girin");
        int sayi=input.nextInt();
        for (int i=1;i<=sayi;i++){
            if (i%3==0){
                System.out.print(i+" ");
            }
        }
        System.out.println();
    // Kullanıcıdan bir sayi isteyin (57) bir den baslayarak 3 veya 5 in katlarını yazdırın
    for (int i=1;i<58;i++){
        if (i%3==0 || i%5==0){

            System.out.print(i+" ");
        }
    }


input.close();


    }
}
