package day10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class List02Tekrar {
    public static void main(String[] args) {
        //Soru 11
        //Döngüleri kullanarak tamsayılardan oluşan bir listenin tüm
        // öğelerinin benzersiz (tekrarsız) olup olmadığını kontrol ediniz.

        List<Integer> myList = new ArrayList<>();
        myList.add(10);
        myList.add(31);
        myList.add(16);
        myList.add(7);
        myList.add(15);
        myList.add(23);
        int counter =0;

        for (int w:myList){  // 10  31  15
            for (int k:myList){ //10
              if (w==k){
                  counter++;//1 + 1 + 1 + 1 + 1 + 1  + 1 + 1
              }

            }
        }

        if (counter!=myList.size()){
            System.out.println("En az bir tekrarlanan oge vardır");
        }else System.out.println("Yoktur");

        //--int num[]={1,2,4,5,6,8,9,11};//3 7 10
        //olmayan rakamları yazdıran kodu yazınız

        int num[]={-3,4,5,6,7,17,9,13};
        Arrays.sort(num);
        List<Integer> yeni = new ArrayList<>();
        for (int w:num){
            yeni.add(w);
        }
        Collections.sort(yeni);//

        for (int i=yeni.get(0);i<=yeni.get(yeni.size()-1);i++){

            if (!yeni.contains(i)){
                System.out.print(i+" ");
            }

        }










         }

    }

