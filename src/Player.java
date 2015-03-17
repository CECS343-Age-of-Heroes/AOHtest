
import java.util.ArrayList;

public class Player {
   private String mName;
   private String mRace;
   private String age;
   private ArrayList<Card> cards;
   private ArrayList<Resource> resources;
   private ArrayList<BuildingTiles> buildingT;
   private ArrayList<ProductionTiles> productionT;
   private Integer victoryPoints;
   boolean turn;
   public Player(String name, String race){
      mName = name;
      mRace = race;
      age = "Archaic";
      cards = new ArrayList();
      resources = new ArrayList();
      buildingT = new ArrayList();
      productionT = new ArrayList();
      victoryPoints = 0;
      turn = false;
   }
   public String getRace(){
      return mRace;
   }
   public void chooseRace(String newRace){
      mRace = newRace;
   }
   public String getAge(){
      return age;
   }
   public void newAge(){
      if(age.equals("Archaic"))
         age = "Classical";
      else if(age.equals("Classical"))
         age = "Heroic";
      else if(age.equals("Heroic"))
         age = "Mythic";
      else
         System.out.println("You cannot progress any further.");
   }
   public Card getCards(){
      for(int i = 0;i<cards.size();i++){
      
      }
      return null;
   }
   public Integer cardQuantity(){
      return cards.size();
   }
   public void addCard(String newCard){
      Card tempCard = new Card(newCard);
      cards.add(tempCard);
   }
   public Integer resourceQuantity(String resourceType){
      int quantity = 0;
      for(int i = 0;i < resources.size();i++){
         if(resources.get(i).resourceType().equals(resourceType))
            quantity = quantity + resources.get(i).value;
      }
      return quantity;
   }
   public void addResource(String newResource){
      Resource tempRes = new Resource(newResource);
      resources.add(tempRes);
   }
   public void buildBuilding(String newBuilding){
      int quantity = 0;
      // need to worry about how many you can place down only a total of 16
      for(int i = 0;i < buildingT.size();i++){
         if(buildingT.get(i).buildType().equals(newBuilding))
            quantity++;
      }
      if(quantity == 1 && newBuilding != "House"){
         BuildingTiles tempBuild = new BuildingTiles(newBuilding);
         buildingT.add(tempBuild);
      }
      else if(newBuilding == "House" && quantity <= 10){
         BuildingTiles tempBuild = new BuildingTiles(newBuilding);
         buildingT.add(tempBuild);
      }
      else{
         System.out.println("You have have hit the building limit");
      }
   }
   public void placeProduction(String newProduction){
      int quantity = 0;
      // need to worry about how many you can place down only a total of 16
      for(int i = 0;i < productionT.size();i++){
         if(productionT.get(i).productionType().equals(newProduction))
            quantity++;
      //check with race to find out how much of each tile the player can have
      }
   }
   public Integer victoryPtsQuantity(){
      return victoryPoints;
   }
   public void addVictoryPts(Integer addThisMuch){
      victoryPoints = victoryPoints + addThisMuch;
   }
}
