package sulehocasoru;

import java.util.ArrayList;
import java.util.List;

public class MethodOlustruma02 {
    public static void main(String[] args) {
        System.out.println( isimBirlestirme("ali","VELI"));
        System.out.println( isimBirlestirme("ali","VELI").concat("Tandogan"));

        System.out.println(  isimBirlestirme("ahmet","mehmet","cemil"));
        System.out.println( isimBirlestirme("Ali Can"));

        System.out.println( gunler("PAZARTESİ","SALI","CARSAMABA","CUMA"));

        System.out.println( sayilar(26,12,3,7,24,13,0,-12,27,33));



    }

    public static String isimBirlestirme (String a,String b){
      String birlestirme =  a.toUpperCase()+b.toLowerCase();
        return birlestirme;
    }

    public static String isimBirlestirme (String a,String b,String c){
      String ilkElemetDegisim =  a.replace("a","x")+b+c;
        return ilkElemetDegisim;
    }

    public static int isimBirlestirme (String a) {

     int uzunluk =a.length();
            return uzunluk;
    }


   public static List gunler(String...a){
        List<String> list =new ArrayList<>();
        for (String w:a){

        }

        return list;

   }
   public  static List sayilar(int...a){
        List<Integer> sayilarList = new ArrayList<>();
        for (Integer w:a){
            if (w%2==0 && w>20){
                sayilarList.add(w);
            }
        }
        return sayilarList;
   }






}
