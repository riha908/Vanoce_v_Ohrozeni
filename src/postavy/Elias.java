package postavy;

import Hra.Item;
import Hra.Oblast;

import java.util.ArrayList;

public class Elias extends Charakteri{
   private Oblast oblast;
   private ArrayList<Item> inventory;

   public Elias(){
      this.inventory = new ArrayList<>();
   }

   public Oblast getOblast() {
      return oblast;
   }

   public void setOblast(Oblast oblast) {
      this.oblast = oblast;
   }

   public ArrayList<Item> getInventory() {
      return inventory;
   }

   public void addToInventory(Item item) {
      if (item == null) {
         throw new IllegalArgumentException("Item nesmí být null");
      }
      inventory.add(item);
   }
}
