package day13;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Soru01 {

    public static void main(String[] args) {
       // Aşağıda key olarak ürün adlarını ve value olarak ürün
        // sayısını içeren bir map bulunmaktadır.
        // Toplam ürün sayısını bulmak için kodu yazınız.
        Map<String, Integer> product = new HashMap<>();
        product.put("Laptop", 12);
        product.put("TV", 53);
        product.put("Refrigerator", 12);
        product.put("Music System", 80);
        product.put("Sac kurutma makinesi",45);

        Set<String> keys= product.keySet();
        System.out.println(keys);//[Laptop, TV, Refrigerator, Music System]
        int urunSayisi=  keys.size();
        System.out.println(urunSayisi);

        Collection<Integer> adetSayisi= product.values();
        System.out.println(adetSayisi);//[12, 53, 12, 87, 45]

       int sum =0;
       for (Integer w:adetSayisi){
           sum +=w;
       }
        System.out.println(sum);

        //Aşağıda key olarak ürün adlarını ve value olarak ürün sayısını içeren bir map bulunmaktadır.
        // Ürünler arasında " Laptop " olup olmadığını kontrol etmek için kodu yazınız.

        HashMap<String, Integer> product1 = new HashMap<>();
        product1.put("Laptop", 12);
        product1.put("TV", 53);
        product1.put("Refrigerator", 12);
        product1.put("Music System", 87);
        int a= product1.getOrDefault("Laptop",0);
        System.out.println(a);

       Set<String> set1 = product1.keySet();














    }
}
