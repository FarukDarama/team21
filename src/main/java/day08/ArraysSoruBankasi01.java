package day08;

import java.util.Arrays;
import java.util.Comparator;

public class ArraysSoruBankasi01 {
    public static void main(String[] args) {
        //Soru 1:
        //Tamsayılardan oluşan bir arrayde ortadaki elemanı bulunuz.
        // Örnek: (12, 5, 8) ==> (5, 8, 12) ==> Çıktı =8/
        //(12, 5, 8, 13) ==> (5, 8, 12, 13) ==> Çıktı =(8+12)/2 = 10
        int arr1[]={12, 5, 8, 13};
        Arrays.sort(arr1);

        if (arr1.length%2!=0){
            int ortaEleman=arr1[arr1.length/2];
            System.out.println(ortaEleman);
        }else {
            int ortaEleman2=(arr1[arr1.length/2-1] + arr1[arr1.length/2+1])/2;
            System.out.println(ortaEleman2);
        }
        //Soru 2:
        //String’ lerden oluşan bir arrayde uzunluğu en küçük olan elemanları bulunuz.
        // Örnek: ( Kemal, Jonathan, Mark, Angie, Veli ) ==> Output is Mark, Veli

        String arr2[]={"Kemal", "Jonathan", "Mark", "Angie", "Veli"};
        Arrays.sort(arr2,Comparator.comparing(String::length));//Veli,Mark,Kemal,Angie,Jonathan
        System.out.println(Arrays.toString(arr2));
        int minCh=arr2[0].length();//4

        for (String w:arr2){
            if (w.length()==minCh){
                System.out.print(w+" ");
            }
        }
        System.out.println();
        //Soru 3:
        //Tamsayılardan oluşan bir arrayde en küçük pozitif elemanı ve en büyük negatif elemanı bulunuz.
        //Örnek:(-12, 18, -5, 23, -2) ==> En küçük pozitif 18, en büyük negatif -2

         int arr3[]={-12, 18, -5, 23, -2,};
        Arrays.sort(arr3);
        for (int i=0;i<arr3.length-1;i++){

            if (arr3[i]<0 && arr3[i+1]>0){
                int enBuyukNegatif=arr3[i];
                int enKucukPozitif=arr3[i+1];
                System.out.println("enKucukPozitif = " + enKucukPozitif);
                System.out.println("enBuyukNegatif = " + enBuyukNegatif);

            }

        }
        // Soru 4:
        //String’ lerden oluşan bir arrayde öğeler 'n' veya 'k' ile bitiyorsa,
        // o öğelerin baş harflerini alınız.
        //Örnek: { “Kemal”, “Jonathan”, “Mark”, “Jackson”, “Ali” } ==> Çıktı JJM
       String arr4[]={"Kemal", "Jonathan", "Mark", "Jackson", "Ali"};
        Arrays.sort(arr4);
        for (String w:arr4){
            char sonHarf=w.charAt(w.length()-1);
            if (sonHarf=='n'|| sonHarf=='k'){
                System.out.print(w.charAt(0));
            }
        }
        System.out.println();
        // Soru 5 :
        //String’ lerden oluşan bir arrayde kullanılan öğelerin toplam karakter sayısını bulunuz.
        // Örnek: { "Kemal", "Jonathan", "Mark", "Angie", "Veli" } ==> Çıktı 26
        int toplam =0;

        String arr5[]={"Kemal", "Jonathan", "Mark", "Angie", "Veli"};
        for (String w :arr5){
           toplam = toplam+w.length();
        }
        System.out.println("toplam = " + toplam);










    }




}
