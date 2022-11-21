package day01;

public class Day01_TypeCasting {

    public static void main(String[] args) {
        //Short data tipinde bir değişken oluşturunuz ve onu bir int değişkenine dönüştürünüz.
        short a=12;
        int b =a;
        // Long data tipinde bir değişken oluşturunuz ve onu bir int değişkenine dönüştürünüz.
        long x= 15;
        int y=(int)x;
        //Double data tipinde bir değişken oluşturunuz ve onu bir float değişkenine dönüştürünüz.
        double deger =5.6;
        float f=(float) deger;
        //Double data tipinde bir değişken oluşturunuz ve onu bir short değişkenine dönüştürünüz
        // Sonrasında bu short değişkenin değerini konsolda yazdırınız.

        double fiyat =12.5;
        short s= (short) fiyat;
        System.out.println(s);




    }





}
