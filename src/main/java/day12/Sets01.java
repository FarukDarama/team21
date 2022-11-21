package day12;

import java.util.*;

public class Sets01 {

    public static void main(String[] args) {
        //Soru 1.
        //Bir listede kaç farklı öğe olduğunu gösteren kodu yazınız.
        //Örnek: {10, 31, 15, 7, 15, 7, 7} ==> 4
        List<Integer> myList = new ArrayList<>();
        myList.add(10);
        myList.add(31);
        myList.add(15);
        myList.add(7);
        myList.add(15);
        myList.add(7);
        myList.add(7);
        HashSet<Integer> mySet = new HashSet<>(myList);
        System.out.println(mySet.size());
        //Soru 2.
        //Set ve Liste arasındaki ortak öğeleri yazdırmak için kod yazınız.
        List<Integer> myList1 = new ArrayList<>();
        myList1.add(10);
        myList1.add(31);
        myList1.add(15);
        myList1.add(7);
        myList1.add(13);

        Set<Integer> mySet1 = new HashSet<>();
        mySet1.add(10);
        mySet1.add(7);
        mySet1.add(35);
        mySet1.add(13);

        mySet1.retainAll(myList1);
        System.out.println(mySet1);
        //Soru 3.
        //Bir String’ de kullanılan farklı karakterleri yazdırmak için kod yazınız.
        // Örnek: ‘Mississippi’  ́ Misp
         String s = "Mississippi";
         String  arr[] =  s.split("");
         List<String> myList3 =Arrays.asList(arr);
        Set<String> mySet3= new HashSet<>(myList3);
        System.out.println(mySet3);




    }
}
