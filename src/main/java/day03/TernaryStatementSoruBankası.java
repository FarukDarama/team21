package day03;

public class TernaryStatementSoruBankası {
    public static void main(String[] args) {
     // Soru 2. Bir üçgenin iki kenar uzunlugu esitse ikizkenar
     // tüm kenarları eşitse eşitkenar iki koşulda saglanmıyorsa cesitkenar yazdırın

       int k1 = 5;
       int k2 = 6;
       int k3 = 5;
        String ucgen = k1==k2 && k1!=k3 || k1==k3 && k1!=k2 || k2==k3 && k2!=k1 ?
                ("Ikızkenar") :(k1==k2 && k2==k3 ? "Eskenar" :"Cesitkenar");
        System.out.println("ucgen = " + ucgen);

      // Soru 3.
      int a = 121;
      int yuvarlama =  a%10>=5 ? ((a/10 +1)*10) : (a/10)*10;
        System.out.println("yuvarlama = " + yuvarlama);
      // Soru 4.

      int yil =2022;
      String artıkYil= yil%100==0 ? (yil%400==0 ? "Artık yıl" : "Artık yıl degıl") : (yil%4==0 ? "Artık yıl" :"Artık yıl degil");
      System.out.println("artıkYil = " + artıkYil);
      // Soru 6.

        int x =13;
       int mutlakDeger = x<0 ? (x*(-1)) : (x);
        System.out.println("mutlakDeger = " + mutlakDeger);

      // Soru 7.

       int b = 12;
       int c = 15;
       int kucukSayi = b<c ? b : c;
        System.out.println("kucukSayi = " + kucukSayi);

      // Soru 8. Sayı 3 basamaklı ise konsolda kodunuz "Bu sayı 3 basamaklıdır" olacaktır.
      // Aksi takdirde, kodunuz " Bu sayı 3 basamaklı değildir" olacaktır.

        int sayi =1234;
       String basamak = sayi>99 && sayi<1000 || sayi<-99 && sayi>-1000 ? "Sayınız 3 basamaklıdır" : "Sayınız 3 basamaklı degildir";
        System.out.println(basamak);


      // Soru 9.
       int d= 18;
      String tekCift= d%2==0 ? "Cift" : "Tek";
        System.out.println("tekCift = " + tekCift);

      // Soru 10. Ternary kullanarak; konsolda sayı pozitif ise “Pozitif” ,
        // negatif ise “Pozitif Değil” yazdırınız.
      int sayi1 =17;
      String sayi1Sonuc = sayi1>0 ? "Sayınız pozitif" : "Sayiniz pozitif degil";
        System.out.println("sayi1Sonuc = " + sayi1Sonuc);




    }
}
