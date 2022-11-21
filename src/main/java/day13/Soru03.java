package day13;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Soru03 {

    public static void main(String[] args) {


       // Belirli bir listede tekrarlanan öğelerin sayısı nasıl kontrol edilir?
       List<Integer> myList = new ArrayList<>();
        myList.add(12);//12=3 21=2
        myList.add(21);
        myList.add(12);
        myList.add(13);
        myList.add(12);
        myList.add(21);
        myList.add(35);
        myList.add(35);


        HashMap<Integer,Integer> map1 = new HashMap<>();

        for (Integer w:myList){
            Integer gorunumSayisi=map1.get(w);

            if (gorunumSayisi==null){
                map1.put(w,1);
            }else {

                map1.put(w,gorunumSayisi+1);
            }
        }

        System.out.println(map1);//{35=1, 21=2, 12=3, 13=1}

        for (Map.Entry<Integer, Integer> w :map1.entrySet()){

            System.out.println(w.getKey()+" den "+w.getValue()+" tane vardir");
        }











    }
}
