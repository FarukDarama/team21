package ebruhocasorular;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Soru07 {

    // Asagida verilen map'de yazilim dili java olan kisi isimlerini bir liste olarak donduren
    // bir method yaziniz

    public static void main(String[] args) {

        Map<Integer,String> map1 = new HashMap<>();

        map1.put(101, "Ali, Can, java");
        map1.put(102, "Veli, Yan, java");
        map1.put(103, "Ali, Yan, C#");
        map1.put(1905, "Can, Birtane, Java");

        System.out.println( ismiAl(map1));


    }

    public static   List<String> ismiAl(Map<Integer,String> map1){

        List<String> list1 = new ArrayList<>();

        for (String w:map1.values()){

        String arr[] = w.replace(" ","").split(",");//[Ali,Can,java]

            if (arr[2].equalsIgnoreCase("java")){
                list1.add(arr[0]);
               // list1.add(arr[1]);
            }

  }
        return list1;

        }






    }





