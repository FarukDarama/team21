package day08;

public class ArraysSoruBankasi02 {
    public static void main(String[] args) {
        // Soru 6 :
        //Verilen bir String'de 'a' veya 'A' ile başlayan kelimeyi sayısını bulunuz.
         String str ="Apex is an object oriented programming language";
         String arr[] = str.split(" ");
         int counter =0;
         for (String w:arr){
         char ilkHarf = w.charAt(0);
         if (ilkHarf=='a' || ilkHarf=='A'){
             counter++;
         }
         }
        System.out.println("A ile başlayan kelime sayisi: "+counter);

        // Soru 7 :
        // Verilen bir String'deki sesli harf sayısını bulunuz.
        String s = "Apex is an object oriented programming language";
        String arr1[] =  s.toUpperCase().split("");
      int  sayac=0;
        for (String w :arr1){

            switch (w){
                case "A":
                case "E":
                case "I":
                case "İ":
                case "O":
                case "U":
                    sayac++;

            }


        }
        System.out.println("sayac = " + sayac);

        //Soru 8 :
        //İlk ve son karakterleri aynı olan array öğelerini bulmak için kod yazınız.
        String[] arr2 = new String[]{"alabama", "pick", "sos", "sets", "pex"};
        for (String w :arr2){
           String basHarf =w.substring(0,1);
           String sonHarf =w.substring(w.length()-1);

       }
       //Soru 9 :Verilen bir String arraydeki belirli bir öğenin
        // var olup olmadığını bulmak için kod yazınız.
       String[] arr3 = new String[]{"Apex", "is", "an", "object", "oriented", "programming", "language"};
       String oge ="language";
       int counter1=0;
       for (String w:arr3){
           if (w.equalsIgnoreCase(oge)){
               counter1++;

           }

       }
       if (counter1>0){
           System.out.println(oge+" String'de "+counter1 +" defa vardir");
       }else {
           System.out.println(oge+" String'de yoktur");
       }
       // Soru 10:
       // Verilen bir String arraydeki öğelerin karakterlerinin toplamını bulmak için kod yazınız.
        String[] arr4 = new String[]{"alabama", "pick", "sos", "sets", "pex"};
       int chToplam=0;
       for (String w :arr4){
        chToplam = chToplam +w.length();
       }
        System.out.println("chToplam = " + chToplam);



       





    }
}
