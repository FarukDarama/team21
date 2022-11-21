package day10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayList02SoruBankasi {
    public static void main(String[] args) {
        // Soru 8:
        //Listedeki 7 ve 10 dışındaki her öğenin değerini 2'şer artırınız.
        // Örnek: (12, 31, 7, 13, 10) ==> Çıktı (14, 33, 7, 15, 10)
        List<Integer> h = new ArrayList<>();
        h.add(12);
        h.add(31);
        h.add(7);
        h.add(13);
        h.add(10);
        for(Integer w :h){
            if (w==7 || w==10){
                continue;
            }else {
                h.set(h.indexOf(w),w+2);
                System.out.println(h);
            }
        }
       // Soru 9:
       //String bir listede verilen tüm fiyatların toplamını bulunuz.
        //Örnek: List<String> myList = new List<String>{'$12.99', '$23.60', '$54.45'}; ==> 91.04
        List<String> myList = new ArrayList<>();
         myList.add("$12.99");
         myList.add("$23.60");
         myList.add("$54.45");
         double toplam =0;

         for (String w:myList){
          toplam = toplam+Double.valueOf(w.replace("$",""));
         }
        System.out.println(toplam);
         // Soru 10:
        //Bir String listesinde verilen en düşük ve en büyük fiyatın toplamını bulunuz.
        //Örnek: List<String> myList = new List<String>{'$12.99', '$8.25', '$23.60', '$54.45'}; ==> 62.70
        List<String> myList1 = new ArrayList<>();
        myList1.add("$12.99");
        myList1.add("$8.25");
        myList1.add("$23.60");
        myList1.add("$54.45");

        List<Double> myListInt=new ArrayList<>();
        for (String w:myList1){

            Double fiyat =(Double.valueOf(w.replace("$","")));
            myListInt.add(fiyat);
        }
        Collections.sort(myListInt);
        double sum =myListInt.get(0) + myListInt.get(myListInt.size()-1);
        System.out.println(sum);
        // Soru 11:(YAPAMADIM)
        // Döngüleri kullanarak tamsayılardan oluşan bir listenin
        // tüm öğelerinin benzersiz (tekrarsız) olup olmadığını kontrol ediniz.
        List<Integer> myList2 = new ArrayList<>();
        myList2.add(10);
        myList2.add(31);
        myList2.add(15);
        myList2.add(7);
        myList2.add(15);
        myList2.add(23);

       /* for (Integer w:myList2){

          myList2.remove(w);
          if (myList2.contains(w)){
              System.out.println("En az 1 tekrarli oge vardir");
          }else {
              System.out.println("Ogerler tekrarsizdir");
          }
        }*/









    }
}
