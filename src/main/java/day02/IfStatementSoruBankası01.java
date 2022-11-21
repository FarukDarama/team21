package day02;

public class IfStatementSoruBankası01 {
    public static void main(String[] args) {
        // Soru 1. Aşağıdaki seçenekler doğrultusunda gereken kodu yazınız.
        //a) Aralık, Ocak, Şubat için "Kış"
        //b) Mart, Nisan, Mayıs için "İlkbahar"
        //c) Haziran, Temmuz, Ağustos için "Yaz"
        //d) Eylül, Ekim, Kasım için "Sonbahar"
        //e) Diğerleri için "Geçersiz ay adı"

        String ay ="HAZİRAN";
       String ay1= ay.toLowerCase();
    if (ay.equalsIgnoreCase("aralık")
            ||ay.equalsIgnoreCase("ocak")
            ||ay.equalsIgnoreCase("subat")){
            System.out.println("Kış");
    } else if (ay.equalsIgnoreCase("mart")
            || ay.equalsIgnoreCase("nisan")
            || ay.equalsIgnoreCase("mayis")) {
        System.out.println("Ilk Bahar");
    } else if (ay.equalsIgnoreCase("haziran")
            || ay.equalsIgnoreCase("temmuz")
            || ay.equalsIgnoreCase("agustos")) {
        System.out.println("Yaz");
    } else if (ay.equalsIgnoreCase("eylül")
            || ay.equalsIgnoreCase("ekim")
            || ay.equalsIgnoreCase("kasim")) {
        System.out.println("Son Bahar");
    }else {
        System.out.println("Lütfen gecerli bir ay ismi giriniz");
    }

   // Soru 2. Aşağıdaki seçenekler doğrultusunda gereken kodu yazınız.
        //a) Şifre boşluk karakterinden farklı en az 8 karakter içeriyorsa "Geçerli Şifre"
        //b) Herhangi bir pozisyonda şifrede boşluk karakteri varsa "Şifrede boşluk karakteri kullan- mayınız"
        //c) a ve b koşullarının sağlanmaması durumunda "Geçersiz Şifre"
        //Not: Çözümdeki koşulların sıralarına dikkat ediniz.

        String sifre ="123456";
    if(sifre.replaceAll("[0-9a-zA-Z]","").length()>0){
        System.out.println("Şifrede boşluk karakteri kullanmayınız");
    } else if (sifre.replaceAll("[ ]","").length()>7) {
        System.out.println("Gecreli Sifre");
    }else {
        System.out.println("Gecersiz Sifre");
    }

        // Soru 3. Ayın numarasını girdiğinizde ayın
        // adını yazdırmak için gereken kodu yazınız.
        // Örnek; 1 için çıktı: "Ocak", 2 için çıktı: "Şubat" vb.
        int ayNo= 9;
    if (ayNo==1){
        System.out.println("Ocak");
    } else if (ayNo==2) {
        System.out.println("Subat");
    } else if (ayNo==3) {
        System.out.println("Mart");
    } else if (ayNo==4) {
        System.out.println("Nisan");
    } else if (ayNo==5) {
        System.out.println("Mayis");
    } else if (ayNo==6) {
        System.out.println("Haziran");
    } else if (ayNo==7) {
        System.out.println("Temmuz");
    } else if (ayNo==8) {
        System.out.println("Agustos");
    } else if (ayNo==9) {
        System.out.println("Eylul");
    } else if (ayNo==10) {
        System.out.println("Ekim");
    } else if (ayNo==11) {
        System.out.println("Kasim");
    } else if (ayNo==12) {
        System.out.println("Aralik");
    }else {
        System.out.println("GLutfen gecerli bir ay numarası girin");
    }











    }
}
