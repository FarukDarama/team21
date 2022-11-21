package day11;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DateClassSoruBankasi01 {
    public static void main(String[] args) {
        //Soru 1:
        //Ali'nin kaç gün yaşadığını bulan kodu yazınız.
        // Ali'nin doğum tarihi 12 Mayıs 2002'dir.
         LocalDate dobAli = LocalDate.of(2002,5,12);
         LocalDate bugun = LocalDate.now();
         Long yasadigiGunSayisi = ChronoUnit.DAYS.between(dobAli,bugun);
        System.out.println("yasadigiGunSayisi = " + yasadigiGunSayisi);

        //Soru 2:
        //Ali'nin kaç ay yaşadığını bulan kodu yazınız.
        // Ali'nin doğum tarihi 4 Haziran 1997'dir.
        LocalDate dobAli1 = LocalDate.of(2002,6,4);
        LocalDate bugun1 =LocalDate.now();
        Long aliYasamSuresi =  ChronoUnit.MONTHS.between(dobAli1,bugun1);
        System.out.println("aliYasamSuresi = " + aliYasamSuresi);

        //Soru 3:
        //  Ali'nin doğum tarihi 4 Haziran 1997'dir.
        //  Ali'nin doğum tarihinden 2 yıl, 3 ay ve 12 gün sonraki tam tarihi bulmak için kodu yazınız.
        LocalDate dobAli2 = LocalDate.of(1997,6,4);
        LocalDate tarih = dobAli2.plusYears(2).plusMonths(6).plusDays(4);
        System.out.println("tarih = " + tarih);

        //Soru 4:
        //  Ali, 29 Ekim 1923'ten 45 yıl 8 ay 5 gün sonra doğmuştur.
        //  Veli, 15 Eylül 1993'ten 24 yıl 2 ay 11 gün önce doğmuştur.
        //  Ali ve Veli'nin kesin doğum tarihini hesaplamak için kodu yazınız.
        //  Ali ve Veli'nin doğum tarihinin aynı olup olmadığını kontrol etmek için kodu yazınız.

         LocalDate tarih1  = LocalDate.of(1923,10,29);
         LocalDate dobAli3 =  tarih1.plusYears(45).plusMonths(8).plusDays(5);
         LocalDate tarih2  = LocalDate.of(1993,9,15);
         LocalDate dobVeli = tarih2.minusYears(24).minusMonths(2).minusDays(11);
        System.out.println("dobAli3 = " + dobAli3);
        System.out.println("dobVeli = " + dobVeli);
        
        if (dobAli3.equals(dobVeli)){
            System.out.println("Ali ve Veli ayni tarihde dogmustur");
        } else {
            System.out.println("Ayni tarihde dogmamıslardır");
        }

        //Soru 5:
        // Veli, Ali'den 3 yıl 11 gün sonra doğmuştur.
        // Ali size doğum tarihi bilgisini 24 Kasım 2012 olarak vermiştir.
        // Veli'nin doğum tarihini hesaplamak için gerekli kodu yazınız.

        LocalDate dobAli4   = LocalDate.of(2012,11,24);
        LocalDate dobVeli1  =   dobAli4.plusYears(3).plusDays(11);
        System.out.println("Velinin dogum tarihi: "+dobVeli1);

        //Soru 6:
        //  Kendinizin ve çocuğunuzun doğum tarihi için Tarih Değerleri oluşturup,
        //  ardından farkı gün olarak hesaplayınız.

          LocalDate dobBerrin = LocalDate.of(2016,3,22);
          LocalDate dobI = LocalDate.of(1985,9,13);
          Long gunFark =  ChronoUnit.DAYS.between(dobI,dobBerrin);
          System.out.println(gunFark);

          //Soru 7:
          //Belirli bir tarihte yılın son 2 hanesini alınız.
           LocalDate bugunTarih = LocalDate.of(1996, 8, 21);
           int sonIkiRakam = bugunTarih.getYear()%100; System.out.println("yilin son 2 hanesi : " + sonIkiRakam);

        //Soru 8:
        // Belirli bir yılın "Artık yıl" olup olmadığını kontrol etmek için kodu yazınız.
        //Artık Yıl:
        //i) Bir yıl 100'e ve 400'e tam bölünüyorsa buna artık yıl denir. Örneğin; 2000 artık yıl, 1900 değildir.
        //ii) Bir yıl 100'e ve 4'e tam bölünemiyorsa artık yıl olarak adlandırılır. Örneğin; 2004 artık yıl, 2007 değildir.
        LocalDate tarih4= LocalDate.of(1996, 8, 21);
        boolean artikYilMi = tarih4.isLeapYear(); System.out.println("tarihteki yil artik yildir " + artikYilMi);











    }




}
