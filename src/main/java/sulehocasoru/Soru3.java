package sulehocasoru;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Soru3 {
    List<DayIncome> gunler = new ArrayList<>(7);
    
    public void listAllDays(){
        for (int i = 0; i < this.gunler.size() ; i++) {
            System.out.println(this.gunler.get(i).getDayName() + ": " + this.gunler.get(i).getIncome());
        }
        double gunlukOrtalamaKazanc = this.getOrtalamaKazanc();
        System.out.println("Gunluk Ortalama Kazanc: " + gunlukOrtalamaKazanc);

    }

    public void printDayIncomeList(List<DayIncome> list){
        for (int i = 0; i < list.size() ; i++) {
            System.out.println(list.get(i).getDayName() + ": " + list.get(i).getIncome());
        }
    }
    public double getOrtalamaKazanc(){
        if (gunler != null || gunler.size() > 0){
            int sum = 0;
            for (int i = 0; i < gunler.size(); i++) {
                sum += gunler.get(i).getIncome();
            }
            return sum / gunler.size();
        }
        else {
            return -1;
        }
    }

    public List<DayIncome> getOrtalamaninUstundeKazancGünleri() {
        List<DayIncome> ortUstKazGun = new ArrayList<>();
        double ortalamaKazanc = this.getOrtalamaKazanc();
        for (DayIncome nextDay : this.gunler) {
            if (nextDay.getIncome() >= ortalamaKazanc){
                ortUstKazGun.add(nextDay);
            }
        }
        return ortUstKazGun;
    }
    public List<DayIncome> getOrtalamaninAltindaKazancGünleri() {
        List<DayIncome> ortAltKazanc = new ArrayList<>();
        double ortalamaKazanc = this.getOrtalamaKazanc();
        for (DayIncome nextDay : this.gunler) {
            if (nextDay.getIncome() < ortalamaKazanc){
                ortAltKazanc.add(nextDay);
            }
        }
        return ortAltKazanc;
    }


    public static void main(String[] args) {
        ///* TASK :
        //     * Bir bakkalın 7 günlük tüm kazançlarını günlük olarak gösteren bir program yazınız.
        //     * Ayrıca bakkalın bu hafta ortalama kazandığı miktarı gösteren bir method yazınız.
        //     * Ayrıca bakkalın hangi günler ortalamanın üstüne kazandığını gösteren bir method yazınız.
        //     * Ayrıca bakkalın hangi günler ortalamanın altında kazandığını gösteren bir method yazınız.
        //     *
        //     * 1. Adım : Günleri içeren bir tane ArrayList oluşturun. (gunler)
        //     * 2. Adım : Günlük kazançları ekleyeceğimiz bir tane ArrayList oluşturun. (gunlukKazanclar)
        //     * 3. Adım : While döngüsü ile kullanıcıdan 7 günlük kazançları tekek teker alıp gunlukKazanclar ArrayList'e ekle.
        //     * 4. Adım : getOrtalamaKazanc() adlı method ile ortalama kazancı alın.
        //     * 5. Adım : getOrtalamaninUstundeKazancGünleri() adlı method oluşturun.
        //     *           for döngüsü ile tüm günleri ortalama kazanç ile karşılaştır
        //     *           ortalama kazançtan yüksekse o günleri return yap.
        //     * 6. Adım : getOrtalamaninAltindaKazancGünleri() adlı method oluşturun.
        //     *           for döngüsü ile tüm günleri ortalama kazanç ile karşılaştır
        //     *           ortalama kazançtan aşağıysa o günleri return yap.
        //     * *
        Soru3 soru3 = new Soru3();
        soru3.gunler.add(0, new DayIncome("Pazartesi",0));
        soru3.gunler.add(1, new DayIncome("Salı",0));
        soru3.gunler.add(2, new DayIncome("Çarşamba",0));
        soru3.gunler.add(3, new DayIncome("Perşembe",0));
        soru3.gunler.add(4, new DayIncome("Cuma",0));
        soru3.gunler.add(5, new DayIncome("Cumartesi",0));
        soru3.gunler.add(6, new DayIncome("Pazar",0));
        Scanner input = new Scanner(System.in);
       
        for (int i=0;i<soru3.gunler.size();i++){
            System.out.println("Lutfen "+ soru3.gunler.get(i).getDayName() +" gununun kazancını giriniz");
            double kazanc =  input.nextDouble();
            soru3.gunler.get(i).setIncome((int)kazanc);
        }
        soru3.listAllDays();

        List<DayIncome> ortUstGunler = soru3.getOrtalamaninUstundeKazancGünleri();
        System.out.println("Ortalam Ust: ");
        soru3.printDayIncomeList(ortUstGunler);
        List<DayIncome> ortAltGunler = soru3.getOrtalamaninAltindaKazancGünleri();
        System.out.println("Ortalam Alt: ");
        soru3.printDayIncomeList(ortAltGunler);

        System.out.println(ortAltGunler);

        DayIncome faruk = new DayIncome("faruk",  100);
        System.out.println(faruk);
    }
}
