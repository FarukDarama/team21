package sulehocasoru;

import java.util.Arrays;

import static sulehocasoru.MethodOlustruma02.isimBirlestirme;

public class Soru2 {

    public static void main(String[] args) {
        //--int num[]={1,2,4,5,6,8,9,11};
        //olmayan rakamları yazdıran kodu yazınız. (edited)

       int  num[]={1,2,4,5,6,8,9,11};

        Arrays.sort(num);

        for (int i=num[0];i<=num[num.length-1];i++){
           for (int w:num){

               System.out.print(i+" ");
           }
       }




    }


}
