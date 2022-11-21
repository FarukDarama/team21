package sulehocasoru;

public class Soru1 {
    public static void main(String[] args) {
        //Lutfen loop ile asagidaki sekli cikariniz:
        ////        1  2  3  4  5  6
        ////          2  3  4  5  6
        ////            3  4  5  6
        ////              4  5  6
        ////                5  6
        ////                  6

        int satir =6;
        int bosluk =5;
        for (int i=1;i<=6;i++){
            for (int k=i;k<=6;k++) {
                System.out.print(k + " ");
                }
            System.out.println();
            }


        }


    }

