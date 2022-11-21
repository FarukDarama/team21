package day04;

public class StringManipolationTestKitabı02 {
    public static void main(String[] args) {
 //Soru 10.Bir String in ortadaki herhangi bir konumda yalnızca tek bir boşluk
        // karakteri olup olmadığını kontrol etmek için kod yazınız.
        //Örnek: ‘Ali ‘
        //‘
        //Can’ için konsolda false yazmalıdır.
        //Ali Can ’ için konsolda false yazmalıdır.
        //Ali Can ’ için konsolda false yazmalıdır
       String str="    FARUK DARAMA   ";
      String strTrimli = str.trim();
     int spaceli= strTrimli.length();
     int harfler= strTrimli.replace(" ","").length();

     if (spaceli==harfler+1){
         System.out.println("true");
     }else {
         System.out.println("false");
     }
        // Soru 11. Bir String’ in başında ve sonunda boşluk karakteri olup olmadığını
        // kontrol etmek için kod yazınız.
        // Örnek: ‘ Ali ’ için kodunuz konsolda false yazmalıdır ‘Ali’ için kodunuz konsolda true yazmalıdır

      String a ="ali  can";
      String b="    ali can";
     int once = a.length();
     int sonra =a.trim().length();
     if (once==sonra){
         System.out.println("true");
     }else {
         System.out.println("false");
     }
     // 2. Yol
      //String trimlib=b.trim();
      String sonuc1 = b.equals(b.trim())  ? "true" :"false" ;
      System.out.println("sonuc1 = " + sonuc1);

        // Soru 12. Bir String’ in başında büyük harf ve sonunda nokta olup olmadığını kontrol etmek için kod yazınız.
        //Örnek: ‘Ali’ için kodunuz konsolda false yazdırmalıdır ‘ali.’ için kodunuz konsolda false yazdırmalıdır
        //‘ Ali. ’ için kodunuz konsolda false yazdırmalıdır ‘Ali.’ için kodunuz konsolda true yazdırmalıdır
        //‘ALI.’ için kodunuz konsolda true yazdırmalıdır
        // İlk karakter buyuk mu ?
        // Son karakter . mı ?
        String x ="Ali   .";
      boolean ilkHarf= x.charAt(0)>='A' && x.charAt(0)<='Z';
      boolean sonHarf = x.charAt(x.length()-1) =='.';
      boolean sonuc2 = ilkHarf && sonHarf ;
      System.out.println("sonuc2 = " + sonuc2);
      // Soru 13. Aşağıdaki koşullar için bir parolanın geçerli olup olmadığını kontrol etmek için kod yazınız;
        // Şifre boşluk karakterinden farklı olacak şekilde en az 8 karakter içermelidir.
        // Şifrede en az 1 sembol olmalıdır.

        //Örnek: 'A2b!' için kodunuz konsolda false yazdırmalıdır.
        // 'A2b3cdef' için kodunuz konsolda false yazdırmalıdır
        // '!1a23b4' için kodunuz konsolda false yazdırmalıdır.
        // '!1a23b4?es' için kodunuz konsolda true yazdırılmalıdır.
        // '! a b 3 k' kodunuz konsolda false yazdırmalıdır.

        String pwd ="! a b 3 k 6 7 8";
        boolean uzunluk = pwd.replace(" ","").length()>=8;
        boolean noktalam = pwd.replaceAll("[0-9a-zA-Z ]","").length()>0;
        boolean sonuc3 = uzunluk && noktalam;
        System.out.println("sonuc3 = " + sonuc3);

        // Soru 14. Bir String’ in belirli bir tek karaktere sahip olup
        // olmadığını üç farklı şekilde kontrol etmek için kod yazınız.
        String c ="herhangi";
        boolean s1= c.contains("h");
        System.out.println("s1 = " + s1);
        boolean s2= c.replaceAll("^h","").length()>0;
        System.out.println("s2 = " + s2);
        boolean s3 = c.replace("h","").length()!=c.length();
        System.out.println("s3 = " + s3);

        int indexC= c.indexOf(x);
        System.out.println("indexC = " + indexC);

       // 15. Soru  String gomlekFiyat = ‘$12.99’;
        //String kitapFiyat = ‘$35.99’;
        //Gömlek ve kitap fiyatlarının toplamını bulmak için gereken kodu yazınız.

        String gomlekFiyat = "$12.99";
        String kitapFiyat = "$35.99";
        String dolarsızG  = gomlekFiyat.replace("$","");
        String dolarsızK = kitapFiyat.replace("$","");
         double g =Double.valueOf(dolarsızG);
         double k =Double.valueOf(dolarsızK);
        System.out.println(g+k);
        // 16. Soru Verilen bir ismin adının ve soyadının baş harflerini almak için kodu yazınız.
        // Not: İkinci isim kapsam dışındadır.
        String isim ="Fli Gan";
        char basHarfIsım= isim.charAt(0);
        char soyisimIlkHarf =  isim.split(" ")[1].charAt(0);
        System.out.println("Basharfler: "+basHarfIsım+soyisimIlkHarf);

        // 17. Soru Bir String’ de kullanılan noktalama işaretlerinin sayısını bulmak için bir kod yazınız.
       String pwd1 ="=*&^asdad?+'/-  ";
       int noktalamaSayisi = pwd1.replaceAll("[0-9a-zA-Z ]","").length();
        System.out.println("noktalamaSayisi = " + noktalamaSayisi);





    }
}
