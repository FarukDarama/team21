package studentpractice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentPractice01 {
    public static void main(String[] args) {
          //URUN LISTESININ HAZIRLANMASI
        List<String> urunler = new ArrayList<>();
        urunler.add("Su");
        urunler.add("Sıcak Su");
        urunler.add("Sutlu Flitre Kahve");
        urunler.add("Flitre Kahve");
        urunler.add("Americano");
        urunler.add("Espresso");
        urunler.add("Turk Kahvesi");
        urunler.add("Menengic");
        urunler.set(2,"Cappuccino");

         //FIYATLARIN HAZIRLANMASI
        List<Double> fiyatlar = new ArrayList<>();
        fiyatlar.add(1.00);
        fiyatlar.add(1.50);
        fiyatlar.add(3.00);
        fiyatlar.add(3.00);
        fiyatlar.add(3.00);
        fiyatlar.add(3.00);
        fiyatlar.add(4.00);
        fiyatlar.add(3.50);

        // URUN VE FIYATLARIN EKRANDA LISTELENMESİ
        System.out.println("No\t\tFiyatlar\t\tUrunler");
        System.out.println("--------------------------------------");

        for (int i = 1; i <= urunler.size() ; i++) {
            System.out.print(i);
            for (int j = i-1; j <i ; j++) {

                System.out.println("\t\t"+fiyatlar.get(j)+ "$"+"\t\t\t\t"+urunler.get(j));
            }

        }
        //KULLANICIDAN ALMAK ISTEDGINI URUNUN BILGISI
        Scanner input = new Scanner(System.in);
        System.out.println("\nLutfen almak ıstedgınız urun no gırınız");
        int no = input.nextInt();

        //SEKER BILGISI
        String cevap ="";

        if (no!=1 || no!=2){
            System.out.println("Seker ıster mısınız? E/H");
            cevap=input.next();
        }
        if (cevap.equalsIgnoreCase("E")){

            String fazlaSeker="";
            int counter=1;
            while (!fazlaSeker.equalsIgnoreCase("H")){
                System.out.println("Lutfen seker miktarını girin 1,2,3,4");
                int miktar = input.nextInt();
                if (counter==3){
                    System.out.println("Saglıgınız ıcın daha fazla seker secımıne ızın verılmemektedır.");
                    break;
                }

                System.out.println("Daha fazla eklemek ısrer mısınız ? E/H");
                fazlaSeker= input.next();
                counter++;


            }
        }








    }
}
