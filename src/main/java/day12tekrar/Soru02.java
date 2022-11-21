package day12tekrar;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Soru02 {
   //Bir liste ve bir set oluşturunuz. Set içerisinde var olan listenin bütün elemanlarını kaldıran bir kod yazınız.

    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<>();
        myList.add(10);
        myList.add(31);
        myList.add(15);
        myList.add(7);
        myList.add(13);

        Set<Integer> mySet = new HashSet<>();
        mySet.add(10);
        mySet.add(7);
        mySet.add(35);
        mySet.add(13);
        mySet.add(27);

        System.out.println(mySet);

        mySet.retainAll(myList);//ortak olmayan elemanlari siliyor
        System.out.println(mySet);

        //mySet.removeAll(myList);//ortak olanlari siliyor
        //System.out.println(mySet);

        //Bir listede tekrarlanan öğeler olup olmadığını kontrol etmek için kodu yazınız.

        List<Integer> myList2 = new ArrayList<>();
        myList2.add(10);
        myList2.add(31);
        myList2.add(15);
        myList2.add(7);
        myList2.add(13);
        myList2.add(13);

        HashSet<Integer> set2= new HashSet<>(myList2);

        if (myList2.size()==set2.size()){
            System.out.println("Tekrarli eleman yok");
        }else {
            System.out.println("Tekrarli elelman var");
        }





    }
}
