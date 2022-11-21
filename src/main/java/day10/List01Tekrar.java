package day10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class List01Tekrar {
    public static void main(String[] args) {

 // 1. Soru Bir tamsayı listesindeki tüm öğelerinin toplamını bulunuz.
        List<Integer> myList = new ArrayList<>();
        myList.add(12);
        myList.add(31);
        myList.add(7);
        myList.add(13);
        myList.add(10);
        int sum =0;

        for (int w:myList){
         sum = sum +w;
        }

        System.out.println("sum = " + sum);
       // Bir tamsayı listesinde 13 öğesinden önceki tüm liste öğelerinin toplamını bulunuz.
                List<Integer> myList1 = new ArrayList<>();
                myList1.add(12);
                myList1.add(31);
                myList1.add(7);
                myList1.add(13);
                myList1.add(10);
                int sum1 =0;

                for (int w: myList1){

                     if (w==13){
                        break;
                     }
                    sum1 =sum1+ w;

                }
        System.out.println("sum1 = " + sum1);

       //Bir tamsayı listesindeki tüm çift sayıların çarpımını bulunuz.
        List<Integer> myList2 = new ArrayList<>();
        myList2.add(12);
        myList2.add(31);
        myList2.add(7);
        myList2.add(13);
        myList2.add(11);
        myList2.add(15);
        myList2.add(9);
         int carpim =1;
         for (int w :myList2){
             if (w%2==0){
                carpim = carpim*w;
             }
         }
        System.out.println("carpim = " + carpim);
        // Listede eleman olarak 15 varsa, tüm 15'leri 51 olarak değiştiriniz.
        // Örnek: (12, 11, 15, 34, 43) ==> Çıktı (12, 11, 51, 34, 43)
        List<Integer> num = new ArrayList<>();
         num.add(12);
         num.add(11);
         num.add(15);
         num.add(16);
         num.add(43);
         num.add(15);

         if (!num.contains(15)){
             System.out.println("Listiniz 15 icermemektedir");

         }else {
             for (int w :num){
                 if (w==15){
                     num.set(num.indexOf(w) , 51 );//// num.set(2,51)
                 }
             }
             System.out.println("num = " + num);
         }



         //Soru 6 Listede 15 veya 13 varsa, bu elemanları kaldırınız.
        // Örnek: (10, 31, 15, 13, 54) ==> Çıktı (10, 31, 54)
        List<Integer> h = new ArrayList<>();
        h.add(10);
        h.add(31);
        h.add(15);
        h.add(13);
        h.add(54);
        h.add(13);
        if (!h.contains(15) && !h.contains(13)){
            System.out.println("15 ve 13 listde yok");
        }else {
            for (int i=0;i<h.size();i++){
                if (h.get(i)==15){
                    int indx15=h.indexOf(15);// infex15 =2
                    h.remove(indx15);
                    i--;//1
                }
                if (h.get(i)==13){
                    int indx13=h.indexOf(13);//2//3
                    h.remove(indx13);
                    i--;
                }

            }
            System.out.println("h = " + h);

        }

        // Bir tamsayı listesinde en yakın 2 tamsayıyı bulunuz.
        // Örnek: (12, 31, 15, 13, 54) ==> Çıktı 12 ve 13'tür
        List<Integer> f = new ArrayList<>();
        f.add(196);
        f.add(31);
        f.add(15);
        f.add(13);
        f.add(54);
        Collections.sort(f);
        System.out.println(f);//[12, 13, 15, 31, 54]

        int minFark=Integer.MAX_VALUE;
        for (int i=1;i<f.size();i++){
        minFark =  Math.min(minFark,f.get(i) - f.get(i-1));
        }
        System.out.println("minFark = " + minFark);

        for (int i =1;i<f.size();i++){

            if (f.get(i)-f.get(i-1)==minFark){
                System.out.println("Buyuk deger: "+f.get(i));
                System.out.println("Kucuk deger: "+f.get(i-1));
            }

        }
        //  Listedeki 7 ve 10 dışındaki her öğenin değerini 2'şer artırınız.
        //  Örnek: (12, 31, 7, 13, 10) ==> Çıktı (14, 33, 7, 15, 10)
        List<Integer> g = new ArrayList<>();
        g.add(12);//14
        g.add(31);//33
        g.add(7);
        g.add(13);
        g.add(10);
        for (Integer w:g){
            if (w==7 || w==10){
                continue;
            }
                g.set(g.indexOf(w), w+2);

        }
        System.out.println("g = " + g);
        //String bir listede verilen tüm fiyatların toplamını bulunuz.
        //Örnek: List<String> myList = new List<String>{'$12.99', '$23.60', '$54.45'}; ==> 91.04
        List<String> arr = new ArrayList<>();
        arr.add("$12.99");
        arr.add("$23.60");
        arr.add("$54.45");

        double toplam =0;

        for (String w:arr){

       toplam = toplam + Double.valueOf(w.replace("$","")); //"12.99"==> 12.99

        }

        System.out.println(toplam);
        //Bir String listesinde verilen en düşük ve en büyük fiyatın toplamını bulunuz.
        //Örnek: List<String> myList = new List<String>{'$12.99', '$8.25', '$23.60', '$54.45'}; ==> 62.70
        List<String> p = new ArrayList<>();
        p.add("$12.99");
        p.add("$23.60");
        p.add("$8.25");
        p.add("$54.45");
        List<Double> j = new ArrayList<>();
        for (String w:p){

        Double fiyat = Double.valueOf(w.replace("$",""));//12.99
            j.add(fiyat);

        }

        System.out.println(j);//12.99,23.60,....
        Collections.sort(j);
        System.out.println(j);
        double enKucukDeger =j.get(0);
        double enBuyukDeger =j.get(j.size()-1);
        System.out.println(enKucukDeger+enBuyukDeger);











    }
}
