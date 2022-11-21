package practice03;

import java.lang.reflect.Array;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q04_IsaretDegistirme {
    public static void main(String[] args) {
        //Array içerisindeki elementlerin işaretlerini(+-) değiştiren bir kod yazınız.
        // input : 1,2,-3,4,-5,-6
        //output :-1,-2,3,-4,5,6

        int arr[]={1,2,-3,4,-5,-6};
        List<Integer> list = new ArrayList<>();
        for (int w:arr){
            list.add(w);
        }
        System.out.println(list);

        for (Integer w:list){

        list.set(list.indexOf(w),w*-1);

        }
        System.out.println(list);
      /*
       Bir top belirli yükseklikten atılmaktadır.(Scanner ile yüksekliği al)
       Atıldıktan sonra, atıldığı yüksekliğin 3/4 u kadar yerden yukarı doğru zıplamaktadır
       Top zıplama  yüksekliği 1 metrenin altına indiğinde durmaktadır.
       Bu ana kadar aldigi toplam yolu ve yere vurma sayısını bulan do while code blogu create ediniz.

      */
        Scanner input = new Scanner(System.in);
        System.out.println("Topun bırakıldıgı yukseligi giriniz");
        double yukseklik = input.nextDouble();
        int counter =0;
        double toplamyol =0;

        do {

            toplamyol=toplamyol+yukseklik;
            counter++;

            yukseklik = yukseklik*0.75;
            toplamyol=toplamyol+yukseklik;



        }while (yukseklik>1);

        NumberFormat nmr = new DecimalFormat(".00");
        System.out.println(nmr.format(toplamyol));
        System.out.println(counter);






    }
}
