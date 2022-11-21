package day08;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysSoruBnakasi03 {
    public static void main(String[] args) {
        //  Soru 11 :
        // Tamsayılardan oluşan arrayde bulunan sıfırları, array sonuna yerleştiren kod yazınız.
        // Örnek: (5, 0, 2, 0, 3) ==> (5, 2, 3, 0, 0)
        int arr[]={5, 0, 2, 0, 3};
        int yeni[]=new int[5];
        int indx=0;
        for (int w:arr){
            if (w!=0){
                yeni[indx]=w;
                indx++;
            }
        }
        System.out.println(Arrays.toString(yeni));

        // Soru 12 :
        //  Kullanıcıdan aldığınız tamsayılar ile bir array oluşturunuz ve
        //  bu arraydeki en küçük ve en büyük öğeler arasındaki farkı konsolda yazdırınız.

        Scanner input =new Scanner(System.in);
        System.out.println("Kac tamsayi gireceginizi yazin");
        int elemanSayisi=input.nextInt();


        int arr1[] = new int[elemanSayisi];
        for (int i=0;i<elemanSayisi;i++){
            System.out.println("Lutfen elemanlari giriniz");
            arr1[i]=input.nextInt();

        }
        System.out.println(Arrays.toString(arr1));
        Arrays.sort(arr1);
        int enBuyuk = arr1[arr1.length-1];
        int enKucuk = arr1[0];

        System.out.println("Aralarindaki fark: "+(enBuyuk-enKucuk));
        //Soru 13 :
        //Kullanıcıdan 2 String girmesini isteyiniz. Stringlerin karakterleri ve karakter sayıları aynıysa konsola
        // "Anagramdır" yazdırın. Aksi takdirde, konsolda "Anagram Değil" yazdırınız.
        // Örneğin; "Mary" ve "army" ve "RAMY" Anagramlardır.

        Scanner scan =new Scanner(System.in);
        System.out.println("Lutfen iki String giriniz");
        String str1=scan.next().toUpperCase();
        String str2=scan.next().toUpperCase();
        String brr1[] = str1.split("");
        String brr2[] = str2.split("");
        Arrays.sort(brr1);
        Arrays.sort(brr2);

        if (brr1.length!=brr2.length){
            System.out.println("Anagram degildir");
        } else if (str1.isEmpty() || str2.isEmpty()) {
            System.out.println("Anagram degildir");
        } else if (Arrays.equals(brr1,brr2)) {
            System.out.println("Anagramdir");

        }else {
            System.out.println("Anagram degildir");
        }


    }
}
