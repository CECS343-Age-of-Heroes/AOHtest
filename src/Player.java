
import static java.lang.Integer.parseInt;
import java.util.ArrayList;

public class Player {
   private String mName;
   private Culture mCulture;
   private Age mAge;
   private ArrayList<Card> mHand;
   private ArrayList<Card> mRandDeck;
   private ArrayList<Card> mPermDeck;
   private ArrayList<Resource> mResources;
   private ArrayList<BuildingTiles> buildingT;
   private ArrayList<BuildingTiles> buildingTDeck;
   private ArrayList<ProductionTiles> productionT;
   private Integer victoryPoints;
   private Action mMove;
   private Deck mDeck;
   boolean turn;
   public Player(String name, String culture){
      mName = name;
      mCulture = new Culture(culture);
      mAge = new Age();
      mHand = new ArrayList();
      mResources = new ArrayList();
      buildingT = new ArrayList();
      buildingTDeck = new ArrayList();
      productionT = new ArrayList();
      victoryPoints = 0;
      mRandDeck = new ArrayList();
      mPermDeck = new ArrayList();
      mMove = new Action();
      mDeck = new Deck();
      buildingTDeck = mDeck.buildDeck();
      mRandDeck = mDeck.cultureDeck(culture);
      mPermDeck = mDeck.permanentDeck();
      mResources.add(new Resource("Favor",4));
      mResources.add(new Resource("Food",4));
      mResources.add(new Resource("Wood",4));
      mResources.add(new Resource("Gold",4));
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
      return mHand.size();
   }
   public void drawCard(){
      mMove.drawCard(mRandDeck, mAge, mHand);
   }
   public void showHand(){
      for (Card card : mHand) {
         System.out.println(card.getCardName());
      }
      System.out.println(mRandDeck.size());
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
   public void addResource(String resourceType){
      String[] r = resourceType.split(" ");
      Resource tempRes = new Resource(r[1],parseInt(r[2]));
      mResources.add(tempRes);
   }
   public void buildBuilding(String newBuilding){
      mMove.buildBuildT(newBuilding, buildingT, buildingTDeck, mResources);
   }
   public void placeProduction(String newProduction){
      String[] input;
      input = newProduction.split(" ");
      mMove.drawProdT(newProduction, mCulture.showCulture(), productionT);
      addResource(newProduction);
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
