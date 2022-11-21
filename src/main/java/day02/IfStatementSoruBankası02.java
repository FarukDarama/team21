package day02;

public class IfStatementSoruBankası02 {
    public static void main(String[] args) {
        // Soru 7. Tam isim için dilbilgisi kurallarını kontrol etmek için kodu yazınız.
        //a) Kodunuz "ali Can", "Ali can", "ali can" için "Baş harflerinde hata" yazmalıdır.
        //b) Kodunuz, aşağıdaki gibi tek kelimeler için "Ad veya soyadı eksik" yazmalıdır.
        //c) "Ali" veya "Can" veya "ali"Kodunuz "ALI CAN" gibi tüm formatlar için "Format hatası" yaz- malıdır.
        //d) Kodunuz bir veya daha fazla boşluk (" " veya " " gibi karakterler) için " Isim girilmedi" yazmalıdır.
        //e) Ad, harfler ve boşluktan başka herhangi bir karakteri içeriyorsa, kodunuz "Geçersiz Ad" yazmalıdır.
        //Not : Kısaltmada 1'den fazla hata varsa, ilgili tüm hata mesajları çıktı olarak konsolda görünmelidir.
        // Örneğin; "ali3" için kodunuz "Baş harflerinde hata", "Ad veya soyadı eksik" ve "Geçersiz Ad"

        String isim ="ali3";
        String isimIlkHarf = isim.substring(0,1);
        int boslukIndex = isim.trim().indexOf(" ");
        String soyadIlkHarf = isim.substring(boslukIndex+1,boslukIndex+2);
        boolean isimIlkHarfBuyukMu =   isimIlkHarf.charAt(0)>='A' && isimIlkHarf.charAt(0)<='Z';
        boolean soyadIlkHarfBuyukMu =  soyadIlkHarf.charAt(0)>='A' && soyadIlkHarf.charAt(0)<='Z';

        if(isimIlkHarfBuyukMu && soyadIlkHarfBuyukMu){
            System.out.println("Baş harflerinde hata");
        }
        if (boslukIndex==-1){
            System.out.println("Ad veya soyadı eksik");
        }
        if (boslukIndex==-1 && isim.equals(isim.toUpperCase()) ){
            System.out.println("Format hatası");
        }
        if (isim.replaceAll("[ ]","").length()==0){
            System.out.println("Isim girilmedi");
        }
        if (isim.replaceAll("[a-zA-Z ]","").length()>0){
            System.out.println("Gecersiz ad");
        }








    }
}
