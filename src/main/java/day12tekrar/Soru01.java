package day12tekrar;

import java.util.*;

public class Soru01 {

    //Bir listede kaç farklı öğe olduğunu gösteren kodu yazınız. Örnek: {10, 31, 15, 7, 15, 7, 7} ==> 4
    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<>();
        myList.add(10);
        myList.add(31);
        myList.add(15);
        myList.add(7);
        myList.add(15);
        myList.add(7);
        myList.add(7);
        myList.add(31);
        System.out.println(myList);//[10, 31, 15, 7, 15, 7, 7]
        HashSet<Integer> mySet = new HashSet<>(myList);
        System.out.println(mySet);
        int sonHal = mySet.size();
        System.out.println(sonHal+" kadar farli elemen vardir");

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
        System.out.println( mySet1.retainAll(myList1));
        System.out.println(mySet1);
        myList1.retainAll(mySet1);//retainAll() methodu ortak elemanlari bulmaya yarar.
        System.out.println(myList1);

        //Bir String’ de kullanılan farklı karakterleri yazdırmak için kod yazınız. Örnek: ‘Mississippi’  ́ Misp

       String s = "Mississippi";
       String arr[] =  s.split("");
       List<String> list = new ArrayList<>(Arrays.asList(arr));
       HashSet<String> myHashsEt = new HashSet<>(list);
       System.out.println( myHashsEt);
       String tekrarsiz ="";

       for (String w:myHashsEt){

           tekrarsiz+=w;
       }
        System.out.println(tekrarsiz);





    }
}
