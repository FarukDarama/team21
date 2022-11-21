package day04;

public class Tekrar {
    public static void main(String[] args) {

    // Soru 6. Bir String değişkeni oluşturunuz ve String'in ilk ve son
    // karakterlerinin ASCII değerlerinin toplamını bulunuz.

     String d ="vergeben";
    char ilkHarf = d.charAt(0);
    char sonHarf = d.charAt(d.length()-1);
    System.out.println(ilkHarf+sonHarf);
     //Bir String değişkeni oluşturunuz ve ilk karakteri dışındaki tüm karakterleri konsolda yazdırınız.
     //Örnek: String 'Java' ise konsola 'ava' yazdırmalısınız.
       String e="faruk";
       String yenie =  e.substring(1);
        System.out.println("yenie = " + yenie);
        // Soru 8.Bir String değişkeni oluşturunuz ve son karakteri dışındaki
        // tüm karakterlerini konsolda büyük harfle yazdırınız.
        //Örnek: String 'Java' ise konsola 'JAV' yazdırmalısınız.

        String f = "hadibaslayalım";
        String yeniF=   f.toUpperCase().substring(0,f.length()-1);//
        System.out.println("yeniF = " + yeniF);

       // Soru 9. Bir String değişkeni oluşturunuz ve konsolda
        // ilk karakter ve son karakter dışındaki tüm karakterleri büyük harflerle yazdırınız.
        //Örnek: String 'Java' ise konsolda 'AV' yazdırmalısınız.

        String g ="bugun";
       String yenig= g.toUpperCase().substring(1,g.length()-1);
        System.out.println("yenig = " + yenig);

        // Soru 10.Bir String in ortadaki herhangi bir konumda yalnızca
        // tek bir boşluk karakteri olup olmadığını kontrol etmek için kod yazınız.
        //Örnek: ‘Ali ‘

        //'Can’ için konsolda false yazmalıdır.
        //'Ali Can ’ için konsolda false yazmalıdır.
        //'Ali Can ’ için konsolda false yazmalıdır.
        //‘Ali Can’ için konsolda true yazmalıdır.
        //'AliCan  '

        String h = "   Ali Can   ";
       boolean bosluk = h.trim().contains(" ");      //Ali Can
        System.out.println("bosluk = " + bosluk);

       //Soru 11 . Bir String’ in başında ve sonunda boşluk karakteri
        // olup olmadığını kontrol etmek için kod yazınız.
        //Örnek: ‘ Ali ’ için kodunuz konsolda false yazmalıdır ‘Ali’ için kodunuz konsolda true yazmalıdır

        String i =" Mehmet ";
        String sonuc =  i.trim().equals(i) ? "true" : "false";
        System.out.println("sonuc = " + sonuc);

        // Soru 12. Bir String’ in başında büyük harf ve sonunda nokta
        // olup olmadığını kontrol etmek için kod yazınız.
        //Örnek: ‘Ali’ için kodunuz konsolda false yazdırmalıdır
        //       ‘ali.’ için kodunuz konsolda false yazdırmalıdır
        //       ‘ Ali. ’ için kodunuz konsolda false yazdırmalıdır
        //       ‘Ali.’ için kodunuz konsolda true yazdırmalıdır
        //        ‘ALI.’ için kodunuz konsolda true yazdırmalıdır
          String j= "Veli.";
          String dogruMu =   j.charAt(0)>='A' && j.charAt(0)<='Z' && j.charAt(j.length()-1) =='.' ? "Ture": "False";
        System.out.println("dogruMu = " + dogruMu);


        // Soru 13. Aşağıdaki koşullar için bir parolanın geçerli olup olmadığını kontrol etmek için kod yazınız;
        // Şifre boşluk karakterinden farklı olacak şekilde en az 8 karakter içermelidir.
        // Şifrede en az 1 sembol olmalıdır.
        //Örnek: 'A2b!' için kodunuz konsolda false yazdırmalıdır.
        // 'A2b3cdef' için kodunuz konsolda false yazdırmalıdır '!1a23b4' için kodunuz konsolda false yazdırmalıdır.
        // '!1a23b4?es' için kodunuz konsolda true yazdırılmalıdır. '! a b 3 k' kodunuz konsolda false yazdırmalıdır.

        String sifre = "12345678.9";

      boolean sekizdenBuyukMu =  sifre.replace(" ","").length()>7;
      boolean sembolVarMı = sifre.replaceAll("[0-9a-zA-Z ]","").length()>0;
      String sonuc2 =  sekizdenBuyukMu && sembolVarMı ? "true" : "false" ;
        System.out.println("sonuc2 = " + sonuc2);
          //Soru 14. Bir String’ in belirli bir tek karaktere sahip olup olmadığını üç farklı şekilde
        // kontrol etmek için kod yazınız.
        // 1. Yol
         String a1 ="Faruk";
        boolean varMı = a1.contains("f");
        System.out.println("varMı = " + varMı);
        // 2.Yol

       boolean sonuc3 = a1.replaceAll("[^k]","").length()>0 ;
        System.out.println("sonuc3 = " + sonuc3);
       // 3. Yol

        int xinIndex = a1.indexOf('a');
        System.out.println("xinIndex = " + xinIndex);
        // Soru 15.String gomlekFiyat = ‘$12.99’;
        //String kitapFiyat = ‘$35.99’;
        //Gömlek ve kitap fiyatlarının toplamını bulmak için gereken kodu yazınız.

       String gomlekFiyat = "$12.99";
       String  kitapFiyat = "$35.99";

      String yeniGomlek= gomlekFiyat.replaceAll("[$.]","");//"12.99"
      String yeniKitap=  kitapFiyat.replaceAll("[$.]","");// "35.99"

       double Gomlek = Double.valueOf(yeniGomlek);
       double Kitap = Double.valueOf(yeniKitap);
        System.out.println((Gomlek+Kitap)/100);

        // Soru 16. Verilen bir ismin adının ve soyadının baş
        // harflerini almak için kodu yazınız. Not: İkinci isim kapsam dışındadır.

      String isim ="Ali Can"; //AC
      String isimIlkHarf =isim.substring(0,1);
      String soyisimIlkHarf=  isim.split(" ")[1].substring(0,1);
        System.out.println(isimIlkHarf+soyisimIlkHarf);
      // Soru 17 . Bir String’ de kullanılan noktalama işaretlerinin sayısını bulmak için bir kod yazınız.

       String pwd ="Vay be! Ali 13 yaşında ama üniversite öğrencisi.";
       int noktalamaSayisi = pwd.replaceAll("[^\\p{Punct}]","").length();
        System.out.println("noktalamaSayisi = " + noktalamaSayisi);




    }
}
