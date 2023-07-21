import homeworkWith1DayDedlain.enums.KeyCharacter;
import homeworkWith1DayDedlain.model.DataBase;
import homeworkWith1DayDedlain.model.Product;
import homeworkWith1DayDedlain.service.ServiceImpl;

import javax.xml.stream.events.Characters;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);

        List<Product> productList = new ArrayList<>();
       List<Characters>charactersList=new ArrayList<>();

        ServiceImpl service = new ServiceImpl();

        System.out.println("Enter keyshoto tam");

        String key = scaner.nextLine();

        switch (key) {
            case "1" -> key = String.valueOf(KeyCharacter.HDR);
            case "2" -> key = String.valueOf(KeyCharacter.OLED);
            case "3" -> key = String.valueOf(KeyCharacter.IPS_LCD);
            case "4" -> key = String.valueOf(KeyCharacter._DCI_P3);
            case "5" -> key = String.valueOf(KeyCharacter.GEEK_BENCH);
            case "6" -> key = String.valueOf(KeyCharacter.HDR);
            case "7" -> key = String.valueOf(KeyCharacter.BUS);

        }
        DataBase dataBase = new DataBase();

    }
}