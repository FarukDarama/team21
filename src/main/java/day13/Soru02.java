package day13;

import java.util.*;

public class Soru02 {
    public static void main(String[] args) {
       // Aşağıda key olarak ürün adlarını ve value olarak ürün sayısını içeren bir map bulunmaktadır.
        // Ürün adlarını alfabetik sırayla yazdırınız.

        Map<String, Integer> product = new HashMap<>();
        product.put("Laptop", 82);
        product.put("TV", 53);
        product.put("Refrigerator", 12);
        product.put("Music System", 87);
        product.put("Mobile Phone", 53);

        TreeMap<String,Integer> myTree= new TreeMap<>(product);
        System.out.println(myTree);

        HashSet<String> set1 = new HashSet<>(product.keySet());
        TreeSet<String> product1 = new TreeSet<>(set1);
        System.out.println(product1);

        //Bir String’ deki kelimelerin kaç defa tekrarlandığını ifade eden kod yazınız.
        // (Büyük/küçük harfe duyarlı değil)

        String s = "Apex is easy. Type codes to learn apex. To earn money learn apex.\"; ";
        //Apex = 2, is=1, easy=1
        String arr[] = s.toLowerCase().replaceAll("\\p{Punct}","").split(" ");
        System.out.println(Arrays.toString(arr));

        HashMap<String,Integer> map1= new HashMap<>();

        for (String w:arr){

          Integer kelimesayicı=map1.get(w);

            if (kelimesayicı==null){
                map1.put(w,1);

            }else {

                map1.put(w,kelimesayicı+1);

            }

        }
        System.out.println(map1);


















    }
}
