package homeworkWith1DayDedlain.service;

import homeworkWith1DayDedlain.enums.KeyCharacter;
import homeworkWith1DayDedlain.model.DataBase;
import homeworkWith1DayDedlain.model.Product;

import java.security.Key;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ServiceImpl implements ServiceAble {
    
    DataBase dataBase = new DataBase();


    public ServiceImpl(DataBase dataBase) {
        this.dataBase = dataBase;
    }

    public DataBase getDataBase() {
        return dataBase;
    }

    public void setDataBase(DataBase dataBase) {
        this.dataBase = dataBase;
    }



    @Override
    public List<Map<KeyCharacter, String>> saveProduct(KeyCharacter key , String value) {
        Map<KeyCharacter,String>map = new HashMap<>();
        map.put(key, value);
        dataBase.getProductList().put(key,value);


//        Map<KeyCharacter, String> map = new HashMap<>();
//        map.put((KeyCharacter) e,s);
//        List<Map<KeyCharacter, String>> characterList = product.getMaps();
//        characterList.add(map);
//        product.setMaps(characterList);
//        return product;
        return null;
    }
}
//    public Product method(Enum e,String s) {
//        Map<KeyCharacter, String> map = new HashMap<>();
//        map.put((KeyCharacter) e,s);
//        List<Map<KeyCharacter, String>> characterList = product.getMaps();
//        characterList.add(map);
//        product.setMaps(characterList);
//        return product;
//
//





