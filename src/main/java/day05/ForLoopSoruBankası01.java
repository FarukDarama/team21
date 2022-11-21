package day05;

public class ForLoopSoruBankası01 {
    public static void main(String[] args) {
        //1. Soru 120'den 11'e kadar 4 ile bölünebilen ve 6 ile bölünebilen
        // tüm tam sayıları aynı satırda iki ardışık tam sayı arasında boşluk bırakarak yazınız.
        //1.Yol
    for (int i=120;i>10;i--){
    if (i%4==0 && i%6==0){
        System.out.print(i +" ");//120 108 96 84 72 60 48 36 24 12
       }
    }
        System.out.println();
       //2.Yol
     for (int i =120;i>10;i--){
         if (i%12==0){
             System.out.print(i+" ");
         }
     }
        System.out.println();
     //2. Soru ( YAPAMADIM !!! ) Bir String’ de tekrarlanan karakterleri yazdırmak için kod yazınız. Örneğin; accessories  ́ ces
      String a="accessories";
     for (int i=0;i<a.length();i++){
         char iIndex=a.charAt(i);
         if (a.indexOf(iIndex)!=a.lastIndexOf(iIndex)){
             System.out.print(iIndex);
         }
     }








    }
}
