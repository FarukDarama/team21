package day10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayList01SoruBankasi {
    public static void main(String[] args) {
        // Soru 1:
        //Bir tamsayı listesindeki tüm öğelerinin toplamını bulunuz.
        List<Integer> myList = new ArrayList<>();
        myList.add(12);
        myList.add(31);
        myList.add(7);
        myList.add(13);
        myList.add(10);
        int sum = 0;
        for (Integer w : myList) {
            sum = sum + w;
        }
        System.out.println("sum = " + sum);
        // Soru 2:
        //Bir tamsayı listesinde 13 öğesinden önceki tüm liste öğelerinin toplamını bulunuz.
        List<Integer> myList1 = new ArrayList<>();
        myList.add(12);
        myList1.add(31);
        myList1.add(7);
        myList1.add(13);
        myList1.add(10);
        int sum1 = 0;
        for (Integer w : myList1) {
            if (w == 13) {
                break;
            }
            sum1 = sum1 + w;
        }
        System.out.println("sum1 = " + sum1);
        // Soru 3:
        // 3) Bir tamsayı listesindeki tüm çift sayıların çarpımını bulunuz.
        int multply = 1;
        List<Integer> myList3 = new ArrayList<>();
        myList3.add(12);
        myList3.add(31);
        myList3.add(7);
        myList3.add(13);
        myList3.add(10);
        for (Integer w : myList3) {

            if (w % 2 == 0) {
                multply = multply * w;
            }

        }
        System.out.println("multply = " + multply);
        // Soru 4 :(MANTIGINI ANLAMADIM )
        //Bir listedeki öğelerin azalan sırada olup olmadığını kontrol ediniz.
        // Örnek: (Sarı, Mavi, Kırmızı, Yeşil) ==> Çıktı: Azalan sırada değil
        //(Sarı, Kırmızı, Yeşil, Mavi) ==> Çıktı: Azalan sıradadır
        List<String> e = new ArrayList<>();
        e.add("Yellow");
        e.add("Red");
        e.add("Green");
        e.add("Blue");
        List<String> f = new ArrayList<>();
        f.addAll(e);
        Collections.sort(f);
        System.out.println(e);
        System.out.println(f);
        int size = e.size();
        int flag = 0;
        for (int i = 0; i < size; i++) {
            if (f.get(i).equals(e.get(size - 1 - i))) {
                flag++;
            }
        }
        if (flag == size) {
            System.out.println("Azalan siradadir");
        } else {
            System.out.println("Azalan sirada degil");
        }
        // Soru 5 :
        // Listede eleman olarak 15 varsa, tüm 15'leri 51 olarak değiştiriniz.
        // Örnek: (12, 11, 15, 34, 43) ==> Çıktı (12, 11, 51, 34, 43)
        List<Integer> g = new ArrayList<>();
        g.add(12);
        g.add(11);
        g.add(15);
        g.add(34);
        g.add(15);
        g.add(43);
        if (g.contains(15)) {
            for (int w : g) {
                if (w == 15) {
                    g.set(g.indexOf(w),51);
                }
            }
            System.out.println(g);

        }
       // Soru 6:
       // Listede 15 veya 13 varsa, bu elemanları kaldırınız.
       // Örnek: (10, 31, 15, 13, 54) ==> Çıktı (10, 31, 54)
        List<Integer> h1 = new ArrayList<>();
        h1.add(10);
        h1.add(31);
        h1.add(15);
        h1.add(13);
        h1.add(54);
        h1.add(13);
        if (!h1.contains(15) && !h1.contains(13)){
            System.out.println("15 ve 13 listde yok");
        }else {
            for (int i=0;i<h1.size();i++){
                if (h1.get(i)==15){
                    int indx15=h1.indexOf(15);
                    h1.remove(indx15);
                    i--;
                }
                if (h1.get(i)==13){
                    int indx13=h1.indexOf(13);
                    h1.remove(indx13);
                    i--;
                }

            }
            System.out.println("h1 = " + h1);

        }

        // Soru :7
        // Bir tamsayı listesinde en yakın 2 tamsayıyı bulunuz.
        // Örnek: (12, 31, 15, 13, 54) ==> Çıktı 12 ve 13'tür
        List<Integer> h = new ArrayList<>();
        h.add(12);
        h.add(31);
        h.add(15);
        h.add(13);
        h.add(54);
        Collections.sort(h);//[12,13,15,31,54]
        int fark =Integer.MAX_VALUE;

        for (int i =1;i<h.size();i++){
           fark = Math.min(fark,h.get(i)-h.get(i-1));
        }
       for (int i=1;i<h.size();i++){
           if (h.get(i)-h.get(i-1) ==fark){
               System.out.println(h.get(i) +" and "+h.get(i-1));
           }
       }



    }
}
