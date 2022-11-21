package sekilsorulari;

public class SekilSorulari {
    public static void main(String[] args) {
//        1 2 3 4 5 6
//         2 3 4 5 6
//          3 4 5 6
//           4 5 6
//            5 6
//             6


        for (int satir = 1; satir <= 6; satir++) {//satır kontrolü

            for (int bosluk = 1; bosluk < satir; bosluk++) {// boşluk yazdırma
                System.out.print(" ");
            }
            for (int rakam = satir; rakam <= 6; rakam++) {//sutun kontrolu
                System.out.print(rakam + " ");
            }
            System.out.println();
        }
        int num = 1; while(num<1) {
            System.out.print(num + " ");

    }

 ////while loop kullanarak uc basamakli sayilardan 15,20 ve 90 a tam bolunebilen sayilari yaziniz.
        int sayi =100;
        while (sayi<1000){

            if (sayi%15==0 && sayi%20==0 && sayi% 90==0){
                System.out.print(sayi+" ");
            }


            sayi++;
        }
        System.out.println();
          for (int i  = 100;i<1000;i++){
          if (i%15==0 && i%20==0 && i%90==0){
              System.out.print(i+" ");
          }
      }




}}

