package day07;

import java.util.Scanner;

public class LoopSoruBankası04 {
    public static void main(String[] args) {
        //Soru 17 : Bir tamsayıdaki rakamların toplamını bulmak için kodu yazınız.

        int rakamToplam=0;
        int sayi1=1234;
        for (int i =sayi1;i>0;i/=10){//i=i/10
            rakamToplam = rakamToplam+i%10;
        }
        System.out.println("rakamToplam = " + rakamToplam);


        // Soru 18 : Bir String’ de benzersiz(tekrarsız) karakterler
        // yazdırmak için kod yazınız. Örneğin; Hello ==> Heo

        String str ="Hello";
        String bos="";
        for (int i=0;i<str.length();i++){
            String ch =str.substring(i,i+1);
            if (str.indexOf(ch)==str.lastIndexOf(ch)){
                bos =bos+ch;

            }
        }

        System.out.println(bos);


        // Soru 19 :Bir String’ deki boşluk ve noktalama işaretleri dışındaki toplam karakter sayısını bulunuz.
        String a ="123  +%&abc   ABC";
       String aNew = a.replaceAll("[^a-z0-9A-Z]","");

        int harfRakam = aNew.length();
        System.out.println(harfRakam +" tane harf ve rakam içermektedir");
        // Soru 20 :Aşağıdaki görüntüyü bir for döngüsü kullanarak elde eden kodu yazınız.
         /*
         * * * * * *
         * * * * *
         * * * *
         * * *
         * *
         *
          */
     int satir=6;
     int sutun=6;
     for (int i =1;i<=satir;i++){
         for (int k =satir;k>=i;k--){
             System.out.print("* ");
         }
         System.out.println();
     }
        // Soru 21 :Bir tamsayının benzersiz(tekrarsız)
        // basamaklarının toplamını bulmak için kodu yazınız. Örnek:12133455  ́ 2+4=6
    int sayi = 12133455;
     String sayiStr = String.valueOf(sayi);//"12133455"
     String empty ="";

     for (int i =0;i<sayiStr.length();i++){
         String ch=sayiStr.substring(i,i+1);

         if (sayiStr.indexOf(ch)==sayiStr.lastIndexOf(ch)){
          empty  =   empty+ch;
         }

     } //empty="24"
   int tekrarsiz =  Integer.valueOf(empty);//24
        int sum =0;
        for (int i=tekrarsiz;i>0;i/=10){
         sum =   sum +i%10;
        }

        System.out.println("sum = " + sum);
        // Soru 22 : 5 hariç 3'ten 9'a kadar olan tam sayıları yazdırmak için kod yazınız.
        for (int i=3;i<10;i++){
            if (i==5 ) {
                continue;
            }
            System.out.print(i+" ");
        }
        System.out.println();
        //Soru 23 :Asal sayı olup olmadığını kontrol etmek için kullanıcıdan
        // bir tam sayı girmesini isteyiniz. Örnek: kullanıcı 43 girerse çıktı “43 bir asal sayıdır”,
        // kullanıcı 120 girerse “120 asal değildir” olur, kullanıcı negatif tam sayılar girerse çıktı
        // “Pozitif bir tam sayı giriniz” şeklinde kullanıcıyı yönlendiriniz.
        Scanner scan = new Scanner(System.in);
        System.out.println("Asal olup olmadigini kontrol etmek icin pozitif bir tamsayi giriniz: ");
        int number = scan.nextInt();
        int count = 0;
        if(number>0) {
            if (number == 1) {
                System.out.println(number + " bir asal sayidir degildir");
            }else {
                for(int i=2; i<number; i++) {
                    if(number%i==0) {
                        count++;
                    } }
                if(count==0) {
                    System.out.println(number + " bir asal sayidir ");
                }else {
                    System.out.println(number + " bir asal sayi degildir ");
                } }
        }else {
            System.out.println("Pozitif bir tam sayi giriniz ");
        }

        // Soru 24: Kullanıcıya kaç tane fibonacci sayısı görmek istediğini sorunuz.
        // Ardından bu fibonacci sayılarını yazdıran kodu yazınız.
        //Örnek: kullanıcı 6 girerse çıktı 1 1 2 3 5 8 olacaktır.

        //Scanner input = new Scanner(System.in);
        //System.out.println("Kac tane fibonacci sayisi gormek istiyorsunuz ?");
        //int fsayi = input.nextInt();



    }
}
