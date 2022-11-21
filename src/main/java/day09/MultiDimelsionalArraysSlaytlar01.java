package day09;

import java.util.Arrays;

public class MultiDimelsionalArraysSlaytlar01 {
    public static void main(String[] args) {
        // Soru 1 : Asagıdaki m.d. arraydeki tüm elemanların carpımını yazdıran kodu yazınız
        //{{1,2,3},{4,5}}
        int mr[][] = {{1,2,3},{4,5}};
        int carpim =1;
        for (int[] w:mr){
            for (int k :w){
              carpim = carpim*k;
            }
        }
        System.out.println("carpim = " + carpim);
        // Soru 2 : Asagıdaki m.d. arrayindeki iç array in son elemalarını carpan kodu yazınız
        //{{1,2,3},{4,5},{6}};
        int mr2[][] ={{1,2,3},{4,5},{6}};
        int carpım1=1;
        for (int[] w:mr2){
            carpım1 =  carpım1*w[w.length-1];
        }
        System.out.println("carpım1 = " + carpım1);
        // Soru 3 : Asagıdaki m.d. arraylarin iç arraylerinde aynı index e sahip elemanların
        // toplamını ekrana yazdıran kodu yazınız
        //arr1 ={{1,2},{3,4,5},{6}};
        //arr2 ={{7,8,9},{10,11},{12};

        // Soru 4 : Asagıdaki m.d. arraylarin iç arraylerindeki tüm elemanların toplamını bulan ve sonucları yeni
        // bir arrayin icine koyan kodu yazdırınız.
        // Ornek : {{1,2,3},{4,5},{6,7}}; ===>> {6,9,13}

        int arr[][]={{1,2,3},{4,5},{6,7}};
        int arrYeni[]=new int[3];
        int sum =0;
        int indx =0;
        for (int[] w:arr){
            for (int k:w){
               sum = sum+k;
            }
            arrYeni[indx] =sum;
            indx++;
            sum =0;

        }
        System.out.println(Arrays.toString(arrYeni));

        //Soru 6 : Verilen bir cümledeki kelime sayisını yazdıran kodu yazın.

        String cumle ="Dun okula giderken cok yoruldum.";
        String myArr[] = cumle.split(" ");
         int kelimeSayisi = myArr.length;
        System.out.println("kelimeSayisi = " + kelimeSayisi);

         //Soru 7 : Verilen bir Arrayden istenen degere eşit elemanları kaldırıp kalanları yeni bir arraye
        int arr1[]={3,5,5,7,4,3,4};
        int idx=0;
        int arr2[]=new int[5];
        for (int w:arr1){
            if (w==3){
                continue;

            }else {
                arr2[idx]=w;
                idx++;
            }
        }
        System.out.println(Arrays.toString(arr2));









    }
}
