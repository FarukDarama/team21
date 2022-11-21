package day04;

import java.util.Scanner;

public class StringManipulationTestKitabı01 {
    public static void main(String[] args) {
   // Soru 1. Sadece tek bir kelimeden oluşan şehir isimleri için bir String değişkeni oluşturun. Şehir ismini,
        // baş harfi büyük ve diğer tüm karakterleri küçük harfler olacak şekilde konsolda yazdırınız.
        //Örnek: mIAMI - Miami miami - Miami MIAMI - Miami
        //mIaMi - Miami vb.

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir sehir ismi giriniz");
        String sehir = input.nextLine();
        String ilkHarf = sehir.substring(0,1).toUpperCase();
        String kalan = sehir.toLowerCase().substring(1,sehir.length());
        System.out.println(ilkHarf+kalan);
        // Soru 2. Kişi isimleri için 3 String değişken oluşturunuz.
        // Boşluk karakterleri hariç 3 isimdeki karakter sayısının toplamını yazdırınız.
        //Örnek: İsimler Ali Can, Merve Star, Mark Tom ise konsolda 22 görmelisiniz.
        String ad1 = "Ali Can";
        String ad2 = "Merve Star";
        String ad3 = "Mark Tom";
        String adlar = ad1 + ad2 + ad3;
        int harfToplam = adlar.replace(" ","").length();
        System.out.println("harfToplam = " + harfToplam);

        // Soru 3. Bir String değişkeni oluşturunuz, String'deki toplam alfabetik ve sayısal
        // karakter sayısını konsolda yazdırınız.
        //Örnek: String : ' Miami 33018!!! ' ise konsolda 10 yazdırmanız gerekir.
         String pwd ="Miami 33018!!!";
        int harfRakam = pwd.replaceAll("[ ]","").
                         replaceAll("\\p{Punct}","").
                          length();
        System.out.println("harfRakam = " + harfRakam);

        // Soru 4. Bir String değişkeni oluşturunuz, String'deki rakam olmayan karakterlerin
        // sayısını konsolda yazdırınız.
        //Örnek: String: '1a3Bcf4!...' ise konsolda 8 yazdırmanız gerekir.' ise konsolda 8 yazdırmanız gerekir.
        String pwd1="1a3Bcf4!...";
        int rakamsız = pwd1.replaceAll("[0-9]","").length();
        System.out.println("rakamsız = " + rakamsız);

        // Soru 5. Bir String değişkeni oluşturunuz ve String değişkenin konsolda
        // boşluk olmayan son karakteri yazdırınız.
        //Örnek: 'Ali Can' için n yazdırmalısınız. ‘Miami’ için i yazdırmalısınız.

         String a = "  akshdfvfd*?   ";
        String  spaceSiz =  a.trim();
        char sonHarf = spaceSiz.charAt(spaceSiz.length()-1);
        System.out.println("sonHarf = " + sonHarf);
        // Soru 6. Bir String değişkeni oluşturunuz ve String'in ilk ve son
        // karakterlerinin ASCII değerlerinin toplamını bulunuz.

        String almanca="vergeben";
        char ilk = almanca.charAt(0);
        char son = almanca.charAt(almanca.length()-1);
        System.out.println(ilk+son);//228
        
        // Soru 7. Bir String değişkeni oluşturunuz ve ilk karakteri dışındaki
        // tüm karakterleri konsolda yazdırınız.
        //Örnek: String 'Java' ise konsola 'ava' yazdırmalısınız.
        
        String x = "Fenerbahce";
        String newx = x.substring(5);// girilen sayının indexinden yazdırmaya baslar.
        System.out.println("newx = " + newx);
        // Soru 8. Bir String değişkeni oluşturunuz ve son karakteri dışındaki
        // tüm karakterlerini konsolda büyük harfle yazdırınız.
        //Örnek: String 'Java' ise konsola 'JAV' yazdırmalısınız.
         String y = "Anelka";
         String newy = y.toUpperCase().substring(1);
        System.out.println("newy = " + newy);
        // Soru 9. Bir String değişkeni oluşturunuz ve konsolda ilk karakter ve
        // son karakter dışındaki tüm karakterleri büyük harflerle yazdırınız.
        //Örnek: String 'Java' ise konsolda 'AV' yazdırmalısınız.

        String z ="Ayya";
       int sonIndex=z.length()-1;
       String geriKalan = z.substring(1,sonIndex).toUpperCase();
       System.out.println("geriKalan = " + geriKalan);



    }
}
