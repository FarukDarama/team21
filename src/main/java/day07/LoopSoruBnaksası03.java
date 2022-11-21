package day07;

public class LoopSoruBnaksası03 {
    public static void main(String[] args) {
        // Soru 15 :Do-while döngüsünü kullanarak konsolda 'C' ile 'A' arasındaki
        // karakterleri yazdırmak için kod yazınız.
        String x="";
        for (char i='Z';i>='A';i--){
            x= x+i;
        }
        System.out.print(x);
        System.out.println();
       //Soru 16 :Bir String de, ilk 'm' karakterinden önceki tüm karakterleri yazınız.
       String s = "Christmas";
       String bos="";
      for (int i=0;i<s.length()-1;i++){
          String ch=s.substring(i,i+1);
          if (ch.equals("m")){
              break;
          }
        bos = bos+ch;
      }
        System.out.println(bos);



    }
}
