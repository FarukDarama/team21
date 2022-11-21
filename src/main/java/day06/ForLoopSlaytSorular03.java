package day06;

public class ForLoopSlaytSorular03 {
    public static void main(String[] args) {
        // Bir string alın ve tersini yazdırın .
        String isim = "Faruk";
        String ters ="";
        for (int i=isim.length()-1;i>=0;i--){
            char ch =isim.charAt(i);
            ters =ters+ch;

        }
        System.out.println(ters);

        // Kullanıcıdan bir string alın palindrome olup olmadıgını kontrol edin
        String str ="abak";
        String ters2="";
         for (int i =str.length()-1;i>=0;i--){
             char ch2 =str.charAt(i);
             ters2 = ters2+ch2;
         }
        if (str.equalsIgnoreCase(ters2)){
            System.out.println("Girilen ifade Palindromedir");
        }else {
            System.out.println("Girilen ifade Palindromedir degildir");
        }
    //Ku8llanıcıdan iki sayı alıcaz  sayılar ve aralarındaki sayıların toplamını yazdırın
        int sayi1 =13;
        int sayi2 = 16;

        int toplam =0;

        for (int i=13;i<17;i++){
         toplam = toplam+i;
        }
        System.out.println("Sayıaların toplamı :"+toplam);




    }





}
