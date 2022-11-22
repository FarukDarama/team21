package proje_kimlik_map;

import static proje_kimlik_map.KimlikYap.person;
import static proje_kimlik_map.KimlikYap.selectOption;

public class Runner {

    public static void main(String[] args) {

        person.put("2345",new Persons("Dilara","Samsun","01478520"));
        person.put("3345",new Persons("Busra","Kars","01478521"));
        person.put("4345",new Persons("Merve","Hatay","01478522"));
        selectOption();

    }
}
