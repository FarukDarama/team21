package ebruhocasorular;
/* TASK :
         * Basit bir 5 ürünlü manav alisveris programi yaziniz.
         *
         * 1. Adim : urun listesinden urun sectir ve kac kilo oldugunu sor.
         * 2. Adim : Baska bir urun almak isteyip istemedigini sor.
         * 			 istemiyorsa toplam miktari goster, istiyorsa tekrar urun sectir.
         * 			 Bu islemi alisverisi bitirmek isteyene kadar tekrarla.
         * 3. Adim : Musteri her urun sectiginde, aldigi urunun fiyatini toplam fiyata ekle.
         * 4. Adim : Alisveris bitince toplam odemesi gereken tutari goster.

        Ipucu:
        Class icinde 3 method olacak
         * main() isimli bir method
         * musteriSecimi() isimli bir method
         * kasa() isimli bir method
         * */


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Soru01 {
    public static void main(String[] args) {
        //URUNLERİN HAZIRLANMASI
        List<String> urunler = new ArrayList<>();
        urunler.add("Muz");
        urunler.add("Portakal");
        urunler.add("Elma");
        urunler.add("Kivi");
        urunler.add("Erik");

        //FIYATLARIN HAZIRLANMASI
        List<Double> fiyatlar = new ArrayList<>();
        fiyatlar.add(3.5);
        fiyatlar.add(2.0);
        fiyatlar.add(2.0);
        fiyatlar.add(4.0);
        fiyatlar.add(3.5);

        //URUN VE FIYAT EKRANDA LISTELEME

        System.out.println("Urun No\t\tUrunler\t\t\tFiyatlar");
        System.out.println("-----------------------------------------");

        for (int i=1;i<=urunler.size();i++){
            System.out.print(i);
            for (int j =i-1;j<i;j++){
                System.out.println("\t\t\t"+fiyatlar.get(j)+"$"+"            "+urunler.get(j));
            }
        }

        //KULLANICIDAN ALMAK ISTEDIGI URUNUN BILGISI
        String ekUrun="";
        double tutar=0;
        do {
            Scanner input = new Scanner(System.in);
            System.out.println("\nLutfen almak istediginiz urun no'yu giriniz");
            int no =input.nextInt();

            System.out.println("Lutfen kac kg almak istediginizi giriniz ");
            double kg = input.nextDouble();

            System.out.println("Baska urun almak ister misiniz ?  E/H");
            ekUrun =  input.next().substring(0,1);
           for (int i=1;i<=urunler.size();i++){
               if (no==i){
                   tutar=fiyatlar.get(i-1)*kg;
               }
           }


        }while (ekUrun.equalsIgnoreCase("E"));

        System.out.println("Odemeniz gereken toplam tutar: "+tutar+"$");
















    }

}
