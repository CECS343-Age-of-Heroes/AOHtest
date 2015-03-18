
import java.util.ArrayList;

public abstract class Counter<T> {
   public Integer checkCount(String newTile, ArrayList<T> array){
      int quantity = 0;
      for(int i = 0;i < array.size();i++){
         if(array.get(i).toString().equals(newTile))
            quantity++;
      }
      return quantity;
   }
   public Integer arraySize(ArrayList<T> array){
      return array.size();
   }
}
