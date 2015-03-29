
import java.util.ArrayList;

public abstract class Counter<T> {
   public Integer checkCount(String newTile, ArrayList<T> array){
      int quantity = 0;
      for (T array1 : array) {
         if (array1.toString().equals(newTile)) {
            quantity++;
         }
      }
      return quantity;
   }
   public Integer arraySize(ArrayList<T> array){
      return array.size();
   }
}
