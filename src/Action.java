
import java.util.ArrayList;


public class Action extends Counter{
   public Action(){
   }
   public BuildingTiles buildBuildT(String newBuilding, 
           ArrayList<BuildingTiles> tHand, ArrayList<BuildingTiles> tDeck,
           ArrayList<Resource> resource){
      if(arraySize(tHand) < 16){
         for(int i = 0;i < tDeck.size();i++){
            if(tDeck.get(i).toString().equals(newBuilding)){
               tHand.add(tDeck.get(i));
               tDeck.remove(i);
            }
         }
      }
      return null;
   }
   public ProductionTiles drawProdT(String nTile, String mCultureName,
    ArrayList<ProductionTiles> tArray){
      String[] input = nTile.split(" ");
      ProductionTiles tempTile = new ProductionTiles(nTile);
      if(arraySize(tArray) < 16){
         if(mCultureName.equals("Egypt")){
            if(input[0].equals("Desert")&&checkCount(input[0],tArray) < 6 || 
             input[0].equals("Fertile")&&checkCount(input[0],tArray) < 5 || 
             input[0].equals("Forest")&&checkCount(input[0],tArray) < 1 ||
             input[0].equals("Hills")&&checkCount(input[0],tArray) < 2 ||
             input[0].equals("Swamp")&&checkCount(input[0],tArray) < 2)
            tArray.add(tempTile);
         }
         else if(mCultureName.equals("Greek")){
         if(input[0].equals("Desert")&&checkCount(input[0],tArray) < 1 || 
             input[0].equals("Fertile")&&checkCount(input[0],tArray) < 3 || 
             input[0].equals("Forest")&&checkCount(input[0],tArray) < 2 ||
             input[0].equals("Hills")&&checkCount(input[0],tArray) < 8 ||
             input[0].equals("Mountains")&&checkCount(input[0],tArray) < 1 ||
             input[0].equals("Swamp")&&checkCount(input[0],tArray) < 1)
            tArray.add(tempTile);
         }
         else if(mCultureName.equals("Norse")){
         if(input[0].equals("Desert")&&checkCount(input[0],tArray) < 1 || 
             input[0].equals("Fertile")&&checkCount(input[0],tArray) < 3 || 
             input[0].equals("Forest")&&checkCount(input[0],tArray) < 4 ||
             input[0].equals("Hills")&&checkCount(input[0],tArray) < 3 ||
             input[0].equals("Mountains")&&checkCount(input[0],tArray) < 4 ||
             input[0].equals("Swamp")&&checkCount(input[0],tArray) < 1)
            tArray.add(tempTile);
         }
      }
      else
         System.out.println("You cannot build this");
      return null;
   }
   public void drawCard(ArrayList<Card> drawHere, Age currentAge, ArrayList<Card> hand){
      if(hand.size()<currentAge.drawNumber()){
         hand.add(drawHere.get(0));
         drawHere.remove(0);
      }
      else{
         System.out.println("Cannot draw more");
      }
   }
}
