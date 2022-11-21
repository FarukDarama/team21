package day05;

import java.util.Scanner;

public class ForLoopSlayt03 {
    public static void main(String[] args) {
        // Soru 10. Kullanıcıdan 2 tam sayi isteyin.Girilen sayilar ve aralarındaki sayiların toplamını yazdıran
        // bir program yazın

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen 2 tam sayı giriniz");
        int s1=input.nextInt();
        int s2=input.nextInt();
        int sum =0;
        for (int i =s1;i<s2+1;i++){
            sum=sum+i;
        }
        System.out.println("sum = " + sum);
        // Soru 11. Kullanıcdan 10 dan kucuk bır tam sayı ısteyin ve girilen sayının faktoriyelini yazdırın
        Scanner input1 = new Scanner(System.in);
        System.out.println("Lutfen 10 dan kucuk tam sayı giriniz");
        int s3 =input1.nextInt();
        int multiply =1;
        for (int i =s3;i>0;i--){
         multiply=multiply*i;
        }
        System.out.println(multiply);

      input.close();
      input1.close();

    }
}
