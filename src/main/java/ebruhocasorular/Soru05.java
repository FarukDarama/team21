package ebruhocasorular;

public class Soru05 {
    // Verilen bir String'deki harfleri ve harflerin kacar kez kullanildigini
    // return eden bir method yaziniz
    //  Ornek : Input : Zeynep Hoca bir tane   output : { =3, a=3, b=1, r=1, C=1, c=1, t=1, e=1, H=1, i=1, n=2, o=1}
    String input="Zeynep Hoca bir tane";

    public static void main(String[] args) {
        System.out.println(karakterSayisiBulma("Ahmet hoca cok caliskan")) ;





    }

    public static String karakterSayisiBulma(String str){

      String arr[]=  str.split("");//Zeynep [Z,e,y,n,e,p]
      String bos="";

      for (String w:arr){//Z

          int counter =0;
          for (String j:arr){//Z,e

              if (w.equals(j)){
                  counter++;//1
              }
          }

          if (!bos.contains(w)){
              bos+=w+"="+counter+",";
          }
      }
      return  bos ;

    }





}
