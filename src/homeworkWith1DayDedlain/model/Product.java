package homeworkWith1DayDedlain.model;

import homeworkWith1DayDedlain.enums.Category;
import homeworkWith1DayDedlain.enums.KeyCharacter;

import java.util.List;
import java.util.Map;

public class Product {
    private long id;
    private Category category;
    private String name;
    private Character character;
    private List<Map<KeyCharacter, String>> mapList;
    private int price;

    public Product (){

    }

    public Product (long id,Category category,KeyCharacter keyCharacter ,String g){

        this.id=id;
        this.category = category;

    }

    public Product(long id, Category category, String name, Character character, List<Map<KeyCharacter, String>> mapList, int price) {
        this.id = id;
        this.category = category;
        this.name = name;
        this.character = character;
        this.mapList = mapList;
        this.price = price;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Character getCharacter() {
        return character;
    }

    public void setCharacter(Character character) {
        this.character = character;
    }

    public List<Map<KeyCharacter, String>> getMapList() {
        return mapList;
    }

    public void setMapList(List<Map<KeyCharacter, String>> mapList) {
        this.mapList = mapList;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", category=" + category +
                ", name='" + name + '\'' +
                ", character=" + character +
                ", mapList=" + mapList +
                ", price=" + price +
                '}';

    }
}
