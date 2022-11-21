package day05;

import java.util.Scanner;

public class ForLoopSlayt02 {
    public static void main(String[] args) {
        // Soru 6 (YAPILAMADI !!!)  Kullanıcıdan 100 den kucuk bir tam saı isteyin 1 den baslayarak girilen sayıya kadar
        //Sayı 3 un katı ise yerine Java
        // Sayı 5 in katı ise Guzeldir
        // hem 3 un hem 5 ın katı ise Java Guzeldir
       /* Scanner input = new Scanner(System.in);
        System.out.println("Lutfen 100 den kucuk pozitif bir tamsayı girin");
        int sayi=input.nextInt();
        for (int i=1;i<sayi+1;i++){
            if (i%3==0&&i%5!=0){
                System.out.print(" Java");
            } else if (i%5==0&&i%3!=0) {
                System.out.print(" Guzeldir");
            } else if (i%15==0) {
                System.out.print(" Java Guzeldir");
            }else{
                System.out.print(i);
            }
        }*/
      // Soru 7. Kullanıcıdan bir String isteyin ve tersten yazdırın.
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir String girin");
        String str =input.nextLine();
         String ters ="";
         for (int i =str.length()-1;i>-1;i--){
             char harf =str.charAt(i);
           ters = ters+harf;
         }
        System.out.println(ters);
         // Kullanıcıdan string alın palindrome olup olmadıgını yazdıran bir program yazın
        if(str.equalsIgnoreCase(ters)){
            System.out.println("Girdiginiz String bir Palindromedur");
        }else System.out.println("Girdiginiz String bir Palindrom degildir.");

    input.close();













    }
}
