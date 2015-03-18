
import java.util.ArrayList;


public class Action extends Counter{
   public Action(){
   }
   public BuildingTiles buildBuildT(String newBuilding, 
           ArrayList<BuildingTiles> tArray){
      int quantity = 0;
      BuildingTiles tempTile = new BuildingTiles(newBuilding);
      if(arraySize(tArray) < 16){
         if(checkCount(newBuilding,tArray)==0 && !newBuilding.equals("House"))
            tArray.add(tempTile);
         else if(checkCount(newBuilding,tArray)<10&&newBuilding.equals("House"))
            tArray.add(tempTile);
         else
            System.out.println("You have have hit the building limit");
      }
      return null;
   }
   public ProductionTiles drawProdT(String nTile, String mCultureName,
    ArrayList<ProductionTiles> tArray){
      ProductionTiles tempTile = new ProductionTiles(nTile);
      if(arraySize(tArray) < 16){
         if(mCultureName.equals("Egypt")){
            if(nTile.equals("Desert")&&checkCount(nTile,tArray) < 6 || 
             nTile.equals("Fertile")&&checkCount(nTile,tArray) < 5 || 
             nTile.equals("Forest")&&checkCount(nTile,tArray) < 1 ||
             nTile.equals("Hills")&&checkCount(nTile,tArray) < 2 ||
             nTile.equals("Swamp")&&checkCount(nTile,tArray) < 2)
            tArray.add(tempTile);
         }
         else if(mCultureName.equals("Greek")){
         if(nTile.equals("Desert")&&checkCount(nTile,tArray) < 1 || 
             nTile.equals("Fertile")&&checkCount(nTile,tArray) < 3 || 
             nTile.equals("Forest")&&checkCount(nTile,tArray) < 2 ||
             nTile.equals("Hills")&&checkCount(nTile,tArray) < 8 ||
             nTile.equals("Mountains")&&checkCount(nTile,tArray) < 1 ||
             nTile.equals("Swamp")&&checkCount(nTile,tArray) < 1)
            tArray.add(tempTile);
         }
         else if(mCultureName.equals("Norse")){
         if(nTile.equals("Desert")&&checkCount(nTile,tArray) < 1 || 
             nTile.equals("Fertile")&&checkCount(nTile,tArray) < 3 || 
             nTile.equals("Forest")&&checkCount(nTile,tArray) < 4 ||
             nTile.equals("Hills")&&checkCount(nTile,tArray) < 3 ||
             nTile.equals("Mountains")&&checkCount(nTile,tArray) < 4 ||
             nTile.equals("Swamp")&&checkCount(nTile,tArray) < 1)
            tArray.add(tempTile);
         }
      }
      else
         System.out.println("You cannot build this");
      return null;
   }
}
