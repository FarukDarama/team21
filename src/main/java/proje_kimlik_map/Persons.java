package proje_kimlik_map;

public class Persons {


    public String name;
    public String adres;
    public String telNo;

    public Persons(String name, String adres, String telNo) {

        this.name = name;
        this.adres = adres;
        this.telNo = telNo;
    }

    @Override
    public String toString() {
        return "Persons{" +
                "name='" + name + '\'' +
                ", adres='" + adres + '\'' +
                ", telNo='" + telNo + '\'' +
                '}';
    }





}
