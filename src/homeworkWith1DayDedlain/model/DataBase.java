package homeworkWith1DayDedlain.model;

import homeworkWith1DayDedlain.enums.KeyCharacter;

import javax.xml.stream.events.Characters;
import java.security.Key;
import java.util.List;
import java.util.Map;

public class DataBase {
   private Map<KeyCharacter,String> productList;
   private List<Charakters> charaktersList;
   
   public DataBase (){
      
   }

   public DataBase(Map<KeyCharacter, String> productList, List<Charakters> charaktersList) {
      this.productList = productList;
      this.charaktersList = charaktersList;
   }

   public Map<KeyCharacter, String> getProductList() {
      return productList;
   }

   public void setProductList(Map<KeyCharacter, String> productList) {
      this.productList = productList;
   }

   public List<Charakters> getCharaktersList() {
      return charaktersList;
   }

   public void setCharaktersList(List<Charakters> charaktersList) {
      this.charaktersList = charaktersList;
   }

   @Override
   public String toString() {
      return "DataBase{" +
              "productList=" + productList +
              ", charaktersList=" + charaktersList +
              '}';
   }
}
