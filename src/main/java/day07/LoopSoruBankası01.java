package day07;

public class LoopSoruBankası01 {
    public static void main(String[] args) {
        // Soru 1:120'den 11'e kadar 4 ile bölünebilen ve 6 ile bölünebilen tüm tam sayıları aynı satırda
        // iki ardışık tam sayı arasında boşluk bırakarak yazınız.

        for (int i = 120; i > 10; i--) {
            if (i % 4 == 0 && i % 6 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();

        int k = 120;
        while (k > 10) {
            if (k % 4 == 0 && k % 6 == 0) {
                System.out.print(k + " ");
            }
            k--;
        }
        System.out.println();
        // 3. yol do loop
        int m = 120;
        do {
            if (m % 4 == 0 && m % 6 == 0) {
                System.out.print(m + " ");
            }
            m--;
        } while (m > 10);
        System.out.println();

        // Soru 2:Bir String’ de tekrarlanan karakterleri yazdırmak için kod yazınız.
        String str = "accessories";
        String s = "";
        for (int i = 0; i < str.length(); i++) {
            String ch = str.substring(i, i + 1);
            if (str.indexOf(ch) != str.lastIndexOf(ch)) {
                if (!s.contains(ch)) {
                    s = s + ch;
                }

            }
        }
        System.out.print(s);
        System.out.println();
        //  SOru 3:Bir String ‘ in palindrom olup olmadığını kontrol etmek için kod yazınız.
        // Bir String, tersi ile aynıysa, buna palindrom denir. Örneğin; “anna”, “123321” palindromlardır.

        String str1 = "ancak";
        String ters = "";
        for (int i = str1.length() - 1; i > -1; i--) {
            char ch = str1.charAt(i);
            ters = ters + ch;
        }

        if (str1.equals(ters)) {
            System.out.println("polindromdur");
        } else {
            System.out.println("Polindrom degildir");
        }

        // Soru 4: Benzersiz (Tekrarsız) rakamları bir tamsayı olarak yazdırmak
        // için kod yazınız. Örnek; 223878  ́ 37

        int num = 223878;
        String strSayi = String.valueOf(num);
        for (int i = 0; i < strSayi.length(); i++) {
            char sayi = strSayi.charAt(i);
            if (strSayi.indexOf(sayi) == strSayi.lastIndexOf(sayi)) {
                System.out.println(sayi);//37
            }

        }
        // Soru 5 : Aşağıdaki görüntüyü bir for döngüsü kullanarak elde eden kodu yazınız.
        // AAAAA
        // AAAAA
        // AAAAA
        int satir=3;
        int sutun=5;
        for (int f=1;f<=satir;f++){
            for (int g=1;g<=sutun;g++){
                System.out.print("A ");

            }
            System.out.println();
        }












    }
}
