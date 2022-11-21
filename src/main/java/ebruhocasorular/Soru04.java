package ebruhocasorular;

import java.util.HashSet;

public class Soru04 {
    /*
   1) Main method altinda bir double hashSet olusturunuz.
    ve bu seti, adi setOlustur ve return tipi hashSet double olan
    ayri bir metod altinda 3.23 , 3.10 , 5.12 , 10.12 , 23.12 degerlerini kullanarak doldurun.
    Adini toplaminiAl koyacagimiz ve parametre olarak bir Double hashSet kabul edecek ayri bir method olusturarak
    hashSetin degerlerinin toplamini alacaksiniz.
    Çıktı--> sonuc = 44.69
     */

    public static void main(String[] args) {

        HashSet<Double> set = new HashSet<>();
        System.out.println(  setOlustur(3.23,3.10,5.12,10.12,23.12));
        System.out.println( toplaminiAl(set));

    }
    public static HashSet<Double> setOlustur(double a, double b, double c, double d, double e){
       HashSet<Double> set = new HashSet<>();
        set.add(3.23);
        set.add(3.10);
        set.add(5.12);
        set.add(10.12);
        set.add(23.12);
       return set;

    }

    public static Double toplaminiAl(HashSet<Double> hashSet){


       double toplam=0;
       for (Double w:hashSet){
           toplam+=w;
       }

        return toplam;


    }






}
