package day02;

import java.util.Scanner;

public class IfStatement {
    public static void main(String[] args) {
    //asagidaki secenekler dogrultusunda gereken kodu yaziniz.
        //        //a)Aralik,ocak,subat icin "Kis"
        //        //b) Mart,nisan ,mayis icin "Ilkbahar"
        //        //c)haziran temmuz agustos icin "yaz"
        //        //d)eylul ekim kasim icin "sonbahar"
        //        //e)digerleri icin gecersiz ad

        Scanner input = new Scanner(System.in);
        System.out.println("Bir ay adı veriniz");
        String ayAdi=input.next();
        boolean kis=ayAdi.equalsIgnoreCase("Aralık")||ayAdi.equalsIgnoreCase("ocak")
                ||ayAdi.equalsIgnoreCase("subat");
        boolean ilkBahar=ayAdi.equalsIgnoreCase("mart") || ayAdi.equalsIgnoreCase("nisan")
                ||ayAdi.equalsIgnoreCase("mayis");
        boolean yaz=ayAdi.equalsIgnoreCase("haziran")||ayAdi.equalsIgnoreCase("temmuz")
                ||ayAdi.equalsIgnoreCase("agustos");
        boolean sonBahar=ayAdi.equalsIgnoreCase("eylul")||ayAdi.equalsIgnoreCase("ekim")
                ||ayAdi.equalsIgnoreCase("kasim");

        if (kis){
            System.out.println("kis");
        } else if (ilkBahar ){
            System.out.println("ilkbahar");
        } else if (yaz) {
            System.out.println("yaz");
        } else if (sonBahar) {
            System.out.println("sonbahar");
        } else if (kis) {
            System.out.println("kış");
        }else {
            System.out.println("Lütfen gecerli bir ay giriniz");
        }
        //soru1:kullanicidan gun ismi girmesini isteyiniz.girilen isim gecerli ise
        //GUN isminin 1..,2..ve3.. harflerini ilk harf buyuk diger ikisi kucuk olarak yazdirin.
        //GUN ismi gecerli degilse "gecerli bir gun ismi giriniz" yazdirin.

        System.out.println("bir gun ismi giriniz");
        String gun = input.next().toLowerCase();

        if (gun.equalsIgnoreCase("pazar") ||
                gun.equalsIgnoreCase("pazartesi") ||
                gun.equalsIgnoreCase("sali") ||
                gun.equalsIgnoreCase("carsamba") ||
                gun.equalsIgnoreCase("persembe") ||
                gun.equalsIgnoreCase("cuma") ||
                gun.equalsIgnoreCase("cumartesi")) {
            String ilk = gun.substring(0,1).toUpperCase();
            char ikinci=gun.charAt(1);
            char ucuncu=gun.charAt(2);
            System.out.println("girdiginiz gunun ilk uc harfi:" +ilk+ikinci+ucuncu);
        }else{
            System.out.println("gecerli bir gun adi giriniz");
        }
        //Soru 5: Aşağıdaki seçenekler doğrultusunda gereken kodu yazınız.
//        a) Bir üçgenin iki kenarının uzunluğu eşitse "İkizkenar Üçgen".
//        b) Bir üçgenin tüm kenarlarının uzunluğu eşitse "Eşkenar Üçgen".
//        c) a ve b koşulları sağlanmıyorsa "Çeşit Kenar Üçgen"
        Scanner input1=new Scanner(System.in);
        System.out.println("Lutfen ucgenin kenar uzunluklarınız giriniz");
        int k1=input1.nextInt();
        int k2=input1.nextInt();
        int k3=input1.nextInt();
        if (k1<=0 || k2<=0 || k3<=0){
            System.out.println("Pozitif bir sayı giriniz");
        }else if (k1==k2 && k2!=k3 || k2==k3 && k3!=k1 || k3==k1 && k2!=k1 ){
            System.out.println("ikizkenar Uçgen");
        } else if (k1==k2 && k1==k3 && k2==k3) {
            System.out.println("Eskenar ücgen ");
        }else {
            System.out.println("Cesitkenar ucgen");
        }


    }//main
}//class
