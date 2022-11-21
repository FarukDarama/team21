package day12;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Sets02 {
    public static void main(String[] args) {
        //Soru 4.Bir liste ve bir set oluşturunuz. Set içerisinde var olan listenin
        // bütün elemanlarını kaldıran bir kod yazınız.
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
        mySet.removeAll(myList);
        System.out.println(mySet);

        //Soru 5.
       // Bir listede tekrarlanan öğeler olup olmadığını kontrol etmek için kodu yazınız.
        List<Integer> myList1 = new ArrayList<>();
        myList1.add(13);
        myList1.add(31);
        myList1.add(15);
        myList1.add(7);
        myList1.add(13);
        Set<Integer> mySet1 = new HashSet<>(myList1);
        if (myList1.size()!=mySet1.size()){
            System.out.println("Tekrarlanan eleman var");
        }else {
            System.out.println("Tekrarlanan eleman yok");
        }













    }
}
