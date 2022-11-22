package proje_kimlik_map;

import java.util.HashMap;
import java.util.Scanner;

public class KimlikYap {

  static   HashMap<String,Persons> person = new HashMap<>();
  static Scanner input = new Scanner(System.in);

    static void selectOption() {
        System.out.println("yapmak istediginiz islemi giriniz :\n0:islemi sonlandir\n" +
                "1:kullanici ekle\n2:kullanici bilgisi alma\n3:kullanici silme");
        int secim = input.nextInt();//nextLine hata verir.çünkü bir üst satır println değil print olduğu için tum satırı alır.
        switch (secim) {
            case 0:
                cikis();
                break;
            case 1:
                saveInfo();
                selectOption();
                break;
            case 2:
                getInfo();
                selectOption();
                break;
            case 3:
                removeInfo();
                selectOption();
                break;
            default:
                System.out.println("yanlis giris yaptiniz. Tekrar deneyiniz");
                selectOption();
                break;
        }
    }






  public  static void saveInfo(){
      System.out.println("Id numaranızı giriniz");
      String idNumber=input.next();
      if (idNumber.length()!=4 || idNumber.equals(null)){
          System.out.println("Gecersiz bir Id numarası girdiniz");
          saveInfo();
      } else if (person.containsKey(idNumber)) {
          System.out.println("Zaten varolan bir IdNumber girdiniz...Kontrol ederek tekrar deneyiniz");
          saveInfo();
      }else {
          System.out.println("Lütfen Adınızı giriniz");
          String ad =input.next();
          System.out.println("Lutfen Soyadınızı giriniz");
          String soyad =input.next();
          System.out.println("Lutfen Adres giriniz");
          String adres =input.next();
          System.out.println("Lutfen Telefon numranızı girin");
          String telNummer = input.next();

          Persons obj = new Persons(ad.concat(" ").concat(soyad),adres,telNummer);
          person.put(idNumber,obj);
          System.out.println(person);

      }

  }

  public static void cikis(){
      System.out.println("Cıkıs basari ile yapıldı");
  }

  public  static void  getInfo(){
      System.out.println("Lutfen bilgi almak istediginiz kişinin IdNumberini giriniz");
      String idNo=input.next();
      person.get(idNo);
      if (!person.containsKey(idNo)){
          System.out.println("Girdiginiz id no'ya ait sistemde kayıtlı bir lişi yoktur");
          getInfo();
      }else {
          System.out.println(person.get(idNo));
      }
  }

  public static  void removeInfo(){
      System.out.println("Girmek istediğiniz kişinin Id numarasını giriniz");
      String idNumber=input.next();
      if (!person.containsKey(idNumber)){
          System.out.println("Girdiginiz id numarasi bulunmamaktadır");
          removeInfo();
      }else {
          person.remove(idNumber);
          System.out.println("Silme işlemi basari ile gercekleşti");
          System.out.println(person);
      }
  }








}
