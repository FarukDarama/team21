package day07;

public class LoopSoruBankası02 {
    public static void main(String[] args) {
  // Soru 6 :Aşağıdaki görüntüyü bir for döngüsü kullanarak elde eden kodu yazınız.
  // A
  // AA
  // AAA
  // AAAA

        int satir=4;
        for (int i=1;i<=satir;i++){
            for (int k=1;k<=i;k++){
                System.out.print("A ");
            }
            System.out.println();
        }

        // Soru 7 : Aşağıdaki çarpım tablosunu oluşturmak için kod yazınız.
        //3x1=3 3x2=6 3x3=9 3x4=12 3x5=15 3x6=18 3x7=21 3x8=24 3x9=27 3x10=30
        int num=4;
        for (int i=1;i<11;i++){
            System.out.println(num+"x"+i+"="+(num*i));
        }
      //Soru 8: 20'den 3'e kadar olan tek tamsayıları aynı satırda
      // ardışık olacak şekilde aralarında boşluk bırakarak yazdırmak için gereken kodu yazınız.
        System.out.println();
        for (int i=20;i>2;i--){
            if (i%2!=0){
                System.out.print(i+" ");
            }
        }
        //Soru 9: String içindeki tüm küçük harfleri yıldız
        //işaretiyle yazdırmak için gereken kodu yazınız. Örneğin; 'Ali Can?' ==> l*i*a*n*
        System.out.println();
        String isim ="Ali Can?";
        String yeni = isim.replaceAll("[^a-z]","");//lian
        String bos="";
        for (int i=0;i<yeni.length();i++){
           String son = yeni.substring(i,i+1)+"*";
           bos= bos + son  ;
        }
        System.out.println(bos);

        //Soru 10: Verilen ondalık sayının sadece ondalık kısmındaki rakamlarını,
        // kendisinden önce bir yıldız işaretiyle yazdırmak için gereken kodu yazınız.
        //Örneğin; 75.4238  ́ *4*2*3*8
        double d1=75.4238;
        String bos1="";
        String d1Double = String.valueOf(d1);
        String ondalık = d1Double.split("\\.")[1];//4238
        System.out.println(ondalık);
        for (int i=0;i<ondalık.length();i++){
            String yildizCh="*"+ondalık.substring(i,i+1);
         bos1 = bos1+yildizCh;
        }
        System.out.println(bos1);
        //Soru 11: Bir String’ i tersine çevirmek için kod yazınız. Örnek; Mark ==> kraM
        String c ="Mark";
        String bos2="";
        for (int i=c.length()-1;i>=0;i--){
            char ch=c.charAt(i);
          bos2 = bos2+ch;
        }
        System.out.println("bos2 = " + bos2);

       //Soru 12 :(YAPILAMADI)Aşağıdaki görüntüyü bir for döngüsü kullanarak elde eden kodu yazınız.
       /*
       AAAAAAAA
       AXXXXXXA
       AXXXXXXA
       AXXXXXXA
        */
       /*int satır=4;
        int sütun=8;
        for (int i=1;i<=satır;i++){
            for (int k=1;k<=sütun;k++){
                System.out.println("A");
            }
            System.out.println();
        }*/

        // Soru 13 :3 ile 14 arasındaki tam sayıların toplamını bulmak için kodu yazınız.

        int sum =0;
        for (int i=3;i<15;i++){
        sum = sum +i;
        }
        System.out.println("sum = " + sum);

        // Soru 14 :3 ile 9 arasındaki tam sayıların çarpımını bulmak için kodu yazınız.
         int multiply =1;
         for (int i=3;i<10;i++){
            multiply = multiply*i;
         }
        System.out.println("multiply = " + multiply);
        System.out.println();

    }
}
