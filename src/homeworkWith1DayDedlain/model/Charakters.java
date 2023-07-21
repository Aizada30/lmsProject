package homeworkWith1DayDedlain.model;

import homeworkWith1DayDedlain.enums.KeyCharacter;

import java.util.List;
import java.util.Map;

public class Charakters {

    private long id;
    private Map<KeyCharacter,List<String>> mapList;

    public Charakters(long id, Map<KeyCharacter, List<String>> mapList) {
        this.id = id;
        this.mapList = mapList;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Map<KeyCharacter, List<String>> getMapList() {
        return mapList;
    }

    public void setMapList(Map<KeyCharacter, List<String>> mapList) {
        this.mapList = mapList;
    }
}
