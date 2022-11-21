package ebruhocasorular;

import java.util.HashSet;

public class Soru06 {
    /*
    Main method altinda bir double hashSet olusturunuz.
    ve bu seti, adi setOlustur ve return tipi hashSet double olan
    ayri bir metod altinda 3.23 , 3.10 , 5.12 , 10.12 , 23.12 degerlerini kullanarak doldurun.
    Adini toplaminiAl koyacagimiz ve parametre olarak bir Double hashSet kabul edecek ayri bir method olusturarak
    hashSetin degerlerinin toplamini alacaksiniz.
    Çıktı--> sonuc = 44.69
     */

    public static void main(String[] args) {


       //setOlustur(3.23,3.10,5.12,10.12,23.12);
       //tolaminiBul(setOlustur(3.23,3.10,5.12,10.12,23.12));
        HashSet<Double> set1 = setOlustur(3.23 , 3.10 , 5.12 , 10.12 , 23.12);
        double sonuc =  tolaminiBul(set1);
        System.out.println(sonuc);
    }

    public static HashSet<Double> setOlustur(double a,double b,double c,double d,double e){
        HashSet<Double> set1 = new HashSet<>();
        set1.add(a);
        set1.add(b);
        set1.add(c);
        set1.add(d);
        set1.add(e);
        return set1;
    }

    public static double tolaminiBul(HashSet<Double> set2){
        double toplam=0;

        for (Double w:set2){
            toplam+=w;
        }
       return toplam;
    }






}
