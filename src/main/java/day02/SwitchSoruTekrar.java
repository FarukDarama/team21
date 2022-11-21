package day02;

import java.util.Scanner;

public class SwitchSoruTekrar {
    public static void main(String[] args) {
        /*
        kullanıcıdan ay ismi alınız ve kullanıcının verdiği aydan itibaren sonuna kadar yazdırın

         */

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir ay ismi giriniz");
        String ayIsmi=input.next().toLowerCase();

        switch (ayIsmi){
            case "ocak":
                System.out.println("Ocak");
            case "subat":
                System.out.println("Subat");
            case "mart":
                System.out.println("Mart");
            case "nisan":
                System.out.println("Nisan");
            case "mayis":
                System.out.println("Mayis");
            case "haziran":
                System.out.println("Haziran");
            case "temmuz":
                System.out.println("Temmuz");
            case "agustos":
                System.out.println("Agustos");
            case "eylul":
                System.out.println("Eylul");
            case "ekim":
                System.out.println("Ekim");
            case "kasim":
                System.out.println("Kasim");
            case "aralik":
                System.out.println("Aralik");
                break;
            default:
                System.out.println("Lütfen gecerli bir ay ismi girin");
        }






    }
}
