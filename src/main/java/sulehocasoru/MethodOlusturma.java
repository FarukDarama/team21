package sulehocasoru;

public class MethodOlusturma {
    public static void main(String[] args) {

        toplama(3, 5);
        System.out.println();
        faktoriel(6);
        fibonacci(6);
        sayilar(3,4,6);
        System.out.println( dortSayıCarpımı(3,4,5,6));

    }

    public static void toplama(int a, int b) {
        System.out.println(a + b);
    }


    public static void faktoriel(int a) {

        int carpım = 1;
        for (int i = 1; i <= a; i++) {
            carpım = carpım * i;

        }
        System.out.println(carpım);

    }

    public static void fibonacci(int a) {
        int x = 1;
        int y = 1;
        int f = 0;

        for (int i = 0; i < a - 1; i++) {

            f = x + y;
            System.out.println(f);
            x = y;
            y = f;

        }

    }


    public static void sayilar(int a, int b, int c) {
        int sonuc = a * b + c;
        System.out.println(sonuc);
    }

    public static int dortSayıCarpımı(int a,int b,int c,int d){

        int carpım =a*b*c*d;
        return carpım;
    }





}







