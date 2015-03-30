
import java.util.ArrayList;
import java.util.Collections;


public class Deck {
   private ArrayList<Card> newRandomDeck;
   private ArrayList<Card> newPermanentDeck;
   private ArrayList<ProductionTiles> newProdDeck;
   private ArrayList<BuildingTiles> newBuildDeck;
   private ArrayList<Value> buildValue;
   public Deck(){
      newRandomDeck = new ArrayList();
      newPermanentDeck = new ArrayList();
      newProdDeck = new ArrayList();
      newBuildDeck = new ArrayList();
      buildValue = new ArrayList();
   }
    public ArrayList<Card> cultureDeck(String current){
      if(current.equals("Egypt")){
         newRandomDeck.add(new Card("Build Nephthys"));
         newRandomDeck.add(new Card("Build Horus"));
         newRandomDeck.add(new Card("Explore Ptah"));
         newRandomDeck.add(new Card("Gather All"));
         newRandomDeck.add(new Card("Gather Bast"));
         newRandomDeck.add(new Card("Gather Ra"));
         newRandomDeck.add(new Card("Next Age Set"));
         newRandomDeck.add(new Card("Next Age Hathor"));
         newRandomDeck.add(new Card("Trade Normal"));
         newRandomDeck.add(new Card("Trade Thoth"));
      }
      else if(current.equals("Greek")){
         newRandomDeck.add(new Card("Build 3"));
         newRandomDeck.add(new Card("Build Hera"));
         newRandomDeck.add(new Card("Explore Artemis"));
         newRandomDeck.add(new Card("Gather Poseidon"));
         newRandomDeck.add(new Card("Gather Hades"));
         newRandomDeck.add(new Card("Gather Dionysus"));
         newRandomDeck.add(new Card("Next Age Hephaestos"));
         newRandomDeck.add(new Card("Next Age Zeus"));
         newRandomDeck.add(new Card("Trade Normal"));
         newRandomDeck.add(new Card("Trade Hermes"));
      }
      else if(current.equals("Norse")){
         newRandomDeck.add(new Card("Build 3"));
         newRandomDeck.add(new Card("Build Njord"));
         newRandomDeck.add(new Card("Explore Artemis"));
         newRandomDeck.add(new Card("Gather Skadi"));
         newRandomDeck.add(new Card("Gather Freyia"));
         newRandomDeck.add(new Card("Gather Thor"));
         newRandomDeck.add(new Card("Next Age Odin"));
         newRandomDeck.add(new Card("Next Age Normal"));
         newRandomDeck.add(new Card("Trade Forseti"));
         newRandomDeck.add(new Card("Trade Loki"));
      }
      newRandomDeck.add(new Card("Build 4"));
      for(int i = 0;i < 5;i++){
         newRandomDeck.add(new Card("Gather All"));
      }
      for(int i = 0;i < 4;i++){
         newRandomDeck.add(new Card("Trade Normal"));
      }
      for(int i = 0;i < 2;i++){
         newRandomDeck.add(new Card("Build 3"));
         newRandomDeck.add(new Card("Build 2"));
         newRandomDeck.add(new Card("Explore 2"));
         newRandomDeck.add(new Card("Explore 0"));
         newRandomDeck.add(new Card("Next Age Normal"));
      }
      Collections.shuffle(newRandomDeck);
      return newRandomDeck;
   }
   public ArrayList<Card> permanentDeck(){
      newPermanentDeck.add(new Card("Explore"));
      newPermanentDeck.add(new Card("Gather"));
      newPermanentDeck.add(new Card("Build"));
      newPermanentDeck.add(new Card("Trade"));
      newPermanentDeck.add(new Card("Next Age"));
      return newPermanentDeck;
   }
   public ArrayList<ProductionTiles> prodDeck(){
      for(int i = 0;i < 12;i++){
         newProdDeck.add(new ProductionTiles("Fertile Food 2"));
      }
      for(int i = 0;i < 9;i++){
         newProdDeck.add(new ProductionTiles("Forest Wood 2"));
      }
      for(int i = 0;i < 7;i++){
         newProdDeck.add(new ProductionTiles("Desert Favor 2"));
         newProdDeck.add(new ProductionTiles("Desert Gold 1"));
      }
      for(int i = 0;i < 6;i++){
         newProdDeck.add(new ProductionTiles("Mountains Gold 2"));
      }
      for(int i = 0;i < 4;i++){
         newProdDeck.add(new ProductionTiles("Hills Gold 2"));
         newProdDeck.add(new ProductionTiles("Hills Food 1"));
         newProdDeck.add(new ProductionTiles("Hills Wood 1"));
         newProdDeck.add(new ProductionTiles("Hills Favor 1"));
         newProdDeck.add(new ProductionTiles("Swamp Wood 1"));
         newProdDeck.add(new ProductionTiles("Swamp Food 1"));
         newProdDeck.add(new ProductionTiles("Swamp Favor 1"));
      }
      for(int i = 0;i < 3;i++){
         newProdDeck.add(new ProductionTiles("Fertile Wood 1"));
         newProdDeck.add(new ProductionTiles("Fertile Favor 1"));
         newProdDeck.add(new ProductionTiles("Fertile Gold 1"));
         newProdDeck.add(new ProductionTiles("Mountains Wood 1"));
         newProdDeck.add(new ProductionTiles("Mountains Favor 1"));
      }
      for(int i = 0;i < 2;i++){
         newProdDeck.add(new ProductionTiles("Forest Food 1"));
         newProdDeck.add(new ProductionTiles("Forest Gold 1"));
         newProdDeck.add(new ProductionTiles("Forest Favor 1"));
      }
      Collections.shuffle(newProdDeck);      
      return newProdDeck;
   }
   public ArrayList<BuildingTiles> buildDeck(){
      Value favor,food,wood,gold;
      food = new Value("Food",2);
      wood = new Value("Wood",2);
      buildValue.add(food);
      buildValue.add(wood);
      for(int i = 0;i < 10;i++){
         newBuildDeck.add(new BuildingTiles("House",buildValue));
      }
      favor = new Value("Favor",2); 
      food = new Value("Food",2);
      wood = new Value("Wood",2);
      gold = new Value("Gold",2);
      buildValue.add(favor);
      buildValue.add(food);
      buildValue.add(wood);
      buildValue.add(gold);
      newBuildDeck.add(new BuildingTiles("Storehouse",buildValue));
      favor = new Value("Favor",2);
      gold = new Value("Gold",3);
      buildValue.add(favor);
      buildValue.add(gold);
      newBuildDeck.add(new BuildingTiles("Market",buildValue)); 
      food = new Value("Food",4);
      gold = new Value("Gold",1);
      buildValue.add(food);
      buildValue.add(gold);
      newBuildDeck.add(new BuildingTiles("Quarry",buildValue)); 
      food = new Value("Food",3);
      gold = new Value("Gold",2);
      buildValue.add(food);
      buildValue.add(gold);
      newBuildDeck.add(new BuildingTiles("Monument",buildValue));
      wood = new Value("Wood",2);
      gold = new Value("Gold",3);
      buildValue.add(wood);
      buildValue.add(gold);
      newBuildDeck.add(new BuildingTiles("Granary",buildValue));
      food = new Value("Food",3);
      wood = new Value("Wood",2);
      buildValue.add(food);
      buildValue.add(wood);
      newBuildDeck.add(new BuildingTiles("Gold Mint",buildValue));
      food = new Value("Food",2);
      gold = new Value("Gold",3);
      buildValue.add(food);
      buildValue.add(gold);
      newBuildDeck.add(new BuildingTiles("Wood Workshop",buildValue));
      favor = new Value("Favor",4); 
      food = new Value("Food",4);
      wood = new Value("Wood",4);
      gold = new Value("Gold",4);
      buildValue.add(favor);
      buildValue.add(food);
      buildValue.add(wood);
      buildValue.add(gold);
      newBuildDeck.add(new BuildingTiles("Great Temple",buildValue));
      favor = new Value("Favor",10); 
      food = new Value("Food",10);
      wood = new Value("Wood",10);
      gold = new Value("Gold",10);
      buildValue.add(favor);
      buildValue.add(food);
      buildValue.add(wood);
      buildValue.add(gold);
      newBuildDeck.add(new BuildingTiles("The Wonder",buildValue));
      return newBuildDeck;
   }
}
