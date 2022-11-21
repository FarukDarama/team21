package day02;

import java.util.Scanner;

public class SwitchSoru04 {
    public static void main(String[] args) {
      // Kullanıcıdan SDET kısaltmaısndaki harflerden birini girmesini isteyin
      // s girerse SOFTWARE
      // d girerse DEVELOPER
      // e girerese Engineer
      // t girerse   In Testing yazdırın

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen S,D,E,T harflerinden bizini giriniz");
        String kısaltma=input.next().toUpperCase();

        switch (kısaltma){
            case "S" :
                System.out.println("SOFTWARE");
                break;
            case "D" :
                System.out.println("DEVELOPER");
                break;
            case "E" :
                System.out.println("ENGINEER");
                break;
            case "T" :
                System.out.println("In Testing");
                break;
            default:
                System.out.println("Lutfen yukardaki harflerden birini girin");
        }








    }
}
