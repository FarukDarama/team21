package day08;

import java.util.Arrays;
import java.util.Scanner;

public class Tekrar {
    public static void main(String[] args) {
        // Soru 5 :
        //String’ lerden oluşan bir arrayde kullanılan öğelerin toplam karakter sayısını bulunuz.
        // Örnek: { "Kemal", "Jonathan", "Mark", "Angie", "Veli" } ==> Çıktı 26
        String arr5[]={"Kemal", "Jonathan", "Mark", "Angie", "Veli"};

        int sum =0;
        for (String w:arr5){

           sum = sum+w.length();

        }
        System.out.println(sum);

        // Soru 6 :
        //Verilen bir String'de 'a' veya 'A' ile başlayan kelimeyi sayısını bulunuz.
         String str ="Apex is an object oriented programming language";
         String arr2 [] = str.split(" ");
         int counter =0;


         for (String w:arr2){

             if (w.startsWith("a") || w.startsWith("A")){
                 counter++;
             }
         }
        System.out.println("counter = " + counter);
        // Soru 7 :
        // Verilen bir String'deki sesli harf sayısını bulunuz.
        String s = "Apex is a an object oriented programming language";
        String harf[] =  s.toLowerCase().split("");
        int counter1 =0;


        for (String w :harf){

            switch (w){
                case"a":
                case "e":
                case "i":
                case "o":
                case "u":
                    counter1++;

            }

        }
        System.out.println("counter1 = " + counter1);
        //Soru 8 :
        //İlk ve son karakterleri aynı olan array öğelerini bulmak için kod yazınız.
        String[] arr3 = new String[]{"alabama", "pick", "sos", "sets", "pex","eke"};
        for (String w:arr3){
         String ilkCh = w.substring(0,1);
         String sonCh = w.substring(w.length()-1);
         if (ilkCh.equals(sonCh)){
             System.out.print(w+" ");
         }
        }
        System.out.println();
        //Soru 9 :Verilen bir String arraydeki belirli bir öğenin
        // var olup olmadığını bulmak için kod yazınız.
        String[] arr4 = new String[]{"Apex", "is", "an", "object","is","is", "oriented", "programming", "language"};
        String oge ="amca";
        int counter3=0;

        for (String w:arr4){
            if (w.contains(oge)){
              counter++;
            }

        }
        if (counter3>0){
            System.out.println(oge +" arrayde "+counter3+" kere mecuttur");
        }else {
            System.out.println(oge+" mevcut degildir");
        }
       // 10) Verilen bir String arraydeki öğelerin karakterlerinin toplamını bulmak için kod yazınız.
        String[] arr6 = {"alabama", "pick", "sos", "sets", "pex"};
        System.out.println(arr6.length);//5
        int sum1 = 0;
       for (String w:arr6){
         sum1 =  sum1+w.length();
       }
        System.out.println(sum1);
      //Tamsayılardan oluşan arrayde bulunan sıfırları, array sonuna yerleştiren kod yazınız.
      // Örnek: (5, 0, 2, 0, 3) ==> (5, 2, 3, 0, 0)
        int orginal[]={5,0,2,0,3,7,0,8};//[5,0,2,0,3]
        int yeni[]=new int[orginal.length];  //[0,0,0,0,0]
        int indx=0;
        for (int w :orginal){
            if (w!=0){
                yeni[indx]=w;
                indx++;
            }
        }
        System.out.println(Arrays.toString(yeni));
       //Kullanıcıdan aldığınız tamsayılar ile bir array oluşturunuz ve bu arraydeki
        // en küçük ve en büyük öğeler arasındaki farkı konsolda yazdırınız.

        Scanner input =new Scanner(System.in);
        System.out.println("kac eleman gireceksiniz");
        int eleman =input.nextInt();

        int arr[]=new int[eleman];
        for (int i=0;i<arr.length;i++){
            System.out.println("lutfen "+ (i+1) +". elemani girin");
            arr[i]=input.nextInt();

        }
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);

        System.out.println(arr[arr.length-1] - arr[0]);









    }
}
