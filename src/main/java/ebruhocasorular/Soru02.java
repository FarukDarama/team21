package ebruhocasorular;

public class Soru02 {

    public static void main(String[] args) {
        // Verilen bir String'deki harfleri ve harflerin kacar kez kullanildigini
        // return eden bir method yaziniz
        //  Ornek : Input : Zeynep Hoca bir tane   output : { Z=3, a=3, b=1, r=1, C=1, c=1, t=1, e=1, H=1, i=1, n=2, o=1}

        Soru02 obj = new Soru02();
        System.out.println(obj.karakterSayma("Zeynep Hoca bir tane"));




    }

    public String karakterSayma(String a){
        String bos ="";
       String arr[] = a.split("");
        for (String w:arr){
            int counter =0;
            for (String j: arr){
                if (w.equals(j)){
                    counter++;
                }

            }
            if (!bos.contains(w))
            bos+=w+"="+counter+" ";
        }

        return bos;


    }



}
