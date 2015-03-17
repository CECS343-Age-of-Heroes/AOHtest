
import java.util.ArrayList;


public class Action {
   public ProductionTiles drawProdT(String nTile, String cultureName,
    ArrayList<ProductionTiles> tArray){
      int quantity = 0;
      ProductionTiles tempTile = new ProductionTiles(nTile);
      quantity = tArray.size();
      if(quantity < 16){
         if(cultureName.equals("Egypt")){
            if(nTile.equals("Desert")&&checkCount(nTile,tArray) < 6 || 
             nTile.equals("Fertile")&&checkCount(nTile,tArray) < 5 || 
             nTile.equals("Forest")&&checkCount(nTile,tArray) < 1 ||
             nTile.equals("Hills")&&checkCount(nTile,tArray) < 2 ||
             nTile.equals("Swamp")&&checkCount(nTile,tArray) < 2)
               tArray.add(tempTile);
            else
               System.out.println("You cannot place this piece");
         }
         else if(cultureName.equals("Greek")){
            if(nTile.equals("Desert")&&checkCount(nTile,tArray) < 1 || 
             nTile.equals("Fertile")&&checkCount(nTile,tArray) < 3 || 
             nTile.equals("Forest")&&checkCount(nTile,tArray) < 2 ||
             nTile.equals("Hills")&&checkCount(nTile,tArray) < 8 ||
             nTile.equals("Mountains")&&checkCount(nTile,tArray) < 1 ||
             nTile.equals("Swamp")&&checkCount(nTile,tArray) < 1)
               tArray.add(tempTile);
            else
               System.out.println("You cannot place this piece");
         }
         else if(cultureName.equals("Norse")){
            if(nTile.equals("Desert")&&checkCount(nTile,tArray) < 1 || 
             nTile.equals("Fertile")&&checkCount(nTile,tArray) < 3 || 
             nTile.equals("Forest")&&checkCount(nTile,tArray) < 4 ||
             nTile.equals("Hills")&&checkCount(nTile,tArray) < 3 ||
             nTile.equals("Mountains")&&checkCount(nTile,tArray) < 4 ||
             nTile.equals("Swamp")&&checkCount(nTile,tArray) < 1)
               tArray.add(tempTile);
            else
               System.out.println("You cannot place this piece");
         }
      }
      else{
         System.out.println("You cannot place anymore this");
      }
      return null;
   }
   private Integer checkCount(String newTile, ArrayList<ProductionTiles> array){
      int quantity = 0;
      for(int i = 0;i < array.size();i++){
         if(array.get(i).productionType().equals(newTile))
            quantity++;
      }
      return quantity;
   }
}
