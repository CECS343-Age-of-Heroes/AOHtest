
import java.util.ArrayList;

public class Player {
   private String mName;
   private Culture mCulture;
   private Age age;
   private ArrayList<Card> cards;
   private ArrayList<Resource> resources;
   private ArrayList<BuildingTiles> buildingT;
   private ArrayList<ProductionTiles> productionT;
   private Integer victoryPoints;
   private Action myMove = new Action();
   boolean turn;
   public Player(String name, String culture){
      mName = name;
      mCulture = new Culture(culture);
      age = new Age();
      cards = new ArrayList();
      resources = new ArrayList();
      buildingT = new ArrayList();
      productionT = new ArrayList();
      victoryPoints = 0;
      turn = false;
   }
   public String getName(){
       return mName;
   }
   public String getCulture(){
      return mCulture.showCulture();
   }
   public String currentAge(){
      return age.getAge();
   }
   public void changeAge(){
      age.newAge();
   }
   public Card getCards(){
      for(int i = 0;i < cards.size();i++){
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
            quantity = quantity + resources.get(i).getValue();
      }
      return quantity;
   }
   public void addResource(String newResource){
      Resource tempRes = new Resource(newResource);
      resources.add(tempRes);
   }
   public void buildBuilding(String newBuilding){
      myMove.buildBuildT(newBuilding, buildingT);
   }
   public void placeProduction(String newProduction){
      myMove.drawProdT(newProduction, mCulture.showCulture(), productionT);
   }
   public Integer productionSize(){
      return productionT.size();
   }
   public Integer buildingSize(){
      return buildingT.size();
   }
   public Integer victoryPtsQuantity(){
      return victoryPoints;
   }
   public void addVictoryPts(Integer addThisMuch){
      victoryPoints = victoryPoints + addThisMuch;
   }
}
