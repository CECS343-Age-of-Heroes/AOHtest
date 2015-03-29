
import java.util.ArrayList;

public class Player {
   private String mName;
   private Culture mCulture;
   private Age mAge;
   private ArrayList<Card> mCards;
   private ArrayList<Resource> mResources;
   private ArrayList<BuildingTiles> buildingT;
   private ArrayList<ProductionTiles> productionT;
   private Integer victoryPoints;
   private Action mMove;
   private Deck mDeck;
   boolean turn;
   public Player(String name, String culture){
      mName = name;
      mCulture = new Culture(culture);
      mAge = new Age();
      mCards = new ArrayList();
      mResources = new ArrayList();
      buildingT = new ArrayList();
      productionT = new ArrayList();
      victoryPoints = 0;
      mMove = new Action();
      mDeck = new Deck(culture);
      turn = false;
   }
   public String getName(){
       return mName;
   }
   public String getCulture(){
      return mCulture.showCulture();
   }
   public String currentAge(){
      return mAge.getAge();
   }
   public void changeAge(){
      mAge.newAge();
   }
   public Integer cardQuantity(){
      return mCards.size();
   }
   public void drawCard(){
      mMove.drawCard(mDeck, mAge, mCards);
   }
   public void showHand(){
      for (Card card : mCards) {
         System.out.println(card.getCardName());
      }
      System.out.println(mDeck.getSizeDeck());
   }
   public Integer resourceQuantity(String resourceType){
      int quantity = 0;
      for (Resource resource : mResources) {
         if (resource.resourceType().equals(resourceType)) {
            quantity = quantity + resource.getValue();
         }
      }
      return quantity;
   }
   public void addResource(String newResource){
      Resource tempRes = new Resource(newResource);
      mResources.add(tempRes);
   }
   public void buildBuilding(String newBuilding){
      mMove.buildBuildT(newBuilding, buildingT);
   }
   public void placeProduction(String newProduction){
      mMove.drawProdT(newProduction, mCulture.showCulture(), productionT);
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
