package day05;

import java.util.Scanner;

public class ForLoopSlaytlar01 {
    public static void main(String[] args) {
     // Soru 3. 100 den 50 ye kadar sayıları aralarında virgül olacak şekilde yazdırın
        for (int i=100;i>49;i--){
            System.out.print(i+",");
        }
        System.out.println();
     // Soru 4. Kullanıcıdan 100 den küçük bir tamsayı isteyin.Bir den baslayarak girilen sayıya kadar
        // 3'ün katı olanalrı  yazdırın .
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen 100 den kucuk pozitif bir tamsayı girin");
        int sayi=input.nextInt();

        for (int i =1;i<sayi+1;i++){
            if (i%3==0){
                System.out.print(i+" ");
            }
        }
        System.out.println();
        // Soru 5. Kullanıcıdan 100 den küçük bir tamsayı isteyin.Bir den baslayarak girilen sayıya kadar
        // 3 un veya 5 in katı olanları yazdırın

        for (int i =1;i<sayi+1;i++){
            if (i%3==0 || i%5==0){
                System.out.print(i+" ");
            }
        }

       input.close();














    }
}
