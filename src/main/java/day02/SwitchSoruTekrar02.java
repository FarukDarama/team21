package day02;

import java.util.Scanner;

public class SwitchSoruTekrar02 {
    public static void main(String[] args) {
        //kullanıcıdan işlem ve iki tane sayi alarak işlemin sonucunu ekrana yazdırın
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen işlem işareti giriniz");
        char sembol=input.next().charAt(0);
        System.out.println("Lutfen 2 tam sayı girin");
        double a=input.nextDouble();
        double b=input.nextDouble();
        switch (sembol){
            case '+':
                System.out.println(a+b);
                break;
            case '-':
                System.out.println(a-b);
                break;
            case '*':
                System.out.println(a*b);
                break;
            case '/':
                System.out.println(a/b);
                break;
            case '%':
                System.out.println((a*b)/100);
                break;
            default:
                System.out.println("Lutfen gecerli bir sembol girin");

        }






    }
}
