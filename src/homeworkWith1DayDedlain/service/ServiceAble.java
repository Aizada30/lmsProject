package homeworkWith1DayDedlain.service;

import homeworkWith1DayDedlain.enums.KeyCharacter;

import java.util.List;
import java.util.Map;

public interface ServiceAble {

    List<Map<KeyCharacter,String>> saveProduct(KeyCharacter key,String value);

}
